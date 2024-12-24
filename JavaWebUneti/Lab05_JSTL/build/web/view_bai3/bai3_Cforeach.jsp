<%-- 
    Document   : bai3_Cforeach
    Created on : Oct 26, 2024, 1:55:15 PM
    Author     : ADMIN
--%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>C:foreach - Nguyễn Hữu Hoàng</title>
    </head>
    <body>
        <h3>Bài tập C:foreach</h3>
        <c:forEach var="i" begin="1" end="5">
            Số <c:out value="${i}"/> <p>
        </c:forEach>
    </body>
</html>
