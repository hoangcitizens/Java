/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ADMIN
 */
@WebServlet(name = "vidu2", urlPatterns = {"/vidu2"})
public class vidu2 extends HttpServlet {
    private static final Map<String, String> COUNTRY_MAP = new HashMap<>();
    static {
        COUNTRY_MAP.put("vietnam", "Việt Nam");
        COUNTRY_MAP.put("nga", "Nga");
        COUNTRY_MAP.put("lao", "Lào");
        COUNTRY_MAP.put("trung", "Trung Quốc");
        COUNTRY_MAP.put("cuba", "Cuba");
        COUNTRY_MAP.put("ando", "Ấn Độ");
    }

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet vidu2</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet vidu2 at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);
        request.getRequestDispatcher("/view/vidu2.jsp").forward(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");

        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String gender = request.getParameter("gender");
        boolean married = request.getParameter("married") != null;
        String nationalityCode = request.getParameter("nationality");
        
        String notes = request.getParameter("notes");
        String[] hobbies = request.getParameterValues("hobbies");
        
        // Cách 1: hiển thị thông tin sang 1 trang khác (thongtinvidu2.jsp)
        // Chuyển đổi mã quốc gia thành tên đầy đủ
        //String nationality = getCountryName(nationalityCode);
//        StringBuilder hobbiesStr = new StringBuilder();
//        if (hobbies != null) {
//            for (String hobby : hobbies) {
//                hobbiesStr.append(hobby).append(", ");
//            }
//            if (hobbiesStr.length() > 2) {
//                hobbiesStr.setLength(hobbiesStr.length() - 2);
//            }
//        }
//        request.setAttribute("username", username);
//        request.setAttribute("gender", gender);
//        request.setAttribute("married", married ? "Đã kết hôn" : "Độc thân");
//        request.setAttribute("nationality", nationality);
//        request.setAttribute("hobbies", hobbiesStr.toString());
//        request.setAttribute("notes", notes);
//        request.getRequestDispatcher("/view/thongtinvidu2.jsp").forward(request, response);

        response.getWriter().println(">>Username: " + username);
        response.getWriter().println(">>Password: " + password);
        response.getWriter().println(">>Gender: " + gender);
        response.getWriter().println(">>Married: " + married);
        response.getWriter().println(">>Country: " + nationalityCode);
        response.getWriter().print(">>Hobbies: ");
        for (String item : hobbies) {
            response.getWriter().print(item + ", ");
        }
        response.getWriter().println("\nNotes: " + notes);

    }
    
    // method cho cách 1
    private String getCountryName(String code) {
        return COUNTRY_MAP.getOrDefault(code.toLowerCase(), code);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
