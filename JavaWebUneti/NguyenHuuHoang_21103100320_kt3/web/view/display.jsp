<%-- 
    Document   : display
    Created on : Nov 30, 2024, 12:50:50 PM
    Author     : ADMIN
--%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Quản lý cán bộ</h1>
        <form action="LeaderServlet" method="post">
            <table>
                <tr>
                    <td>Mã cán bộ:</td>
                    <td><input type="text" name="macb"></td>
                </tr>
                <tr>
                    <td>Họ tên:</td>
                    <td><input type="text" name="hoten"></td>
                </tr>
                <tr>
                    <td>Giới tính:</td>
                    <td><input type="text" name="gioitinh"></td>
                </tr>
                <tr>
                    <td>Lương:</td>
                    <td><input type="text" name="luong"></td>
                </tr>                
                <tr>
                    <td colspan="2">
                        <input type="submit" name="chucnang" value="Create">
                        <input type="submit" name="chucnang" value="Delete">    
                        <input type="submit" name="chucnang" value="Search">                   
                        <input type="reset" value="Reset">                  
                    </td>                   
                </tr>
            </table>
        </form>
        <h2>Danh sách cán bộ</h2>
        <table border="1">
            <tr>
                <th>STT</th>
                <th>Mã cán bộ</th>
                <th>Tên cán bộ</th>
                <th>Giới tính</th>
                <th>Lương</th>
                <th>Thuế</th>                           
            </tr>
            <!-- Cách 1 dùng jstl -->
            <c:forEach var="leader" items="${leaders}" varStatus="status">
                <tr>
                    <td>${status.index + 1}</td>
                    <td>${leader.macb}</td>
                    <td>${leader.hoten}</td>
                    <td>${leader.gioitinh}</td>
                    <td>${leader.luong}</td>                   
                    <td>${leader.thue()}</td>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>
