package lab10;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class KetNoi {

    public Connection cn = null;

    public Connection thuchienketnoi() throws SQLException {
        String path = "jdbc:mysql://localhost:3306/QuanLySinhVien";
        this.cn = DriverManager.getConnection(path, "root", "");
        return cn;
    }

    public ResultSet laydl() throws SQLException {
        Connection cnn = null;
        cnn = thuchienketnoi();
        Statement st = cnn.createStatement();
        String sql = "select * from student";
        ResultSet rs = st.executeQuery(sql);
        return rs;
    }

    public void xoa(int id) throws SQLException {
        Connection kn = thuchienketnoi();
        Statement st = kn.createStatement();
        String sql = "delete from student where ID=" + id;
        st.executeUpdate(sql);
    }

    public void them(int id, String hoten, String gioitinh, double diem) throws SQLException {
        Connection kn = thuchienketnoi();
        String sql = "insert into student(ID,HoTen,GioiTinh,DiemTB) values(?,?,?,?)";
        PreparedStatement st = kn.prepareStatement(sql);
        st.setInt(1, id);
        st.setString(2, hoten);
        st.setString(3, gioitinh);
        st.setDouble(4, diem);
        st.executeUpdate();
    }

    public void sua(int id, String hoten, String gioitinh, double diem) throws SQLException {
        Connection kn = thuchienketnoi();
        String sql = "UPDATE student SET HoTen=?, GioiTinh=?, DiemTB=? WHERE ID=?";
        PreparedStatement st = kn.prepareStatement(sql);
        st.setString(1, hoten);
        st.setString(2, gioitinh);
        st.setDouble(3, diem);
        st.setInt(4, id);
        st.executeUpdate();
        kn.close();
    }

    public ResultSet timkiem(String ten) throws SQLException {
        Connection kn = thuchienketnoi();
        Statement st = kn.createStatement();
        String sql = "select * from student where HoTen like '%" + ten + "%'";
        ResultSet rs = st.executeQuery(sql);
        return rs;
    }
}
