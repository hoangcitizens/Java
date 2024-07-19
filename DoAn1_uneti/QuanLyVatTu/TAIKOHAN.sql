-- Tạo cơ sở dữ liệu
CREATE DATABASE QuanLyTaiKhoan;
GO
-- Sử dụng cơ sở dữ liệu
USE QuanLyTaiKhoan;
GO
-- Tạo bảng lưu trữ thông tin tài khoản của admin
CREATE TABLE Admin (
    ID INT PRIMARY KEY IDENTITY,
    Username NVARCHAR(50) UNIQUE NOT NULL,
    Password NVARCHAR(50) NOT NULL
);

-- Tạo bảng lưu trữ thông tin tài khoản của khách hàng
CREATE TABLE KhachHang (
    ID INT PRIMARY KEY IDENTITY,
    Username NVARCHAR(50) UNIQUE NOT NULL,
    Password NVARCHAR(50) NOT NULL
);

-- Thêm dữ liệu mẫu cho bảng Admin
INSERT INTO Admin (Username, Password) VALUES
('admin', 'admin123'),
('ADMIN1', 'ADMIN123');

SELECT *FROM Admin;