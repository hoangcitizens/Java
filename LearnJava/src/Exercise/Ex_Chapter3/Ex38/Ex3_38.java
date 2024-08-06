package Exercise.Ex_Chapter3.Ex38;/*
    Bài 3. Nhập vào từ bàn phím một số nguyên dương N. Hãy viết chương trình tìm số nguyên dương
    n nhỏ nhất để thõa mãn bất đẳng thức S phía dưới. In kết quả của n ra màn hình.
            S = 1 + 2 + 3 + ⋯ + n ≥ N
        - Input: gồm 1 dòng chứa số nguyên n > 0.
        - Output: Hiển thị trên 1 dòng giá trị của n để thỏa mãn bất đẳng thức S
 */

import java.util.Scanner;

public class Ex3_38 {
    public static void main(String[] args) {
        int i = 1; // bắt đầu từ 1
        int sum = 0; // tổng bắt đầu từ 0
        var N = new Scanner(System.in).nextInt(); // Nhập vào giá trị của N

        // ý tưởng của lời giải là bắt đầu từ giá trị i = 1
        // lần lượt tăng i lên đồng thời cộng i vào tổng gốc
        // nếu tại một thời điểm nào đó mà i cộng vào tổng cho kq >= 500
        // ta in ra kq, dừng vòng lặp => tìm xong đáp án
        while (true) { // lặp vô hạn
            sum += i;
            if (sum >= N) { // nếu tổng thỏa mãn >= 500
                System.out.println(i); // in ra i
                break; // kết thúc vòng lặp
            }
            i++; // lần lượt tăng i lên
        }
    }
}
