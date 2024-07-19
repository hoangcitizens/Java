CREATE DATABASE QLVATTUNEW;
GO
USE QLVATTUNEW
GO
-- Tạo bảng Danh Mục Vật Tư

CREATE TABLE Danhsachvattu (
    MaVatTu INT PRIMARY KEY,
    TenVatTu NVARCHAR(100),
    MoTa NVARCHAR(MAX),
    DonViTinh NVARCHAR(50),
    GiaNhap DECIMAL(18, 2),
    GiaBan DECIMAL(18, 2),
    SoLuongTon INT
);

-- Tạo bảng Nhà cung cấp
CREATE TABLE NhaCungCap (
    MaNhaCungCap INT PRIMARY KEY,
    TenNhaCungCap NVARCHAR(100),
    DiaChi NVARCHAR(200),
    SoDienThoai NVARCHAR(20)
);

-- Tạo bảng Phiếu nhập
CREATE TABLE PhieuNhap (
    MaPhieuNhap INT PRIMARY KEY,
    MaNhaCungCap INT,
    NgayNhap DATE,
    TongTien DECIMAL(18, 2),
    FOREIGN KEY (MaNhaCungCap) REFERENCES NhaCungCap(MaNhaCungCap)
);

-- Tạo bảng Chi tiết phiếu nhập
CREATE TABLE ChiTietPhieuNhap (
    ID INT PRIMARY KEY,
    MaPhieuNhap INT,
    MaVatTu INT,
    SoLuong INT,
    DonGia DECIMAL(18, 2),
    ThanhTien DECIMAL(18, 2),
    FOREIGN KEY (MaPhieuNhap) REFERENCES PhieuNhap(MaPhieuNhap),
    FOREIGN KEY (MaVatTu) REFERENCES Danhsachvattu(MaVatTu)
);

-- Tạo bảng Phiếu xuất
CREATE TABLE PhieuXuat (
    MaPhieuXuat INT PRIMARY KEY,
    NgayXuat DATE,
    TongTien DECIMAL(18, 2)
);

-- Tạo bảng Chi tiết phiếu xuất
CREATE TABLE ChiTietPhieuXuat (
    ID INT PRIMARY KEY,
    MaPhieuXuat INT,
    MaVatTu INT,
    SoLuong INT,
    DonGia DECIMAL(18, 2),
    ThanhTien DECIMAL(18, 2),
    FOREIGN KEY (MaPhieuXuat) REFERENCES PhieuXuat(MaPhieuXuat),
    FOREIGN KEY (MaVatTu) REFERENCES Danhsachvattu(MaVatTu)
);

-- Thêm dữ liệu vào bảng Danhsachvattu
INSERT INTO Danhsachvattu(MaVatTu, TenVatTu, MoTa, DonViTinh, GiaNhap, GiaBan, SoLuongTon) VALUES
(1, N'Thép hình', N'Mô tả cho Thép hình', N'Kg', 15000, 20000, 100),
(2, N'Ống PVC', N'Mô tả cho Ống PVC', N'Cây', 5000, 8000, 200),
(3, N'Bánh xe ô tô', N'Mô tả cho Bánh xe ô tô', N'Cái', 800000, 1000000, 50),
(4, N'Đinh vít', N'Mô tả cho Đinh vít', N'Cây', 1000, 2000, 500),
(5, N'Máy móc công nghiệp', N'Mô tả cho Máy móc công nghiệp', N'Bộ', 20000000, 25000000, 10),
(6, N'Vật liệu xây dựng', N'Mô tả cho Vật liệu xây dựng', N'Kg', 10000, 15000, 150),
(7, N'Dây điện', N'Mô tả cho Dây điện', N'Mét', 8000, 12000, 300),
(8, N'Hóa chất công nghiệp', N'Mô tả cho Hóa chất công nghiệp', N'Kg', 50000, 60000, 80);


-- Thêm dữ liệu vào bảng NhaCungCap
INSERT INTO NhaCungCap (MaNhaCungCap, TenNhaCungCap, DiaChi, SoDienThoai) VALUES
(1, N'Công ty TNHH Vật Tư Kỹ Thuật Hưng Thịnh', N'Số 10, ngõ 36, Đại Lộ Thăng Long, Hà Nội', N'0123456789'),
(2, N'Công ty Cổ Phần Vật Tư Xây Dựng Hà Nội', N'Số 25, ngõ 68, Kim Mã, Ba Đình, Hà Nội', N'0987654321'),
(3, N'Công ty TNHH Vật Tư Kỹ Thuật Đại Phát', N' Số 58, ngõ 121, Thái Hà, Đống Đa, Hà Nội', N'0369852147');

-- Thêm dữ liệu vào bảng PhieuNhapVatTu
INSERT INTO PhieuNhap (MaPhieuNhap, MaNhaCungCap, NgayNhap, TongTien) VALUES
(4, 1, '2024-03-10', 800000),
(5, 2, '2024-03-11', 650000),
(6, 3, '2024-03-12', 900000),
(7, 1, '2024-03-13', 750000),
(8, 2, '2024-03-14', 720000),
(9, 3, '2024-03-15', 850000),
(10, 1, '2024-03-16', 700000),
(11, 2, '2024-03-17', 600000),
(12, 3, '2024-03-18', 950000),
(13, 1, '2024-03-19', 780000),
(14, 2, '2024-03-20', 730000),
(15, 3, '2024-03-21', 880000),
(16, 1, '2024-03-22', 720000),
(17, 2, '2024-03-23', 680000),
(18, 3, '2024-03-24', 910000),
(19, 1, '2024-03-25', 790000),
(20, 2, '2024-03-26', 740000),
(21, 3, '2024-03-27', 820000),
(22, 1, '2024-03-28', 730000),
(23, 2, '2024-03-29', 690000),
(24, 3, '2024-03-30', 930000),
(25, 1, '2024-04-01', 820000),
(26, 2, '2024-04-02', 760000),
(27, 3, '2024-04-03', 890000),
(28, 1, '2024-04-04', 750000),
(29, 2, '2024-04-05', 700000),
(30, 3, '2024-04-06', 960000);

-- Thêm dữ liệu vào bảng PhieuXuatVatTu
INSERT INTO PhieuXuat (MaPhieuXuat, NgayXuat, TongTien) VALUES
(4, '2024-03-10', 500000),
(5, '2024-03-11', 480000),
(6, '2024-03-12', 550000),
(7, '2024-03-13', 490000),
(8, '2024-03-14', 520000),
(9, '2024-03-15', 600000),
(10, '2024-03-16', 510000),
(11, '2024-03-17', 470000),
(12, '2024-03-18', 580000),
(13, '2024-03-19', 530000),
(14, '2024-03-20', 540000),
(15, '2024-03-21', 570000),
(16, '2024-03-22', 500000),
(17, '2024-03-23', 490000),
(18, '2024-03-24', 590000),
(19, '2024-03-25', 550000),
(20, '2024-03-26', 560000),
(21, '2024-03-27', 580000),
(22, '2024-03-28', 500000),
(23, '2024-03-29', 480000),
(24, '2024-03-30', 600000),
(25, '2024-04-01', 570000),
(26, '2024-04-02', 580000),
(27, '2024-04-03', 590000),
(28, '2024-04-04', 510000),
(29, '2024-04-05', 520000),
(30, '2024-04-06', 610000);

SELECT * FROM Danhsachvattu;
SELECT * FROM NhaCungCap;
SELECT * FROM PhieuNhap;
SELECT * FROM PhieuXuat;
