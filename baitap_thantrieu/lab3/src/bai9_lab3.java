/*
    Bài 9. Viết chương trình tính tích 2 ma trận các số nguyên A [m][n] và B[n][k]
*/

import java.util.Scanner;
public class bai9_lab3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m, n, k;
        int[][] a, b, c;
        System.out.println("(*) Ma trận a");
        System.out.printf("- Nhập cột ma trận a: ");m = scanner.nextInt();
        System.out.printf("- Nhập hàng ma trận a: ");n = scanner.nextInt();
        a = nhap(m, n, scanner);
        System.out.printf("(*) Ma trận b");
        System.out.printf("\n-Nhập cột ma trận b: "); k = scanner.nextInt();
       b = nhap(n, k, scanner);
        System.out.println("=> Ma tran a: "); xuat(a);
        System.out.println("=> Ma tran b: "); xuat(b);
        System.out.println("Kết quả ma trận a x b = "); c = nhanMaTran(a, b); xuat(c);
    }
    public static int[][] nhap(int m, int n, Scanner scanner){
        int[][] x = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("\tNhập [" + i + "][" + j + "] = ");
                x[i][j] = scanner.nextInt();
            }
        }
        return x;
    }
    public static void xuat(int[][] x){
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[0].length; j++) {
                System.out.printf("%5d", x[i][j]);
            }
            System.out.println();
        }
    }
    public static int[][] nhanMaTran(int[][] a, int[][] b){
        int[][] c = new int[a.length][b[0].length];
        int m = a.length;
        int n = b[0].length;
        int k = a[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                for (int l = 0; l < k; l++) {
                    c[i][j] += a[i][l] * b[l][j];
                }
            }
        }
        return c;
    }
}