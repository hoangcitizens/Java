package Exercise.Ex_Chapter4.Ex45;

import java.util.Scanner;

/*
    Bài 2. Nhập vào một số nguyên n từ bàn phím, trong đó n >= 0. Hãy viết phương thức đệ quy
    thực hiện tìm số fibonacci thứ n, kí hiệu Fn. In kết quả ra màn hình.
    Chú thích: số Fibonacci là số được định nghĩa như sau F0 = 0, F1 = 1, Fn = Fn − 1 + Fn − 2 (với mọi số nguyên n > 1).
        - Input: gồm 1 dòng chứa số nguyên n >= 0.
        - Output: hiển thị trên 1 dòng giá trị của Fn
 */
public class Ex2_45 {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        System.out.print("Nhập số nguyên dương n = ");
        var n = sc.nextInt();
        System.out.print(STR."Số fibonacci thứ \{n} là: \{fib(n)}");
    }
    public static long fib(int n)
    {
        if (n < 2)
            return n;
        else
            return fib(n-1) + fib(n-2);
    }
}
