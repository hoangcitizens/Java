package model;

import controller.KetNoi;
import java.sql.*;
import java.util.*;

public class DepartmentDAO {

    KetNoi k = new KetNoi();

    public DepartmentDAO() {
    }
    
    // Trường hợp không có sắp xếp
//    public List<Department> getAllDepartments() throws SQLException, ClassNotFoundException {
//        List<Department> list = new ArrayList<>();
//        k.getConnect(); // Kết nối cơ sở dữ liệu
//        String sql = "SELECT * FROM department";
//        try (Statement statement = k.con.createStatement(); 
//            ResultSet resultSet = statement.executeQuery(sql)) {
//            while (resultSet.next()) {
//                Department department = new Department();
//                department.setId(resultSet.getInt("id"));
//                department.setName(resultSet.getString("name"));
//                department.setDescription(resultSet.getString("description"));
//                list.add(department);
//            }
//        }
//        return list;
//    }

    // Trường hợp có sắp xếp
    public List<Department> getAllDepartments(String sapxep) throws SQLException, ClassNotFoundException {
        List<Department> list = new ArrayList<>();
        k.getConnect(); // Kết nối cơ sở dữ liệu
        String sql = "SELECT * FROM department";

        if ("tang".equalsIgnoreCase(sapxep)) {
            sql += " ORDER BY name ASC";
        } else if ("giam".equalsIgnoreCase(sapxep)) {
            sql += " ORDER BY name DESC";
        }

        try (PreparedStatement statement = k.con.prepareStatement(sql); ResultSet resultSet = statement.executeQuery(sql)) {
            while (resultSet.next()) {
                Department department = new Department();
                department.setId(resultSet.getInt("id"));
                department.setName(resultSet.getString("name"));
                department.setDescription(resultSet.getString("description"));
                list.add(department);
            }
        }
        return list;
    }
    
    // Thêm mới một phòng ban
    public void addDepartment(Department department) throws SQLException, ClassNotFoundException {
        String sql = "INSERT INTO department (name, description) VALUES (?, ?)";
        // k.getConnect(); // Kết nối cơ sở dữ liệu
        try (PreparedStatement statement = k.con.prepareStatement(sql)) {
            statement.setString(1, department.getName());
            statement.setString(2, department.getDescription());
            statement.executeUpdate();
        }
    }

    // Cập nhật thông tin phòng ban
    public void updateDepartment(Department department) throws SQLException {
        String sql = "UPDATE department SET name = ?, description = ? WHERE id = ?";
        try (PreparedStatement statement = k.con.prepareStatement(sql)) {
            statement.setString(1, department.getName());
            statement.setString(2, department.getDescription());
            statement.setInt(3, department.getId());
            statement.executeUpdate();
        }
    }

    // Xóa phòng ban theo ID
    public void deleteDepartment(int id) throws SQLException, ClassNotFoundException {
        // k.getConnect(); // Kết nối cơ sở dữ liệu
        String sql = "DELETE FROM department WHERE id = ?";
        try (PreparedStatement statement = k.con.prepareStatement(sql)) {
            statement.setInt(1, id);
            statement.executeUpdate();
        }
    }
}
