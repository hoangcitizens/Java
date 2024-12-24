package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "LoginServlet_0320", urlPatterns = {"/LoginServlet_0320"})
public class LoginServlet_0320 extends HttpServlet {    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet LoginServlet_0320</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet LoginServlet_0320 at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);
        request.getRequestDispatcher("view/login.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {       
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        if ("nhhoang.dhti15a5hn@sv.uneti.edu.vn".equals(email) && "1234@".equals(password)) {
            request.getRequestDispatcher("view/displaysinhvien.jsp").forward(request, response);
        } else {
            response.sendRedirect("view/login.jsp");
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }
}
