package Exercise.Ex_Chapter3.Ex31;/*
    Bài 7. Nhập vào một dòng họ-đệm-tên từ bàn phím. Giả định họ-đệm-tên chỉ phân tách nhau bằng
    1 khoảng trắng và viết dưới dạng không dấu. Lưu ý không có 1 hoặc nhiều dấu cách ở đầu và cuối chuỗi.
    Hãy kiểm tra xem chữ cái đầu tiên của tên có viết hoa hay không. In kết quả ra màn hình.
    Gợi ý: sử dụng mẫu regex ^[A-Z].* để kiểm tra.
        - Input: gồm 1 dòng chứa chuỗi họ-đệm-tên cần kiểm tra.
        - Output: hiển thị trên 1 dòng kết quả tương ứng YES hoặc NO
 */


import java.util.Scanner;

public class Ex7_31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var fullName = scanner.nextLine().trim();
        // check and print result
        var lastSpaceIndex = fullName.lastIndexOf(" ");
        var firstName = fullName.substring(lastSpaceIndex + 1);
        if (firstName.matches("^[A-Z].*")) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
