<%-- 
    Document   : hienthi_frm1_00320
    Created on : Oct 12, 2024, 1:39:44 PM
    Author     : ADMIN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
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
                <span class="info-label">Mã sinh viên: </span>
                <span class="info-value">${idstudent}</span>
            </div>
            <div class="info-item">
                <span class="info-label">Fullname: </span>
                <span class="info-value">${fullname}</span>
            </div>
            <div class="info-item">
                <span class="info-label">Age: </span>
                <span class="info-value">${age}</span>
            </div>
            <div class="info-item">
                <span class="info-label">Giới tính: </span>
                <span class="info-value">${gender}</span>
            </div>
            <div class="info-item">
                <span class="info-label">Ngày tuyển dụng: </span>
                <span class="info-value">${recruitmentDate}</span>
            </div>
            <div class="info-item">
                <span class="info-label">Quốc tịch: </span>
                <span class="info-value">${country}</span>
            </div>
            <div class="info-item">
                <span class="info-label">Sở thích: </span>
                <span class="info-value">${interests}</span>
            </div>
            <div class="info-item">
                <span class="info-label">Lương: </span>
                <span class="info-value">${salary}</span>
            </div>
            <div class="info-item">
                <span class="info-label">Hình : ${img}</span>
                <img src="images/${img}" height="100" width="100">
            </div>
            <div class="info-item">
                <span class="info-label">Tài liệu: ${doc}</span>
                <a href="images/${doc}">Tải về<br></a>
            </div>      
        </div>
    </body>
</html>
