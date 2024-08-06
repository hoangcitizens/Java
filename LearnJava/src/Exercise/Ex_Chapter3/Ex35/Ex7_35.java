package Exercise.Ex_Chapter3.Ex35;/*
    Bài 7. Nhập vào từ bàn phím hai số nguyên a và b, trong đó a < b. Hãy viết chương trình liệt kê các
           số nguyên tố trong đoạn [a, b].
    - Input: gồm 1 dòng chứa số nguyên a và b, phân tách nhau bằng 1 dấu cách.
    - Output: hiển thị trên 1 dòng các số nguyên tố trong đoạn [a, b], phân tách nhau bằng 1 dấu cách giữa các số
 */


import java.util.Scanner;

public class Ex7_35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập a = ");
        var a = scanner.nextInt();
        System.out.print("Nhập b = ");
        var b = scanner.nextInt();
        System.out.print(STR."Các số nguyên tố trong đoạn [\{a},\{b}] là: ");
        for (int i = a; i <= b; i++) {
            int count = 0;
            if (i < 2)
                count++;
            else {
                for (int j = 2; j <= i / 2; j++) {
                    if (i % j == 0)
                        count++;
                }
            }
            System.out.print((count == 0) ? STR."\{i}, " : "");
        }
    }
}
