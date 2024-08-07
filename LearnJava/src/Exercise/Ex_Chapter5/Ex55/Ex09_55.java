package Exercise.Ex_Chapter5.Ex55;

/*
    Bài 9. Viết chương trình cho phép vào từ bàn phím hai số nguyên dương m và n, trong đó m là số hàng và n là số cột
    của một ma trận số nguyên cấp m x n. Hãy sắp xếp các phần tử trên từng hàng của ma trận theo thứ tự tăng dần từ trái
    qua phải và hiển thị kết quả ra màn hình.
    - Input: cho trên nhiều dòng
        o Dòng đầu chứa số nguyên m > 0 và n > 0, phân tách nhau bởi 1 dấu cách.
        o m dòng tiếp theo, mỗi dòng chứa n phần tử, phân tách nhau bởi 1 dấu cách.
    - Output: hiển thị trên nhiều dòng theo hàng và cột ma trận thỏa mãn yêu cầu của đề bài.
 */

import java.util.Arrays;
import java.util.Scanner;

public class Ex09_55 {
    public static void main(String[] args) {
        // nhập vào ma trận
        var matrix = getMatrix();
        // sắp xếp và hiển thị
        sort(matrix);
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
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    /**
     * phương thức sắp xếp ma trận theo thứ tự tăng dần
     * từ trái qua phải. Do mỗi hàng trong mảng 1 chiều bản chất
     * là mảng 1 chiều nên ta có thể sử dụng phương thức Arrays.sort()
     *
     * @param matrix mảng hai chiều chứa các phần tử cần sắp xếp
     */
    private static void sort(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            Arrays.sort(matrix[i]);
        }
    }

    /**
     * phương thức dùng để nhập vào các phần tử cho mảng hai chiều và trả
     * về mảng sau khi nhập
     *
     * @return mảng sau khi nhập
     */
    private static int[][] getMatrix() {
        var input = new Scanner(System.in);
        System.out.print("Nhập số hàng: ");
        var m = input.nextInt();
        System.out.print("Nhập số cột: ");
        var n = input.nextInt();
        var matrix = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(STR."Nhập matrix[\{i}][\{j}] = ");
                matrix[i][j] = input.nextInt();
            }
        }
        return matrix;
    }
}
