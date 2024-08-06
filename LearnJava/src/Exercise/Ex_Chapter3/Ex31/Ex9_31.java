package Exercise.Ex_Chapter3.Ex31;/*
    Bài 9. Nhập từ bàn phím thông số hình thang gồm đáy lớn, đáy nhỏ, chiều cao. Sau đó kiểm tra các
    thông số có hợp lệ hay không(các thông số > 0). Tính toán và in ra màn hình kết quả của diện tích
    hình thang nếu hợp lệ. Ngược lại in ra INVALID INPUT.
        - Input: gồm 1 dòng chứa lần lượt độ dài đáy lớn, đáy nhỏ và chiều cao, phân tách nhau bằng 1 dấu cách.
        - Output: hiển thị trên 1 dòng diện tích hình thang tương ứng nếu hợp lệ, nếu không in ra INVALID INPUT.
 */


import java.util.Scanner;

public class Ex9_31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a, b, h;
        a = scanner.nextDouble();
        b = scanner.nextDouble();
        h = scanner.nextDouble();
        // check and print result
        if (a > 0 && b > 0 && h > 0) {
            double area = (a + b) * h / 2;
            System.out.println(area);
        } else {
            System.out.println("INVALID INPUT");
        }
    }
}
