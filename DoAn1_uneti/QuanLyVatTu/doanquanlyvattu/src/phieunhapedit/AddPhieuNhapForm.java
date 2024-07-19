package phieunhapedit;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class AddPhieuNhapForm extends JFrame implements ActionListener {
    private JTextField maPhieuNhapField;
    private JTextField maNhaCungCapField;
    private JTextField dateField;
    private JTextField totalField;
    private PhieuNhapAddedListener listener;

    public AddPhieuNhapForm() {
        setTitle("Thêm phiếu nhập");
        setSize(400, 300);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new GridLayout(0, 2, 10, 10));

        JLabel maPhieuNhapLabel = new JLabel("Mã phiếu nhập:");
        maPhieuNhapField = new JTextField();

        JLabel maNhaCungCapLabel = new JLabel("Mã nhà cung cấp:");
        maNhaCungCapField = new JTextField();

        JLabel dateLabel = new JLabel("Ngày nhập (YYYY-MM-DD):");
        dateField = new JTextField();

        JLabel totalLabel = new JLabel("Tổng tiền:");
        totalField = new JTextField();

        JButton addButton = new JButton("Thêm");
        addButton.addActionListener(this);

        panel.add(maPhieuNhapLabel);
        panel.add(maPhieuNhapField);
        panel.add(maNhaCungCapLabel);
        panel.add(maNhaCungCapField);
        panel.add(dateLabel);
        panel.add(dateField);
        panel.add(totalLabel);
        panel.add(totalField);
        panel.add(new JLabel());
        panel.add(addButton);

        add(panel, BorderLayout.CENTER);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Thêm")) {
            String maPhieuNhap = maPhieuNhapField.getText();
            String maNhaCungCap = maNhaCungCapField.getText();
            String date = dateField.getText();
            String total = totalField.getText();

            if (!isValidInput(maPhieuNhap, maNhaCungCap, date, total)) {
                return;
            }

            try (Connection connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=QLVATTUNEW;trustServerCertificate=true", "sa", "123456")) {
                String sql = "INSERT INTO PhieuNhap (MaPhieuNhap, MaNhaCungCap, NgayNhap, TongTien) VALUES (?, ?, ?, ?)";
                try (PreparedStatement statement = connection.prepareStatement(sql)) {
                    statement.setString(1, maPhieuNhap);
                    statement.setString(2, maNhaCungCap);
                    statement.setString(3, date);
                    statement.setString(4, total);

                    int rowsInserted = statement.executeUpdate();
                    if (rowsInserted > 0) {
                        JOptionPane.showMessageDialog(this, "Thêm phiếu nhập thành công");
                        if (listener != null) {
                            listener.phieuNhapAdded();
                        }
                        clearForm();
                    }
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(this, "Đã xảy ra lỗi khi thêm phiếu nhập: " + ex.getMessage(), "Lỗi", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private boolean isValidInput(String maPhieuNhap, String maNhaCungCap, String date, String total) {
        if (maPhieuNhap.isEmpty() || maNhaCungCap.isEmpty() || date.isEmpty() || total.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng điền đầy đủ thông tin", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (!date.matches("\\d{4}-\\d{2}-\\d{2}")) {
            JOptionPane.showMessageDialog(this, "Ngày nhập không hợp lệ. Định dạng phải là YYYY-MM-DD", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }

    private void clearForm() {
        maPhieuNhapField.setText("");
        maNhaCungCapField.setText("");
        dateField.setText("");
        totalField.setText("");
    }

    public void addPhieuNhapAddedListener(PhieuNhapAddedListener listener) {
        this.listener = listener;
    }

    public interface PhieuNhapAddedListener {
        void phieuNhapAdded();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            AddPhieuNhapForm form = new AddPhieuNhapForm();
            form.setVisible(true);
        });
    }
}
