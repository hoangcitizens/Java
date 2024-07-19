package phieunhapedit;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EditPhieuNhapForm extends JFrame implements ActionListener {
    private JTextField idField;
    private JTextField dateField;
    private JTextField supplierField;
    private JTextField totalField;
    private JButton editButton;

    public EditPhieuNhapForm(Object id) {
        setTitle("Sửa phiếu nhập");
        setSize(400, 300);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new GridLayout(0, 2, 10, 10));

        JLabel idLabel = new JLabel("ID:");
        idField = new JTextField();
        idField.setEditable(false);
        idField.setText(id.toString());

        JLabel dateLabel = new JLabel("Ngày nhập:");
        dateField = new JTextField();

        JLabel supplierLabel = new JLabel("Nhà cung cấp:");
        supplierField = new JTextField();

        JLabel totalLabel = new JLabel("Tổng tiền:");
        totalField = new JTextField();

        editButton = new JButton("Sửa");
        editButton.addActionListener(this);

        panel.add(idLabel);
        panel.add(idField);
        panel.add(dateLabel);
        panel.add(dateField);
        panel.add(supplierLabel);
        panel.add(supplierField);
        panel.add(totalLabel);
        panel.add(totalField);
        panel.add(new JLabel()); // Empty label for alignment
        panel.add(editButton);

        add(panel, BorderLayout.CENTER);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == editButton) {
            String id = idField.getText();
            String date = dateField.getText();
            String supplier = supplierField.getText();
            String total = totalField.getText();

            try (Connection connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=QLVATTUNEW;encrypt=false;trustServerCertificate=true", "sa", "123456")) {
                String sql = "UPDATE PhieuNhap SET NgayNhap=?, MaNhaCungCap=?, TongTien=? WHERE MaPhieuNhap=?";
                try (PreparedStatement statement = connection.prepareStatement(sql)) {
                    statement.setString(1, date);
                    statement.setString(2, supplier);
                    statement.setString(3, total);
                    statement.setString(4, id);

                    int rowsUpdated = statement.executeUpdate();
                    if (rowsUpdated > 0) {
                        JOptionPane.showMessageDialog(this, "Cập nhật phiếu nhập thành công");
                        dispose(); // Đóng form sau khi cập nhật thành công
                    } else {
                        JOptionPane.showMessageDialog(this, "Không tìm thấy phiếu nhập với ID này");
                    }
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(this, "Đã xảy ra lỗi khi cập nhật phiếu nhập: " + ex.getMessage(), "Lỗi", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            EditPhieuNhapForm form = new EditPhieuNhapForm(1); // Thay thế 1 bằng ID thực tế
            form.setVisible(true);
        });
    }
}
