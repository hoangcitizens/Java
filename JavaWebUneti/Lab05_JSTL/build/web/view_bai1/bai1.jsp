<%-- 
    Document   : bai1
    Created on : Oct 26, 2024, 12:55:43 PM
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
        <h1>PHÉP TÍNH</h1>
        <form action="">
            Số 1: <input type="text" name="txtso1" value="${param.txtso1}"><br>
            Số 2: <input type="text" name="txtso2" value="${param.txtso2}"><br>
            <input type="submit" value="Nhân">
            <h2>Nhân 2 số: ${param.txtso1 * param.txtso2} </h2>
        </form>
            <jsp:include page="/view_bai1/testbai1.jsp"/>
            <br>Hiển thị bằng cách 2
            <%@include file="/view_bai1/testbai1.jsp" %> 
    </body>
</html>
