<%-- 
    Document   : thongtinvidu2
    Created on : Oct 5, 2024, 3:13:53 PM
    Author     : ADMIN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Thông tin đăng ký tài khoản</title>
        <style>
        body {
            font-family: Arial, sans-serif;
            line-height: 1.6;
            color: #333;
            max-width: 600px;
            margin: 0 auto;
            padding: 20px;
            background-color: #f4f4f4;
        }
        .container {
            background-color: #fff;
            border-radius: 5px;
            padding: 20px;
            box-shadow: 0 2px 5px rgba(0,0,0,0.1);
        }
        h1 {
            color: #2c3e50;
            border-bottom: 2px solid #3498db;
            padding-bottom: 10px;
        }
        .info-item {
            margin-bottom: 15px;
        }
        .info-label {
            font-weight: bold;
            color: #2980b9;
        }
        .info-value {
            margin-left: 10px;
        }
    </style>
    </head>
    <body>
        <div class="container">
        <h1>Thông tin khi chọn giá trị</h1>
        <div class="info-item">
            <span class="info-label">Tên đăng nhập:</span>
            <span class="info-value">${username}</span>
        </div>
        <div class="info-item">
            <span class="info-label">Giới tính:</span>
            <span class="info-value">${gender}</span>
        </div>
        <div class="info-item">
            <span class="info-label">Tình trạng hôn nhân:</span>
            <span class="info-value">${married}</span>
        </div>
        <div class="info-item">
            <span class="info-label">Quốc tịch:</span>
            <span class="info-value">${nationality}</span>
        </div>
        <div class="info-item">
            <span class="info-label">Sở thích:</span>
            <span class="info-value">${hobbies}</span>
        </div>
        <div class="info-item">
            <span class="info-label">Ghi chú:</span>
            <p class="info-value">${notes}</p>
        </div>
    </div>
    </body>
</html>
