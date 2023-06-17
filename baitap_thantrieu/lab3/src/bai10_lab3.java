/*
    Bài 10. Nhập vào ma trận A[n][m] có các phần tử là các số nguyên.
    Hãy liệt kê trên màn hình tất cả các phần tử của ma trận theo thứ tự tăng dần từ trái qua phải, từ trên xuống dưới
 */
import java.util.Arrays;
public class bai10_lab3 {
    public static void main(String[] args) {
        int[][] A = { { 4, 7, 2 }, { 6, 9, 1 }, { 3, 8, 5 } };
        int n = A.length;
        int m = A[0].length;

        int[] result = new int[n * m];
        int k = 0;

        for (int j = 0; j < m; j++) {
            for (int i = 0; i < n; i++) {
                result[k++] = A[i][j];
            }
        }
        Arrays.sort(result);
        for (int i = 0; i < n * m; i++) {
            System.out.print(result[i] + " ");
        }
    }
}