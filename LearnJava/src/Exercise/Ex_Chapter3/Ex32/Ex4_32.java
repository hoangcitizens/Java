package Exercise.Ex_Chapter3.Ex32;/*
    Bài 4. Nhập vào từ bàn phím một chuỗi kí tự là tên thứ của một tuần. Tên thứ nhập vào phải ở dạng tiếng việt.
           Hãy chuyển đổi tên thứ đó sang tên tiếng Anh tương ứng.
    Lưu ý:
    • Chỉ nhập đúng tên thứ của tuần ở dạng tiếng việt, ví dụ: thứ hai hoặc Thứ Hai hoặc THỨ HAI, không có ngoại lệ nào khác.
    • Tên tiếng anh tương ứng sau khi chuyển đổi chỉ bao gồm trong tập hợp sau {Monday, Tuesday, Wednesday, Thursday,
    Friday, Saturday, Sunday}.
        - Input: gồm 1 dòng chứa chuỗi kí tự là tên thứ của một tuần.
        - Output: hiển thị trên 1 dòng tên tiếng anh tương ứng với thứ đó. Nếu tên thứ không hợp
                  lệ thì in ra INVALID DAY OF WEEK.
 */


import java.util.Scanner;

public class Ex4_32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào tên thứ Tiếng Việt: ");
        var str = scanner.nextLine().trim().toLowerCase();
        var result = switch (str){
            case "thứ hai" -> "Monday";
            case "thứ ta" -> "Tuesday";
            case "thứ tư" -> "Wednesday";
            case "thứ năm" -> "Thursday";
            case "thứ sáu" -> "Friday";
            case "thứ bảy" -> "Saturday";
            case "chủ nhật" -> "Sunday";
            default -> "INVALID DAY OF WEEK";
        };
        System.out.println(STR."Tên thứ tiếng anh: \{result}");
    }
}
