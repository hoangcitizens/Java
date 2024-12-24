<%-- 
    Document   : bai3_Cforeach_BangCuuChuong2
    Created on : Oct 26, 2024, 1:57:13 PM
    Author     : ADMIN
--%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Bảng cửu chương 2 - Nguyễn Hữu Hoàng</title>
    </head>
    <body>
        <h3>Bảng cửu chương 2</h3>
        <br />
        <c:forEach var="i" begin="1" end="10">
            <c:out value="2 * ${i} = ${i*2}" /> <br>
        </c:forEach>
    </body>
</html>
