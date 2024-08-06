package Exercise.Ex_Chapter3.Ex37;/*
    Bài 6. Nhập vào từ bàn phím một số nguyên dương h. Hãy vẽ hình tam giác cân đặc với chiều cao
    bằng h. Hình vẽ được thể hiện bằng các kí tự *. In hình tam giác cân tương ứng ra màn hình.
        - Input: gồm 1 dòng chứa số nguyên h > 1 là độ dài của chiều cao của tam giác cân.
        - Output: hiển thị trên nhiều dòng hình tam giác cân đặc thể hiển bằng kí tự *
 */

import java.util.Scanner;

public class Ex6_37 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.print("Nhập độ cao của tam giác: ");
        var h = input.nextInt();
        for (int i = 1; i <= h; i++) {
            for (int j = 1; j < h * 2; j++) {
                if (j < (h + 1 - i) || j > (h - 1 + i))
                    System.out.print("   ");
                else
                    System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
