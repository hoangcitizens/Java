package thicuoiky.Cau1;

import java.util.Scanner;

public class SinhVien {
    private String maSinhVien;
    private String hoTen;
    private int namSinh;
    private String lop;

    public SinhVien() {
    }

    public SinhVien(String maSinhVien, String hoTen, int namSinh, String lop) {
        this.maSinhVien = maSinhVien;
        this.hoTen = hoTen;
        this.namSinh = namSinh;
        this.lop = lop;
    }

    public String getMaSinhVien() {
        return maSinhVien;
    }

    public void setMaSinhVien(String maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }
    public void nhap()
    {       
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã sinh viên: ");  
        this.maSinhVien = sc.nextLine();
        System.out.print("Nhập họ và tên sinh viên: ");
        this.hoTen = sc.nextLine();
        System.out.print("Nhập năm sinh: ");
        this.namSinh = sc.nextInt();
        sc.nextLine();
        System.out.print("Nhập lớp: ");
        this.lop = sc.nextLine();
    }
    public void hienthi()
    {
        System.out.printf("%-15s%-25s%-10d%-15s",this.maSinhVien,this.hoTen,this.namSinh,this.lop);
    }
}
