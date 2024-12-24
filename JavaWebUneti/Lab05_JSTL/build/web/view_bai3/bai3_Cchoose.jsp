<%-- 
    Document   : bai3
    Created on : Oct 26, 2024, 1:46:16 PM
    Author     : ADMIN
--%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>C:choose - Nguyễn Hữu Hoàng</title>
    </head>
    <body>
        <c:set scope="request" value="18" var="tuoi"/>
        Tuổi của bạn là:
        <c:out value="${tuoi}" />
        <c:choose>
            <c:when test="${tuoi < 18}">Trẻ con</c:when>
            <c:when test="${tuoi >= 18}">
                <h1>Bạn là người lớn</h1>
            </c:when>
            <c:otherwise>Tuổi không thuộc phạm vi</c:otherwise>
        </c:choose>
    </body>
</html>
