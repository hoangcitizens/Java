<%-- 
    Document   : display
    Created on : Nov 28, 2024, 9:44:53 PM
    Author     : ADMIN
--%>

<%@page import="model.Leader"%>
<%@page import="java.util.List"%>
<%--<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Quản lý cán bộ</h1>
        <form action="LeaderServlet" method="post">
            <table>
                <tr>
                    <td>Mã cán bộ:</td>
                    <td><input type="text" name="macb"></td>
                </tr>
                <tr>
                    <td>Họ tên:</td>
                    <td><input type="text" name="hoten"></td>
                </tr>
                <tr>
                    <td>Giới tính:</td>
                    <td><input type="text" name="gioitinh"></td>
                </tr>
                <tr>
                    <td>Lương:</td>
                    <td><input type="text" name="luong"></td>
                </tr>               
                <tr>
                    <td colspan="2">
                        <input type="radio" name="sx" value="tang">Tăng
                        <input type="radio" name="sx" value="giam">Giảm
                        <input type="radio" name="sx" value="macdinh">Mặc định                     
                    </td>                   
                </tr>               
                <tr>
                    <td colspan="2">
                        <input type="submit" name="chucnang" value="Create">
                        <input type="submit" name="chucnang" value="Update">
                        <input type="submit" name="chucnang" value="Delete">    
                        <input type="submit" name="chucnang" value="Sort"> 
                        <input type="submit" name="chucnang" value="Search">   
                        <input type="submit" name="chucnang" value="luongmax">
                        <input type="submit" name="chucnang" value="TongLuong">
                        <input type="reset" value="Reset">                  
                    </td>                   
                </tr>
                <tr>
                    <td>Lương min:</td>
                    <td><input type="text" name="luongmin"></td>
                    <td>Lương max:</td>
                    <td><input type="text" name="luongmax"></td>
                </tr>
                <tr>
                    <td colspan="2">
                        <input type="submit" name="chucnang" value="Search Luong Min Max">                                       
                    </td>                   
                </tr>
                <tr>
                    <td colspan="2">
                        <input type="submit" name="chucnang" value="Search Macb">                                       
                    </td>                   
                </tr>
            </table>
        </form>
        <h2>Danh sách cán bộ</h2>
        <table border="1">
            <tr>
                <th>STT</th>
                <th>Mã cán bộ</th>
                <th>Tên cán bộ</th>
                <th>Giới tính</th>
                <th>Lương</th>
                <th>Thuế</th>
            </tr>
            <%
                List<Leader> list = (List<Leader>) request.getAttribute("leaders");
                if (list != null) {
                    int index = 0;
                    for (Leader canBo : list) {
            %>
            <tr>
                <td> <%= index + 1%> </td>
                <td> <%= canBo.getMacb()%> </td>
                <td> <%= canBo.getHoten()%> </td>
                <td> <%= canBo.getGioitinh()%> </td>
                <td> <%= canBo.getLuong()%> </td>
                <td> <%= canBo.thue()%> </td>
            </tr>
            <%
                        index++;
                    }
                }
            %>
            <%
                List<Leader> list2 = (List<Leader>) request.getAttribute("tongluong");
                if (list != null) {
                    int tongluong = 0;
                    for (Leader canBo : list) {
                        tongluong += canBo.getLuong();
                }
            %>
            <tr>
                <td>Tổng lương:</td>
                <td> <%= tongluong %> </td>
            </tr>
            <%
                      
                }
            %>
            
        </table>
    </body>
</html>
