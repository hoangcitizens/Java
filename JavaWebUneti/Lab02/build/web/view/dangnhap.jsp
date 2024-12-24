<%-- 
    Document   : dangky
    Created on : Sep 28, 2024, 2:11:15 PM
    Author     : ADMIN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Đăng nhập</title>
    </head>
    <style>
        body {
            font-family: 'Arial', sans-serif;
            background-color: #f0f2f5;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            margin: 0;
        }

        .container {
            background-color: white;
            padding: 2rem;
            border-radius: 8px;
            box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
            width: 100%;
            max-width: 400px;
        }

        h1 {
            color: #1877f2;
            text-align: center;
            margin-bottom: 1.5rem;
        }

        form {
            display: flex;
            flex-direction: column;
        }

        input[type="text"],
        input[type="email"],
        input[type="password"] {
            margin-bottom: 1rem;
            padding: 0.8rem;
            border: 1px solid #dddfe2;
            border-radius: 6px;
            font-size: 1rem;
        }

        input[type="submit"] {
            background-color: #1877f2;
            color: white;
            border: none;
            border-radius: 6px;
            padding: 0.8rem;
            font-size: 1.1rem;
            cursor: pointer;
            transition: background-color 0.3s ease;
            width: 100%;
            max-width: 200px;
            margin: 1rem auto 0;
        }

        input[type="submit"]:hover {
            background-color: #166fe5;
        }

        p {
            text-align: center;
            margin-top: 1rem;
            color: #606770;
        }

        .a {
            color: #1877f2;
            text-decoration: none;
            cursor: pointer;
            background: none;
            border: none;
            font-size: 1rem;
        }

        .a:hover {
            text-decoration: underline;
        }

        h5 {
            color: #ff4d4f;
            text-align: center;
            margin-top: 1rem;
        }
    </style>
    <body>
        <div class="container">
            <h1>ĐĂNG NHẬP</h1>
            <form action="taikhoan" method="post" >
                <input type="text" id="username" name="username" placeholder="Tên đăng nhập" required >
                <input type="password" id="password" name="password" placeholder="Mật khẩu" required >
                <p>Bạn chưa có tài khoản? <input type="button" name="action" value="register" value="Đăng Ký" class="a"></p>
                <center><input type="submit" value="Đăng nhập"></center>
            </form>
        </div>
    </body>
</html>
