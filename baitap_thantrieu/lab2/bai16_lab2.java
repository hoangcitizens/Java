/*
Bài 16: Nhập vào 2 số tự nhiên m và n, sao cho m < n. Hãy liệt kê các số chính phương trong đoạn [m, n]. Có bao nhiêu số thỏa mãn?
*/

import java.util.Scanner;

public class bai16_lab2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhập n = "); int n = sc.nextInt();
        System.out.printf("Nhập m = "); int m = sc.nextInt();
        System.out.printf("Số chính phương trong đoạn [" + n + "," + m + "] là: " );
        int count = 0;
        for (int i = n; i <= m; i++) {
            if (kiemTraSoChinhPhuong(i))
            {
                count++;
                System.out.printf(i + ", ");
            }
        }
        System.out.printf("\b\b");
        System.out.printf("\nCó " + count + " số chính phương trong đoạn [" + n + "," + m + "]");
    }
    public static boolean kiemTraSoChinhPhuong (int n) {
        if (n < 1)
            return false;
        double i = Math.sqrt(n);
        if (i * i == n)
            return true;
        return false;
    }

}
