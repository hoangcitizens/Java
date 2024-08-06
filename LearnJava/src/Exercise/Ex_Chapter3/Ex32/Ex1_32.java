package Exercise.Ex_Chapter3.Ex32;/*
    Bài 1. Nhập vào một số nguyên từ bàn phím, số nguyên này nằm trong đoạn từ [1-12]. Giả định
    rằng các con giáp được đánh số từ 1-12 lần lượt là Tí, Sửu, Dần, Mão, Thìn, Tỵ, Ngọ, Mùi, Thân,
    Dậu, Tuất, Hợi. Hãy viết chương trình sử dụng biểu thức switch để phân loại và hiển thị ra màn
    hình con giáp tương ứng.
        - Input: gồm 1 dòng chứa số nguyên n trong đoạn [1-12].
        - Output: hiển thị trên 1 dòng con giáp tương ứng với tháng đã nhập ở dạng chữ hoa, nếu
        người dùng nhập số khác ngoài đoạn [1-12] thì in ra KHÔNG HỢP LỆ
 */


import java.util.Scanner;

public class Ex1_32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào 1 số từ [1,12] : ");
        var n = scanner.nextInt();
        var result = switch (n)
        {
            case 1 -> "Tý";
            case 2 -> "Sửu";
            case 3 -> "Dần";
            case 4 -> "Mão";
            case 5 -> "Thìn";
            case 6 -> "Tỵ";
            case 7 -> "Ngọ";
            case 8 -> "Mùi";
            case 9 -> "Thân";
            case 10 -> "Dậu";
            case 11 -> "Tuất";
            case 12 -> "Hợi";
            default -> "Không có con giáp nào";
        };
        System.out.println(result);
    }
}