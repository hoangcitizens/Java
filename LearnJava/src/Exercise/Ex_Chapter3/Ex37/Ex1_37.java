package Exercise.Ex_Chapter3.Ex37;/*
    Bài 1. Nhập vào từ bàn phím một số nguyên dương m. Hãy vẽ hình vuông rỗng cạnh m với các đường chéo
    chính và phụ. Hình vẽ được thể hiện bằng các kí tự *. In hình vuông tương ứng ra
    màn hình.
        - Input: gồm 1 dòng chứa số nguyên m > 2 là cạnh của hình vuông.
        - Output: hiển thị trên nhiều dòng tiếp theo là hình vuông với độ dài cạnh là m, có đường chéo chính và phụ.
 */

import java.util.Scanner;

public class Ex1_37 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập cạnh của hình vuông: ");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n - 1 || j == 0 || j == n - 1 || i == j || i == n - j - 1)
                {
                    System.out.print(" * ");
                }
                else
                    System.out.print("   ");
            }
            System.out.println();
        }
    }
}