package lab08;

import java.util.Scanner;

public class HinhTron extends Hinh{
    double r;
    @Override
    public double tinhdt() {
        return Math.PI * r * r;
    }
    @Override
    public double tinhcv()
    {
        return 2 * Math.PI * r;
    }

    @Override
    public String toString() {
        return "HinhTron {" + " r=" + r + " và có diện tích : " + tinhdt() + 
                ", chu vi là: " + tinhcv() + '}';
    }

    @Override
    public void nhap() {
        System.out.print("Nhập bán kính hình tròn: ");
        Scanner sc = new Scanner(System.in);
        this.r = Double.parseDouble(sc.nextLine());
    }
    
    @Override
    public void hienthi() {
        System.out.println(toString());
    }
    
}
