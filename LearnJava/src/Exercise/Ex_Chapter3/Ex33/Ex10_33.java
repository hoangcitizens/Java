package Exercise.Ex_Chapter3.Ex33;/*
    Bài 10. Nhập vào từ bàn phím một số thực n, trong đó n là điểm của một sinh viên. Theo bảng
            quy đổi dưới đây hãy sử dụng kiến thức về toán tử ba ngôi để cho biết điểm chữ tương ứng của
            sinh viên đó. Lưu ý điểm nhập từ bàn phím phải hợp lệ (lớn hơn hoặc bằng 0 và nhỏ hơn hoặc
            bằng 10).
        Bảng quy đổi:
        ĐIỂM ĐIỂM                     CHỮ
        lớn hơn 9.0 (N >= 9.0)         A
        7.0 đến dưới 9 (7.0 ≤ N < 9)   B
        5.0 đến dưới 7 (5.0 ≤ N < 7)   C
        4.0 đến dưới 5 (4.0 ≤ N < 5)   D
        nhỏ hơn 4.0 (N < 4.0)          F
    - Input: gồm 1 dòng chứa số thực n là điểm của một sinh viên.
    - Output: Hiển thị trên 1 dòng điểm chữ của sinh viên đó theo bảng quy đổi. Nếu điểm không hợp lệ in
      ra “KHONG HOP LE”
 */


import java.util.Scanner;

public class Ex10_33 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var gpa = scanner.nextFloat();
        var result = (gpa > 10f || gpa < 0f) ? "INVALID"
                : (gpa >= 9.0f) ? "A"
                : (gpa >= 7f) ? "B"
                : (gpa >= 5f) ? "C"
                : (gpa >= 4f) ? "D" : "F";
        System.out.println(result);
    }
}
