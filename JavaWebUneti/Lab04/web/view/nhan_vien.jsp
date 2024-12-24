<%-- 
    Document   : nhan_vien
    Created on : Oct 19, 2024, 2:37:03 PM
    Author     : ADMIN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Đăng ký thông tin</title>
        <style>
            body {
                font-family: Times New Roman, serif;
                padding: 20px;
                font-size: 16px;
            }

            .form-container {
                width: 600px;
                margin: 0 auto;
            }

            .form-group {
                display: flex;
                align-items: center;
                margin-bottom: 10px;
            }

            .form-group label {
                min-width: 100px;
            }

            .form-group.hobbies {
                align-items: flex-start;
            }

            .form-group.notes {
                align-items: flex-start;
            }

            input[type="text"],
            input[type="date"],
            select {
                width: 200px;
                padding: 3px;
                border: 1px solid #999;
                margin-right: 15px;
            }

            select {
                height: 25px;
            }

            .gender-group {
                display: inline-flex;
                align-items: center;
            }

            .gender-group input[type="radio"] {
                margin: 0 5px 0 10px;
            }

            .checkbox-group {
                display: flex;
                flex-wrap: wrap;
                gap: 10px;
            }

            .checkbox-item {
                display: flex;
                align-items: center;
                margin-right: 10px;
            }

            .checkbox-item input[type="checkbox"] {
                margin-right: 5px;
            }

            textarea {
                width: 400px;
                height: 100px;
                resize: vertical;
                margin-left: 0;
                border: 1px solid #999;
            }

            hr {
                margin: 20px 0;
                border: none;
                border-top: 1px solid #ccc;
            }

            input[type="submit"] {
                padding: 5px 15px;
                background-color: #f8f8f8;
                border: 1px solid #999;
                border-radius: 2px;
                cursor: pointer;
            }

            input[type="file"] {
                margin-right: 10px;
            }

            /* Style for the file input "Chọn tệp" button */
            input[type="file"]::-webkit-file-upload-button {
                padding: 3px 10px;
                background-color: #f8f8f8;
                border: 1px solid #999;
                border-radius: 2px;
            }
        </style>
    </head>
    <body>
        <div class="form-container">
            <form action="StaffServlet" method="post" enctype="multipart/form-data">
                <div class="form-group">
                    <label>Họ và tên:</label>
                    <input type="text" name="fullname">
                </div>

                <div class="form-group">
                    <label>Hình ảnh:</label>
                    <input name="photo_file" type="file">             
                </div>

                <div class="form-group">
                    <label>Ngày sinh:</label>
                    <input name="birthday" type="date" placeholder="dd/mm/yyyy">
                </div>

                <div class="form-group">
                    <label>Quốc tịch:</label>
                    <select name="country">
                        <option value="Việt Nam">Việt Nam</option>
                        <option value="United States">United States</option>
                        <option value="American">American</option>
                    </select>
                    <label>Giới tính:</label>
                    <div class="gender-group">
                        <input name="gender" type="radio" value="true" id="male">
                        <label for="male">Nam</label>
                        <input name="gender" type="radio" value="false" id="female">
                        <label for="female">Nữ</label>
                    </div>
                </div>

                <div class="form-group">
                    <label>TT hôn nhân:</label>
                    <div class="checkbox-item">
                        <input name="married" type="checkbox" id="married">
                        <label for="married">Đã có gia đình</label>
                    </div>
                </div>

                <div class="form-group hobbies">
                    <label>Sở thích:</label>
                    <div class="checkbox-group">
                        <div class="checkbox-item">
                            <input name="hobby" type="checkbox" value="Reading" id="reading">
                            <label for="reading">Reading</label>
                        </div>
                        <div class="checkbox-item">
                            <input name="hobby" type="checkbox" value="Traveling" id="traveling">
                            <label for="traveling">Traveling</label>
                        </div>
                        <div class="checkbox-item">
                            <input name="hobby" type="checkbox" value="Music" id="music">
                            <label for="music">Music</label>
                        </div>
                        <div class="checkbox-item">
                            <input name="hobby" type="checkbox" value="Other" id="other">
                            <label for="other">Other</label>
                        </div>
                    </div>
                </div>

                <div class="form-group notes">
                    <label>Ghi chú:</label>
                    <textarea name="notes"></textarea>
                </div>
                <hr>
                <input type="submit" value="Submit">
            </form>
        </div>
    </body>
</html>
