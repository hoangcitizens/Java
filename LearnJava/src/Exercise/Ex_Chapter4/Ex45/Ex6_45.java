package Exercise.Ex_Chapter4.Ex45;

/*
    Bài 6. Nhập vào một số nguyên dương n từ bàn phím. Hãy viết phương thức đệ quy thực hiện tìm chữ số đầu tiên của n và in ra màn hình.
        - Input: gồm 1 dòng chứa số nguyên n > 0.
        - Output: hiển thị trên 1 dòng chữ số đầu tiên của n
 */

import java.util.Scanner;

public class Ex6_45 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        var n = input.nextInt();
        System.out.println(firstDigit(n));
    }

    // phương thức tìm chữ số đầu tiên của n
    private static int firstDigit(int n) {
        if (n < 10) { // điểm dừng
            return n;
        } else { // bước đệ quy
            return firstDigit(n / 10);
        }
    }
}
