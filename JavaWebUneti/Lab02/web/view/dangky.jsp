<%-- 
    Document   : dangnhap
    Created on : Sep 28, 2024, 2:07:29 PM
    Author     : ADMIN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Đăng ký</title>
    </head>
    <style>
        /* Đặt các font mặc định và style body */
        body {
            font-family: 'Roboto', sans-serif;
            background: linear-gradient(135deg, #667eea 0%, #764ba2 100%);
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            margin: 0;
        }

        .container {
            background-color: white;
            padding: 2.5rem;
            border-radius: 10px;
            box-shadow: 0 10px 20px rgba(0, 0, 0, 0.2);
            width: 100%;
            max-width: 400px;
        }

        h1 {
            color: #4a4a4a;
            text-align: center;
            margin-bottom: 1.5rem;
            font-size: 2rem;
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
            border: 1px solid #e0e0e0;
            border-radius: 5px;
            font-size: 1rem;
            transition: border-color 0.3s ease;
        }

        input[type="text"]:focus,
        input[type="email"]:focus,
        input[type="password"]:focus {
            outline: none;
            border-color: #667eea;
            box-shadow: 0 0 0 2px rgba(102, 126, 234, 0.2);
        }

        input[type="submit"] {
            background-color: #667eea;
            color: white;
            border: none;
            border-radius: 5px;
            padding: 0.8rem;
            font-size: 1.1rem;
            cursor: pointer;
            transition: background-color 0.3s ease;
            margin-top: 1rem;
        }

        input[type="submit"]:hover {
            background-color: #5a6fd6;
        }

        p {
            text-align: center;
            margin-top: 1rem;
            color: #4a4a4a;
        }

        .a {
            color: #667eea;
            text-decoration: none;
            cursor: pointer;
            background: none;
            border: none;
            font-size: 1rem;
            transition: color 0.3s ease;
        }

        .a:hover {
            color: #5a6fd6;
        }

        h5 {
            color: #ff4d4f;
            text-align: center;
            margin-top: 1rem;
        }

        @media (max-width: 480px) {
            .container {
                padding: 1.5rem;
            }

            h1 {
                font-size: 1.5rem;
            }
        }
    </style>
    <body>
        <div class="container">
            <h1>ĐĂNG KÝ</h1>
            <form action="taikhoan" method="post">
                <input type="text" id="username" name="username" placeholder="Tên đăng nhập" required >
                <input type="email" id="email" name="email" placeholder="Email" required >
                <input type="password" id="password" name="password" placeholder="Mật khẩu" required >
                <input type="password" id="confirmpass" name="confirmpass" placeholder="Xác nhận mật khẩu" required>
                <p>Bạn đã có tài khoản? <input type="button" name="actionLogin" value="Đăng Nhập" class="a"></p>
                <input type="submit" value="Đăng ký"> <h5>${tn}</h5>
            </form>
        </div>
    </body>
</html>
