package controller_vidu1;

import java.sql.*;

/**
 *
 * @author ADMIN
 */
public class ketnoi {
    Connection con;
    public Connection getConnection() throws ClassNotFoundException, SQLException {
        String URL = "jdbc:mysql://localhost:3306/quanlydiem_javaweb_lab6";
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
