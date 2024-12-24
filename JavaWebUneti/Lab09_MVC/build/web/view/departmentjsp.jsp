<%-- 
    Document   : departmentjsp
    Created on : Nov 23, 2024, 1:22:28 PM
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
        <h1>QUẢN LÝ DEPARTMENT</h1>
        <form action="DepartmentServlet" method="post">
            <table>
                <tr>
                    <td>ID:</td>
                    <td><input type="text" name="id"></td>
                </tr>
                <tr>
                    <td>Name:</td>
                    <td><input type="text" name="name"></td>
                </tr>
                <tr>
                    <td>Description:</td>
                    <td><input type="text" name="description"></td>
                </tr>
                <tr>
                    <td colspan="2">
                        <input type="radio" name="sx" value="tang">Tăng
                        <input type="radio" name="sx" value="giam">Giảm
                        <input type="radio" name="sx" value="macdinh">Mặc định                     
                    </td>                   
                </tr>
                <tr>
                    <td colspan="2">
                        <input type="submit" name="chucnang" value="Create">
                        <input type="submit" name="chucnang" value="Update">
                        <input type="submit" name="chucnang" value="Delete">    
                        <input type="submit" name="chucnang" value="Sort"> 
                        <input type="submit" name="chucnang" value="Search">                   
                        <input type="reset" value="Reset">                  
                    </td>                   
                </tr>
            </table>
        </form>
        <h2>Department List</h2>
        <table border="1">
            <tr>
                <th>STT</th>
                <th>ID</th>
                <th>Name</th>
                <th>Description</th>
                <th>Action</th>
            </tr>
            <!-- Cách 1 dùng jstl -->
            <c:forEach var="department" items="${departments}" varStatus="status">
                <tr>
                    <td>${status.index + 1}</td>
                    <td>${department.id}</td>
                    <td>${department.name}</td>
                    <td>${department.description}</td>
                    <td>
                        <a href="DepartmentServlet?action=edit&id=${department.id}">Edit</a>
                    </td>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>
