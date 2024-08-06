package Exercise.Ex_Chapter3.Ex36;/*
    Bài 11. Nhập vào một số nguyên từ bàn phím, số nguyên này là tháng của năm trong đoạn từ [0-12].
    Hãy viết chương trình sử dụng biểu thức switch kết hợp với do-while để phân loại và hiển thị các
    mùa trong năm và in ra màn hình kết quả tương ứng.
        Cụ thể như sau:
            • Nhập tháng 1-3: MÙA XUÂN.
            • Nhập tháng 4-6: MÙA HẠ.
            • Nhập tháng 7-9: MÙA THU.
            • Nhập tháng 10-12: MÙA ĐÔNG.
            • Nhập 0: thoát chương trình
            • Nhập số khác: KHÔNG HỢP LỆ.
        Lưu ý: khi nhập các giá trị khác ngoài đoạn [0-12] thì chương trình sẽ lặp lại liên tục đến khi
        người dùng nhập 0 để thoát chương trình.
        - Input: gồm 1 dòng chứa số nguyên n là tháng trong năm.
        - Output: hiển thị trên 1 dòng mùa tương ứng với tháng đã nhập
 */

import java.util.Scanner;

public class Ex11_36 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        var number = 0;
        do {
            number = input.nextInt();
            var season = ""; // biến lưu tên mùa của năm
            // tiến hành đánh giá với switch
            switch (number) {
                case 0:
                    break;
                case 1:
                case 2:
                case 3:
                    season = "Mùa Xuân";
                    break;
                case 4:
                case 5:
                case 6:
                    season = "Mùa Hạ";
                    break;
                case 7:
                case 8:
                case 9:
                    season = "Mùa Thu";
                    break;
                case 10:
                case 11:
                case 12:
                    season = "Mùa Đông";
                    break;
                default:
                    System.out.println("KHÔNG HỢP LỆ");
            }
            if (!season.isEmpty()) {
                System.out.println(season.toUpperCase());
            }
        } while (number != 0);
    }
}
