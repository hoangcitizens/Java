package Exercise.Ex_Chapter3.Ex36;/*
    Bài 3. Nhập vào từ bàn phím một số nguyên dương n. Hãy tính tổng các chữ số của n sử dụng vòng lặp while.
    In kết quả tương ứng ra màn hình khi thực hiện xong.
        - Input: gồm 1 dòng chứa số nguyên n > 0.
        - Output: hiển thị trên 1 dòng giá trị tổng các chữ số của n
 */

import java.util.Scanner;

public class Ex3_36 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập n = ");
        int n = scanner.nextInt();
        var sum = 0;
        while (n > 0) {
            sum += n % 10; // lấy phần đơn vị của n
            n /= 10; // loại bỏ phần đơn vị đã lấy của n
        }
        // hiện kết quả:
        System.out.println(sum);
    }
}
