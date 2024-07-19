package phieuxuat;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import phieuxuatedit.AddPhieuXuatForm;
import phieuxuatedit.EditPhieuXuatForm;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class PhieuXuatForm extends JFrame {
    private JTable table;
    private JScrollPane scrollPane;
    private JButton addButton;
    private JButton deleteButton;
    private JButton editButton;
    private JButton refreshButton;
    private JButton tongTienButton;

    public PhieuXuatForm() {
        setTitle("Danh sách phiếu xuất");
        setSize(800, 600);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        // Tạo kết nối đến cơ sở dữ liệu
        try {
            Connection connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=QLVATTUNEW;encrypt=true;trustServerCertificate=true", "sa", "123456");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM PhieuXuat");

            // Tạo bảng hiển thị dữ liệu
            table = new JTable(buildTableModel(resultSet));
            scrollPane = new JScrollPane(table);
            add(scrollPane, BorderLayout.CENTER);

            // Tạo panel chứa các nút button
            JPanel buttonPanel = new JPanel();
            addButton = new JButton("Thêm");
            deleteButton = new JButton("Xóa");
            editButton = new JButton("Sửa");
            refreshButton = new JButton("Tải lại");
            tongTienButton = new JButton("Tổng tiền");

            // Đăng ký sự kiện cho các nút button
            addButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    AddPhieuXuatForm addForm = new AddPhieuXuatForm();
                    addForm.setVisible(true);
                }
            });

            deleteButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    int selectedRow = table.getSelectedRow();
                    if (selectedRow != -1) {
                        int confirm = JOptionPane.showConfirmDialog(PhieuXuatForm.this, "Bạn có chắc chắn muốn xóa phiếu xuất này không?", "Xác nhận xóa", JOptionPane.YES_NO_OPTION);
                        if (confirm == JOptionPane.YES_OPTION) {
                            Object id = table.getValueAt(selectedRow, 0);
                            // Thực hiện xóa phiếu xuất có id tương ứng
                            try {
                                Connection connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=QLVATTUNEW;encrypt=true;trustServerCertificate=true", "sa", "123456");
                                String query = "DELETE FROM PhieuXuat WHERE MaPhieuXuat = ?";
                                PreparedStatement preparedStatement = connection.prepareStatement(query);
                                preparedStatement.setString(1, id.toString());

                                int rowsDeleted = preparedStatement.executeUpdate();
                                if (rowsDeleted > 0) {
                                    JOptionPane.showMessageDialog(null, "Xóa phiếu xuất thành công");
                                    // Sau khi xóa, cập nhật lại bảng
                                    refreshTable();
                                } else {
                                    JOptionPane.showMessageDialog(null, "Không tìm thấy phiếu xuất có ID: " + id, "Thông báo", JOptionPane.ERROR_MESSAGE);
                                }

                                connection.close();
                            } catch (SQLException ex) {
                                ex.printStackTrace();
                                JOptionPane.showMessageDialog(null, "Lỗi khi xóa phiếu xuất: " + ex.getMessage(), "Lỗi", JOptionPane.ERROR_MESSAGE);
                            }
                        }
                    } else {
                        JOptionPane.showMessageDialog(PhieuXuatForm.this, "Vui lòng chọn một phiếu xuất để xóa", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                    }
                }
            });

            editButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    int selectedRow = table.getSelectedRow();
                    if (selectedRow != -1) {
                        Object id = table.getValueAt(selectedRow, 0);
                        EditPhieuXuatForm editForm = new EditPhieuXuatForm(id);
                        editForm.setVisible(true);
                    } else {
                        JOptionPane.showMessageDialog(PhieuXuatForm.this, "Vui lòng chọn một phiếu xuất để sửa", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                    }
                }
            });

            refreshButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    try {
                        Connection newConnection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=QLVATTUNEW;encrypt=true;trustServerCertificate=true", "sa", "123456");
                        Statement newStatement = newConnection.createStatement();
                        ResultSet updatedResultSet = newStatement.executeQuery("SELECT * FROM PhieuXuat");
                        DefaultTableModel model = buildTableModel(updatedResultSet);
                        table.setModel(model);
                        newConnection.close(); // Đóng kết nối mới sau khi sử dụng xong
                    } catch (SQLException ex) {
                        ex.printStackTrace();
                    }
                }
            });

            tongTienButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    tinhTongTien();
                }
            });

            buttonPanel.add(addButton);
            buttonPanel.add(deleteButton);
            buttonPanel.add(editButton);
            buttonPanel.add(refreshButton);
            buttonPanel.add(tongTienButton);

            add(buttonPanel, BorderLayout.SOUTH);

            connection.close(); // Đóng kết nối sau khi sử dụng xong
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    // Phương thức cập nhật lại bảng
    private void refreshTable() {
        try {
            Connection newConnection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=QLVATTUNEW;encrypt=true;trustServerCertificate=true", "sa", "123456");
            Statement newStatement = newConnection.createStatement();
            ResultSet updatedResultSet = newStatement.executeQuery("SELECT * FROM PhieuXuat");
            DefaultTableModel model = buildTableModel(updatedResultSet);
            table.setModel(model);
            newConnection.close(); // Đóng kết nối mới sau khi sử dụng xong
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    // Phương thức chuyển ResultSet thành DefaultTableModel
    public static DefaultTableModel buildTableModel(ResultSet rs) throws SQLException {
        ResultSetMetaData metaData = rs.getMetaData();

        // Tạo model cho bảng
        DefaultTableModel model = new DefaultTableModel();

        // Lấy số cột
        int columnCount = metaData.getColumnCount();
        for (int columnIndex = 1; columnIndex <= columnCount; columnIndex++) {
            model.addColumn(metaData.getColumnLabel(columnIndex));
        }

        // Thêm dữ liệu từ ResultSet vào model
        while (rs.next()) {
            Object[] rowData = new Object[columnCount];
            for (int i = 0; i < columnCount; i++) {
                rowData[i] = rs.getObject(i + 1);
            }
            model.addRow(rowData);
        }

        return model;
    }

    // Phương thức tính tổng tiền
    private void tinhTongTien() {
        try {
            Connection connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=QLVATTUNEW;encrypt=true;trustServerCertificate=true", "sa", "123456");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT SUM(TongTien) AS TongTien FROM PhieuXuat");
            if (resultSet.next()) {
                double tongTien = resultSet.getDouble("TongTien");
                JOptionPane.showMessageDialog(this, "Tổng tiền: " + String.format("%.2f", tongTien));
            } else {
                JOptionPane.showMessageDialog(this, "Không có dữ liệu về tổng tiền.");
            }
            connection.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            PhieuXuatForm form = new PhieuXuatForm();
            form.setVisible(true);
        });
    }
}
