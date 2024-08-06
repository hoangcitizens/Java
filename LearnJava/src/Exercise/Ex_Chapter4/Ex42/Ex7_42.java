/*
    Bài 7. Nhập vào 1 số nguyên hoặc 1 chuỗi kí tự từ bàn phím. Tự xác định kiểu, tên phương thức
    và tên các tham số phù hợp. Hãy viết các phương thức nạp chồng thực hiện chức năng đếm số kí
    tự của một số hoặc chuỗi đầu vào và in ra màn hình kết quả tương ứng.
    Các kiểu cần hỗ trợ (tương ứng với 3 phương thức):
        1. Phương thức nhận vào một số kiểu int.
        2. Phương thức nhận vào một số kiểu long.
        3. Phương thức nhận vào một String.
    - Input: gồm 1 dòng chứa ba số thực a, b và c, phân tách nhau bởi 1 dấu cách.
    - Output: hiển thị trên 1 dòng giá trị lớn nhất trong 3 số a, b và c.
Ví d
 */

package Exercise.Ex_Chapter4.Ex42;

import java.util.Scanner;

public class Ex7_42 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);

        // 1. Đếm số kí tự của một số nguyên int
        var numInt = input.nextInt();
        System.out.println(length(numInt));

        // 2. Đếm số kí tự của một số kiểu long
        var numLong = input.nextLong();
        System.out.println(length(numLong));

        input.nextLine();  // đọc bỏ kí tự thừa

        // 3. Đếm số kí tự của một chuỗi kiểu String
        var str = input.nextLine();
        System.out.println(length(str));


    }
    // đếm số kí tự cấu thành số n kiểu int
    public static int length(int n) {
        var count = 0;
        while (n > 0) {
            n /= 10;
            count++;
        }
        return count;
    }

    // đếm số kí tự cấu thành số n kiểu long
    public static int length(long n) {
        var count = 0;
        while (n > 0) {
            n /= 10;
            count++;
        }
        return count;
    }

    // đếm số kí tự cấu thành kí tự str kiểu String
    public static int length(String str) {
        return str.length();
    }
}
