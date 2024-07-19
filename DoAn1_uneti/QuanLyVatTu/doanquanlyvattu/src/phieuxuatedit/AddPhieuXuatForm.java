package phieuxuatedit;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AddPhieuXuatForm extends JFrame {
    public AddPhieuXuatForm() {
        setTitle("Thêm phiếu xuất");
        setSize(400, 300);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new GridLayout(0, 2, 10, 10));

        JLabel maPhieuLabel = new JLabel("Mã phiếu xuất:");
        JTextField maPhieuField = new JTextField();

        JLabel dateLabel = new JLabel("Ngày xuất:");
        JTextField dateField = new JTextField();

        JLabel totalLabel = new JLabel("Tổng tiền:");
        JTextField totalField = new JTextField();

        JButton addButton = new JButton("Thêm");

        panel.add(maPhieuLabel);
        panel.add(maPhieuField);
        panel.add(dateLabel);
        panel.add(dateField);
        panel.add(totalLabel);
        panel.add(totalField);
        panel.add(new JLabel()); // Empty label for alignment
        panel.add(addButton);

        add(panel, BorderLayout.CENTER);

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Khi nút "Thêm" được nhấn, thực hiện thêm dữ liệu vào SQL Server
                String maPhieu = maPhieuField.getText();
                String ngayXuat = dateField.getText();
                String tongTien = totalField.getText();

                // Thực hiện kết nối và thêm dữ liệu vào SQL Server
                try {
                    Connection connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=QLVATTUNEW;encrypt=true;trustServerCertificate=true", "sa", "123456");
                    String query = "INSERT INTO PhieuXuat (MaPhieuXuat, NgayXuat, TongTien) VALUES (?, ?, ?)";
                    PreparedStatement preparedStatement = connection.prepareStatement(query);
                    preparedStatement.setString(1, maPhieu);
                    preparedStatement.setString(2, ngayXuat);
                    preparedStatement.setString(3, tongTien);

                    int rowsInserted = preparedStatement.executeUpdate();
                    if (rowsInserted > 0) {
                        JOptionPane.showMessageDialog(null, "Thêm phiếu xuất thành công");
                    } else {
                        JOptionPane.showMessageDialog(null, "Thêm phiếu xuất thất bại");
                    }

                    connection.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                    JOptionPane.showMessageDialog(null, "Lỗi khi thêm phiếu xuất: " + ex.getMessage());
                }
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            AddPhieuXuatForm form = new AddPhieuXuatForm();
            form.setVisible(true);
        });
    }
}
