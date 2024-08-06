package Exercise.Ex_Chapter3.Ex31;/*
    Bài 10*. Viết chương trình giải phương trình bậc 2 có dạng ax2+ bx + c = 0. Trong đó a, b, c là các
    tham số và x là nghiệm của phương trình. Hãy kiểm tra các điều kiện của của các tham số để tìm các
    trường hợp tương ứng, mỗi trường hợp sẽ có các nghiệm x khác nhau. In kết quả các nghiệm ra màn hình.
    - Input: gồm 1 dòng chứa lần lượt các tham số a, b và c.
    - Output: hiển thị trên 1 dòng kết quả của nghiệm x. Tương ứng với các trường hợp
        + Nếu là nghiệm duy nhất hoặc nghiệm kép in ra có dạng “x = res”, trong đó res là kết quả của nghiệm x.
        + Nếu là nghiệm phân biệt in ra có dạng “x1 = res1, x2 = res2”, trong đó res1, res2 là kết quả của nghiệm x1, x2.
        + Nếu là vô nghiệm in ra “VÔ NGHIỆM”.
        + Nếu là vô số nghiệm in ra “VÔ SỐ NGHIỆM”.
 */


import java.util.Scanner;

public class Ex10_31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var a = scanner.nextDouble();
        var b = scanner.nextDouble();
        var c = scanner.nextDouble();

        if (a == 0) {
            if (b == 0 && c == 0) {
                System.out.println("VÔ SỐ NGHIỆM");
            } else if (b == 0 && c != 0) {
                System.out.println("VÔ NGHIỆM");
            } else if (b != 0 && c == 0) {
                System.out.println("x = 0");
            } else if (b != 0 && c != 0) {
                System.out.println("x = " + (-c / b));
            }
        } else if (a != 0) {
            var delta = Math.pow(b, 2) - 4 * a * c;
            if (delta < 0) {
                System.out.println("VÔ NGHIỆM");
            } else if (delta == 0) {
                System.out.println("x = " + (-b / (2 * a)));
            } else if (delta > 0) {
                System.out.println("x1 = " + ((-b + Math.sqrt(delta)) / 2 * a));
                System.out.println("x2 = " + ((-b - Math.sqrt(delta)) / 2 * a));
            }
        }
    }
}
