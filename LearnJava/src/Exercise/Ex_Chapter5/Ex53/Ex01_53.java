package Exercise.Ex_Chapter5.Ex53;

/*
    Bài 1. Viết chương trình cho phép nhập vào một mảng số nguyên gồm n phần tử và sắp xếp mảng này theo thứ tự tăng dần.
    Yêu cầu tự viết các phương thức phù hợp. In kết quả của mảng trước và sau khi sắp xếp ra màn hình.
    - Input: cho trên 2 dòng
        o Dòng thứ nhất gồm n là số lượng phần tử của mảng, n > 0.
        o Dòng thứ hai gồm các giá trị của n phần tử trong mảng, phân tách nhau bằng 1 dấu cách.
    - Output: hiển thị trên 2 dòng
        o Dòng thứ nhất là các phần tử mảng trước khi sắp xếp tăng dần, phân tách nhau bằng 1 dấu cách.
        o Dòng thứ hai là các phần tử mảng sau khi sắp xếp tăng dần, phân tách nhau bằng 1 dấu cách.
 */

import java.util.Arrays;
import java.util.Scanner;

public class Ex01_53 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Nhập số phần tử của mảng: ");
        var n = sc.nextInt();
        int[] a = new int[n];
        nhapMang(a, n);
        System.out.print("Mảng vừa nhập là: ");
        hienthi(a, n);
        System.out.print("Mảng sau khi sắp xếp tăng dần là: ");
        Arrays.sort(a);
        //sapxep(a, n);
        hienthi(a, n);
    }

    private static void sapxep(int[] a, int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] > a[j]) {
                    int tmp = a[i];
                    a[i] = a[j];
                    a[j] = tmp;
                }
            }
        }
    }

    private static void hienthi(int[] a, int n) {
        for (int number : a) {
            System.out.print(STR."\{number}, ");
        }
        System.out.println("\b\b");
    }

    private static void nhapMang(int[] a, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(STR."Nhập a[\{i}] = ");
            a[i] = sc.nextInt();
        }
    }
}
