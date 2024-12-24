<%-- 
    Document   : bai3_Cfortoken
    Created on : Oct 26, 2024, 1:54:51 PM
    Author     : ADMIN
--%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>C:fortoken - Nguyễn Hữu Hoàng</title>
    </head>
    <body>
        <h3>Bài tập: C:fortoken</h3>
        <select>
            <c:forTokens var="chon" items="+ - * /" delims=" ">
                <option>${chon}</option>
            </c:forTokens>
        </select>
    </body>
</html>
