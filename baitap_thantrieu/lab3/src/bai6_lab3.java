/*
    Bài 6. Nhập số liệu cho dãy số nguyên a0 , a1 ,..., an-1 và một giá trị x.
           Giả sử dãy a đã được sắp xếp theo thứ tự tăng dần.
           Hãy chèn giá trị x vào dãy a sao cho vẫn giữ được tính sắp xếp của mảng
*/

import java.util.Arrays;
import java.util.Scanner;

public class bai6_lab3 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhập số phần tử mảng a: "); int n = sc.nextInt();
        System.out.printf("(+) Nhập mảng a[] gồm " + n + " phần tử: \n"); int[] a = input(n);
        System.out.printf("(+) Nhập giá trị x = "); int x = sc.nextInt();
        int index = -1;
        for (int i = 0; i < n; i++) {
            if (a[i] > x) {
                index = i;
                break;
            }
        }
        if (index == -1)
            a[n] = x; // chèn vào cuối
        else {
            // chèn vào vị trí từ 0 đến n - 1
            for (int i = n; i > index; i--) {
                a[i] = a[i-1]; // dịch sang bên phải vị trí index
            }
            a[index] = x;
        }
        System.out.printf("\nMảng sau khi chèn giá trị x = " + x + " sắp xếp tăng dần là: ");
        Arrays.sort(a);
        System.out.printf(Arrays.toString(a));
    }
    public static int[] input(int n) {
        int[] x = new int[n + 1]; // thừa ra 1 vị trí để chèn x vào
        for (int i = 0; i < n; i++) {
            System.out.printf("\tNhập [" + i + "] = ");
            x[i] = sc.nextInt();
        }
        return x;
    }
}
