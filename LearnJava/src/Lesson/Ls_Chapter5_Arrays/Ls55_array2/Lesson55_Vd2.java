package Lesson.Ls_Chapter5_Arrays.Ls55_array2;

import java.util.Scanner;

public class Lesson55_Vd2 {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        // VD2: Tạo mảng zigzag lưu tam giác số vuông góc trái dưới
        System.out.print("Nhập chiều cao của tam giác: ");
        var h = sc.nextInt();
        // cấp phát hàng của mảng
        var triangle = new int[h][];
        for (int i = 0; i < h; i++) {
            triangle[i] = new int[i+1];
        }
        fillTriangle(triangle);
        onScreen(triangle);
    }

    /**
     * phương thức vẽ hình tam giác số lên màn hình
     * @param triangle hình tam giác số
     */
    private static void onScreen(int[][] triangle) {
        for (int i = 0; i < triangle.length; i++) {
            for (int j = 0; j < triangle[i].length; j++) {
                System.out.printf("%4d",triangle[i][j]);
            }
            System.out.println();
        }
    }

    /**
     * phương thức vẽ hình tam giác số vuông góc trái dưới bằng các chữ số
     * @param triangle mảng zigzag chứa kết quả
     */

    private static void fillTriangle(int[][] triangle) {
        for (int i = 0; i < triangle.length; i++) {
            for (int j = 0; j < triangle[i].length; j++) {
                triangle[i][j] = i + j;
            }
        }
    }
}
