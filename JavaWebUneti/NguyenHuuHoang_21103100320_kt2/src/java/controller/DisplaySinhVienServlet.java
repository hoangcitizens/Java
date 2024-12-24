package controller;

import java.sql.*;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "DisplaySinhVienServlet", urlPatterns = {"/DisplaySinhVienServlet"})
public class DisplaySinhVienServlet extends HttpServlet {
    KetNoi k = new KetNoi();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet DisplaySinhVienServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet DisplaySinhVienServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        Statement statement = null;
        ResultSet resultset = null;

        String sapxep = request.getParameter("sapxep");
        try {
            k.getConnection();
            String sql = "SELECT * FROM sinhvien";
            if ("tangdan".equalsIgnoreCase(sapxep)) {
                sql += " ORDER BY diem ASC";
            } else if ("macdinh".equalsIgnoreCase(sapxep)) {
                sql += "";
            }
            statement = k.con.createStatement();
            resultset = statement.executeQuery(sql);
            request.setAttribute("resultSet", resultset);
            request.getRequestDispatcher("/view/displaysinhvien.jsp").forward(request, response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");

        int masv = Integer.parseInt(request.getParameter("masv"));
        String hoten = request.getParameter("hoten");
        String gioitinh = request.getParameter("gioitinh");
        double diem = Double.parseDouble(request.getParameter("diem"));
        String quequan = request.getParameter("quequan");
        String chucnang = request.getParameter("chucnang");

        try {
            k.getConnection(); // gọi pt kết nối
            switch (chucnang) {
                case "Thêm":
                    addStudent(masv, hoten, gioitinh, diem, quequan);
                    break;
                case "Xóa":
                    deleteStudent(masv);
                    break;
                default:
                    System.out.println("<h2>Không có chức năng này</h2>");
                    break;
            }
            //  request.getRequestDispatcher("/view/displaysinhvien.jsp").include(request, response);
            //  getall(response)

            // Lấy danh sách sản phẩm sau khi thực hiện thêm/xóa
            String sql = "SELECT * FROM sinhvien";
            PreparedStatement stm = k.con.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            request.setAttribute("resultSet", rs);
            request.getRequestDispatcher("/view/displaysinhvien.jsp").forward(request, response);
            rs.close();
            stm.close();
            k.con.close();
        } catch (Exception e) {
            e.fillInStackTrace();
        }
    }

    private void addStudent(int masv, String hoten, String gioitinh, double diem, String quequan) throws SQLException {
        String sql = "INSERT INTO sinhvien (masv, hoten, gioitinh, diem, quequan) VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement stm = k.con.prepareStatement(sql)) {
            stm.setInt(1, masv);
            stm.setString(2, hoten);
            stm.setString(3, gioitinh);
            stm.setDouble(4, diem);
            stm.setString(5, quequan);
            stm.executeUpdate();
        }
    }

    private void deleteStudent(int masv) throws SQLException {
        String sql = "DELETE FROM sinhvien WHERE masv = ?";
        try (PreparedStatement stm = k.con.prepareStatement(sql)) {
            stm.setInt(1, masv);
            stm.executeUpdate();
        }
    }

    //    public void getall(HttpServletResponse response) {
//        try {
//            k.getConnection();
//            String sql = "SELECT * FROM sinhvien";
//            PreparedStatement stm = k.con.prepareStatement(sql);
//            ResultSet rs = stm.executeQuery();
//            PrintWriter out = response.getWriter();
//            response.setContentType("text/html");
//            out.println("<table border='1'>");
//            out.println("<tr><th>Mã sinh viên</th><th>Họ tên</th><th>Giới tính</th><th>Điểm</th><th>Quê quán</th></tr>");
//            while (rs.next()) {
//                int masv = rs.getInt(1);
//                String hoten = rs.getString(2);
//                String gioitinh = rs.getString(3);
//                double diem = rs.getDoulbe(4);
//                String quequan = rs.getString(5);
//
//                out.println("<tr>");
//                out.println("<td>" + masv + "</td>");
//                out.println("<td>" + hoten + "</td>");
//                out.println("<td>" + gioitinh + "</td>");
//                out.println("<td>" + diem + "</td>");
//                out.println("<td>" + quequan + "</td>");
//                out.println("</tr>");
//            }
//            out.println("</table>");
//            rs.close();
//            stm.close();
//            k.con.close();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
