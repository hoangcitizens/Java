package lab06;

import java.util.Scanner;

public class Student {

    private String ten;
    public int tuoi;
    String masv;

    public Student() {

    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getMasv() {
        return masv;
    }

    public void setMasv(String masv) {
        this.masv = masv;
    }

    public Student(String ten, int tuoi, String masv) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.masv = masv;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên: ");
        this.ten = sc.nextLine();
        System.out.print("Nhập tuổi: ");
        this.tuoi = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập mã sinh viên: ");
        this.masv = sc.nextLine();
    }
    public void hienthi ()
    {
        System.out.println("Tên SV: " + this.ten + " Tuổi: " + this.tuoi + " Mã SV: " + this.masv);
    }
}
