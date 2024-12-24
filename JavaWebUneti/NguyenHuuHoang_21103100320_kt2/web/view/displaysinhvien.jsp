<%@page import="controller.KetNoi"%>
<%@ page import="java.sql.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Danh sách sinh viên</title>
        <style>
            body {
                display: flex;
                align-items: center;
                justify-content: center;
                height: 100vh;
                margin: 0;
            }
            h1 {
                text-align: center;
            }
        </style>
    </head>
    <body>
        <div class="container">
            <h1>Danh sách sinh viên</h1>
            <form action="DisplaySinhVienServlet" method="post">
                <table>
                    <tr>
                        <td>Mã sinh viên:</td>
                        <td> <input type="text" name="masv"> </td>
                    </tr>
                    <tr>
                        <td>Họ và tên:</td>
                        <td> <input type="text" name="hoten"> </td>
                    </tr>  
                    <tr>
                        <td>Giới tính:</td>
                        <td> <input type="text" name="gioitinh"> </td>
                    </tr>  
                    <tr>
                        <td>Điểm:</td>
                        <td> <input type="text" name="diem"> </td>
                    </tr>  
                    <tr>
                        <td>Quê quán:</td>
                        <td> <input type="text" name="quequan"> </td>
                    </tr>                        
                    <tr>
                        <td></td>
                        <td>
                            <input type="submit" name="chucnang" value="Thêm">                       
                            <input type="submit" name="chucnang" value="Xóa">
                            <input type="reset" value="Reset">
                        </td>
                    </tr>
                </table>
            </form>
            <form action="DisplaySinhVienServlet" method="get">
                <table>
                    <tr>
                        <td>Sắp xếp:</td>
                        <td>
                            <input type="radio" id="tangdan" name="sapxep" value="tangdan" checked> Tăng dần
                            <input type="radio" id="macdinh" name="sapxep" value="macdinh"> Mặc định
                        </td>
                    </tr>
                    <tr>
                        <td></td>
                        <td>
                            <button type="submit">Sắp Xếp</button>
                        </td>
                    </tr>
                </table>
            </form>
            <table border="2">
                <tr>
                    <th>Mã sinh viên</th>
                    <th>Họ và tên</th>
                    <th>Giới tính</th>
                    <th>Điểm</th>
                    <th>Quê quán</th>
                </tr>
                <%
                    ResultSet resultset = (ResultSet) request.getAttribute("resultSet");
                    try {
                        while (resultset != null && resultset.next()) {
                            int masv = resultset.getInt("masv");
                            String hoten = resultset.getString("hoten");
                            String gioitinh = resultset.getString("gioitinh");
                            double diem = resultset.getDouble("diem");
                            String queQuan = resultset.getString("quequan");
                %>
                <tr>
                    <td><%= masv%></td>
                    <td><%= hoten%></td>
                    <td><%= gioitinh%></td>
                    <td><%= diem%></td>
                    <td><%= queQuan%></td>
                </tr>
                <%
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    if (resultset != null)
                        resultset.close();
                %>
            </table>
        </div>
    </body>
</html>
