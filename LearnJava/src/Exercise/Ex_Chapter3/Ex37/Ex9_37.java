package Exercise.Ex_Chapter3.Ex37;/*
    Bài 9. Nhập vào hai số nguyên dương a và b từ bàn phím, trong đó a < b. Hãy viết chương trình
    liệt kê các số chính phương trong đoạn [a, b] và in kết quả ra màn hình.
        - Input: gồm 1 dòng chứa hai số nguyên a > 0 và b > 0.
        - Output: hiển thị trên 1 dòng các số chính phương trong đoạn [a, b], phân tách nhau bằng 1 dấu phẩy.
 */

import java.util.Scanner;

public class Ex9_37 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập a = ");
        int a = scanner.nextInt();
        System.out.print("Nhập b = ");
        int b = scanner.nextInt();
        System.out.print(STR."Số chính phương trong đoạn [\{a},\{b}] là: ");
        for (int i = a; i <= b; i++) {
            int sqrt = (int) Math.sqrt(i);
            if (sqrt * sqrt == i) {
                System.out.print(i + ", ");
            }
        }
        System.out.print("\b\b");
    }
}
