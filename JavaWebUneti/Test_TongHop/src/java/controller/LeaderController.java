package controller;

import java.sql.*;
import java.util.*;
import javax.servlet.http.HttpServletRequest;
import model.Leader;
import model.LeaderDAO;

public class LeaderController {

    private LeaderDAO leaderDAO;

    public LeaderController() {
        leaderDAO = new LeaderDAO();
    }

    // Tạo mới một cán bộ
    public void createLeader(String hoten, String gioitinh, int luong) throws SQLException, ClassNotFoundException {
        Leader leader = new Leader();
        leader.setHoten(hoten);
        leader.setGioitinh(gioitinh);
        leader.setLuong(luong);
        leaderDAO.addLeader(leader);
    }

    // Cập nhật thông tin cán bộ
    public void updateLeader(int macb, String hoten, String gioitinh, int luong) throws SQLException {
        Leader leader = new Leader(macb, hoten, gioitinh, luong);
        leaderDAO.updateLeader(leader);
    }

    // Xóa cán bộ
    public void deleteLeader(int macb) throws SQLException, ClassNotFoundException {
        leaderDAO.deleteLeader(macb);
    }

    public void searchLeader(String keyword, HttpServletRequest request) throws SQLException, ClassNotFoundException {
        // Gọi DAO để thực hiện tìm kiếm
        List<Leader> result = leaderDAO.searchLeader(keyword);
        // Đặt danh sách kết quả vào request để truyền đến JSP
        request.setAttribute("leaders", result);
    }

    public void searchLeader2(int minSalary, int maxSalary, HttpServletRequest request) throws SQLException, ClassNotFoundException {
        // Gọi DAO để thực hiện tìm kiếm
        List<Leader> result = leaderDAO.searchLeader2(minSalary, maxSalary);

        // Đặt danh sách kết quả vào request để truyền đến JSP
        request.setAttribute("leaders", result);
    }
    
    public void searchLeaderById(int macb, HttpServletRequest request) throws SQLException, ClassNotFoundException {
        // Gọi DAO để thực hiện tìm kiếm
        List<Leader> result = leaderDAO.searchLeaderById(macb);

        // Đặt danh sách kết quả vào request để truyền đến JSP
        request.setAttribute("leaders", result);
    }

    // Lấy danh sách tất cả cán bộ không có sắp xếp
    /*
    public void getAllLeaders(HttpServletRequest request) throws SQLException, ClassNotFoundException {
        List<Leader> leaderList = leaderDAO.getAllLeaders();
        request.setAttribute("leaders", leaderList);
    }
     */
    public void getAllLeaders(HttpServletRequest request) throws SQLException, ClassNotFoundException {
        String sapxep = request.getParameter("sx");
        List<Leader> leaderList;

        if ("tang".equals(sapxep)) {
            leaderList = leaderDAO.getAllLeaders("tang");
        } else if ("giam".equals(sapxep)) {
            leaderList = leaderDAO.getAllLeaders("giam");
        } else {
            leaderList = leaderDAO.getAllLeaders(null); // Mặc định không sắp xếp
        }

        request.setAttribute("leaders", leaderList);
    }
    
    public void luongmax(HttpServletRequest request) throws ClassNotFoundException, SQLException {       
        List<Leader> list = leaderDAO.luongmax();       
        request.setAttribute("leaders", list);      
    }
    
    public void tongluong(HttpServletRequest request) throws ClassNotFoundException, SQLException {       
        List<Leader> list = leaderDAO.tongluong();       
        request.setAttribute("tongluong", list);      
    }
}
