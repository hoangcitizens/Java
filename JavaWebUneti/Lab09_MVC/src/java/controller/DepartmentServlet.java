package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.DepartmentDAO;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

@WebServlet(name = "DepartmentServlet", urlPatterns = {"/DepartmentServlet"})
public class DepartmentServlet extends HttpServlet {

    KetNoi k = new KetNoi();
    DepartmentDAO departmentDao;
    DepartmentController departmentController;

    @Override
    public void init() throws ServletException {
        departmentDao = new DepartmentDAO();
        departmentController = new DepartmentController();
    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet DepartmentServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet DepartmentServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            departmentController.getAllDepartments(request);
            request.getRequestDispatcher("/view/departmentjsp.jsp").forward(request, response);
        } catch (SQLException e) {
            throw new ServletException(e);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DepartmentServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        String ids = request.getParameter("id");
        int id = (ids == null || ids.isEmpty()) ? 0 : Integer.parseInt(ids);
        String action = request.getParameter("chucnang");
        String name = request.getParameter("name");
        String description = request.getParameter("description");

        try {
            switch (action) {
                case "Create":
                    departmentController.createDepartment(name, description);
                    break;
                case "Update":
                    departmentController.updateDepartment(id, name, description);
                    break;
                case "Delete":
                    departmentController.deleteDepartment(id);
                    break;
                case "Sort":
                    departmentController.getAllDepartments(request);
                    request.getRequestDispatcher("/view/departmentjsp.jsp").forward(request, response);
                    break;
                default:
                    departmentController.getAllDepartments(request);
                    break;
            }
            response.sendRedirect("DepartmentServlet");

        } catch (SQLException e) {
            throw new ServletException(e);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DepartmentServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
