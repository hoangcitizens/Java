<%-- 
    Document   : frm1_21103100320
    Created on : Oct 12, 2024, 1:39:13 PM
    Author     : ADMIN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            body {
                font-family: Arial, sans-serif;
                background-color: #f0f0f0;
                padding: 20px;
            }
            form {
                background-color: white;
                padding: 20px;
                border-radius: 5px;
                box-shadow: 0 0 10px rgba(0,0,0,0.1);
                max-width: 400px;
                margin: 0 auto;
            }
            input[type="text"], select, input[type="file"] {
                width: 100%;
                padding: 5px;
                margin-bottom: 10px;
                border: 1px solid #ccc;
                border-radius: 3px;
            }
            .radio-group, .checkbox-group {
                display: flex;
                justify-content: flex-start;
                gap: 10px;
                margin-bottom: 10px;
            }
            .radio-group label, .checkbox-group label {
                margin-bottom: 0;
            }
            input[type="submit"] {
                background-color: #4CAF50;
                color: white;
                padding: 10px 15px;
                border: none;
                border-radius: 3px;
                cursor: pointer;
            }
            input[type="submit"]:hover {
                background-color: #45a049;
            }
        </style>
    </head>
    <body>
        <div class="form-container">
            <form action="frm1_00320_NguyenHuuHoang" method="post" enctype="multipart/form-data">
                <input type="text" id="idstudent" name="idstudent" placeholder="Mã sinh viên?">
                <input type="text" id="fullname" name="fullname" placeholder="Fullname?">

                <input type="text" id="age" name="age" placeholder="Age?">

                <div class="radio-group">
                    <input type="radio" id="male" name="gender" value="male">
                    <label for="male">Male</label>
                    <input type="radio" id="female" name="gender" value="female">
                    <label for="female">Female</label>
                </div>

                <input type="text" id="recruitment-date" name="recruitmentDate" placeholder="Recruitment Date?">

                <select id="country" name="country">
                    <option value="vietnam">Việt Nam</option>
                    <option value="nga">Nga</option>
                    <option value="trungquoc">Trung Quốc</option>
                    <option value="Mỹ">Mỹ</option>
                    <option value="nhat">Nhật</option>
                    <option value="Ấn Độ">Ấn Độ</option>
                </select>               
                Hình ảnh: <input type="file" name="photo"> <br>
                Tài liệu: <input type="file" name="docfile"> 

                <div class="checkbox-group">
                    <div>
                        <input type="checkbox" id="reading" name="interests" value="reading">
                        <label for="reading">Reading</label>
                    </div>
                    <div>
                        <input type="checkbox" id="traveling" name="interests" value="traveling">
                        <label for="traveling">Traveling</label>
                    </div>
                    <div>
                        <input type="checkbox" id="music" name="interests" value="music">
                        <label for="music">Music</label>
                    </div>
                    <div>
                        <input type="checkbox" id="other" name="interests" value="other">
                        <label for="other">Other</label>
                    </div>
                </div>

                <input type="text" id="salary" name="salary" placeholder="Salary">

                <input type="submit" value="Submit">
            </form>
        </div>
    </body>
</html>
