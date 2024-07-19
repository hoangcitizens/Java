package menu;

import javax.swing.*;

import danhsachvattu.DanhsachvattuForm;
import nhacungcap.NhaCungCapForm;
import phieunhap.PhieuNhapForm;
import phieuxuat.PhieuXuatForm;

import java.awt.*;
import java.awt.event.*;

public class MenuForm extends JFrame implements ActionListener {
    private JLabel loggedInLabel;
    private JButton exitButton;

    public MenuForm() {
        setTitle("Menu");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(600, 400);
        setLocationRelativeTo(null);

        // Panel chứa các button menu
        JPanel menuPanel = new JPanel();
        menuPanel.setLayout(new GridLayout(0, 1, 10, 10)); // Sắp xếp theo hàng dọc, cách 10px

        String[] tableNames = {"Danh mục vật tư", "Nhà cung cấp", "Phiếu nhập vật tư", "Phiếu xuất vật tư"};
        for (String tableName : tableNames) {
            JButton button = new JButton(tableName);
            button.addActionListener(this);
            button.setPreferredSize(new Dimension(200, 50)); // Thiết lập kích thước mới cho button
            menuPanel.add(button);
        }

        // Panel chứa thông tin người đăng nhập
        JPanel loggedInPanel = new JPanel(new BorderLayout());
        loggedInLabel = new JLabel("Đăng nhập với tên: Admin", JLabel.CENTER); // Thay đổi tên tùy theo người dùng đăng nhập
        JPanel loggedInInfoPanel = new JPanel(new GridBagLayout()); // Sử dụng GridBagLayout cho panel chứa thông tin đăng nhập

        // Thêm thông tin người dùng vào panel
        JTextArea userInfo = new JTextArea(4, 20);
        userInfo.setEditable(false); // Ngăn người dùng chỉnh sửa
        userInfo.setText("hotpost: Admin\nEmail: congtycophanphanphoivattu@gmail.com\nĐịa chỉ: Mỹ Đình - Hà Nội\nPhiên bản hiện tại: 0.0.1");

        // Thiết lập ràng buộc cho JTextArea
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(20, 20, 0, 20); // Khoảng cách từ biên trên
        loggedInInfoPanel.add(userInfo, gbc);
        
        loggedInPanel.add(loggedInLabel, BorderLayout.NORTH);
        loggedInPanel.add(loggedInInfoPanel, BorderLayout.CENTER);

        // Panel chứa nút thoát
        JPanel exitPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        exitButton = new JButton("Thoát");
        exitButton.addActionListener(this);
        exitButton.setPreferredSize(new Dimension(100, 50)); // Thiết lập kích thước mới cho button thoát
        exitPanel.add(exitButton);

        // Panel chứa các panel trên
        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.add(menuPanel, BorderLayout.WEST);
        mainPanel.add(loggedInPanel, BorderLayout.CENTER);
        mainPanel.add(exitPanel, BorderLayout.SOUTH);

        add(mainPanel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source instanceof JButton) {
            JButton button = (JButton) source;
            if (button == exitButton) {
                int choice = JOptionPane.showConfirmDialog(this, "Bạn có muốn thoát không?", "Xác nhận", JOptionPane.OK_CANCEL_OPTION);
                if (choice == JOptionPane.OK_OPTION) {
                    System.exit(0);
                }
            } else {
                // Mở form tương ứng với tên bảng
                String tableName = button.getText();
                openTableForm(tableName);
            }
        }
    }

    private void openTableForm(String tableName) {
        // Mở form tương ứng với tên bảng
        switch (tableName) {
            case "Danh mục vật tư":
            	DanhsachvattuForm danhMucVatTuForm = new DanhsachvattuForm();
                danhMucVatTuForm.setVisible(true);
                break;
            case "Nhà cung cấp":
                NhaCungCapForm nhaCungCapForm = new NhaCungCapForm();
                nhaCungCapForm.setVisible(true);
                break;
            case "Phiếu nhập vật tư":
                PhieuNhapForm phieuNhapVatTuForm = new PhieuNhapForm();
                phieuNhapVatTuForm.setVisible(true);
                break;
            case "Phiếu xuất vật tư":
                PhieuXuatForm phieuXuatVatTuForm = new PhieuXuatForm();
                phieuXuatVatTuForm.setVisible(true);
                break;
            default:
                JOptionPane.showMessageDialog(this, "Chức năng đang được phát triển!");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            MenuForm menuForm = new MenuForm();
            menuForm.setVisible(true);
        });
    }
}
