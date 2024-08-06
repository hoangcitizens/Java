package Exercise.Ex_Chapter3.Ex38;/*
    Bài 4. Nhập vào 3 giá trị nguyên a, b, k từ bàn phím, trong đó 0 < a < b và k != 0. Hãy tìm số chính
    phương đầu tiên chia hết cho k trong đoạn [a, b] và in kết quả tương ứng ra màn hình.
        - Input: gồm 1 dòng chứa giá trị của a, b, và k, phân tách nhau bởi 1 dấu cách.
        - Output: hiển thị trên 1 dòng giá trị số chính phương đầu tiên chia hết cho k trong đoạn
        [a, b], nếu không tồn tại thì không in ra màn hình
 */

import java.util.Scanner;

public class Ex4_38 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        // tìm ước số nguyên tố nhỏ nhất của n
        var a = input.nextInt();
        var b = input.nextInt();
        var k = input.nextInt();

        if (k != 0) { // thực hiện tiếp
            var lowBound = (int) Math.ceil(Math.sqrt(a));
            var heightBound = (int) Math.floor(Math.sqrt(b));
            for (int i = lowBound; i <= heightBound; i++) {
                if (i * i % k == 0) {
                    System.out.println((i * i));
                    break;
                }
            }
        }

    }
}
