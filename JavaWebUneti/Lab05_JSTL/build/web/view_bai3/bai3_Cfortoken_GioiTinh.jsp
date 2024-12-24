<%-- 
    Document   : bai3_Cfortoken_Gioitinh
    Created on : Oct 26, 2024, 2:01:54 PM
    Author     : ADMIN
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>C:fortoken Giới tính - Nguyễn Hữu Hoàng</title>
    </head>
    <body>
        <h3>Bài tập C:fortoken Giới tính</h3>
        <c:forTokens var="chon" items="Nam Nữ Khác" delims=" ">
            <label>
                <input type="radio"> ${chon}
            </label>
        </c:forTokens>
    </body>
</html>
