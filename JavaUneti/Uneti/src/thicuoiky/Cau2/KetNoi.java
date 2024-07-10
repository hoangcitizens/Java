/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package thicuoiky.Cau2;

import java.sql.*;

public class KetNoi {
   public Connection cn = null;
   public Connection thucHienKetNoi() throws SQLException
   {
       String path = "jdbc:mysql://localhost:3306/qlsv";
       this.cn = DriverManager.getConnection(path,"root","");
       return cn;
   }
   public ResultSet laydl() throws SQLException
   {
       Connection cnn = null;
       cnn = thucHienKetNoi();
       Statement st = cnn.createStatement();
       String sql = "SELECT * FROM sinhvien";
       ResultSet rs = st.executeQuery(sql);
       return rs;
   }
   public ResultSet timKiem(String ten) throws SQLException
   {
       Connection cnn = thucHienKetNoi();
       Statement st = cnn.createStatement();
       String sql = "SELECT * FROM sinhvien WHERE tensv LIKE '%" + ten + "%'";
       ResultSet rs = st.executeQuery(sql);
       return rs;
   }
   public void xoa(int id) throws SQLException
   {
       Connection cnn = thucHienKetNoi();
       Statement st = cnn.createStatement();
       String sql = "DELETE FROM sinhvien WHERE masv = " + id;
       st.executeUpdate(sql);
   }
   public void them(int id,String ten,String que,double diem) throws SQLException
   {
       Connection cnn = thucHienKetNoi();
       String sql = "INSERT INTO sinhvien(masv,tensv,quequan,diemtb) VALUES(?,?,?,?)";
       PreparedStatement st = cnn.prepareStatement(sql);
       st.setInt(1, id);
       st.setString(2, ten);
       st.setString(3, que);
       st.setDouble(4, diem);
       st.executeUpdate();
   }
       public void sua(int id,String ten,String que,double diem) throws SQLException
   {
       Connection cnn = thucHienKetNoi();
       String sql = "UPDATE sinhvien SET tensv=?,quequan=?,diemtb=? WHERE masv = ?";
       PreparedStatement st = cnn.prepareStatement(sql);
       st.setString(1, ten);
       st.setString(2, que);
       st.setDouble(3, diem);
       st.setInt(4, id);
       st.executeUpdate();
       cnn.close();
   }
}
