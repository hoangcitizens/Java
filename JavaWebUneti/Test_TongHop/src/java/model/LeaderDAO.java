package model;

import controller.KetNoi;
import java.sql.*;
import java.util.*;

public class LeaderDAO {

    KetNoi k = new KetNoi();

    public LeaderDAO() {
    }

    // Trường hợp không có sắp xếp
//    public List<Leader> getAllLeaders() throws SQLException, ClassNotFoundException {
//        List<Leader> list = new ArrayList<>();
//        k.getConnect(); // Kết nối cơ sở dữ liệu
//        String sql = "SELECT * FROM canbo";
//        try (Statement statement = k.con.createStatement(); 
//            ResultSet resultSet = statement.executeQuery(sql)) {
//            while (resultSet.next()) {
//                Leader leader = new Leader();
//                leader.setMacb(resultSet.getInt("macb"));
//                leader.setHoten(resultSet.getString("name"));
//                leader.setGioitinh(resultSet.getString("gioitinh"));
//                leader.setLuong(resultSet.getInt("luong"));
//                list.add(leader);
//            }
//        }
//        return list;
//    }
    // Trường hợp có sắp xếp
    public List<Leader> getAllLeaders(String sapxep) throws SQLException, ClassNotFoundException {
        List<Leader> list = new ArrayList<>();
        k.getConnect(); // Kết nối cơ sở dữ liệu
        String sql = "SELECT * FROM canbo";

        if ("tang".equalsIgnoreCase(sapxep)) {
            sql += " ORDER BY luong ASC";
        } else if ("giam".equalsIgnoreCase(sapxep)) {
            sql += " ORDER BY luong DESC";
        }

        try (PreparedStatement statement = k.con.prepareStatement(sql); 
                ResultSet resultSet = statement.executeQuery(sql)) {
            while (resultSet.next()) {
                Leader leader = new Leader();
                leader.setMacb(resultSet.getInt("macb"));
                leader.setHoten(resultSet.getString("hoten"));
                leader.setGioitinh(resultSet.getString("gioitinh"));
                leader.setLuong(resultSet.getInt("luong"));
                list.add(leader);
            }
        }
        return list;
    }

    // Thêm mới một cán bộ
    public void addLeader(Leader leader) throws SQLException, ClassNotFoundException {
        String sql = "INSERT INTO canbo (hoten, gioitinh, luong) VALUES (?, ?, ?)";
        // k.getConnect(); // Kết nối cơ sở dữ liệu
        try (PreparedStatement statement = k.con.prepareStatement(sql)) {
            statement.setString(1, leader.getHoten());
            statement.setString(2, leader.getGioitinh());
            statement.setInt(3, leader.getLuong());
            statement.executeUpdate();
        }
    }

    // Cập nhật thông tin cán bộ
    public void updateLeader(Leader leader) throws SQLException {
        String sql = "UPDATE canbo SET hoten = ?, gioitinh = ?, luong = ? WHERE macb = ?";
        try (PreparedStatement statement = k.con.prepareStatement(sql)) {
            statement.setString(1, leader.getHoten());
            statement.setString(2, leader.getGioitinh());
            statement.setInt(3, leader.getLuong());
            statement.setInt(4, leader.getMacb());
            statement.executeUpdate();
        }
    }

    // Xóa cán bộ theo mã cán bộ
    public void deleteLeader(int macb) throws SQLException, ClassNotFoundException {
        // k.getConnect(); // Kết nối cơ sở dữ liệu
        String sql = "DELETE FROM canbo WHERE macb = ?";
        try (PreparedStatement statement = k.con.prepareStatement(sql)) {
            statement.setInt(1, macb);
            statement.executeUpdate();
        }
    }

