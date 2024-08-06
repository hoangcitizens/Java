package Lesson.Ls_Chapter4_Methods.Ls44_Switch;

import java.util.Scanner;

// Bài 4.4: Biểu thức switch
/*
    1. Tổng quan
        - Được giới thiệu ở phiên bản Java 12 và được định nghĩa lại ở phiên bản Java 13.
        - Đây là một tính năng đang ở chế độ preview và có thể sẽ được tích hợp ở các phiên bản Java mới về sau.
        - Cho phép cấu trúc switch được sử dụng như một biểu thức. Tức là có thể đem cả biểu thức đi đánh giá như
          một giá trị trị cụ thể.
        - Có thể coi biểu thức switch là rút gọn của cấu trúc switch giống như toán tử ba ngôi là rút gọn của if-else vậy.
        - Ta có thể xác định cụ thể giá trị của từng nhãn qua việc sử dụng từ khóa yield hoặc biểu thức mũi tên.
    2. Các đặc trưng
        - Có thể dùng nhiều nhãn trong một case.
        - Biểu thức switch được đánh giá như một giá trị. Sau đó nó có thể được gán hoặc truyền vào các biểu thức lớn hơn.
        - Nếu kiểu mục tiêu đã được xác định rõ ràng, tất cả các nhánh(case) đều phải có giá trị trả về ở kiểu mục tiêu đó.
        - Nếu kiểu mục tiêu chưa xác định thì kiểu cha tương thích với hầu hết các kiểu trong biểu thức switch sẽ được sử dụng.
        - Sử dụng yield để trả về một giá trị từ các case của biểu thức switch.
        - Không còn cần sử dụng break.
        - Có thể sử dụng mũi tên thay cho yield: tránh trôi thực thi lệnh xuống các nhãn khác, cho phép các câu lệnh biểu diễn trên 1 dòng hoặc chứa khối bao bởi cặp ngoặc {}.
        - Trường hợp biến là kiểu enum thì không bắt buộc có default.
        - Nếu biến đầu vào của biểu thức switch có kiểu khác enum thì phải có nhãn default.
 */
public class Lesson44_Switch {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.print("Nhập số thứ tự ngày của tuần(1-7): ");
        var index = input.nextInt();
        System.out.println(dayOfweek2(index));
    }
    public static String dayOfweek2(int index) {
        return switch (index) {
            case 1 -> "Thứ Hai";
            case 2 -> "Thứ Ba";
            case 3 -> "Thứ Tư";
            case 4 -> "Thứ Năm";
            case 5 -> "Thứ Sáu";
            case 6 -> "Thứ Bảy";
            case 7 -> "Chủ Nhật";
            default -> "Ngày không hợp lệ";
        };
    }
}
