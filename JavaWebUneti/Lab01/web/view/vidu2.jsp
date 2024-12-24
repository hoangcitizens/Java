<%-- 
    Document   : vidu2
    Created on : Sep 28, 2024, 3:22:32 PM
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
        <h1>Welcome to Java web</h1>
        <h2>Nguyễn Hữu Hoàng</h2>
        <h3>Kết quả: ${kq}</h3>
        <<h4>Time: ${now}</h4>
        <jsp:include page="/view/dangnhap.jsp"/>
    </body>
</html>
