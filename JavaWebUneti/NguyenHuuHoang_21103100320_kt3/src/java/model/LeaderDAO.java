package model;

import controller.KetNoi;
import java.sql.*;
import java.util.*;

public class LeaderDAO {

    KetNoi k = new KetNoi();

    public LeaderDAO() {
    }

    public List<Leader> getAllLeaders() throws SQLException, ClassNotFoundException {
        List<Leader> list = new ArrayList<>();
        k.getConnect(); // Kết nối cơ sở dữ liệu
        String sql = "SELECT * FROM canbo";
        try (Statement statement = k.con.createStatement(); ResultSet resultSet = statement.executeQuery(sql)) {
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

    // Xóa phòng ban theo mã cán bộ
    public void deleteLeader(int macb) throws SQLException, ClassNotFoundException {
        // k.getConnect(); // Kết nối cơ sở dữ liệu
        String sql = "DELETE FROM canbo WHERE macb = ?";
        try (PreparedStatement statement = k.con.prepareStatement(sql)) {
            statement.setInt(1, macb);
            statement.executeUpdate();
        }
    }

    // Tìm kiếm theo tên các bộ
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
}
