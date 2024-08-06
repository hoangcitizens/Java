package Exercise.Ex_Chapter5.Ex55;

/*
    Bài 1. Nhập vào từ bàn phím một số nguyên dương m. Hãy vẽ hình vuông rỗng cạnh m với hai đường chéo sử dụng mảng
    hai chiều, mỗi phần tử trong mảng được thể hiển bằng kí tự * hoặc các khoảng trắng. In hình vuông tương ứng ra màn hình.
        - Input: gồm 1 dòng chứa số nguyên m > 2 là cạnh của hình vuông.
        - Output: hiển thị trên nhiều dòng tiếp theo là hình vuông với độ dài cạnh là m với hai đường chéo.
 */

import java.util.Scanner;

public class Ex01_55 {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        System.out.print("Nhập độ dài cạnh hình vuông: ");
        var m = sc.nextInt();
        int[][] a = new int[m][m];
        if (m > 0) {
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a[i].length; j++) {
                    if (i == 0 || i == a.length-1 || j == 0 || j == a.length-1)
                    {
                        System.out.print(" * ");
                    }
                    else
                        System.out.print("   ");
                }
                System.out.println();
            }
        }
        else {
            System.out.print("Vui lòng nhập cạnh hình vuông là số dương");
        }
    }
}
