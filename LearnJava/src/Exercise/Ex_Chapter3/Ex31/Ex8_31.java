package Exercise.Ex_Chapter3.Ex31;/*
    Bài 8. Nhập vào một chuỗi kí tự từ bàn phím. Lưu ý không có một hoặc nhiều dấu cách ở đầu và cuối chuỗi.
           Hãy kiểm tra xem kí tự đầu chuỗi và cuối chuỗi có trùng nhau không. In kết quả ra màn hình.
                - Input: gồm 1 dòng chứa chuỗi kí tự cần kiểm tra.
                - Output: hiển thị trên 1 dòng kết quả tương ứng YES hoặc NO.
 */


import java.util.Scanner;

public class Ex8_31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var str = scanner.nextLine();

        // check and print result
        if (str.charAt(0) == str.charAt(str.length() - 1)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
