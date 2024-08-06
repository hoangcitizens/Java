package Exercise.Ex_Chapter5.Ex55;

/*
    Bài 11. Nhập vào từ bàn phím hai số nguyên dương m và n, trong đó m và n là số hàng và cột của một ma trận chỉ chứa
    hai số 0 hoặc 1. Hãy viết chương trình vẽ ma trận cấp m x n bằng các số 0 và 1 rồi in ra màn hình. Lưu ý phần tử
    đầu tiên của ma trận bằng 0, phần tử tiếp theo là 1 và cứ thế tiếp tục.
        - Input: gồm 1 dòng chứa số nguyên m > 0 và n > 0, phân tách nhau bởi 1 dấu cách.
        - Output: hiển thị trên nhiều dòng tiếp theo là ma trận m x n chỉ chứa các số 0 và 1.
*/

import java.util.Scanner;

public class Ex11_55 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.print("Nhập số hàng: ");
        var m = input.nextInt();
        System.out.print("Nhập số cột: ");
        var n = input.nextInt();
        var matrix = new int[m][n];
        fillMatrix(matrix);
        onScreen(matrix);
    }

    /**
     * phương thức hiển thị ma trận lên màn hình
     *
     * @param matrix ma trận chứa các phần tử cần hiển thị
     */
    private static void onScreen(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println();
        }
    }

    /**
     * phương thức điền giá trị cho ma trận. Nhận thấy rằng
     * phần tử tại vị trí i, j trong ma trận là phần dư của (i + j) % 2
     *
     * @return mảng 2 chiều sau khi nhập
     */
    private static void fillMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (i + j) % 2;
            }
        }
    }
}
