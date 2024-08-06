package Exercise.Ex_Chapter2.Ex26;/*
    Bài 9. Nhập vào 1 dòng thông điệp nào đó từ bàn phím. Hãy hiển thị ra màn hình vị trí và giá trị
    của phần tử đầu tiên cũng như phần tử cuối cùng trong chuỗi.
    Lưu ý: không được có dấu cách thừa ở đầu và cuối chuỗi.
    - Input: gồm một dòng chứa thông điệp của bạn.
    - Output: hiển thị trên 2 dòng
        + Dòng đầu gồm vị trí và giá trị kí tự đầu tiên được thể hiện trong dấu nháy đơn,
        phân tách nhau bằng 1 dấu cách.
        + Dòng thứ hai gồm vị trí và giá trị kí tự cuối trong chuỗi được thể hiện trong dấu
        nháy đơn, phân tách nhau bằng 1 dấu cách
 */

import java.util.Scanner;

public class Ex9_26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập một thông điệp: ");
        String str = scanner.nextLine();
        System.out.println(STR."Vị trị đầu tiên \{0} với giá trị '\{str.charAt(0)}'");
        System.out.println(STR."vị trị cuối cùng \{str.length()- 1} với giá trị '\{str.charAt(str.length()-1)}'");
    }
}
