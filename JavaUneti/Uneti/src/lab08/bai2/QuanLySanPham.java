package lab08.bai2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class QuanLySanPham {

    static public List<SanPham> dssp = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void nhap() {
        System.out.print("Nhập số lượng sản phẩm: ");
        int i = 0, n;
        n = sc.nextInt();
        do {
            SanPham sp = new SanPham();
            System.out.println("(*) Nhập thông tin sản phẩm thứ " + (i + 1));
            sp.nhap();
            dssp.add(sp);
            i += 1;
        } while (i < n);
    }

    public static void xuat() {
        System.out.println("Danh sách vừa nhập");
        for (SanPham sanPham : dssp) {
            sanPham.hienthi();
        }
    }

    public static void xuatNgauNhien() {
        Collections.shuffle(dssp, new Random());
        System.out.println("Danh sách vừa nhập");
        for (SanPham sanPham : dssp) {
            sanPham.hienthi();
        }
    }

    public static void sapXepTheoGia() {
        Collections.sort(dssp, new Comparator<SanPham>() {
            @Override
            public int compare(SanPham o1, SanPham o2) {
                if (o1.getGia() > o2.getGia()) {
                    return -1;
                } else if (o2.getGia() == o2.getGia()) {
                    return 0;
                }
                return 1;
            }
        });
        System.out.println("Danh sách sản phẩm sau khi sắp xếp");
        for (SanPham sanPham : dssp) {
            sanPham.hienthi();
        }
    }

    public static void timVaXoa() {
        System.out.print("Nhập tên sản phẩm cần xóa: ");
        String name = sc.nextLine();
        boolean found = false;
        for (int i = 0; i < dssp.size(); i++) {
            if (dssp.get(i).getTenSanPham().equalsIgnoreCase(name)) {
                dssp.remove(i);
                found = true;
                System.out.println("Đã xóa sản phẩm có tên: " + name);
                break;
            }
        }
        System.out.println("Danh sách sau khi xóa");
        for (SanPham sanPham : dssp) {
            sanPham.hienthi();
        }
        if (!found) {
            System.out.println("Không tìm thấy sản phẩm có tên: " + name);
        }
    }

    public static void giaTrungBinhSanPham() {
        double tong = 0;
        for (SanPham sanPham : dssp) {
            tong += (double) sanPham.getGia();
        }
        System.out.println("Giá trung bình của các sản phẩm là: " + tong / dssp.size());
    }

    public static void main(String[] args) {
        int choice;

        do {
            System.out.println("___________________________Menu___________________________");
            System.out.println("|1. Nhập danh sách sản phẩm từ bàn phím                   |");
            System.out.println("|2. Xuất danh sách vừa nhập                               |");
            System.out.println("|3. Xuất danh sách ngẫu nhiên                             |");
            System.out.println("|4. Sắp xếp giảm dần theo giá và xuất giá ra màn hình     |");
            System.out.println("|5. Tìm và xóa sản phẩm theo tên nhập từ bàn phím         |");
            System.out.println("|6. Xuất giá trung bình của các sản phẩm                  |");
            System.out.println("|0. Thoát                                                 |");
            System.out.println("|_________________________________________________________|");
            System.out.print("Nhập lựa chọn của bạn: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    nhap();
                    break;
                case 2:
                    xuat();
                    break;
                case 3:
                    xuatNgauNhien();
                    break;
                case 4:
                    sapXepTheoGia();
                    break;
                case 5:
                    timVaXoa();
                    break;
                case 6:
                    giaTrungBinhSanPham();
                    break;
                case 0:
                    System.out.println("Thoát chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
            }
        } while (choice != 0);
        sc.close();
    }

}
