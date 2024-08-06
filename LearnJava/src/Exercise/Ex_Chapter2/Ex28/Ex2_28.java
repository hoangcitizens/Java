package Exercise.Ex_Chapter2.Ex28;

import java.util.Scanner;

/*
    Bài 2. Thực hiện nhập từ bàn phím một số thực dương n. Hãy in ra màn hình giá trị căn bậc 2, căn bậc 3 của n.
    - Input: gồm 1 dòng chứa số thực dương n.
    - Output: hiển thị trên 2 dòng
        + Dòng đầu là giá trị căn bậc 2 của số thực n.
        + Dòng thứ hai là giá trị căn bậc 3 của số thực n.
 */
public class Ex2_28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào số thực dương n = ");
        var n = scanner.nextFloat();
        System.out.println(STR."Giá trị căn bậc 2 của \{n} là \{Math.sqrt(n)}" +
                           STR."\nGiá trị căn bậc 3 của \{n} là \{Math.cbrt(n)}");
    }
}
