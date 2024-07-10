package lab05;

public class SinhVien {

    String ten;
    int tuoi;
    String masv;
    String gioitinh;

    public SinhVien() {
        ten = "Unknown";
        tuoi = 0;
        masv = "Unknown";
        gioitinh = "Unknown";
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

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }
    
    public SinhVien(String ten) {
        this.ten = ten;
    }
    public void inthongtin()
    {
        System.out.println("In thông tin: " + this.ten + " " + this.tuoi + " " + this.masv + " " + this.gioitinh);
    }
    public static void main(String[] args) {
        SinhVien s1 = new SinhVien();
        s1.ten = "mai";
        s1.tuoi = 45;
        s1.masv = "34567";
        s1.gioitinh = "Nữ";
        s1.inthongtin();
        s1.setTen("Nam Mai");
        s1.setGioitinh("Nam");
        s1.inthongtin();
        //
        SinhVien s2 = new SinhVien();
        s2.setTen("Hoang");
        s2.setTuoi(18);
        s2.setMasv("21103100320");    
        s2.setGioitinh("Nam");
        s2.inthongtin();
    }
}
