package Exercise.Ex_Chapter4.Ex45;

/*
    Bài 10. Nhập vào một số nguyên dương n từ bàn phím. Hãy viết phương thức đệ quy để tính tổng
    của biểu thức S sau và in ra màn hình kết quả.
        S = 1 + 1/2 + 1/3 + ... + 1/n;
    - Input: gồm 1 dòng chứa số nguyên n > 0.
    - Output: hiển thị trên 1 dòng kết quả của biểu thức S, làm tròn kết quả đến 2 chữ số thập phân sau dấu phẩy
 */

import java.util.Scanner;

public class Ex10_45 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        var n = input.nextInt();
        var sum = add(n);
        System.out.printf("%.2f%n", sum);
    }

    // phương thức tính toán S = 1 + 1/2 ... + 1/n
    private static double add(int n) {
        if (n == 1) { // điểm dừng
            return 1;
        } else { // bước đệ quy
            return 1.0 / n + add(n - 1);
        }
    }
}
