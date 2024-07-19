package nhacungcap;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import nhacungcapedit.AddNhaCungCapForm;
import nhacungcapedit.EditNhaCungCapForm;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class NhaCungCapForm extends JFrame implements ActionListener {
    private JTable table;
    private JScrollPane scrollPane;
    private JButton addButton;
    private JButton deleteButton;
    private JButton editButton;
    private JButton refreshButton;

    public NhaCungCapForm() {
        setTitle("Danh sách nhà cung cấp");
        setSize(800, 600);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        // Tạo kết nối đến cơ sở dữ liệu
        try {
            Connection connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=QLVATTUNEW;encrypt=true;trustServerCertificate=true", "sa", "123456");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM NhaCungCap");

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

            // Đăng ký sự kiện cho các nút button
            addButton.addActionListener(this);
            deleteButton.addActionListener(this);
            editButton.addActionListener(this);
            refreshButton.addActionListener(this);

            buttonPanel.add(addButton);
            buttonPanel.add(deleteButton);
            buttonPanel.add(editButton);
            buttonPanel.add(refreshButton);

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

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source == addButton) {
            // Xử lý sự kiện thêm
            AddNhaCungCapForm addForm = new AddNhaCungCapForm();
            addForm.setVisible(true);
        } else if (source == deleteButton) {
            // Xử lý sự kiện xóa
            int row = table.getSelectedRow();
            if (row != -1) {
                int confirm = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn muốn xóa nhà cung cấp này?", "Xác nhận xóa", JOptionPane.YES_NO_OPTION);
                if (confirm == JOptionPane.YES_OPTION) {
                    Object id = table.getValueAt(row, 0);
                    deleteNhaCungCap(id);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Vui lòng chọn một nhà cung cấp để xóa.");
            }
        } else if (source == editButton) {
            // Xử lý sự kiện sửa
            int row = table.getSelectedRow();
            if (row != -1) {
                Object id = table.getValueAt(row, 0);
                EditNhaCungCapForm editForm = new EditNhaCungCapForm((int) id);
                editForm.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(this, "Vui lòng chọn một nhà cung cấp để sửa.");
            }
        } else if (source == refreshButton) {
            // Xử lý sự kiện tải lại
            updateTable();
        }
    }

    private void deleteNhaCungCap(Object id) {
        try {
            Connection connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=QLVATTUNEW;encrypt=true;trustServerCertificate=true", "sa", "123456");
            
            // Kiểm tra xem có bất kỳ phiếu nhập nào tham chiếu đến nhà cung cấp này không
            PreparedStatement checkStatement = connection.prepareStatement("SELECT COUNT(*) FROM PhieuNhap WHERE MaNhaCungCap = ?");
            checkStatement.setObject(1, id);
            ResultSet resultSet = checkStatement.executeQuery();
            resultSet.next();
            int count = resultSet.getInt(1);
            
            if (count > 0) {
                // Nếu có, hiển thị cảnh báo và không thực hiện xóa
                JOptionPane.showMessageDialog(this, "Không thể xóa nhà cung cấp này vì có phiếu nhập tham chiếu đến.", "Lỗi", JOptionPane.ERROR_MESSAGE);
            } else {
                // Nếu không có, thực hiện xóa nhà cung cấp
                PreparedStatement deleteStatement = connection.prepareStatement("DELETE FROM NhaCungCap WHERE MaNhaCungCap = ?");
                deleteStatement.setObject(1, id);
                int rowsAffected = deleteStatement.executeUpdate();
                
                if (rowsAffected > 0) {
                    JOptionPane.showMessageDialog(this, "Xóa nhà cung cấp thành công.");
                    updateTable();
                } else {
                    JOptionPane.showMessageDialog(this, "Xóa nhà cung cấp không thành công.");
                }
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
            ResultSet resultSet = statement.executeQuery("SELECT * FROM NhaCungCap");
            table.setModel(buildTableModel(resultSet));
            connection.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            NhaCungCapForm form = new NhaCungCapForm();
            form.setVisible(true);
        });
    }
}
