package Exercise.Ex_Chapter5.Ex55;

/*
    Bài 5. Nhập vào từ bàn phím một số nguyên dương h. Hãy vẽ hình tam giác vuông góc phải trên với độ dài 2 cạnh góc
    vuông bằng h sử dụng mảng hai chiều, mỗi phần tử trong mảng được thể hiển bằng kí tự * hoặc các khoảng trắng *.
    In hình tam giác vuông tương ứng ra màn hình.
        - Input: gồm 1 dòng chứa số nguyên h > 1 là độ dài của 2 cạnh tam giác vuông.
        - Output: hiển thị trên nhiều dòng tiếp theo là hình tam giác vuông ở góc phải trên với độ dài cạnh là m.
 */

import java.util.Scanner;

public class Ex05_55 {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        System.out.print("Nhập độ dài tam giác vuông cân: ");
        var h = sc.nextInt();
        int[][] a = new int[h][h];
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < h; j++) {
                if (i <= j) {
                    System.out.print(" * ");
                }
                else
                    System.out.print("   ");
            }
            System.out.println();
        }
    }
}
