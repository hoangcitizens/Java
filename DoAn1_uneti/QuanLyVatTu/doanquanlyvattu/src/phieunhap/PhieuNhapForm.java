package phieunhap;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import phieunhapedit.AddPhieuNhapForm;
import phieunhapedit.EditPhieuNhapForm;

import java.awt.*;
import java.sql.*;

public class PhieuNhapForm extends JFrame {
    private JTable table;
    private JScrollPane scrollPane;
    private JButton addButton;
    private JButton deleteButton;
    private JButton editButton;
    private JButton refreshButton;
    private JButton tongTienButton;

    public PhieuNhapForm() {
        setTitle("Danh sách phiếu nhập");
        setSize(800, 600);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        // Tạo kết nối đến cơ sở dữ liệu
        try {
            Connection connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=QLVATTUNEW;encrypt=true;trustServerCertificate=true", "sa", "123456");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM PhieuNhap");

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
            addButton.addActionListener(e -> {
                AddPhieuNhapForm addForm = new AddPhieuNhapForm();
                addForm.setVisible(true);
            });
            deleteButton.addActionListener(e -> {
                int row = table.getSelectedRow();
                if (row != -1) {
                    int confirm = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn muốn xóa phiếu nhập này?", "Xác nhận xóa", JOptionPane.YES_NO_OPTION);
                    if (confirm == JOptionPane.YES_OPTION) {
                        Object id = table.getValueAt(row, 0);
                        deletePhieuNhap(id);
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Vui lòng chọn một phiếu nhập để xóa.");
                }
            });
            editButton.addActionListener(e -> {
                int row = table.getSelectedRow();
                if (row != -1) {
                    Object id = table.getValueAt(row, 0);
                    EditPhieuNhapForm editForm = new EditPhieuNhapForm(id);
                    editForm.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(this, "Vui lòng chọn một phiếu nhập để sửa.");
                }
            });
            refreshButton.addActionListener(e -> updateTable());
            tongTienButton.addActionListener(e -> tinhTongTien());

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

    // Phương thức xóa phiếu nhập
    private void deletePhieuNhap(Object id) {
        try {
            Connection connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=QLVATTUNEW;encrypt=true;trustServerCertificate=true", "sa", "123456");
            PreparedStatement statement = connection.prepareStatement("DELETE FROM PhieuNhap WHERE MaPhieuNhap = ?");
            statement.setObject(1, id);
            int rowsAffected = statement.executeUpdate();
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(this, "Xóa phiếu nhập thành công.");
                updateTable();
            } else {
                JOptionPane.showMessageDialog(this, "Xóa phiếu nhập không thành công.");
            }
            connection.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    // Phương thức cập nhật lại dữ liệu trên bảng
    private void updateTable() {
        try {
            Connection connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=QLVATTUNEW;encrypt=true;trustServerCertificate=true", "sa", "123456");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM PhieuNhap");
            table.setModel(buildTableModel(resultSet));
            connection.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    // Phương thức tính tổng tiền
    private void tinhTongTien() {
        try {
            Connection connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=QLVATTUNEW;encrypt=true;trustServerCertificate=true", "sa", "123456");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT SUM(TongTien) AS TongTien FROM PhieuNhap");
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
            PhieuNhapForm form = new PhieuNhapForm();
            form.setVisible(true);
        });
    }
}
