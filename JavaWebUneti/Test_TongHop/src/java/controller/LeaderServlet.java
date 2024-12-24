package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.LeaderDAO;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

@WebServlet(name = "LeaderServlet", urlPatterns = {"/LeaderServlet"})
public class LeaderServlet extends HttpServlet {

    KetNoi k = new KetNoi();
    LeaderDAO leaderDao;
    LeaderController leaderController;

    @Override
    public void init() throws ServletException {
        leaderDao = new LeaderDAO();
        leaderController = new LeaderController();
    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet LeaderServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet LeaderServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);
        try {
            leaderController.getAllLeaders(request);
            request.getRequestDispatcher("/view/display.jsp").forward(request, response);
        } catch (SQLException e) {
            throw new ServletException(e);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LeaderServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        String macbs = request.getParameter("macb");
        int macb = (macbs == null || macbs.isEmpty()) ? 0 : Integer.parseInt(macbs);
        String action = request.getParameter("chucnang");
        String hoten = request.getParameter("hoten");
        String gioitinh = request.getParameter("gioitinh");
        String luongs = request.getParameter("luong");
        int luong = (luongs == null || luongs.isEmpty()) ? 0 : Integer.parseInt(luongs);

        String luongmins = request.getParameter("luongmin");
        String luongmaxs = request.getParameter("luongmax");
        int luongmin = (luongmins == null || luongmins.isEmpty()) ? 0 : Integer.parseInt(luongmins);
        int luongmax = (luongmaxs == null || luongmaxs.isEmpty()) ? 0 : Integer.parseInt(luongmaxs);

        try {
            switch (action) {
                case "Create":
                    leaderController.createLeader(hoten, gioitinh, luong);
                    break;
                case "Update":
                    leaderController.updateLeader(macb, hoten, gioitinh, luong);
                    break;
                case "Delete":
                    leaderController.deleteLeader(macb);
                    break;
                case "Sort":
                    leaderController.getAllLeaders(request);
                    request.getRequestDispatcher("/view/display.jsp").forward(request, response);
                    break;
                case "Search":
                    leaderController.searchLeader(hoten, request);
                    request.getRequestDispatcher("/view/display.jsp").forward(request, response);
                    break;
                case "Search Luong Min Max":
                    leaderController.searchLeader2(luongmin, luongmax, request);
                    request.getRequestDispatcher("/view/display.jsp").forward(request, response);
                    break;
                case "Search Macb":
                    leaderController.searchLeaderById(macb, request);
                    request.getRequestDispatcher("/view/display.jsp").forward(request, response);
                    break;
                case "luongmax":
                    leaderController.luongmax(request);
                    request.getRequestDispatcher("/view/display.jsp").forward(request, response);
                    break;
                case "tongluong":
                    leaderController.getAllLeaders(request);
                    leaderController.tongluong(request);
                    request.getRequestDispatcher("/view/display.jsp").forward(request, response);
                    break;
                default:
                    leaderController.getAllLeaders(request);
                    break;
            }
            response.sendRedirect("LeaderServlet");

        } catch (SQLException e) {
            throw new ServletException(e);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LeaderServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public String getServletInfo() {
        return "Short gioitinh";
    }// </editor-fold>

}
