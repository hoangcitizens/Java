<%-- 
    Document   : bai3_Cif
    Created on : Oct 26, 2024, 1:55:41 PM
    Author     : ADMIN
--%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>C:if - Nguyễn Hữu Hoàng</title>
    </head>
    <body>
        <h3>Bài tập C:if</h3>
        <c:set var="luong" scope="session" value = "${2000*2}"/>
        <c:if test="${luong > 2000}">
            <p> Lương là: <c:out value = "${luong}"/> <p>
        </c:if>
    </body>
</html>
