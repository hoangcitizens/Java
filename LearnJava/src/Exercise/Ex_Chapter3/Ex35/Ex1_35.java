package Exercise.Ex_Chapter3.Ex35;/*
    Bài 1. Nhập vào một số nguyên dương n từ bàn phím. Hãy tính tổng của biểu thức S sau và in ra
    màn hình kết quả.
        S = 1 + 1/2 + 1/3 + ... + 1/n
    - Input: gồm 1 dòng chứa số nguyên n > 0.
    - Output: hiển thị trên 1 dòng kết quả của biểu thức S, làm tròn kết quả đến số nguyên gần
    nhất.
 */


import java.util.Scanner;

public class Ex1_35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào n = ");
        var n = scanner.nextInt();
        double S = 0;
        for (int i = 1; i <= n; i++) {
            S += 1.0/i;
        }
        System.out.printf("Tổng S = %1.3f", S);
    }
}
