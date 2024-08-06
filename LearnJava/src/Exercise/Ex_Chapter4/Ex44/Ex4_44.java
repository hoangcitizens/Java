package Exercise.Ex_Chapter4.Ex44;

/*
    Bài 4. Nhập vào từ bàn phím một chuỗi kí tự là tên thứ của một tuần. Tên thứ nhập vào phải ở
    dạng tiếng việt. Hãy sử dụng switch expression để chuyển đổi tên thứ sang tên tiếng Anh tương
    ứng và in ra màn hình.
    Lưu ý:
    1. Chỉ nhập đúng tên thứ của tuần ở dạng tiếng việt, ví dụ: thứ hai hoặc Thứ Hai hoặc THỨ
    HAI, không có ngoại lệ nào khác.
    2. Tên tiếng anh tương ứng sau khi chuyển đổi chỉ bao gồm trong tập hợp sau {Monday,
    Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday}.
    3. Khi nhập các giá trị khác định dạng chuẩn ở mục 1 thì chương trình sẽ in ra INVALID DAY
    OF WEEK và lặp lại liên tục đến khi người dùng nhập 0 để thoát chương trình.
        - Input: gồm 1 dòng chứa chuỗi kí tự là tên thứ của một tuần.
        - Output: hiển thị trên 1 dòng tên tiếng anh tương ứng với thứ đó. Nếu tên thứ không hợp
                  lệ thì in ra INVALID DAY OF WEEK.
 */

import java.util.Scanner;

public class Ex4_44 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);

        while (true) {
            var dayOfWeek = input.nextLine();
            var result = ""; // biến lưu kết quả chuyển đổi
            // tiến hành kiểm tra và đánh giá
            dayOfWeek = dayOfWeek.toLowerCase(); // viết thường hết cho dễ so sánh
            dayOfWeek = dayOfWeek.trim(); // loại bỏ hết các dấu cách thừa
            // vào switch expression
            result = switch (dayOfWeek) {
                case "0" -> "";
                case "thứ hai" -> "Monday";
                case "thứ ba" -> "Tuesday";
                case "thứ tư" -> "Wednesday";
                case "thứ năm" -> "Thursday";
                case "thứ sáu" -> "Friday";
                case "thứ bảy" -> "Saturday";
                case "chủ nhật" -> "Sunday";
                default -> "Invalid day of week".toUpperCase();
            };
            if (result.isEmpty()) {
                break;
            } else {
                System.out.println(result);
            }
        }
    }
}
