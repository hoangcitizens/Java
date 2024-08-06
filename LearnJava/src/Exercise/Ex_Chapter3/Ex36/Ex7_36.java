package Exercise.Ex_Chapter3.Ex36;/*
    Bài 7. Viết chương trình giải và biện luận phương trình bậc hai ax^2 + bx + c = 0. Trong đó a, b, c
    là các hệ số và x là giá trị của nghiệm. Hãy hiển thị kết quả của nghiệm lên màn hình.
    Lưu ý: Yêu cầu khi nhập hệ số a bắt buộc phải khác 0, nếu cố tình nhập a = 0 thì chương trình sẽ
    yêu cầu nhập lại đến khi a ≠ 0 mới dừng nhập.
        - Input: gồm 1 dòng chứa 3 tham số a, b và c, phân tách nhau bằng 1 dấu cách.
        - Output: hiển thị trên 1 dòng các nghiệm theo dạng
            o Nếu phương trình vô nghiệm: “VÔ NGHIỆM”.
            o Nếu phương trình có nghiệp kép: “x = res”, trong đó res là giá trị của nghiệm kép.
            o Nếu phương trình có nghiệm phân biệt: “x1 = res1, x2 = res2”, trong đó res1, res2
            lần lượt là giá trị của nghiệm x1, x2.
 */


import java.util.Scanner;

public class Ex7_36 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        double a = 0;
        double b, c;

        while (a == 0) {
            a = input.nextDouble();
        }

        b = input.nextDouble();
        c = input.nextDouble();

        var delta = b * b - 4 * a * c;  // tính delta

        // giải biện luận pt bậc hai:
        if (delta < 0) {
            System.out.println("VÔ NGHIỆM");
        } else if (delta == 0) {
            System.out.println("x = " + (-b / (2 * a)));
        } else {
            var x1 = (-b + Math.sqrt(delta)) / (2 * a);
            var x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        }
    }
}
