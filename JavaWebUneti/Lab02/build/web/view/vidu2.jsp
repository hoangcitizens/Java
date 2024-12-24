<%-- 
    Document   : vidu2
    Created on : Oct 5, 2024, 2:53:03 PM
    Author     : ADMIN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Đăng ký</title>        
        <style>
            body {
                font-family: Arial, sans-serif;
                background-color: #f0f0f0;
                display: flex;
                justify-content: center;
                align-items: center;
                height: 100vh;
                margin: 0;
            }
            .form-container {
                background-color: white;
                padding: 20px;
                border-radius: 8px;
                box-shadow: 0 0 10px rgba(0,0,0,0.1);
                width: 500px;
            }
            h2 {
                margin-top: 0;
            }
            input[type="text"],
            input[type="password"],
            select,
            textarea {
                width: 100%;
                padding: 8px;
                margin: 5px 0 15px;
                border: 1px solid #ddd;
                border-radius: 4px;
                box-sizing: border-box;
            }
            input[type="radio"],
            input[type="checkbox"] {
                margin-right: 5px;
            }
            button {
                width: 100%;
                padding: 10px;
                background-color: #007bff;
                color: white;
                border: none;
                border-radius: 4px;
                cursor: pointer;
            }
            button:hover {
                background-color: #0056b3;
            }
        </style>
    </head>
    <body>
        <div class="form-container">
            <form action="vidu2" method="post">               
                <label for="username">Tên đăng nhập:</label>
                <input type="text" id="username" name="username" required>

                <label for="password">Mật khẩu:</label>
                <input type="password" id="password" name="password" required>

                <label>Giới tính:</label>
                <input type="radio" id="male" name="gender" value="male">
                <label for="male">Nam</label>
                <input type="radio" id="female" name="gender" value="female">
                <label for="female">Nữ</label><br><br>

                <input type="checkbox" id="married" name="married">
                <label for="married">Đã có gia đình?</label><br><br>

                <label for="nationality">Quốc tịch:</label>
                <select id="nationality" name="nationality">
                    <option value="vietnam">Việt Nam</option>
                    <option value="lao">Lào</option>
                    <option value="nga">Nga</option>
                    <option value="cuba">Cuba</option>
                    <option value="trungquoc">Trung Quốc</option>
                    <option value="ando">Ấn Độ</option>
                    <!-- Add other options as needed -->
                </select>

                <label>Sở thích:</label><br>
                <input type="checkbox" id="reading" name="hobbies" value="reading" checked>
                <label for="reading">Đọc sách</label>
                <input type="checkbox" id="travel" name="hobbies" value="travel">
                <label for="travel">Du lịch</label>
                <input type="checkbox" id="music" name="hobbies" value="music">
                <label for="music">Âm nhạc</label>
                <input type="checkbox" id="other" name="hobbies" value="other">
                <label for="other">Khác</label><br><br>

                <label for="notes">Ghi chú:</label>
                <textarea id="notes" name="notes" rows="4"></textarea>

                <button type="submit">Đăng ký</button>
            </form>
        </div>
    </body>
</html>
