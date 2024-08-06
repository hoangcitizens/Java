package Exercise.Ex_Chapter3.Ex33;/*
    Bài 7. Nhập vào ba số nguyên a, b và c từ bàn phím, trong đó a, b, c là các thSỐ ÂM số và x là
           nghiệm của phương trình bậc 2 có dạng 𝑎𝑥2 + 𝑏𝑥 + 𝑐 = 0. Hãy sử dụng kiến thức về toán tử ba
           ngôi để kiểm tra các điều kiện của của các thSỐ ÂM số để tìm các trường hợp tương ứng, mỗi
           trường hợp sẽ có các nghiệm x khác nhau. In kết quả các nghiệm ra màn hình.
    - Input: gồm 1 dòng chứa lần lượt các thSỐ ÂM số a, b và c.
    - Output: hiển thị trên 1 dòng kết quả của nghiệm x. Tương ứng với các trường hợp sau
        o Nếu là nghiệm duy nhất hoặc nghiệm kép in ra có dạng “x = m”, trong đó m là kết quả của nghiệm x.
        o Nếu là nghiệm phân biệt in ra có dạng “x1 = m1, x2 = m2”, trong đó m1, m2 là kết quả của nghiệm x1, x2.
        o Nếu là vô nghiệm in ra “VO NGHIEM”.
        o Nếu là vô số nghiệm in ra “VO SO NGHIEM”
 */


import java.util.Scanner;

public class Ex7_33 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var a = scanner.nextInt();
        var b = scanner.nextInt();
        var c = scanner.nextInt();
        if (a == 0) { // giải phương trình bậc nhất
            var result = c == b && b == 0 ? "VO SO NGHIEM"
                    : b == 0 ? "VO NGHIEM"
                    : STR."x = \{-c * 1f / b}";
            System.out.println(result);
        } else {
            var delta = b * b - 4 * a * c;
            var result = delta < 0 ? "VO NGHIEM"
                    : delta == 0 ? STR."x = \{-b / (2 * a)}"
                    : STR."x1 = \{(-b + Math.sqrt(delta)) / (2 * a)}, x2 = \{(-b - Math.sqrt(delta)) / (2 * a)}";
            System.out.println(result);
        }
    }
}
