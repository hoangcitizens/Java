package Exercise.Ex_Chapter2.Ex28;/*
    Bài 3. Nhập vào từ bàn phím một góc x ở hệ degree. In ra màn hình giá trị của sin(x), cos(x), tan(x).
    Chú thích: hệ degree là đơn vị đo bằng độ, khác với radian, ví dụ : -30 độ, 40 độ, ....
    - Input: gồm 1 dòng chứa góc x ở hệ degree.
    - Output: gồm nhiều dòng với định dạng sau
        + Dòng đầu ghi “sin(x) = a” với x là giá trị của góc x vừa nhập, a là kết quả của sin(x).
        + Dòng tiếp ghi “cos(x) = a” với x là giá trị của góc x vừa nhập, a là kết quả của cos(x).
        + Dòng cuối ghi “tan(x) = a” với x là giá trị của góc x vừa nhập, a là kết quả của tan(x).
 */

import java.util.Scanner;

public class Ex3_28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào chỉ số góc: ");
        int x = scanner.nextInt();
        System.out.println(STR."sin(\{x}) = \{Math.sin(Math.toDegrees(x))}");
        System.out.println(STR."cos(\{x}) = \{Math.cos(Math.toDegrees(x))}");
        System.out.println(STR."tan(\{x}) = \{Math.tan(Math.toDegrees(x))}");
    }
}
