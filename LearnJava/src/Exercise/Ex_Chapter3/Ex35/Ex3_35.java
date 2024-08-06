package Exercise.Ex_Chapter3.Ex35;/*
    Bài 3. Nhập vào một chuỗi kí tự từ bàn phím. Hãy viết hoa chữ cái đầu mỗi từ và in kết quả ra màn hình.
        - Input: gồm 1 dòng chứa chuỗi kí tự.
        - Output: hiển thị trên 1 dòng cả chuỗi với chữ cái đầu mỗi từ viết hoa
 */

import java.util.Scanner;

public class Ex3_35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào một chuỗi: ");
        var str = scanner.nextLine();
        for (int i = 0; i < str.length(); i++) {
            if (i == 0 && str.charAt(i) != ' ') {
                System.out.print(Character.toUpperCase(str.charAt(i)));
            } else if (i != 0 && str.charAt(i) == ' ') {
                System.out.print(" " + Character.toUpperCase(str.charAt(i + 1)));
                i++;
            } else {
                System.out.print(str.charAt(i));
            }
        }
    }
}
