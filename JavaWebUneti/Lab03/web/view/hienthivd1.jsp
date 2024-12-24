<%-- 
    Document   : hienthivd1
    Created on : Oct 12, 2024, 1:12:21 PM
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
        <h2>1. Hình: ${img}</h2>
        <img src="images/${img}" height="100" width="100">
        <h2>2. Tài liệu: ${doc}</h2>
        <a href="images/${doc}=">Tải về</a>
    </body>
</html>
