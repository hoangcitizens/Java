package Exercise.Ex_Chapter2.Ex26;/*
    Bài 8. Nhập vào 1 dòng gồm họ và tên từ bàn phím. Giả định họ-đệm-tên chỉ phân tách nhau
bằng 1 khoảng trắng và không có dấu cách thừa ở đầu và cuối. Hãy tách chuỗi trên để lấy họ,
đệm, tên.
    - Input: gồm một dòng chứa chuỗi đầu vào.
    - Output: gồm nhiều dòng với định dạng sau
        + Dòng đầu ghi “Họ: X” với X là họ tách được từ chuỗi họ và tên.
        + Dòng tiếp theo ghi “Đệm: Y” với Y là phần tên đệm tách được.
        + Dòng cuối ghi “Tên: Z” với Z là tên tách được từ chuỗi họ và tên.
 */

import java.util.Scanner;

public class Ex8_26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập họ và tên: ");
        String fullName = scanner.nextLine();
        int x = fullName.indexOf(" ");
        int y = fullName.lastIndexOf(" ");
        String firstName = fullName.substring(0,x);
        String midName = fullName.substring(x+1,y);
        String lastName = fullName.substring(y+1,fullName.length());
        System.out.println(STR."Họ: \{firstName}");
        System.out.println(STR."Đệm: \{midName}");
        System.out.println(STR."Tên: \{lastName}");
    }
}
