/*
    Bài 12: Liệt kê các thừa số nguyên tố của một số dưới dạng số mũ.
    Ví dụ: số 28 được phân tích thành 2^2 x 7^1. Tương tự cho những số khác.
*/

import java.util.Scanner;

public class bai12_lab2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhập vào số nguyên n = "); int n = sc.nextInt();
        System.out.printf(n + " = ");
        for (int i = 2; i <= n; i++) {
            int count = 0;
            while (n % i == 0) {
                count++;
                n /= i;
            }
            if (count > 0) {
                if (count == 1) {
                    System.out.print(i + " x ");
                } else {
                    System.out.print(i + "^" + count + " x ");
                }
            }
        }
        System.out.printf("\b\b\b");

    }
}
