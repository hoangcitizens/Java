package Exercise.Ex_Chapter3.Ex38;/*
    Bài 5. Nhập vào hai số tự nhiên k và m từ bàn phím, trong đó k và m là các số tự nhiên dương giá
    trị không quá 1000. Hãy viết chương trình tìm k số đầu tiên có 5 chữ số mà tổng các chữ số chia
    hết cho m. In kết quả ra màn hình.
        - Input: gồm 1 dòng chứa giá trị của k và m, phân tách nhau bằng 1 dấu cách.
        - Output: hiển thị trên 1 dòng các kết quả được liệt kê, phân tách nhau bằng 1 dấu phẩy.
 */

import java.util.Scanner;

public class Ex5_38 {
    public static void main(String[] args) {
        // tìm ước số nguyên tố nhỏ nhất của n
        var input = new Scanner(System.in);
        var k = input.nextInt();
        var m = input.nextInt();

        // khởi tạo biến đếm
        var count = 0;
        StringBuilder result = new StringBuilder();

        for (int i = 10000; i <= 99999; i++) {
            int j = i;
            int sumDigits = 0; // tổng các chữ số
            while (j > 0) { // tính tổng các chữ số của j
                sumDigits += j % 10; // lấy phần đơn vị
                j /= 10; // loại bỏ phần đã lấy
            }
            if (sumDigits % m == 0) { // nếu tổng chữ số chia hết cho m
                result.append(i);
                result.append(", ");
                count++; // tăng biến đếm
                if (count >= k) {
                    break; // tìm đc k số thỏa thì kết thúc việc tìm
                }
            }
        }

        // Xóa dấu phẩy và khoảng trắng zở cuối nếu có
        if (result.length() > 0) {
            result.setLength(result.length() - 2);
        }

        // In kết quả
        System.out.println(result.toString());
    }
}
