<%-- 
    Document   : vidu1
    Created on : Nov 2, 2024, 2:40:55 PM
    Author     : ADMIN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h2>Đăng nhập tài khoản</h2>
        <form action="loginServlet" method="post">
            <table>
                <tr>
                    <td>Username:</td>
                    <td> <input type="text" name="username" required> </td>
                </tr>
                <tr>
                    <td>Password:</td>
                    <td> <input type="password" name="password" required> </td>
                </tr>  
                <tr>
                    <td>Sắp xếp:</td>
                    <td>
                        <input type="radio" name="sapxep" value="tangdan" checked> Tăng dần
                        <input type="radio" name="sapxep" value="giamdan"> Giảm dần
                        <input type="radio" name="sapxep" value="macdinh"> Mặc định theo tên
                    </td>
                </tr>
                <tr>
                    <td></td>
                    <td>
                        <input type="submit" name="chucnang" value="Thêm">
                        <input type="submit" name="chucnang" value="Sửa">
                        <input type="submit" name="chucnang" value="Xóa">
                        <input type="submit" name="chucnang" value="Sắp xếp">
                        <input type="reset" value="Reset">
                    </td>
                </tr>
            </table>
        </form>      
    </body>
</html>
