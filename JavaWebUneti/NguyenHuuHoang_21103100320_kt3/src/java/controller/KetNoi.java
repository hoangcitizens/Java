package controller;

import java.sql.*;

public class KetNoi {
    public Connection con;
    public Connection getConnect() throws ClassNotFoundException, SQLException {
        String URL = "jdbc:mysql://localhost:3306/qlcb_kt3";
        String user = "root";
        String password = "";
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection(URL, user, password);
        return con;
    }
    public void disconnect() throws SQLException {
        con.close();
    }
}
