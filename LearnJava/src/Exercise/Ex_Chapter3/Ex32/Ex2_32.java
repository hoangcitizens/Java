package Exercise.Ex_Chapter3.Ex32;/*
    Bài 2: Nhập vào một số nguyên từ bàn phím, số nguyên này là tháng của năm trong đoạn từ [1-12].
           Hãy viết chương trình sử dụng biểu thức switch để phân loại và hiển thị các mùa trong năm và in ra màn hình
           kết quả tương ứng.
    Cụ thể như sau:
            • Nhập tháng 1-3: MÙA XUÂN.
            • Nhập tháng 4-6: MÙA HẠ.
            • Nhập tháng 7-9: MÙA THU.
            • Nhập tháng 10-12: MÙA ĐÔNG.
            • Nhập số khác: KHÔNG HỢP LỆ.
        - Input: gồm 1 dòng chứa số nguyên n là tháng trong năm.
        - Output: hiển thị trên 1 dòng mùa tương ứng với tháng đã nhập.
 */


import java.util.Scanner;

public class Ex2_32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập 1 số từ [1,12] : ");
        var n = scanner.nextInt();
        var result = switch (n) {
            case 1, 2, 3 -> "MÙA XUÂN";
            case 4, 5, 6 -> "MÙA HẠ";
            case 7, 8, 9 -> "MÙA THU";
            case 10, 11, 12 -> "MÙA ĐÔNG";
            default -> "KHÔNG HỢP LÊ";
        };
        System.out.println(result);
    }
}
