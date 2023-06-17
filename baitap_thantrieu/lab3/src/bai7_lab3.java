/*
    Bài 7. Nhập dãy n số (n ≤ 1000). Xác định đường chạy dài nhất, xuất lên màn hình vị trí phần tử đầu tiên và độ dài của đường chạy đó.
           Đường chạy là một dãy liên tiếp các phần tử không giảm của dãy ban đầu.
           Ví dụ : Nhập dãy 1 4 2 3 1 2 6 8 3 5 7 Đường chạy dài nhất là : 4 4
 */
import java.util.Scanner;
public class bai7_lab3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số phần tử của dãy: "); int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.print("Nhập các phần tử của dãy: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int count = 1, maxCount = 1, start = 0, end = 0;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] <= arr[i + 1]) {
                count++;
                if (count > maxCount) {
                    maxCount = count;
                    start = i + 2 - maxCount;
                    end = i + 2;
                }
            } else {
                count = 1;
            }
        }
        System.out.print("Đường dài nhất là: ");
        for (int i = start; i < end; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Ví trí phần tử đầu tiên của đường chạy: " + start);
        System.out.println("Độ dài của đường chạy: " + maxCount);
    }
}