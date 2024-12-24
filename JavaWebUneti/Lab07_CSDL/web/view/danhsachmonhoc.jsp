<%-- 
    Document   : danhsachmonhoc
    Created on : Nov 9, 2024, 3:16:32 PM
    Author     : ADMIN
--%>

<%@ page import="java.sql.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h2>Danh sách môn học</h2>
        <table>
            <tr>
                <th>Mã môn</th>
                <th>Tên môn</th>
                <th>Số tiết</th>
            </tr>
            <%
                ResultSet resultset = (ResultSet) request.getAttribute("resultSet");
                try {
                    while (resultset != null && resultset.next()) {
                        String mamon = resultset.getString("mamon");
                        String tenmon = resultset.getString("tenmon");
                        int sotiet = resultset.getInt("sotiet");
             %>
             <tr>
                 <td><%= mamon %></td>
                 <td><%= tenmon %></td>
                 <td><%= sotiet %></td>               
             </tr>
             <%
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
             %>
        </table>
    </body>
</html>
