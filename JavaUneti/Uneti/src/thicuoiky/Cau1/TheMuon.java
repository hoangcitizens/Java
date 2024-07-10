package thicuoiky.Cau1;

import java.util.Scanner;

public class TheMuon extends SinhVien{
   

    private String soPhieuMuon;
    private String ngayMuon;
    private String hanTra;
    private String soHieu;

    public TheMuon() {
    }
    public TheMuon(String soPhieuMuon, String ngayMuon, String hanTra, String soHieu, String maSinhVien, String hoTen, int namSinh, String lop) {
        super(maSinhVien, hoTen, namSinh, lop);
        this.soPhieuMuon = soPhieuMuon;
        this.ngayMuon = ngayMuon;
        this.hanTra = hanTra;
        this.soHieu = soHieu;
    }

    public String getSoPhieuMuon() {
        return soPhieuMuon;
    }

    public void setSoPhieuMuon(String soPhieuMuon) {
        this.soPhieuMuon = soPhieuMuon;
    }

    public String getNgayMuon() {
        return ngayMuon;
    }

    public void setNgayMuon(String ngayMuon) {
        this.ngayMuon = ngayMuon;
    }

    public String getHanTra() {
        return hanTra;
    }

    public void setHanTra(String hanTra) {
        this.hanTra = hanTra;
    }

    public String getSoHieu() {
        return soHieu;
    }

    public void setSoHieu(String soHieu) {
        this.soHieu = soHieu;
    }
    
    @Override
    public void nhap()
    {
        //sc.nextLine();
        super.nhap();           
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số phiếu mượn: ");
        this.soPhieuMuon = sc.nextLine();
        System.out.print("Nhập ngày mượn: ");
        this.ngayMuon = sc.nextLine();
        System.out.print("Nhập hạn trả: ");
        this.hanTra = sc.nextLine();
        System.out.print("Nhập số hiệu: ");
        this.soHieu = sc.nextLine();
    }
    
    @Override
    public void hienthi()
    {
        super.hienthi();
        System.out.printf("%-15s%-15s%-15s%-10s\n",this.soPhieuMuon,this.ngayMuon,this.hanTra,this.soHieu);
    }
    public static void title()
    {
        System.out.printf("%-15s%-25s%-10s%-15s%-15s%-15s%-15s%-10s\n",
                "Mã sinh viên","Họ và tên","Năm sinh","Lớp","Số phiếu","Ngày mượn","Hạn trả","Số hiệu sách");
    }
    public static void main(String[] args) {  
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng thẻ mượn: " );
        int n = sc.nextInt();
        TheMuon []tm = new TheMuon[n];
        for (int i = 0; i < n; i++) {
            System.out.println("(*) Nhập thông tin thẻ thứ " + i + 1);
            tm[i] = new TheMuon();
            tm[i].nhap();
            System.out.println("");
        }
        title();
        for (int i = 0; i < tm.length; i++) {
            tm[i].hienthi();
        }
    }
}
