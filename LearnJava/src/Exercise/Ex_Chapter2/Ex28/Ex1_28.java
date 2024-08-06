package Exercise.Ex_Chapter2.Ex28;

import java.util.Scanner;

/*
    Bài 1. Nhập vào từ bàn phím một số nguyên n. Hãy tìm giá trị tuyệt đối của n và in ra màn hình.
    - Input: gồm 1 dòng chứa số nguyên n.
    - Output: hiển thị trên 1 dòng giá trị tuyệt đối của n.
 */
public class Ex1_28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào số nguyên n = ");
        int n = scanner.nextInt();
        System.out.printf(STR."Trị tuyệt đối của \{n} là \{Math.abs(n)}");
    }
}
