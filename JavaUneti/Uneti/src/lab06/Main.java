package lab06;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] s = new Student[20];
        int n;
        System.out.print("Nhập số sinh viên: ");
        n = sc.nextInt();
        System.out.println("Nhập " + n + " sinh viên");
        for (int i = 0; i < n; i++) {
            s[i] = new Student();
            s[i].nhap();
            System.out.println("");
        }
        System.out.println();
        System.out.println("In thông tin sinh viên");
        for (int i = n - 1; i >= 0; i--) {
            s[i].hienthi();
        }
        System.out.println("In thông tin sinh viên tuổi lớn nhất: ");
        int tuoi_max = s[0].tuoi;
        for (int i = 0; i < n; i++) {
            if (s[i].tuoi > tuoi_max) {
                s[i].hienthi();
            }
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (s[i].tuoi > s[j].tuoi) {
                    Student tmp = s[i];
                    s[i] = s[j];
                    s[j] = tmp;
                }
            }
        }
        System.out.println("In thông tin sinh viên sau khi sắp xếp");
        for (int i = 0; i < n; i++) {
            s[i].hienthi();
        }

    }

}
