/*
    Bài 11. Viết chương trình in ra ma trận xoáy ốc Q[m][n]. Trong đó m, n > 0 tùy ý.
 */
public class bai11_lab3 {
    public static void main(String[] args) {
        int m = 5, n = 4;
        int[][] Q = new int[m][n];
        int row = 0, col = 0;
        int value = 1;
        while (row < m && col < n) {
            // điền giá trị cho hàng đầu tiên từ trái qua phải
            for (int i = col; i < n; i++) {
                Q[row][i] = value++;
            }
            row++;
            // điền giá trị cho cột cuối cùng từ trên xuống dưới
            for (int i = row; i < m; i++) {
                Q[i][n - 1] = value++;
            }
            n--;
            // điền giá trị cho hàng cuối cùng từ phải sang trái
            if (row < m) {
                for (int i = n - 1; i >= col; i--) {
                    Q[m - 1][i] = value++;
                }
                m--;
            }
            // điền giá trị cho cột đầu tiên từ dưới lên trên
            if (col < n) {
                for (int i = m - 1; i >= row; i--) {
                    Q[i][col] = value++;
                }
                col++;
            }
        }
        // in ma trận xoáy ốc
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(Q[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
