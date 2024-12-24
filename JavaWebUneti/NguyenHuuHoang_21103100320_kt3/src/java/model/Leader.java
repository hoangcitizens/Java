package model;

public class Leader {
    private int macb;
    private String hoten;
    private String gioitinh;
    private int luong;

    public Leader() {
    }

    public Leader(int macb, String hoten, String gioitinh, int luong) {
        this.macb = macb;
        this.hoten = hoten;
        this.gioitinh = gioitinh;
        this.luong = luong;
    }

    public int getMacb() {
        return macb;
    }

    public void setMacb(int macb) {
        this.macb = macb;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public int getLuong() {
        return luong;
    }

    public void setLuong(int luong) {
        this.luong = luong;
    }
    
    public int thue() { 
        if (luong >= 9000000 && luong < 15000000)
            return (int) (luong * 0.1);
        else if (luong >= 15000000)
            return (int) (luong * 0.15);
        else 
            return 0;
    }
}
