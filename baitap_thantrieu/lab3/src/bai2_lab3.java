/*
    Bài 2. Đọc vào một dãy số a có n phần tử là các số nguyên. Đếm số lần xuất hiện của từng phần tử trong mảng.
           In ra phần tử và số lần xuất hiện của phần tử có số lần xuất hiện nhiều nhất trong a.
*/

import java.util.Scanner;

public class bai2_lab3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhập số phần tử của mảng: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] res = new int[n]; // mảng kết quả
        for (int i = 0; i < n; i++) {
            System.out.printf("Nhập a[" + i + "] = ");
            a[i] = sc.nextInt();
            res[i] = -1; // gán các giá trị res = -1 ( mặc định là 0 )
        }
        System.out.printf("Các phần tử trong mảng vừa nhập là: ");
        for (int i = 0; i < n; i++) {
            System.out.printf(a[i] + ", ");
        }
        System.out.printf("\b\b");
        int count = 0;

        // đếm số lần xuất hiện của các phần tử
        for (int i = 0; i < n; i++) {
            count = 1; // mặc định mỗi phần tử xuất hiện 1 lần
            for (int j = i + 1; j < n; j++) { // xét phần tử tiếp theo
                if (res[j] != 0 && a[i] == a[j]) { // vì ban đầu ta gán các vị trí res đều = -1 nên dk1 sẽ đúng
                    count++;
                    res[j] = 0; // nếu phần tử vị trí i trùng với j thì res vị trí j sẽ = 0 (đánh dấu để biết là xét rồi nên bỏ qua <không thỏa mãn dk1>)
                }
            }
            if (res[i] != 0) { // nếu res chưa xét
                res[i] = count; // gán lại res = số lần xuất hiện
            }
        }

        // Tìm số lần max
        int max = res[0];
        for (int i = 0; i < n; i++) {
            if (res[i] > max) {
                max = res[i];
            }
        }
        System.out.printf("\nSố lần xuất hiện max là " + max + " lần với các phần tử: ");
        for (int i = 0; i < n; i++) {
            if (res[i] == max)
                System.out.printf(a[i] + ", ");
        }
        System.out.printf("\b\b");
    }
}
