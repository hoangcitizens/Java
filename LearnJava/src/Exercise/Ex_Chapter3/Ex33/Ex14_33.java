package Exercise.Ex_Chapter3.Ex33;/*
    Bài 14. Nhập vào từ bàn phím một số nguyên n trong đoạn [1-12], n tương ứng với 1 tháng trong
    năm. Hãy sử dụng kiến thức về toán tử ba ngôi để in ra màn hình tên tháng tương ứng đó ở dạng tiếng Anh.
        - Input: gồm 1 dòng chứa số nguyên n > 0 là tháng của năm, n nằm trong đoạn [1-12].
        - Output: Hiển thị trên 1 dòng giá trị tiếng anh tương ứng với tháng vừa nhập. Nếu input nằm ngoài
          đoạn [1-12] in ra màn hình “INVALID".
 */

import java.util.Scanner;

public class Ex14_33 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var month = scanner.nextInt();
        var result = (month <= 0 || month >= 13) ? "INVALID"
                : (month == 1) ? "January"
                : (month == 2) ? "February"
                : (month == 3) ? "March"
                : (month == 4) ? "April"
                : (month == 5) ? "May"
                : (month == 6) ? "June"
                : (month == 7) ? "July"
                : (month == 8) ? "August"
                : (month == 9) ? "September"
                : (month == 10) ? "October"
                : (month == 11) ? "November"
                : "December";
        System.out.println(result);
    }
}
