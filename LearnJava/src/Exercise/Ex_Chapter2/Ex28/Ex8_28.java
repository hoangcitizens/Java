package Exercise.Ex_Chapter2.Ex28;/*
    Bài 8. Nhập vào từ bàn phím bán kính r > 0 của đường tròn. Hãy tính chu vi, diện tích của đường tròn này và
           in kết quả ra màn hình.
    - Input: gồm một dòng chứa bán kính r của đường tròn.
    - Output: hiển thị trên 2 dòng
        + Dòng đầu là giá trị của chu vi được làm tròn đến số nguyên gần nhất.
        + Dòng thứ hai là giá trị diện tích được làm tròn đến số nguyên gần nhất.
 */


import java.util.Scanner;

public class Ex8_28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào bán kính hình tròn: ");
        var r = scanner.nextFloat();
        System.out.println(STR."Chu vi hình tròn là: \{2*Math.PI*r}");
        System.out.println(STR."Diện tích hình tròn là: \{Math.PI*r*r}");
    }
}
