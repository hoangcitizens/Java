/*
    Bài 8. Viết chương trình nhập số liệu cho ma trận các số nguyên A cấp mxn trong đó m, n là các số tự nhiên.
           Sau đó tìm ma trận chuyển vị B = (bij) cấp nxm, bij = aji i = 1, 2, ..., n; j = 1, 2, ..., m.
           Hiển thị 2 ma trận trên màn hình để tiện so sánh.
*/
import java.util.Scanner;
public class bai8_lab3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Nhập m = "); int m = scanner.nextInt();
        System.out.printf("Nhập b = "); int n = scanner.nextInt();
        System.out.println("Nhập ma trận a[][]: "); int[][] arr = nhap(m, n, scanner);
        int[][] brr = chuyenVi(arr);
        System.out.println("(+) Ma trận gốc: "); show(arr);
        System.out.println("(+) Ma trận chuyển vị: "); show(brr);
    }
    private static int[][] chuyenVi(int[][] arr) {
        int m = arr.length;
        int n = arr[0].length;
        int[][] brr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                brr[i][j] = arr[j][i];
            }
        }
        return brr;
    }
    private static int[][] nhap(int m, int n, Scanner scanner) {
        int[][] x = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("Nhập a[" + i + "][" + j + "] = ");
                x[i][j] = scanner.nextInt();
            }
        }
        return x;
    }
    private static void show(int[][] arr) {
        int m = arr.length;
        int n = arr[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}