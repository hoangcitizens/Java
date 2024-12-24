<%-- 
    Document   : bai2
    Created on : Oct 26, 2024, 1:09:02 PM
    Author     : ADMIN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Bài 2</title>
    </head>
    <body>
        <h3>User Edition</h3>
        <form action="bai2Servlet" method="post">
            ${message}<br>
            Username:
            <input name="username" type="text"> <br>
            Password:
            <input name="password" type="password"> <br>
            <input name="remember" type="checkbox"> 
            Remember me?
            <br>
            <input type="submit" value="Create">
        </form>
    </body>
</html>
