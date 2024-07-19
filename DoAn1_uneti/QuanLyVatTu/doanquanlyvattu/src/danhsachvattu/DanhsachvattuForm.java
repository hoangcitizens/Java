package danhsachvattu;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import vattu.AddVatTuForm;
import vattu.EditVatTuForm;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class DanhsachvattuForm extends JFrame implements ActionListener {
    private JTable table;
    private JScrollPane scrollPane;
    private JButton addButton;
    private JButton deleteButton;
    private JButton editButton;
    private JButton refreshButton;
    private JButton tongTienNhapButton;
    private JButton tongTienBanButton;

    public DanhsachvattuForm() {
        setTitle("Danh sách vật tư");
        setSize(800, 600);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        // Tạo kết nối đến cơ sở dữ liệu
        try {
            Connection connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=QLVATTUNEW;encrypt=true;trustServerCertificate=true", "sa", "123");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM Danhsachvattu");

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
            tongTienNhapButton = new JButton("Tổng tiền nhập");
            tongTienBanButton = new JButton("Tổng tiền bán");

            // Đăng ký sự kiện cho các nút button
            addButton.addActionListener(this);
            deleteButton.addActionListener(this);
            editButton.addActionListener(this);
            refreshButton.addActionListener(this);
            tongTienNhapButton.addActionListener(this);
            tongTienBanButton.addActionListener(this);

            buttonPanel.add(addButton);
            buttonPanel.add(deleteButton);
            buttonPanel.add(editButton);
            buttonPanel.add(refreshButton);
            buttonPanel.add(tongTienNhapButton);
            buttonPanel.add(tongTienBanButton);

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
        DefaultTableModel model = new DefaultTableModel() {
            @Override
            public Class<?> getColumnClass(int columnIndex) {
                // Tránh hiển thị ký tự E khi số lớn
                return columnIndex == 5 || columnIndex == 6 ? Double.class : super.getColumnClass(columnIndex);
            }
        };

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
            AddVatTuForm addForm = new AddVatTuForm();
            addForm.setVisible(true);
        } else if (source == deleteButton) {
            // Xử lý sự kiện xóa
            int row = table.getSelectedRow();
            if (row != -1) {
                int confirm = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn muốn xóa vật tư này?", "Xác nhận xóa", JOptionPane.YES_NO_OPTION);
                if (confirm == JOptionPane.YES_OPTION) {
                    Object id = table.getValueAt(row, 0);
                    deleteVatTu(id);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Vui lòng chọn một vật tư để xóa.");
            }
        } else if (source == editButton) {
            // Xử lý sự kiện sửa
            int row = table.getSelectedRow();
            if (row != -1) {
                Object id = table.getValueAt(row, 0);
                EditVatTuForm editForm = new EditVatTuForm((int) id); // Ép kiểu id về int trước khi truyền vào constructor
                editForm.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(this, "Vui lòng chọn một vật tư để sửa.");
            }
        } else if (source == refreshButton) {
            // Xử lý sự kiện tải lại
            updateTable();
        } else if (source == tongTienNhapButton) {
            // Xử lý sự kiện tổng tiền nhập
            tinhTongTienNhap();
        } else if (source == tongTienBanButton) {
            // Xử lý sự kiện tổng tiền bán
            tinhTongTienBan();
        }
    }

    // Phương thức xóa vật tư
    private void deleteVatTu(Object id) {
        try {
            Connection connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=QLVATTUNEW;encrypt=true;trustServerCertificate=true", "sa", "123456");
            PreparedStatement statement = connection.prepareStatement("DELETE FROM Danhsachvattu WHERE MaVatTu = ?");
            statement.setObject(1, id);
            int rowsAffected = statement.executeUpdate();
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(this, "Xóa vật tư thành công.");
                updateTable();
            } else {
                JOptionPane.showMessageDialog(this, "Xóa vật tư không thành công.");
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
            ResultSet resultSet = statement.executeQuery("SELECT * FROM Danhsachvattu");
            table.setModel(buildTableModel(resultSet));
            connection.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    // Phương thức tính tổng tiền nhập
    private void tinhTongTienNhap() {
        try {
            Connection connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=QLVATTUNEW;encrypt=true;trustServerCertificate=true", "sa", "123456");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT SUM(TongTien) AS TongTienNhap FROM PhieuNhap");
            if (resultSet.next()) {
                double tongTienNhap = resultSet.getDouble("TongTienNhap");
                JOptionPane.showMessageDialog(this, "Tổng tiền nhập: " + String.format("%.2f", tongTienNhap)); // Định dạng số tiền
            } else {
                JOptionPane.showMessageDialog(this, "Không có dữ liệu về tổng tiền nhập.");
            }
            connection.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    // Phương thức tính tổng tiền bán
    private void tinhTongTienBan() {
        try {
            Connection connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=QLVATTUNEW;encrypt=true;trustServerCertificate=true", "sa", "123456");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT SUM(TongTien) AS TongTienBan FROM PhieuXuat");
            if (resultSet.next()) {
                double tongTienBan = resultSet.getDouble("TongTienBan");
                JOptionPane.showMessageDialog(this, "Tổng tiền bán: " + String.format("%.2f", tongTienBan)); // Định dạng số tiền
            } else {
                JOptionPane.showMessageDialog(this, "Không có dữ liệu về tổng tiền bán.");
            }
            connection.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            DanhsachvattuForm form = new DanhsachvattuForm();
            form.setVisible(true);
        });
    }
}
