package lab08.bai2;

import java.util.Scanner;

public class SanPham {
    private String tenSanPham;
    private double gia;

    public SanPham() {
    }

    public SanPham(String tenSanPham, double gia) {
        this.tenSanPham = tenSanPham;
        this.gia = gia;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên sản phẩm: ");
        tenSanPham = sc.nextLine();
        System.out.print("Nhập đơn giá: ");
        gia = Double.parseDouble(sc.nextLine());
    }
    public void hienthi() {
        System.out.println("Tên sản phẩm: " + this.tenSanPham +
                           "\nGiá sản phẩm: " + this.gia);
     
    }
    
}
