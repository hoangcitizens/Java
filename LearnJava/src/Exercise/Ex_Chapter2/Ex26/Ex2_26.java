package Exercise.Ex_Chapter2.Ex26;/*
    Bài 2. Nhập vào một chuỗi kí tự từ bàn phím và cho biết độ dài của chuỗi bạn vừa nhập.
    - Input: 1 dòng chứa chuỗi kí tự cần nhập vào bao gồm cả khoảng trắng(dấu cách, dấu tab
    ngang).
    - Output: hiển thị trên 1 dòng độ dài của chuỗi.
 */

import java.util.Scanner;

public class Ex2_26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào chuỗi ký tự: ");
        String s = scanner.nextLine();
        System.out.println(STR."Độ dài chuỗi ký tự là: \{s.length()}");
    }
}
