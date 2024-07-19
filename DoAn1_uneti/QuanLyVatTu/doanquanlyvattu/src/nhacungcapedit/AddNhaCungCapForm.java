package nhacungcapedit;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AddNhaCungCapForm extends JFrame {
    public AddNhaCungCapForm() {
        setTitle("Thêm nhà cung cấp");
        setSize(400, 300);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new GridLayout(0, 2, 10, 10));

        JLabel nameLabel = new JLabel("Tên nhà cung cấp:");
        JTextField nameField = new JTextField();

        JLabel addressLabel = new JLabel("Địa chỉ:");
        JTextField addressField = new JTextField();

        JLabel phoneLabel = new JLabel("Số điện thoại:");
        JTextField phoneField = new JTextField();

        JButton addButton = new JButton("Thêm");

        // Xử lý sự kiện khi nhấn nút "Thêm"
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String tenNhaCungCap = nameField.getText();
                String diaChi = addressField.getText();
                String soDienThoai = phoneField.getText();

                // Gọi phương thức để thêm dữ liệu vào cơ sở dữ liệu
                addNewNhaCungCap(tenNhaCungCap, diaChi, soDienThoai);
            }
        });

        panel.add(nameLabel);
        panel.add(nameField);
        panel.add(addressLabel);
        panel.add(addressField);
        panel.add(phoneLabel);
        panel.add(phoneField);
        panel.add(new JLabel()); // Empty label for alignment
        panel.add(addButton);

        add(panel, BorderLayout.CENTER);
    }

    // Phương thức để thêm dữ liệu mới vào cơ sở dữ liệu
    private void addNewNhaCungCap(String tenNhaCungCap, String diaChi, String soDienThoai) {
        try {
            Connection connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=QLVATTUNEW;encrypt=true;trustServerCertificate=true", "sa", "123456");
            String query = "INSERT INTO NhaCungCap (TenNhaCungCap, DiaChi, SoDienThoai) VALUES (?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, tenNhaCungCap);
            statement.setString(2, diaChi);
            statement.setString(3, soDienThoai);

            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                JOptionPane.showMessageDialog(this, "Thêm nhà cung cấp thành công");
            } else {
                JOptionPane.showMessageDialog(this, "Thêm nhà cung cấp không thành công");
            }
            connection.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Lỗi: " + ex.getMessage());
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            AddNhaCungCapForm form = new AddNhaCungCapForm();
            form.setVisible(true);
        });
    }
}
