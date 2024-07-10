package lab08;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        List<HinhTron> dsht = new ArrayList<>();
//        int i = 0;
//        System.out.print("Nhập số lượng hình tròn: ");
//        int n = sc.nextInt();
//        do {
//            HinhTron ht = new HinhTron();
//            ht.nhap();
//            dsht.add(ht);
//            i = i + 1;
//        } while (i < 2);
//        System.out.println("In lại");
//        for (HinhTron h : dsht) {
//            h.hienthi();
//        }
//        HinhTron ht1 = new HinhTron();
//        ht1.nhap();
//        dsht.add(1, ht1);
//        System.out.println("In lại sau khi in");
//        for (HinhTron hinhTron : dsht) {
//            hinhTron.hienthi();
//        }
//        dsht.remove(2);
//        System.out.println("In lại sau khi xóa");
//        for (HinhTron hinhTron : dsht) {
//            hinhTron.hienthi();
//        }
////        
//        Collections.sort(dsht, new Comparator<HinhTron>() {
//            @Override
//            public int compare(HinhTron ol, HinhTron o2) {
//                if (ol.tinhdt() > o2.tinhdt())
//                {
//                    return -1;
//                }
//                else if (ol.tinhdt() == o2.tinhdt())
//                    return 0;
//                return 1;
//            }
//        });
//        
        List<HinhChuNhat> dshcn = new ArrayList<>();
        int i = 0, n;
        System.out.print("Nhập số lượng hình chữ nhật: ");
        n = sc.nextInt();
        do {
            HinhChuNhat hcn = new HinhChuNhat();
            hcn.nhap();
            dshcn.add(hcn);
            i += 1;
        } while (i < n);
        System.out.println("In thông tin");
        for (HinhChuNhat hinhChuNhat : dshcn) {
            hinhChuNhat.hienthi();
        }
        HinhChuNhat hcn1 = new HinhChuNhat();
        hcn1.nhap();
        dshcn.add(2, hcn1);
        System.out.println("In lại thông tin sau khi thêm");
        for (HinhChuNhat hinhChuNhat : dshcn) {
            hcn1.hienthi();
        }
        dshcn.remove(2);
        System.out.println("In lại thông tin sau khi xóa");
        for (HinhChuNhat hinhChuNhat : dshcn) {
            hcn1.hienthi();
        }
        
        Collections.sort(dshcn, new Comparator<HinhChuNhat>() {
            @Override
            public int compare(HinhChuNhat ol, HinhChuNhat o2) {
                if (ol.tinhdt() > o2.tinhdt())
                {
                    return -1;
                }
                else if (ol.tinhdt() == o2.tinhdt())
                    return 0;
                return 1;
            }
        });
        System.out.println("In thông tin sau khi sắp xếp");
        for (HinhChuNhat hinhChuNhat : dshcn) {
            hcn1.hienthi();
        }  
    }
}
