package Exercise.Ex_Chapter3.Ex36;/*
    Bài 12. Nhập vào một số nguyên từ bàn phím, số nguyên này nằm trong đoạn từ [0-12]. Giả định rằng các
    con giáp được đánh số từ 1-12 lần lượt là Tí, Sửu, Dần, Mão, Thìn, Tỵ, Ngọ, Mùi, Thân, Dậu, Tuất, Hợi.
    Hãy viết chương trình sử dụng biểu thức switch kết hợp với do-while để phân loại
    và hiển thị ra màn hình con giáp tương ứng.
    Lưu ý: khi nhập các giá trị khác ngoài đoạn [0-12] thì chương trình sẽ lặp lại liên tục đến khi
    người dùng nhập 0 để thoát chương trình.
        - Input: gồm 1 dòng chứa số nguyên n trong đoạn [0-12].
        - Output: hiển thị trên 1 dòng con giáp tương ứng với tháng đã nhập ở dạng chữ hoa, nếu
        người dùng nhập số khác ngoài đoạn [0-12] thì in ra KHÔNG HỢP LỆ
 */


import java.util.Scanner;

public class Ex12_36 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        var number = 0;
        do {
            number = input.nextInt();
            var zodiac = ""; // biến lưu tên con giáp
            // tiến hành đánh giá với switch
            switch (number) {
                case 0:
                    break;
                case 1:
                    zodiac = "Tý";
                    break;
                case 2:
                    zodiac = "Sửu";
                    break;
                case 3:
                    zodiac = "Dần";
                    break;
                case 4:
                    zodiac = "Mão";
                    break;
                case 5:
                    zodiac = "Thìn";
                    break;
                case 6:
                    zodiac = "Tỵ";
                    break;
                case 7:
                    zodiac = "Ngọ";
                    break;
                case 8:
                    zodiac = "Mùi";
                    break;
                case 9:
                    zodiac = "Thân";
                    break;
                case 10:
                    zodiac = "Dậu";
                    break;
                case 11:
                    zodiac = "Tuất";
                    break;
                case 12:
                    zodiac = "Hợi";
                    break;
                default:
                    System.out.println("KHÔNG HỢP LỆ");
            }
            if (!zodiac.isEmpty()) {
                System.out.println(zodiac);
            }
        } while (number != 0);
    }
}
