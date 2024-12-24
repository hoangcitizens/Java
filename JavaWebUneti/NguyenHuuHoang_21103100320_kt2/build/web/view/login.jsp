<%-- 
    Document   : login
    Created on : Nov 16, 2024, 12:53:17 PM
    Author     : ADMIN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Đăng nhập tài khoản</title>
    </head>
    <style>
        body {
            display: flex;
            align-items: center;
            justify-content: center;
            height: 100vh;
            margin: 0;
        }      
        h1 {          
            text-align: center;           
        }
    </style>
    <body>
        <div class="container">
            <h1>Đăng nhập tài khoản</h1>
            <form action="LoginServlet_0320" method="POST">
                <table>
                    <tr>
                        <td>Email:</td>
                        <td> <input type="text" name="email" required><br></td>
                    </tr>
                    <tr>
                        <td>Password</td>
                        <td> <input type="password" name="password" required><br> </td>
                    </tr>
                    <tr>
                        <td></td>
                        <td>
                            <button type="submit">LOGIN</button>
                            <button type="reset">RESET</button>
                        </td>
                    </tr>
                </table>     
            </form>
        </div>
    </body>
</html>
