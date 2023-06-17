/*
    Bài 5. Nhập 2 mảng a[N] và b[M] và số nguyên p (0 ≤ p < N). Hãy chèn mảng b[] vào vị trí p của a[].
           Ví dụ: a[4]: 5 3 6 7; b[3]: 2 9 11; p = 1 → a[7]: 5 2 9 11 3 6 7.
*/

import java.util.Arrays;
import java.util.Scanner;

public class bai5_lab3 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhập số phần tử mảng a: "); int m = sc.nextInt();
        System.out.printf("Nhập số phần tử mảng b: "); int n = sc.nextInt();
        int k = m + n; // số phần tử mảng c
        // nhập dữ liệu
        System.out.printf("(+) Nhập mảng a[] gồm " + m + " phần tử: \n"); int[] a = input(m);
        System.out.printf("(+) Nhập mảng b[] gồm " + n + " phần tử: \n"); int[] b = input(n);
        System.out.printf("(+) Nhập giá trị p = "); int p = sc.nextInt();
        int []c = new int[k];
        do {
            if (p >= m || p < 0)
            {
                System.out.printf("(+) Nhập lại giá trị 0 < p < " + m + ": "); p = sc.nextInt();
            }
        } while (p >= m || p < 0);
        // copy dữ liệu từ 2 mảng vào mảng đích
        for (int i = 0; i < p; i++) {
            c[i] = a[i];
        }
        // copy cả mảng b vào mảng c
        for (int i = 0; i < n; i++) {
            c[i+p] = b[i];
        }
        // copy phần còn lại của mảng a vào mảng c
        for (int i = p; i < m; i++) {
            c[i+n] = a[i];
        }
        System.out.printf("=> Mảng a" + Arrays.toString(a));
        System.out.printf("\n=> Mảng b" + Arrays.toString(b));
        System.out.printf("\n=> Mảng c" + Arrays.toString(c));
    }
    public static int[] input(int n) {
        int[] x = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("\tNhập [" + i + "] = ");
            x[i] = sc.nextInt();
        }
        return x;
    }
}
