package Exercise.Ex_Chapter3.Ex31;/*
    Bài 6: Nhập vào chuỗi họ-đệm-tên dạng không dấu từ bàn phím. Giả định rằng họ-đệm-tên hợp lệ
    chỉ gồm một dấu cách giữa các từ và các kí tự chữ cái. Hãy kiểm tra xem chuỗi đó có hợp lệ hay
    không và in ra màn hình kết luận tương ứng.
    Gợi ý: sử dụng regex ^[a-zA-Z\\s]+$ để kiểm tra. Chi tiết về các regex này sẽ học ở phần biểu thức chính quy.
        - Input: gồm 1 dòng chứa chuỗi cần kiểm tra.
        - Output: hiển thị trên 1 dòng kết luận tương ứng HỢP LỆ hoặc KHÔNG HỢP LỆ
 */

import java.util.Scanner;

public class Ex6_31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var name = scanner.nextLine();
        // kiểm tra và in ra kết luận
        if(name.matches("^[a-zA-Z\\s]+$")) {
            System.out.println("HỢP LỆ");
        } else {
            System.out.println("KHÔNG HỢP LỆ");
        }
    }
}
