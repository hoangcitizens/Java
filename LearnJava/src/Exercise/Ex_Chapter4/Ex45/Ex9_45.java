package Exercise.Ex_Chapter4.Ex45;

/*
    Bài 9. Nhập vào một số nguyên dương n từ bàn phím. Hãy viết phương thức đệ quy để tính tổng của biểu thức S sau và
    in ra màn hình kết quả.
    S = 1 + 2 + 3 + ⋯ + 𝑛
        - Input: gồm 1 dòng chứa số nguyên n > 0.
        - Output: hiển thị trên 1 dòng kết quả của biểu thức S.
 */

import java.util.Scanner;

public class Ex9_45 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        var n = input.nextInt();
        var sum = add(n);
        System.out.println(sum);
    }

    // phương thức tính toán S = 1 + ... + n
    private static int add(int n) {
        if (n == 1) { // điểm dừng
            return 1;
        } else { // bước đệ quy
            return n + add(n - 1);
        }
    }
}
