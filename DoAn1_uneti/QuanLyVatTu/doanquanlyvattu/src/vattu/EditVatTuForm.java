package vattu;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class EditVatTuForm extends JFrame {
    private JTextField idField;
    private JTextField nameField;
    private JTextArea descriptionArea;
    private JTextField unitField;
    private JTextField importPriceField;
    private JTextField sellPriceField;
    private JTextField quantityField;

    public EditVatTuForm(int id) {
        setTitle("Sửa vật tư");
        setSize(400, 300);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new GridLayout(0, 2, 10, 10));

        JLabel idLabel = new JLabel("Mã vật tư:");
        idField = new JTextField();
        idField.setEditable(false);
        idField.setText(String.valueOf(id)); // Chuyển đổi id từ int sang String

        JLabel nameLabel = new JLabel("Tên vật tư:");
        nameField = new JTextField();

        JLabel descriptionLabel = new JLabel("Mô tả:");
        descriptionArea = new JTextArea();

        JLabel unitLabel = new JLabel("Đơn vị tính:");
        unitField = new JTextField();

        JLabel importPriceLabel = new JLabel("Giá nhập:");
        importPriceField = new JTextField();

        JLabel sellPriceLabel = new JLabel("Giá bán:");
        sellPriceField = new JTextField();

        JLabel quantityLabel = new JLabel("Số lượng tồn:");
        quantityField = new JTextField();

        JButton editButton = new JButton("Sửa");
        
        // Xử lý sự kiện khi nhấn nút "Sửa"
        editButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int maVatTu = Integer.parseInt(idField.getText());
                String tenVatTu = nameField.getText();
                String moTa = descriptionArea.getText();
                String donViTinh = unitField.getText();
                double giaNhap = Double.parseDouble(importPriceField.getText());
                double giaBan = Double.parseDouble(sellPriceField.getText());
                int soLuongTon = Integer.parseInt(quantityField.getText());

                // Gọi phương thức để sửa dữ liệu trong cơ sở dữ liệu
                editVatTu(maVatTu, tenVatTu, moTa, donViTinh, giaNhap, giaBan, soLuongTon);
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
        panel.add(editButton);

        add(panel, BorderLayout.CENTER);
    }

    // Phương thức để sửa dữ liệu vật tư trong cơ sở dữ liệu
    private void editVatTu(int maVatTu, String tenVatTu, String moTa, String donViTinh, double giaNhap, double giaBan, int soLuongTon) {
        try {
            Connection connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=QLVATTUNEW;encrypt=true;trustServerCertificate=true", "sa", "123456");
            String query = "UPDATE Danhsachvattu SET TenVatTu = ?, MoTa = ?, DonViTinh = ?, GiaNhap = ?, GiaBan = ?, SoLuongTon = ? WHERE MaVatTu = ?";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, tenVatTu);
            statement.setString(2, moTa);
            statement.setString(3, donViTinh);
            statement.setDouble(4, giaNhap);
            statement.setDouble(5, giaBan);
            statement.setInt(6, soLuongTon);
            statement.setInt(7, maVatTu);
            
            int rowsUpdated = statement.executeUpdate();
            if (rowsUpdated > 0) {
                JOptionPane.showMessageDialog(this, "Đã cập nhật thành công!");
            } else {
                JOptionPane.showMessageDialog(this, "Không tìm thấy vật tư có mã " + maVatTu);
            }

            connection.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Lỗi khi cập nhật dữ liệu: " + ex.getMessage());
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            EditVatTuForm form = new EditVatTuForm(1); // Thay đổi 1 thành mã vật tư cụ thể cần sửa
            form.setVisible(true);
        });
    }
}
