package Exercise.Ex_Chapter2.Ex26;

import java.util.Scanner;

/*
    Bài 3. Nhập vào một chuỗi kí tự từ bàn phím. Hãy thay thế tất cả các dấu cách trong chuỗi bằng
kí tự *.
- Input: 1 dòng chứa chuỗi kí tự cần nhập vào.
- Output: hiển thị trên 1 dòng chuỗi sau khi thay thế toàn bộ các dấu cách bởi dấu *.
 */
public class Ex3_26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào 1 chuỗi: ");
        String s = scanner.nextLine();
        System.out.println(STR."Chuỗi ký tự mới sau khi thay thế là: \{s.replace(' ','*')}");
    }
}
