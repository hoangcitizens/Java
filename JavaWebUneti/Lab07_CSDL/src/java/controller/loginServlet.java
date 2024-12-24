package controller;

import java.sql.*;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "loginServlet", urlPatterns = {"/loginServlet"})
public class loginServlet extends HttpServlet {

    ketnoi k = new ketnoi();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet loginServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet loginServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.getRequestDispatcher("/view/login.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String chucnang = request.getParameter("chucnang");
        String sapxep = request.getParameter("sapxep");
        try {
            k.getConnection(); // gọi pt kết nối
            switch (chucnang) {
                case "Thêm":
                    addUser(username, password);
                    break;
                case "Sửa":
                    updateUser(username, password);
                    break;
                case "Xóa":
                    deleteUser(username);
                    break;
                case "Sắp xếp":                   
                    break;
                default:
                    System.out.println("<h2>Invalid action</h2>");
                    break;
            }
            request.getRequestDispatcher("/view/login.jsp").include(request, response);
            getall(response,sapxep);
        } catch (Exception e) {
            e.fillInStackTrace();
        }
    }

    private void addUser(String username, String password) throws SQLException {
        String sql = "INSERT INTO user (username, password) VALUES (?, ?)";
        try (PreparedStatement stm = k.con.prepareStatement(sql)) {
            stm.setString(1, username);
            stm.setString(2, password);
            stm.executeUpdate();
        }
    }

    private void updateUser(String username, String password) throws SQLException {
        String sql = "UPDATE user SET password = ? WHERE username = ?";
        try (PreparedStatement stm = k.con.prepareStatement(sql)) {
            stm.setString(1, password);
            stm.setString(2, username);
            stm.executeUpdate();
        }
    }

    private void deleteUser(String username) throws SQLException {
        String sql = "DELETE FROM user WHERE username = ?";
        try (PreparedStatement stm = k.con.prepareStatement(sql)) {
            stm.setString(1, username);
            stm.executeUpdate();
        }
    }

    public void getall(HttpServletResponse response,String sapxep) {
        try {
            k.getConnection();
            String sql = "SELECT * FROM user";
            if ("tangdan".equalsIgnoreCase(sapxep)) {
                sql += " ORDER BY username ASC";
            } else if ("giamdan".equalsIgnoreCase(sapxep)) {
                sql += " ORDER BY username DESC";
            }
            PreparedStatement stm = k.con.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            PrintWriter out = response.getWriter();
            response.setContentType("text/html");
            out.println("<table border='1'>");
            out.println("<tr><th>STT</th><th>Username</th><th>Password</th></tr>");
            while (rs.next()) {
                int stt = rs.getInt(1);
                String user = rs.getString(2);
                String pass = rs.getString(3);

                out.println("<tr>");
                out.println("<td>" + stt + "</td>");
                out.println("<td>" + user + "</td>");
                out.println("<td>" + pass + "</td>");
                out.println("</tr>");
            }
            out.println("</table>");
            rs.close();
            stm.close();
            k.con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