    // Tìm kiếm cán bộ theo họ tên
    public List<Leader> searchLeader(String keyword) throws SQLException, ClassNotFoundException {
        List<Leader> list = new ArrayList<>();
        k.getConnect(); // Kết nối cơ sở dữ liệu
        String sql = "SELECT * FROM canbo WHERE hoten LIKE ?";
        try (PreparedStatement statement = k.con.prepareStatement(sql)) {
            statement.setString(1, "%" + keyword + "%");
            try (ResultSet resultSet = statement.executeQuery()) {
                while (resultSet.next()) {
                    Leader leader = new Leader();
                    leader.setMacb(resultSet.getInt("macb"));
                    leader.setHoten(resultSet.getString("hoten"));
                    leader.setGioitinh(resultSet.getString("gioitinh"));
                    leader.setLuong(resultSet.getInt("luong"));
                    list.add(leader);
                }
            }
        }
        return list;
    }

    // Tìm kiếm cán bộ theo khoảng lương
    public List<Leader> searchLeader2(int minSalary, int maxSalary) throws SQLException, ClassNotFoundException {
        List<Leader> list = new ArrayList<>();
        k.getConnect(); // Kết nối cơ sở dữ liệu
        String sql = "SELECT * FROM canbo WHERE luong BETWEEN ? AND ?";
        try (PreparedStatement statement = k.con.prepareStatement(sql)) {
            statement.setInt(1, minSalary);
            statement.setInt(2, maxSalary);
            try (ResultSet resultSet = statement.executeQuery()) {
                while (resultSet.next()) {
                    Leader leader = new Leader();
                    leader.setMacb(resultSet.getInt("macb"));
                    leader.setHoten(resultSet.getString("hoten"));
                    leader.setGioitinh(resultSet.getString("gioitinh"));
                    leader.setLuong(resultSet.getInt("luong"));
                    list.add(leader);
                }
            }
        }
        return list;
    }

    // Tìm kiếm cán bộ theo mã cán bộ
    public List<Leader> searchLeaderById(int macb) throws SQLException, ClassNotFoundException {
        List<Leader> list = new ArrayList<>();
        k.getConnect(); // Kết nối cơ sở dữ liệu
        String sql = "SELECT * FROM canbo WHERE macb = ?";
        try (PreparedStatement statement = k.con.prepareStatement(sql)) {
            statement.setInt(1, macb);
            try (ResultSet resultSet = statement.executeQuery()) {
                while (resultSet.next()) {
                    Leader leader = new Leader();
                    leader.setMacb(resultSet.getInt("macb"));
                    leader.setHoten(resultSet.getString("hoten"));
                    leader.setGioitinh(resultSet.getString("gioitinh"));
                    leader.setLuong(resultSet.getInt("luong"));
                    list.add(leader);
                }
            }
        }
        return list;
    }
    public List<Leader> luongmax() throws ClassNotFoundException, SQLException {
        List<Leader> list = new ArrayList<>();
        k.getConnect();
        String sql = "SELECT * FROM canbo WHERE luong = (SELECT MAX(luong) FROM canbo)";

        try (PreparedStatement st = k.con.prepareStatement(sql); ResultSet rs = st.executeQuery(sql)) {
            while (rs.next()) {
                Leader leader = new Leader();
                leader.setMacb(rs.getInt("macb"));
                leader.setHoten(rs.getString("hoten"));
                leader.setGioitinh(rs.getString("gioitinh"));
                leader.setLuong(rs.getInt("luong"));
                list.add(leader);
            }
        }

        return list;
    }
    
    public List<Leader> tongluong() throws ClassNotFoundException, SQLException {
        List<Leader> list = new ArrayList<>();
        k.getConnect();
        String sql = "SELECT * FROM canbo";

        try (PreparedStatement st = k.con.prepareStatement(sql); ResultSet rs = st.executeQuery(sql)) {
            while (rs.next()) {
                Leader leader = new Leader();
                leader.setMacb(rs.getInt("macb"));
                leader.setHoten(rs.getString("hoten"));
                leader.setGioitinh(rs.getString("gioitinh"));
                leader.setLuong(rs.getInt("luong"));
                list.add(leader);
            }
        }

        return list;
    }
}
