package Exercise.Ex_Chapter3.Ex37;/*
    Bài 8. Nhập vào từ bàn phím một số nguyên dương h. Hãy vẽ hình tam giác số đối xứng với chiều
    cao bằng h. Hình vẽ được thể hiện bằng các chữ số 1, 2, …, h. In hình tam giác cân tương ứng ra màn hình.
        - Input: gồm 1 dòng chứa số nguyên h > 1 là độ dài của chiều cao của tam giác số đối xứng.
        - Output: hiển thị trên nhiều dòng hình tam giác số đối xứng
 */

import java.util.Scanner;

public class Ex8_37 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.print("Nhập độ cao của tam giác: ");
        var h = input.nextInt();
        for (int i = 1; i <= h; i++) {
            for (int j = 1; j < 2 * h; j++) {
                // nếu i là hàng cuối hoặc các hàng khác tại cột j thỏa
                if (j >= h - i + 1 && j <= h + i - 1) {
                    System.out.print(" " + (i - Math.abs(h - j)) + " "); // vẽ số
                } else {
                    System.out.print("   "); // vẽ khoảng trắng
                }
            }
            System.out.println();
        }
    }
}
