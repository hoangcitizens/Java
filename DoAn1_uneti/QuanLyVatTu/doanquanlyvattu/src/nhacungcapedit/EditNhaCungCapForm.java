package nhacungcapedit;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class EditNhaCungCapForm extends JFrame {
    private JTextField idField;
    private JTextField nameField;
    private JTextField addressField;
    private JTextField phoneField;

    public EditNhaCungCapForm(int id) {
        setTitle("Sửa nhà cung cấp");
        setSize(400, 300);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new GridLayout(0, 2, 10, 10));

        JLabel idLabel = new JLabel("Mã nhà cung cấp:");
        idField = new JTextField();
        idField.setEditable(false);
        idField.setText(String.valueOf(id)); 

        JLabel nameLabel = new JLabel("Tên nhà cung cấp:");
        nameField = new JTextField();

        JLabel addressLabel = new JLabel("Địa chỉ:");
        addressField = new JTextField();

        JLabel phoneLabel = new JLabel("Số điện thoại:");
        phoneField = new JTextField();

        JButton editButton = new JButton("Sửa");
        
        // Xử lý sự kiện khi nhấn nút "Sửa"
        editButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int maNhaCungCap = Integer.parseInt(idField.getText());
                String tenNhaCungCap = nameField.getText();
                String diaChi = addressField.getText();
                String soDienThoai = phoneField.getText();

                // Gọi phương thức để sửa dữ liệu trong cơ sở dữ liệu
                editNhaCungCap(maNhaCungCap, tenNhaCungCap, diaChi, soDienThoai);
            }
        });

        panel.add(idLabel);
        panel.add(idField);
        panel.add(nameLabel);
        panel.add(nameField);
        panel.add(addressLabel);
        panel.add(addressField);
        panel.add(phoneLabel);
        panel.add(phoneField);
        panel.add(new JLabel()); // Empty label for alignment
        panel.add(editButton);

        add(panel, BorderLayout.CENTER);
    }

    // Phương thức để sửa dữ liệu nhà cung cấp trong cơ sở dữ liệu
    private void editNhaCungCap(int maNhaCungCap, String tenNhaCungCap, String diaChi, String soDienThoai) {
        try {
            Connection connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=QLVATTUNEW;encrypt=true;trustServerCertificate=true", "sa", "123456");
            String query = "UPDATE NhaCungCap SET TenNhaCungCap = ?, DiaChi = ?, SoDienThoai = ? WHERE MaNhaCungCap = ?";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, tenNhaCungCap);
            statement.setString(2, diaChi);
            statement.setString(3, soDienThoai);
            statement.setInt(4, maNhaCungCap);
            
            int rowsUpdated = statement.executeUpdate();
            if (rowsUpdated > 0) {
                JOptionPane.showMessageDialog(this, "Đã cập nhật thành công!");
            } else {
                JOptionPane.showMessageDialog(this, "Không tìm thấy nhà cung cấp có mã " + maNhaCungCap);
            }

            connection.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Lỗi khi cập nhật dữ liệu: " + ex.getMessage());
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            EditNhaCungCapForm form = new EditNhaCungCapForm(1); // Thay đổi 1 thành mã nhà cung cấp cụ thể cần sửa
            form.setVisible(true);
        });
    }
}
