package Exercise.Ex_Chapter2.Ex26;/*
    Bài 6. Nhập vào chuỗi str1 và chuỗi str2 từ bàn phím, hãy loại bỏ các dấu cách thừa ở đầu và cuối
mỗi chuỗi. Sau đó nối chuỗi str1 với chuỗi str2 và in kết quả ra màn hình.
- Input cho trên 2 dòng:
    + Dòng đầu chứa chuỗi str1.
    + Dòng còn lại chứa chuỗi str2.
- Output: hiển thị trên 1 dòng kết quả sau khi nối chuỗi str1 với chuỗi str2.
 */

import java.util.Scanner;

public class Ex6_26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào chuỗi 1: ");
        String str1 = scanner.nextLine();
        System.out.print("Nhập vào chuỗi 2: ");
        String str2 = scanner.nextLine();
        System.out.println(STR."Chuỗi sau khi loại bỏ khoảng trắng và nối là: \{str1.trim()} \{str2.trim()}");
    }
}
