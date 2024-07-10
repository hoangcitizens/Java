package lab07;

import java.util.Scanner;

public class NhanVien {
    protected String ten;
    protected double luong;
    protected int tuoi;

    public NhanVien() {
    }

    public NhanVien(String ten, double luong, int tuoi) {
        this.ten = ten;
        this.luong = luong;
        this.tuoi = tuoi;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }
    public void nhap()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập họ và tên: ");
        ten = scanner.nextLine();
        System.out.print("Nhập tuổi: ");
        tuoi = scanner.nextInt();
        System.out.print("Nhập lương: ");
        luong = scanner.nextInt();
    }
    public void hienthi()
    {
        System.out.println("Họ và tên: " + this.getTen());
        System.out.println("Tuổi: " + this.getTuoi());
        System.out.println("Lương: " + this.getLuong());
    }
    
}
