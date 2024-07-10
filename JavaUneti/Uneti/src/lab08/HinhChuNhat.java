package lab08;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class HinhChuNhat extends Hinh{
    double d, r;
    Scanner sc = new Scanner(System.in);
    @Override
    public double tinhdt() {
        return d * r;
    }

    @Override
    public double tinhcv() {
        return (d + r) * 2;
    }

    @Override
    public void nhap() {
        System.out.print("Nhập chiều dài hình chữ nhật: ");
        d = Double.parseDouble(sc.nextLine());
        System.out.print("Nhập chiều rộng hình chữ nhật: ");
        r = Double.parseDouble(sc.nextLine());
    }

    @Override
    public String toString() {
        return "HinhChuNhat{" + " chiều dài d = " + d + ", chiều rộng r = " + r +
                " diện tích là: " + tinhdt() + " chu vi là: " + tinhcv() +'}';
    }

    @Override
    public void hienthi() {
        System.out.println(toString());
    }
    
}
