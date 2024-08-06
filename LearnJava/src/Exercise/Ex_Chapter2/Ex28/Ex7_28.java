package Exercise.Ex_Chapter2.Ex28;/*
    Bài 7. Nhập vào từ bàn phím một số nguyên dương n. Hãy sinh 1 số nguyên ngẫu nhiên trong đoạn [0, n) và
           in kết quả ra màn hình.
        - Input: gồm một dòng chứa số nguyên n.
        - Output: hiển thị trên một dòng 1 số nguyên ngẫu nhiên trong đoạn [0, n).
 */
/*
    Ý tưởng của bài rất đơn giản: Sinh số ngẫu nhiên, nhân kết quả với 10^(số lượng chữ số của n)
    để được giá trị có n chữ số. Sau đó ép kiểu sang kiểu nguyên. Chia dư của giá trị vừa có cho n được kết quả.
 */

import java.util.Scanner;

public class Ex7_28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập n = ");
        var n = scanner.nextInt();
        var randNumber = Math.random() * Math.pow(10, countDigitsOfN(n)); // sinh số ngẫu nhiên
        var tmp = (int) randNumber; // ép kiểu sang int
        var result = tmp % n; // lấy dư để đảm bảo kết quả trong [0, n)
        // hiện kết quả:
        System.out.print(STR."Số ngẫu nhiên trong đoạn từ [0,\{n}) là: \{result}");
    }

    // Phương thức này sử dụng để đếm số chữ số của n,
    private static int countDigitsOfN(int n) {
        int count = 1;
        while (n > 0) {
            count++;
            n /= 10;
        }
        return count;
    }
}
