<%-- 
    Document   : table
    Created on : Oct 26, 2024, 1:19:02 PM
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
        <h3>User List</h3>
        <table border="1" style="width:100%">
            <thad>
                <tr>
                    <th>Username</th>
                    <th>Password</th>
                    <th>Remember?</th>
                </tr>
            </thad>           
            <tbody>
                <tr>
                    <th>${bean.username }</th>
                    <th>${bean.password }</th>
                    <th>${bean.remember?'Yes':'No' }</th>
                </tr>
            </tbody>
        </table>
    </body>
</html>
