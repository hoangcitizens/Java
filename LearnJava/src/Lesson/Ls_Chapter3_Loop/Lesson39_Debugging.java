package Lesson.Ls_Chapter3_Loop;
// Bài 3.9. Debugging-gỡ lỗi trong lập trình Java

import java.util.Scanner;

public class Lesson39_Debugging {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("Nhập vào kích thước hình chữ nhật");
        System.out.print("Chiều dài: ");
        var m = input.nextInt();
        System.out.print("Chiều rộng: ");
        var n = input.nextInt();
        if (m > 0 && n > 0) {
            for (int i = 1;
                 i <= m;
                 i++) {
                for (int j = 1;
                     j <= n;
                     j++) {
                    System.out.print(" * ");
                }
                System.out.println();
            }
        } else {
            System.out.println("Kích thước hình chữ nhật phải nguyên dương");
        }
    }
}
