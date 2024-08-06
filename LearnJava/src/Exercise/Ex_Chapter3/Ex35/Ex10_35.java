package Exercise.Ex_Chapter3.Ex35;/*
    Bài 10. Nhập vào từ bàn phím hai số nguyên dương a và b, trong đó 0 ≤ a < b ≤ 90. Hãy viết chương trình
            liệt kê các số trong dãy fibonacci từ Fa đến Fb.
    - Input: gồm 1 dòng chứa hai số nguyên dương a và b, phân tách nhau bằng 1 dấu cách.
    - Output: hiển thị trên 1 dòng các số fibonacci trong dãy fibonacci từ Fa đến Fb, phân tách nhau bằng 1 dấu phẩy
 */


import java.util.Scanner;

public class Ex10_35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập a = ");
        var a = scanner.nextInt();
        System.out.print("Nhập b = ");
        var b = scanner.nextInt();
        System.out.print(STR."Các số Fibonacci trong đoạn [\{a},\{b}] là: ");
        for (int i = a; i <= b; i++) {
            long f0 = 0;
            long f1 = 1;
            long fn = (i < 2) ? i : 0;
            for (int j = 2; j <= i; j++) {
                fn = f0 + f1;
                f0 = f1;
                f1 = fn;
            }
            System.out.print(fn);
            if (i != b)
                System.out.print(", ");
        }
    }
}
