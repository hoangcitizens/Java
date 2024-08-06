package Exercise.Ex_Chapter3.Ex37;/*
    Bài 3. Nhập vào từ bàn phím một số nguyên dương h. Hãy vẽ hình tam giác vuông góc trái dưới với độ
    dài 2 cạnh góc vuông bằng h. Hình vẽ được thể hiện bằng các kí tự *. In hình tam giác
    vuông tương ứng ra màn hình.
        - Input: gồm 1 dòng chứa số nguyên h > 1 là độ dài của 2 cạnh tam giác vuông.
        - Output: hiển thị trên nhiều dòng tiếp theo là hình tam giác vuông ở góc trái dưới với độ dài cạnh là m.
 */

import java.util.Scanner;

public class Ex3_37 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.print("Nhập độ cao tam giác: ");
        var h = input.nextInt();
        for (int i = 1; i <= h; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
