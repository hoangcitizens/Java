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

    // Xóa cán bộ
    public void deleteLeader(int macb) throws SQLException, ClassNotFoundException {
        leaderDAO.deleteLeader(macb);
    }

    // Tìm kiếm theo tên cán bộ
    public void searchLeader(String keyword, HttpServletRequest request) throws SQLException, ClassNotFoundException {
        List<Leader> result = leaderDAO.searchLeader(keyword);
        request.setAttribute("leaders", result);
    }

    // Lấy danh sách tất cả cán bộ không có sắp xếp 
    public void getAllLeaders(HttpServletRequest request) throws SQLException, ClassNotFoundException {
        List<Leader> leaderList = leaderDAO.getAllLeaders();
        request.setAttribute("leaders", leaderList);
    }
}
