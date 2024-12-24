package controller;

import java.sql.*;
import java.util.*;
import javax.servlet.http.HttpServletRequest;
import model.Department;
import model.DepartmentDAO;

public class DepartmentController {

    private DepartmentDAO departmentDAO;

    public DepartmentController() {
        departmentDAO = new DepartmentDAO();
    }

    // Tạo mới một phòng ban
    public void createDepartment(String name, String description) throws SQLException, ClassNotFoundException {
        Department department = new Department();
        department.setName(name);
        department.setDescription(description);
        departmentDAO.addDepartment(department);
    }

    // Cập nhật thông tin phòng ban
    public void updateDepartment(int id, String name, String description) throws SQLException {
        Department department = new Department(id, name, description);  
        departmentDAO.updateDepartment(department);
    }

    // Xóa phòng ban
    public void deleteDepartment(int id) throws SQLException, ClassNotFoundException {
        departmentDAO.deleteDepartment(id);
    }

    // Lấy danh sách tất cả phòng ban không có sắp xếp
    /*
    public void getAllDepartments(HttpServletRequest request) throws SQLException, ClassNotFoundException {
        List<Department> departmentList = departmentDAO.getAllDepartments();
        request.setAttribute("departments", departmentList);
    }
     */
    public void getAllDepartments(HttpServletRequest request) throws SQLException, ClassNotFoundException {
        String sapxep = request.getParameter("sx");
        List<Department> departmentList;

        if ("tang".equals(sapxep)) {
            departmentList = departmentDAO.getAllDepartments("tang");
        } else if ("giam".equals(sapxep)) {
            departmentList = departmentDAO.getAllDepartments("giam");
        } else {
            departmentList = departmentDAO.getAllDepartments(null); // Mặc định không sắp xếp
        }

        request.setAttribute("departments", departmentList);
    }
}
