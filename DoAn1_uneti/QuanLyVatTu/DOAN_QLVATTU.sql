CREATE DATABASE QLVATTU;
GO
USE QLVATTU
GO-- Tạo bảng Danh Mục Vật Tư
CREATE TABLE DanhMucVatTu (
    MaVatTu INT PRIMARY KEY,
    TenVatTu NVARCHAR(100),
    MoTa NVARCHAR(255)
);

-- Tạo bảng Nhà Cung Cấp
CREATE TABLE NhaCungCap (
    MaNhaCungCap INT PRIMARY KEY,
    TenNhaCungCap NVARCHAR(100),
    DiaChi NVARCHAR(255),
    SoDienThoai NVARCHAR(15)
);

-- Tạo bảng Vật Tư
CREATE TABLE VatTu (
    MaVatTu INT PRIMARY KEY,
    MaDanhMuc INT,
    MaNhaCungCap INT,
    TenVatTu NVARCHAR(100),
    DonGia MONEY,
    SoLuongTon INT
);

-- Tạo bảng Phiếu Nhập Vật Tư
CREATE TABLE PhieuNhapVatTu (
    MaPhieuNhap INT PRIMARY KEY,
    MaNhaCungCap INT,
    NgayNhap DATE,
    TongTienNhap MONEY
);

-- Tạo bảng Chi Tiết Phiếu Nhập Vật Tư
CREATE TABLE ChiTietPhieuNhapVatTu (
    MaChiTietPhieuNhap INT PRIMARY KEY,
    MaPhieuNhap INT,
    MaVatTu INT,
    SoLuongNhap INT,
    DonGiaNhap MONEY
);

-- Tạo bảng Phiếu Xuất Vật Tư
CREATE TABLE PhieuXuatVatTu (
    MaPhieuXuat INT PRIMARY KEY,
    NgayXuat DATE,
    TongTienXuat MONEY
);

-- Tạo bảng Chi Tiết Phiếu Xuất Vật Tư
CREATE TABLE ChiTietPhieuXuatVatTu (
    MaChiTietPhieuXuat INT PRIMARY KEY,
    MaPhieuXuat INT,
    MaVatTu INT,
    SoLuongXuat INT,
    DonGiaXuat MONEY
);

-- Thêm dữ liệu vào bảng DanhMucVatTu
INSERT INTO DanhMucVatTu (MaVatTu, TenVatTu, MoTa) VALUES
(1, N'Thép hình', N'Mô tả cho Thép hình'),
(2, N'Ống PVC', N'Mô tả cho Ống PVC'),
(3, N'Bánh xe ô tô', N'Mô tả cho Bánh xe ô tô'),
(4, N'Đinh vít', N'Mô tả cho Đinh vít'),
(5, N'Máy móc công nghiệp', N'Mô tả cho Máy móc công nghiệp'),
(6, N'Vật liệu xây dựng', N'Mô tả cho Vật liệu xây dựng'),
(7, N'Dây điện', N'Mô tả cho Dây điện'),
(8, N'Hóa chất công nghiệp', N'Mô tả cho Hóa chất công nghiệp');

-- Thêm dữ liệu vào bảng NhaCungCap
INSERT INTO NhaCungCap (MaNhaCungCap, TenNhaCungCap, DiaChi, SoDienThoai) VALUES
(1, N'Công ty TNHH Vật Tư Kỹ Thuật Hưng Thịnh', N'Số 10, ngõ 36, Đại Lộ Thăng Long, Hà Nội', N'0123456789'),
(2, N'Công ty Cổ Phần Vật Tư Xây Dựng Hà Nội', N'Số 25, ngõ 68, Kim Mã, Ba Đình, Hà Nội', N'0987654321'),
(3, N'Công ty TNHH Vật Tư Kỹ Thuật Đại Phát', N' Số 58, ngõ 121, Thái Hà, Đống Đa, Hà Nội', N'0369852147');

-- Thêm dữ liệu vào bảng VatTu
INSERT INTO VatTu (MaVatTu, MaDanhMuc, MaNhaCungCap, TenVatTu, DonGia, SoLuongTon) VALUES
(1, 1, 1, N'Thép hình 50x50', 15000, 100),
(2, 1, 1, N'Thép hình 80x80', 22000, 80),
(3, 2, 2, N'Ống PVC phi 25mm', 8000, 150),
(4, 2, 2, N'Ống PVC phi 50mm', 12000, 100),
(5, 3, 3, N'Bánh xe ô tô 15 inch', 500000, 40),
(6, 3, 3, N'Bánh xe ô tô 17 inch', 600000, 30),
(7, 4, 1, N'Đinh vít M4x20', 500, 500),
(8, 4, 1, N'Đinh vít M6x30', 800, 300),
(9, 5, 2, N'Máy nén khí 50HP', 20000000, 5),
(10, 5, 2, N'Máy phay CNC 3 trục', 150000000, 2),
(11, 6, 3, N'Gạch 20x20', 5000, 800),
(12, 6, 3, N'Xi măng Holcim', 120000, 200),
(13, 7, 1, N'Dây điện 2.5mm²', 2000, 1000),
(14, 7, 1, N'Dây điện 4mm²', 3000, 800),
(15, 8, 2, N'Dung dịch niken', 50000, 50),
(16, 8, 2, N'Dung dịch axit sulfuric', 80000, 30);

-- Thêm dữ liệu vào bảng PhieuNhapVatTu
INSERT INTO PhieuNhapVatTu (MaPhieuNhap, MaNhaCungCap, NgayNhap, TongTienNhap) VALUES
(1, 1, '2024-04-01', 600000),
(2, 2, '2024-04-02', 450000),
(3, 3, '2024-04-03', 720000);

-- Thêm dữ liệu vào bảng ChiTietPhieuNhapVatTu
INSERT INTO ChiTietPhieuNhapVatTu (MaChiTietPhieuNhap, MaPhieuNhap, MaVatTu, SoLuongNhap, DonGiaNhap) VALUES
(1, 1, 1, 20, 9500),
(2, 1, 2, 15, 14000),
(3, 2, 3, 25, 11000),
(4, 2, 4, 10, 17000),
(5, 3, 5, 30, 12500),
(6, 3, 6, 15, 15500);

-- Thêm dữ liệu vào bảng PhieuXuatVatTu
INSERT INTO PhieuXuatVatTu (MaPhieuXuat, NgayXuat, TongTienXuat) VALUES
(1, '2024-04-05', 300000),
(2, '2024-04-06', 480000),
(3, '2024-04-07', 540000);

-- Thêm dữ liệu vào bảng ChiTietPhieuXuatVatTu
INSERT INTO ChiTietPhieuXuatVatTu (MaChiTietPhieuXuat, MaPhieuXuat, MaVatTu, SoLuongXuat, DonGiaXuat) VALUES
(1, 1, 1, 10, 13000),
(2, 1, 3, 20, 9000),
(3, 2, 2, 15, 11000),
(4, 2, 4, 5, 15000),
(5, 3, 3, 25, 10000),
(6, 3, 5, 10, 20000);




SELECT * FROM DanhMucVatTu;
SELECT * FROM NhaCungCap;
SELECT * FROM VatTu;
SELECT * FROM PhieuNhapVatTu;
SELECT * FROM ChiTietPhieuNhapVatTu;
SELECT * FROM PhieuXuatVatTu;
SELECT * FROM ChiTietPhieuXuatVatTu;
