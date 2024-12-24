<%-- 
    Document   : thong_tin_nhan_vien
    Created on : Oct 19, 2024, 1:52:03 PM
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
                margin: 0;
                padding: 20px;
                background-color: #f5f5f5;
            }

            h1 {
                color: #2c3e50;
                text-align: center;
                padding: 15px 0;
                margin-bottom: 30px;
                border-bottom: 2px solid #3498db;
                font-size: 24px;
            }

            ul {
                list-style: none;
                padding: 0;
                max-width: 800px;
                margin: 0 auto;
                background-color: white;
                border-radius: 8px;
                box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);
                padding: 20px 40px;
            }

            li {
                padding: 12px 0;
                border-bottom: 1px solid #eee;
                display: flex;
                align-items: center;
            }

            li:last-child {
                border-bottom: none;
            }

            li img {
                border-radius: 5px;
                object-fit: cover;
                margin: 10px 0;
            }

            b {
                color: #2c3e50;
                margin-left: 10px;
                font-weight: 600;
            }

            /* Style for specific items */
            li:has(img) {
                display: block;
            }

            /* Hover effect */
            li:hover {
                background-color: #f8f9fa;
            }
        </style>
    </head>
    <body>
        <h1>THÔNG TIN NHÂN VIÊN CÔNG TY</h1>
        <ul>
            <li>Họ và tên: <b>${bean.fullname}</b></li>
            <li>Hình ảnh: <b>${bean.photo_file}</b></li>
            <li><img src="images/${bean.photo_file}" height="100" width="100"></li>
            <li>Ngày sinh: <b>${bean.birthday}</b></li>
            <li>Giới tính: <b>${bean.gender ? 'Nam' : 'Nữ'}</b></li>
            <li>Quốc tịch: <b>${bean.country}</b></li>
            <li>TT hôn nhân: <b>${bean.married}</b></li>
            <li>Sở thích: <b>${st}</b></li>
            <li>Ghi chú: <b>${bean.notes}</b></li>
        </ul>
    </body>
</html>
