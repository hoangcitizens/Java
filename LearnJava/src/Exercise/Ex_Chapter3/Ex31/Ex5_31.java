package Exercise.Ex_Chapter3.Ex31;/*
    Bài 5. Nhập vào một chuỗi kí tự từ bàn phím. Hãy kiểm tra chuỗi vừa nhập có bắt đầu bởi một hoặc
    nhiều khoảng trắng hay không. In kết luận tương ứng ra màn hình.
    Gợi ý: quy ước một hoặc nhiều khoảng trắng ở đầu chuỗi xác định bởi regex ^\\s+.* hoặc bạn
    cũng có thể sử dụng phương thức startsWith() của đối tượng String.
    - Input: gồm 1 dòng chứa chuỗi kí tự cần kiểm tra.
    - Output: hiển thị trên 1 dòng kết quả tương ứng YES hoặc NO.
 */

import java.util.Scanner;

public class Ex5_31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào 1 chuỗi: ");
        String str = scanner.nextLine();
        // check and print result
        if (str.matches("^\\s+.*")) { // có thể sử dụng str.startsWith(" ")
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
