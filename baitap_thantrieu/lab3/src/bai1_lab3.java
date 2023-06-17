/*
    Bài 1. Đọc vào dãy số a có n phần tử chỉ gồm các số nguyên dương. Kiểm tra mảng a có phải là mảng đối xứng hay không
           (ví dụ: 15 2 1 2 15 là mảng đối xứng).
*/

import java.util.Scanner;

public class bai1_lab3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhập số phần tử của mảng: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("Nhập a[" + i + "] = ");
            a[i] = sc.nextInt();
        }
        System.out.printf("Các phần tử trong mảng vừa nhập là: ");
        for (int i = 0; i < n; i++) {
            System.out.printf(a[i] + ", ");
        }
        System.out.printf("\b\b");
        boolean bool = true;
        for (int i = 0; i < n / 2; i++) {
            int x = n - 1 - i;
            if (a[i] != a[x]) {
                bool = false;
                break;
            }
        }
        if (bool == true)
            System.out.printf(" => Mảng đối xứng !!!");
        else
            System.out.printf(" => Mảng không đối xứng !!!");
    }
}
