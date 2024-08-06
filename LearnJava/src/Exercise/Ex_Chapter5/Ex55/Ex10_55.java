package Exercise.Ex_Chapter5.Ex55;

/*
    Bài 10. Nhập vào từ bàn phím hai số nguyên dương m và n, trong đó m là số hàng và n là số cột của một ma trận số
    nguyên cấp m x n. Hãy viết chương trình cho phép nhập các phần tử của hai ma trận cấp m x n và tính tổng của hai
    ma trận đó. Sau đó, in kết quả tổng của hai ma trận ra màn hình.
    - Input: cho trên nhiều dòng
        o Dòng đầu chứa số nguyên m > 0 và n > 0, phân tách nhau bởi 1 dấu cách.
        o Dòng tiếp theo hiển thị thông báo “Nhập các phần tử cho ma trận 1:”, sau đó m dòng, mỗi dòng chứa n phần tử,
          phân tách nhau bởi 1 dấu cách.
        o Dòng tiếp theo hiển thị thông báo “Nhập các phần tử cho ma trận 2:”, sau đó m dòng, mỗi dòng chứa n phần tử, phân
          tách nhau bởi 1 dấu cách.
    - Output: hiển thị trên nhiều dòng
        o Dòng đầu tiên hiển thị thông báo “Kết quả:”
        o Các dòng tiếp theo hiển thị tổng của hai ma trận theo hàng và cột.
 */

import java.util.Scanner;

public class Ex10_55 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.print("Nhập số hàng: ");
        var m = input.nextInt();
        System.out.print("Nhập số cột: ");
        var n = input.nextInt();
        var matrixA = new int[m][n];
        var matrixB = new int[m][n];
        System.out.println("Nhập các phần tử cho ma trận 1: ");
        fillMatrix(matrixA, input);
        System.out.println("Nhập các phần tử cho ma trận 2: ");
        fillMatrix(matrixB, input);
        var matrixSum = add(matrixA, matrixB);
        System.out.println("Kết quả: ");
        onScreen(matrixSum);
    }

    /**
     * phương thức hiển thị ma trận lên màn hình
     *
     * @param matrix ma trận chứa các phần tử cần hiển thị
     */
    private static void onScreen(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    /**
     * phương thức tính tổng hai ma trận
     *
     * @param matrixA ma trận thứ nhất
     * @param matrixB ma trận thứ hai
     * @return ma trận tổng
     */
    private static int[][] add(int[][] matrixA, int[][] matrixB) {
        // ma trận tổng có cùng cấp với hai ma trận thành phần
        int[][] sum = new int[matrixA.length][matrixA[0].length];
        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixA[i].length; j++) {
                sum[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }
        return sum;
    }

    /**
     * phương thức dùng để nhập vào các phần tử cho ma trận
     *
     * @return mảng 2 chiều sau khi nhập
     */
    private static void fillMatrix(int[][] matrix, Scanner input) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(STR."Nhập matrix[\{i}][\{j}] = ");
                matrix[i][j] = input.nextInt();
            }
        }
    }
}
