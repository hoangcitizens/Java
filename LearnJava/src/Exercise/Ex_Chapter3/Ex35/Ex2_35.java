package Exercise.Ex_Chapter3.Ex35;/*
    Bài 2. Nhập vào một số nguyên dương n từ bàn phím. Hãy tính tổng của biểu thức S sau và in ra màn hình kết quả.
        S = 1 + 2 + 3 + ⋯ + n
    - Input: gồm 1 dòng chứa số nguyên n > 0.
    - Output: hiển thị trên 1 dòng kết quả của biểu thức S
 */

import java.util.Scanner;

public class Ex2_35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào n = ");
        var n = scanner.nextInt();
        int S = 0;
        for (int i = 0; i <= n; i++) {
            S += i;
        }
        System.out.println(STR."Tổng từ 1 đến \{n} là: \{S}");
    }
}
