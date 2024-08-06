package Lesson.Ls_Chapter5_Arrays.Ls55_array2;

import java.util.Scanner;

public class Lesson55_VD1 {
    public static void main(String[] args) {
        // Ví dụ 1: Vẽ hình chữ nhật đặc bằng các dấu *
        var sc = new Scanner(System.in);
        System.out.print("Nhập số hàng HCN: ");
        var height = sc.nextInt();
        System.out.print("Nhập số cột HCN: ");
        var weight = sc.nextInt();
        if (height > 0 && weight > 0) {
            String[][] rect = new String[height][weight];
            fillStars(rect);
            onScreen(rect);
        }
        else
            System.out.println("So hàng số cột phải nguyên dương");
    }

    /**
     * phương thức vẽ lên màn hình
     *
     * @param rect mảng chứa dữ liệu cần vẽ
     */
    private static void onScreen(String[][] rect) {
        for (int i = 0; i < rect.length; i++) {
            for (int j = 0; j < rect[i].length; j++) {
                System.out.print(rect[i][j]);
            }
            System.out.println();
        }
    }

    /**
     * phương thức điền dấu * vào hình chữ nhật
     *
     * @param rect mảng hình chữ nhật
     */

    private static void fillStars(String[][] rect) {
        for (int i = 0; i < rect.length; i++) {
            for (int j = 0; j < rect[i].length; j++) {
                rect[i][j] = " * ";
            }
        }
    }
}
