package vattu;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AddVatTuForm extends JFrame {
    public AddVatTuForm() {
        setTitle("Thêm vật tư");
        setSize(400, 300);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new GridLayout(0, 2, 10, 10));

        JLabel idLabel = new JLabel("Mã vật tư:");
        JTextField idField = new JTextField();

        JLabel nameLabel = new JLabel("Tên vật tư:");
        JTextField nameField = new JTextField();

        JLabel descriptionLabel = new JLabel("Mô tả:");
        JTextArea descriptionArea = new JTextArea();

        JLabel unitLabel = new JLabel("Đơn vị tính:");
        JTextField unitField = new JTextField();

        JLabel importPriceLabel = new JLabel("Giá nhập:");
        JTextField importPriceField = new JTextField();

        JLabel sellPriceLabel = new JLabel("Giá bán:");
        JTextField sellPriceField = new JTextField();

        JLabel quantityLabel = new JLabel("Số lượng tồn:");
        JTextField quantityField = new JTextField();

        JButton addButton = new JButton("Thêm");

        // Xử lý sự kiện khi nhấn nút "Thêm"
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Lấy thông tin từ các trường nhập liệu
                int maVatTu = Integer.parseInt(idField.getText());
                String tenVatTu = nameField.getText();
                String moTa = descriptionArea.getText();
                String donViTinh = unitField.getText();
                double giaNhap = Double.parseDouble(importPriceField.getText());
                double giaBan = Double.parseDouble(sellPriceField.getText());
                int soLuongTon = Integer.parseInt(quantityField.getText());

                // Gọi phương thức để thêm dữ liệu vào cơ sở dữ liệu
                addNewVatTu(maVatTu, tenVatTu, moTa, donViTinh, giaNhap, giaBan, soLuongTon);
            }
        });

        panel.add(idLabel);
        panel.add(idField);
        panel.add(nameLabel);
        panel.add(nameField);
        panel.add(descriptionLabel);
        panel.add(descriptionArea);
        panel.add(unitLabel);
        panel.add(unitField);
        panel.add(importPriceLabel);
        panel.add(importPriceField);
        panel.add(sellPriceLabel);
        panel.add(sellPriceField);
        panel.add(quantityLabel);
        panel.add(quantityField);
        panel.add(new JLabel()); // Empty label for alignment
        panel.add(addButton);

        add(panel, BorderLayout.CENTER);
    }

    // Phương thức để thêm dữ liệu mới vào cơ sở dữ liệu
 // Phương thức để thêm dữ liệu mới vào cơ sở dữ liệu
    private void addNewVatTu(int maVatTu, String tenVatTu, String moTa, String donViTinh, double giaNhap, double giaBan, int soLuongTon) {
        try {
            Connection connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=QLVATTUNEW;encrypt=true;trustServerCertificate=true", "sa", "123456");
            String query = "INSERT INTO Danhsachvattu (MaVatTu, TenVatTu, MoTa, DonViTinh, GiaNhap, GiaBan, SoLuongTon) VALUES (?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1, maVatTu);
            statement.setString(2, tenVatTu);
            statement.setString(3, moTa);
            statement.setString(4, donViTinh);
            statement.setDouble(5, giaNhap);
            statement.setDouble(6, giaBan);
            statement.setInt(7, soLuongTon);

            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                JOptionPane.showMessageDialog(this, "Thêm vật tư thành công");
            } else {
                JOptionPane.showMessageDialog(this, "Thêm vật tư không thành công");
            }
            connection.close();
        } catch (SQLException ex) {
            if (ex.getMessage().contains("Violation of PRIMARY KEY constraint")) {
                JOptionPane.showMessageDialog(this, "Mã vật tư bị trùng, vui lòng chọn mã vật tư khác");
            } else {
                JOptionPane.showMessageDialog(this, "Lỗi: " + ex.getMessage());
            }
        }
    }


    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            AddVatTuForm form = new AddVatTuForm();
            form.setVisible(true);
        });
    }
}
