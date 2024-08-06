package Exercise.Ex_Chapter3.Ex36;/*
    Bài 14. Nhập vào từ bàn phím một chuỗi kí tự là tên thứ của một tuần. Tên thứ nhập vào phải ở
    dạng tiếng việt. Hãy sử dụng vòng lặp do-while kết hợp với biểu thức switch để chuyển đổi tên
    thứ sang tên tiếng Anh tương ứng.
    Lưu ý:
        1. Chỉ nhập đúng tên thứ của tuần ở dạng tiếng việt, ví dụ: thứ hai hoặc Thứ Hai hoặc THỨ
        HAI, không có ngoại lệ nào khác.
        2. Tên tiếng anh tương ứng sau khi chuyển đổi chỉ bao gồm trong tập hợp sau {Monday,
        Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday}.
        3. Khi nhập các giá trị khác định dạng chuẩn ở mục 1 thì chương trình sẽ in ra INVALID DAY
        OF WEEK và lặp lại liên tục đến khi người dùng nhập 0 để thoát chương trình.
        - Input: gồm 1 dòng chứa chuỗi kí tự là tên thứ của một tuần.
        - Output: hiển thị trên 1 dòng tên tiếng anh tương ứng với thứ đó. Nếu tên thứ không hợp
        lệ thì in ra INVALID DAY OF WEEK
 */

import java.util.Scanner;

public class Ex14_36 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        while (true) {
            var dayOfWeek = input.nextLine();
            var result = ""; // biến lưu kết quả chuyển đổi
            // tiến hành kiểm tra và đánh giá
            dayOfWeek = dayOfWeek.toLowerCase(); // viết thường hết cho dễ so sánh
            dayOfWeek = dayOfWeek.trim(); // loại bỏ hết các dấu cách thừa
            // vào cấu trúc switch
            switch (dayOfWeek) {
                case "0":
                    break;
                case "thứ hai":
                    result = "Monday";
                    break;
                case "thứ ba":
                    result = "Tuesday";
                    break;
                case "thứ tư":
                    result = "Wednesday";
                    break;
                case "thứ năm":
                    result = "Thursday";
                    break;
                case "thứ sáu":
                    result = "Friday";
                    break;
                case "thứ bảy":
                    result = "Saturday";
                    break;
                case "chủ nhật":
                    result = "Sunday";
                    break;
                default:
                    result = "Invalid day of week".toUpperCase();
                    break;
            }
            if (result.isEmpty()) {
                break;
            } else {
                System.out.println(result);
            }
        }
    }
}
