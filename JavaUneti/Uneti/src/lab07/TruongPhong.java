package lab07;

import java.util.Scanner;

public class TruongPhong extends NhanVien{
    private double phucap;

    public TruongPhong() {
    }

    public TruongPhong(double phucap, String ten, double luong, int tuoi) {
        super(ten, luong, tuoi);
        this.phucap = phucap;
    }

    public double getPhucap() {
        return phucap;
    }

    public void setPhucap(double phucap) {
        this.phucap = phucap;
    }
    @Override
    public void nhap()
    {
        super.nhap();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập phụ cấp: ");
        this.phucap = scanner.nextDouble();
    }

    public TruongPhong(double phucap) {
        this.phucap = phucap;
    }

    @Override
    public void hienthi() {
        super.hienthi();
        System.out.println("Phụ cấp: " + this.phucap);
    }

    public double tongThuNhap()
    {
        return luong + phucap;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        TruongPhong tp1 = new TruongPhong();
//        System.out.println("Nhập thông tin");
//        tp1.nhap();
//        System.out.println("Hiển thị");
//        tp1.hienthi();

        // Nhập n TruongPhong
        System.out.print("Nhập số lượng trưởng phòng: ");
        int n = scanner.nextInt();
        TruongPhong []tp = new TruongPhong[20];
        for (int i = 0; i < n; i++) {
            System.out.println("(*) Nhập thông tin trưởng phòng thứ " + (i + 1));
            tp[i] = new TruongPhong();
            tp[i].nhap();
            System.out.println("");
        }
        // In thông tin n TruongPhong
        System.out.println("____________THÔNG TIN CÁC TRƯỞNG PHÒNG_____________");
        for (int i = 0; i < n; i++) {        
            tp[i].hienthi();
        } 
        // In tên Truon gPhong có phụ cấp max
        double phucapMax = tp[0].getPhucap();
        for (int i = 0; i < n; i++) {
            if (phucapMax < tp[i].getPhucap())
            {
                System.out.println("Tên Trưởng phòng có phụ cấp cao nhất: " + tp[i].getTen());               
            }
        }
        // Sắp xếp thứ tự giảm dần theo lương
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (tp[i].luong > tp[j].luong)
                {
                    TruongPhong tmp = tp[i];
                    tp[i] = tp[j];
                    tp[j] = tmp;
                }
            }
        }
        System.out.println("____________CÁC TRƯỞNG PHÒNG SẮP XẾP THEO LƯƠNG GIẢM DẦN_____________");
        for (int i = 0; i < n; i++) {
            tp[i].hienthi();
        }
        System.out.println("______THU NHẬP CỦA TỪNG TRƯỞNG PHÒNG________");
        for (int i = 0; i < n; i++) {
            System.out.print("Thu nhập của trưởng phòng " + tp[i].ten + " là: " + tp[i].tongThuNhap());
        }
        
    }
    
}
