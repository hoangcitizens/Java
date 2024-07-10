package lab10;

import java.sql.*;
import java.sql.SQLException;

public class Test {
    public static void title()
    {
        System.out.printf("%-15s%-25s%-15s%-15s\n","ID","Họ và tên","Giới tính","Điểm TB");
    }
    public static void main(String[] args) throws SQLException {
        KetNoi kn = new KetNoi();
        if (kn.thuchienketnoi() == null)
            System.out.println("Không kết nối được đến dữ liệu");
        else
            System.out.println("Kết nối được đến thành công");
        ResultSet rs = kn.laydl();
        title();
        while(rs.next())
        {
            System.out.printf("%-15s%-25s%-15s%-15s\n",rs.getString("ID"),rs.getString("HoTen"),rs.getString("GioiTinh"),rs.getString("DiemTB"));
        }
        kn.laydl();
    }
}
