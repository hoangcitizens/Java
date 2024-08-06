package Exercise.Ex_Chapter4.Ex44;

import java.util.Scanner;

/*
    Bài 2. Nhập vào một số nguyên từ bàn phím, số nguyên này nằm trong đoạn từ [0-12]. Giả định
    rằng các con giáp được đánh số từ 1-12 lần lượt là Tí, Sửu, Dần, Mão, Thìn, Tỵ, Ngọ, Mùi, Thân,
    Dậu, Tuất, Hợi. Hãy viết chương trình sử dụng switch expression để phân loại và hiển thị ra màn
    hình con giáp tương ứng.
    Lưu ý: khi nhập các giá trị khác ngoài đoạn [0-12] thì chương trình sẽ lặp lại liên tục đến khi
    người dùng nhập 0 để thoát chương trình.
        - Input: gồm 1 dòng chứa số nguyên n trong đoạn [0-12].
        - Output: hiển thị trên 1 dòng con giáp tương ứng với tháng đã nhập ở dạng chữ hoa, nếu
        người dùng nhập số khác ngoài đoạn [0-12] thì in ra KHÔNG HỢP LỆ
 */
public class Ex2_44 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        var number = 0;
        do {
            number = input.nextInt();
            String zodiac = switch (number) {
                case 0 -> "";
                case 1 -> zodiac = "Tý";
                case 2 -> zodiac = "Sửu";
                case 3 -> zodiac = "Dần";
                case 4 -> zodiac = "Mão";
                case 5 -> zodiac = "Thìn";
                case 6 -> zodiac = "Tỵ";
                case 7 -> zodiac = "Ngọ";
                case 8 -> zodiac = "Mùi";
                case 9 -> zodiac = "Thân";
                case 10 -> zodiac = "Dậu";
                case 11 -> zodiac = "Tuất";
                case 12 -> zodiac = "Hợi";
                default -> "KHÔNG HỢP LỆ";
            };

            if (!zodiac.isEmpty()) {
                System.out.println(zodiac);
            } else {
                break;
            }
        } while (true);
    }
}
