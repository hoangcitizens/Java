<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>ĐĂNG NHẬP TÀI KHOẢN</h1>
        <form action="LoginServlet" method="post">
            <table>
                <tr>
                    <td>Tài khoản</td>
                    <td>
                        <input type="text" name="username"> 
                    </td>
                </tr>
                <tr>
                    <td>Mật khẩu</td>
                    <td>
                        <input type="password" name="password"> 
                    </td>
                </tr>
                <tr>
                    <td></td>
                    <td>
                        <input type="submit" name="dangnhap" value="Đăng nhập">                        
                        <input type="reset" value="Nhập lại">
                    </td>
                </tr>
            </table>
        </form>
    </body>
</html>