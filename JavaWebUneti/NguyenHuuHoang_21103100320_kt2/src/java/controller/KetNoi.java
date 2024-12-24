package controller;

import java.sql.*;


public class KetNoi {
    Connection con;
    public Connection getConnection() throws ClassNotFoundException, SQLException {
        String URL = "jdbc:mysql://localhost:3306/qlsv_kt2";
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
