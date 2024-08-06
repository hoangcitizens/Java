package Exercise.Ex_Chapter3.Ex37;/*
    Bài 5. Nhập vào từ bàn phím một số nguyên dương h. Hãy vẽ hình tam giác vuông góc phải trên
    với độ dài 2 cạnh góc vuông bằng h. Hình vẽ được thể hiện bằng các kí tự *. In hình tam giác
    vuông tương ứng ra màn hình.
        - Input: gồm 1 dòng chứa số nguyên h > 1 là độ dài của 2 cạnh tam giác vuông.
        - Output: hiển thị trên nhiều dòng tiếp theo là hình tam giác vuông ở góc phải trên với độ dài cạnh là m.
 */

import java.util.Scanner;

public class Ex5_37 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.print("Nhập độ cao của tam giác: ");
        var h = input.nextInt();
        // vẽ tam giác theo hướng: trên hàng thứ i in ra i-1 khoảng trắng
        // sau đó trên hàng thứ i in ra h-i+1 dấu *. Do vuông góc phải trên
        // nên ta in ra giá trị dấu cách nếu chỉ số cột < chỉ số hàng
        for (int i = 1; i <= h; i++) {
            for (int j = 1; j <= h; j++) {
                if (j < i) {
                    System.out.print("   ");
                } else {
                    System.out.print(" * ");
                }
            }
            System.out.println();
        }
    }
}
