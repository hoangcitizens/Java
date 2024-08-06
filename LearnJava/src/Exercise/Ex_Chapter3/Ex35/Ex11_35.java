package Exercise.Ex_Chapter3.Ex35;/*
    Bài 11*. Nhập vào hai số nguyên dương a và b từ bàn phím. Hãy kiểm tra xem cặp số a và b có phải
             cặp số thân thiết hay không và in kết quả ra màn hình.
    Chú thích: cặp số a và b là cặp số thân thiết khi tổng các ước của a cộng lại bằng b và tổng các
    ước của b cộng lại bằng a.
    Ví dụ : a = 220 , b = 284
    mà 220 = 1 + 2 + 4 + 5 + 10 + 11 + 20 + 45 + 55 + 110 = 284 và 284 = 1 + 2 + 4 + 71 + 142 = 220.
        − Input: gồm 1 dòng chứa hai số nguyên dương a và b.
        − Output: hiển thị trên 1 dòng kết quả tương ứng YES nếu là cặp số thân thiết hoặc NO nếu ngược lại
 */

import java.util.Scanner;

public class Ex11_35 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var a = scanner.nextInt();
        var b = scanner.nextInt();
        var result = checkFriendlyNumber(a, b) && checkFriendlyNumber(b, a);
        System.out.println(result ? "YES" : "NO");
    }
    private static boolean checkFriendlyNumber(int m, int n) {
        if (m < 2) {
            return false;
        }
        int sum = sumDivisor(m);
        return sum == n;
    }
    // Phương thức tính tổng các ước của một số
    private static int sumDivisor(int m) {
        int sum = 1;
        int bound = (int) Math.sqrt(m);
        for (int i = 2; i <= bound; i++) {
            if (m % i == 0) {
                if (m / i == i) {
                    sum += i;
                } else {
                    sum += i;
                    sum += m / i;
                }
            }
        }
        return sum;
    }
}
