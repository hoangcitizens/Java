package Exercise.Ex_Chapter2.Ex28;/*
    Bài 10*. Cho ba cạnh tam giác là a > 0, b > 0, c > 0. Hãy tính diện tích tam giác theo công thức Heron dưới đây
             và in kết quả diện tích ra màn hình.  S = √p(p − a)(p − b)(p − c) , với p = (1/2)*(a + b + c)
    Lưu ý: tồn tại tam giác có độ dài 3 cạnh là a, b, c nếu đồng thời a + b > c và a + c > b và b + c > a.
    - Input: cho trên 3 dòng
        + Dòng thứ nhất là kích thước cạnh a.
        + Dòng thứ hai là kích thước cạnh b.
        + Dòng thứ ba là kích thước cạnh c.
    - Output: hiển thị trên 1 dòng giá trị diện tích của tam giác với kích thước đã nhập và làm
    tròn kết quả đến số nguyên gần nhất.
 */


import java.util.Scanner;

public class Ex10_28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập cạnh a = ");
        int a = scanner.nextInt();
        System.out.print("Nhập cạnh b = ");
        int b = scanner.nextInt();
        System.out.print("Nhập cạnh c = ");
        int c = scanner.nextInt();
        if (Math.abs(b - c) < a && a < b + c) {
            System.out.println(STR."3 cạnh a = \{a} b = \{b} c = \{c} tạo thành tam giác !");
            float p = (float) (a + b + c) / 2;
            float S = (float) Math.sqrt(p * (p - a) * (p - b) * (p - c));
            System.out.println(STR."Chu vi hình tam giác là: \{a + b + c}");
            System.out.println(STR."Tính diện tích hình tam giác là: \{Math.round(S)}");
        } else
            System.out.println(STR."3 cạnh a = \{a} b = \{b} c = \{c} không tạo thành tam giác !");
    }
}
