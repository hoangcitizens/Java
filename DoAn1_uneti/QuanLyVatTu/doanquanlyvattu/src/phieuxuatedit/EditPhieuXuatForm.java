package phieuxuatedit;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EditPhieuXuatForm extends JFrame {
    public EditPhieuXuatForm(Object id) {
        setTitle("Sửa phiếu xuất");
        setSize(400, 300);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new GridLayout(0, 2, 10, 10));

        JLabel maPhieuLabel = new JLabel("Mã phiếu xuất:");
        JTextField maPhieuField = new JTextField();
        maPhieuField.setEditable(false);
        maPhieuField.setText(id.toString());

        JLabel dateLabel = new JLabel("Ngày xuất:");
        JTextField dateField = new JTextField();

        JLabel totalLabel = new JLabel("Tổng tiền:");
        JTextField totalField = new JTextField();

        JButton editButton = new JButton("Sửa");

        panel.add(maPhieuLabel);
        panel.add(maPhieuField);
        panel.add(dateLabel);
        panel.add(dateField);
        panel.add(totalLabel);
        panel.add(totalField);
        panel.add(new JLabel()); // Empty label for alignment
        panel.add(editButton);

        add(panel, BorderLayout.CENTER);

        editButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Khi nút "Sửa" được nhấn, thực hiện cập nhật dữ liệu trên SQL Server
                String maPhieu = maPhieuField.getText();
                String ngayXuat = dateField.getText();
                String tongTien = totalField.getText();

                // Thực hiện kết nối và cập nhật dữ liệu trên SQL Server
                try {
                    Connection connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=QLVATTUNEW;encrypt=true;trustServerCertificate=true", "sa", "123456");
                    String query = "UPDATE PhieuXuat SET NgayXuat = ?, TongTien = ? WHERE MaPhieuXuat = ?";
                    PreparedStatement preparedStatement = connection.prepareStatement(query);
                    preparedStatement.setString(1, ngayXuat);
                    preparedStatement.setString(2, tongTien);
                    preparedStatement.setString(3, maPhieu);

                    int rowsUpdated = preparedStatement.executeUpdate();
                    if (rowsUpdated > 0) {
                        JOptionPane.showMessageDialog(null, "Cập nhật phiếu xuất thành công");
                    } else {
                        JOptionPane.showMessageDialog(null, "Cập nhật phiếu xuất thất bại");
                    }

                    connection.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                    JOptionPane.showMessageDialog(null, "Lỗi khi cập nhật phiếu xuất: " + ex.getMessage());
                }
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            EditPhieuXuatForm form = new EditPhieuXuatForm(1); // Thay 1 bằng ID thực tế
            form.setVisible(true);
        });
    }
}
