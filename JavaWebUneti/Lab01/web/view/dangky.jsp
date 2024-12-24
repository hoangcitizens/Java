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
        <title>JSP Page</title>
    </head>
    <style>
        /* Reset cơ bản */
        * {
            margin: 0;
            padding: 0;
            box-sizing: border-box;
        }

        /* Thiết lập toàn trang */
        body {
            font-family: 'Arial', sans-serif;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            background-color: #f5f5f5;
        }

        /* Container của form đăng ký */
        .signup-container {
            background-color: #ffffff;
            padding: 40px;
            border-radius: 10px;
            box-shadow: 0 4px 15px rgba(0, 0, 0, 0.1);
            width: 100%;
            max-width: 400px;
            text-align: center;
        }

        /* Tiêu đề */
        h2 {
            margin-bottom: 20px;
            font-size: 24px;
            color: #333;
        }

        /* Nhóm input */
        .input-group {
            margin-bottom: 20px;
            text-align: left;
        }

        label {
            font-size: 14px;
            color: #555;
        }

        input[type="text"], input[type="email"], input[type="password"] {
            width: 100%;
            padding: 10px;
            font-size: 16px;
            margin-top: 8px;
            border-radius: 5px;
            border: 1px solid #ccc;
            outline: none;
            transition: border 0.3s ease;
        }

        input[type="text"]:focus, input[type="email"]:focus, input[type="password"]:focus {
            border: 1px solid #007bff;
        }

        /* Nút đăng ký */
        .signup-btn {
            background-color: #28a745;
            color: #fff;
            padding: 12px;
            font-size: 16px;
            border: none;
            border-radius: 5px;
            cursor: pointer;
            width: 100%;
            transition: background-color 0.3s ease;
        }

        .signup-btn:hover {
            background-color: #218838;
        }

        /* Liên kết đăng nhập */
        .login-text {
            margin-top: 15px;
            font-size: 14px;
            color: #666;
        }

        .login-text a {
            color: #007bff;
            text-decoration: none;
            transition: color 0.3s ease;
        }

        .login-text a:hover {
            color: #0056b3;
        }
    </style>
    <body>
        <div class="signup-container">
            <h2>Đăng ký</h2>
            <form class="signup-form">
                <div class="input-group">
                    <label for="fullname">Họ và tên</label>
                    <input type="text" id="fullname" placeholder="Nhập họ và tên" required>
                </div>
                <div class="input-group">
                    <label for="email">Email</label>
                    <input type="email" id="email" placeholder="Nhập email" required>
                </div>
                <div class="input-group">
                    <label for="password">Mật khẩu</label>
                    <input type="password" id="password" placeholder="Nhập mật khẩu" required>
                </div>
                <div class="input-group">
                    <label for="confirm-password">Xác nhận mật khẩu</label>
                    <input type="password" id="confirm-password" placeholder="Nhập lại mật khẩu" required>
                </div>
                <button type="submit" class="signup-btn">Đăng ký</button>
                <p class="login-text">Đã có tài khoản? <a href="#">Đăng nhập</a></p>
            </form>
        </div>
    </body>
</html>
