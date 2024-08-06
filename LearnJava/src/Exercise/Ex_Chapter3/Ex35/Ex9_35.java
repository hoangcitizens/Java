package Exercise.Ex_Chapter3.Ex35;/*
    Bài 9. Nhập vào một số nguyên dương n từ bàn phím, trong đó 0 ≤ n ≤ 90. Hãy viết chương trình
           tìm số fibonacci thứ n , kí hiệu Fn. In ra màn hình kết quả.
    Chú thích: số Fibonacci là số được định nghĩa như sau F0 = 0, F1 = 1, Fn = Fn − 1 + Fn − 2
        - Input: gồm 1 dòng chứa số nguyên dương n.
        - Output: hiển thị trên 1 dòng kết quả số fibbonacci thứ n
 */


import java.util.Scanner;

public class Ex9_35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào n = ");
        var n = scanner.nextInt();
        System.out.print(STR."Số Fibonacci thứ \{n} là: ");
        long f0 = 0;
        long f1 = 1;
        long fn = (n < 2) ? n : 0; // nếu n < 2, fn = n
        for (int i = 2; i <= n; i++) {
            fn = f0 + f1;
            f0 = f1;
            f1 = fn;
        }
        System.out.println(fn);
    }
}
