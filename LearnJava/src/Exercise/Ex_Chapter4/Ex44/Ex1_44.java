package Exercise.Ex_Chapter4.Ex44;

import java.util.Scanner;

/*
    Bài 1. Nhập vào một số nguyên từ bàn phím, số nguyên này là tháng của năm trong đoạn từ [0-12].
    Hãy viết chương trình sử dụng switch expression để phân loại và hiển thị các mùa trong năm
    và in ra màn hình kết quả tương ứng.
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
        - Output: hiển thị trên 1 dòng mùa tương ứng với tháng đã nhập.
 */
public class Ex1_44 {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        System.out.print("Nhập vào số nguyên từ bàn phím [0-12] : ");
        var number = sc.nextInt();
        System.out.println(mua(number));
    }
    public static String mua(int number) {
        return switch (number) {
            case 1, 2, 3 -> "MÙA XUÂN";
            case 4, 5, 6 -> "MÙA HẠ";
            case 7, 8, 9 -> "MÙA THU";
            case 10, 11, 12 -> "MÙA ĐÔNG";
            case 0 -> "Thoát chương trình";
            default -> "KHÔNG HỢP LỆ";
        };
    }
}
