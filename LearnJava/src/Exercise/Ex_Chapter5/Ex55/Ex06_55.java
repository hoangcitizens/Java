package Exercise.Ex_Chapter5.Ex55;

/*
    Bài 6. Nhập vào từ bàn phím một số nguyên dương h. Hãy vẽ hình tam giác cân đặc với chiều cao bằng h sử dụng mảng
    hai chiều, mỗi phần tử trong mảng được thể hiển bằng kí tự * hoặc các khoảng trắng. In hình tam giác cân tương ứng
    ra màn hình.
        - Input: gồm 1 dòng chứa số nguyên h > 1 là độ dài của chiều cao của tam giác cân.
        - Output: hiển thị trên nhiều dòng hình tam giác cân đặc thể hiển bằng kí tự *.
 */

import java.util.Scanner;

public class Ex06_55 {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        System.out.print("Nhập độ dài tam giác vuông cân: ");
        var h = sc.nextInt();
        int[][] a = new int[h][h];
        for (int i = 1; i <= h; i++) {
            for (int j = 1; j <= h - i; j++) {
                System.out.print("   ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
