package Exercise.Ex_Chapter2.Ex28;/*
    Bài 9. Nhập từ bàn phím các dữ kiện cho tam giác vuông theo hình dưới đây. Tam giác có cạnh
           huyền c = 100 và 1 góc nhọn α = 35°. Tìm hai cạnh góc vuông a, b và tính chu vi, diện tích tam
           giác này. Sau đó in ra màn hình kết quả của chu vi và diện tích.
    - Input: cho trên 2 dòng
        + Dòng thứ nhất là kích thước cạnh huyền c = 100.
        + Dòng thứ hai là kích thước góc α = 35 độ.
    - Output: hiển thị trên 2 dòng
        + Dòng đầu là giá trị của chu vi tam giác được làm tròn đến số nguyên gần nhất.
        + Dòng thứ hai là giá trị diện tích tam giác được làm tròn đến số nguyên gần nhất.
 */


import java.util.Scanner;

public class Ex9_28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập độ dài cạnh huyền của tam giác c = ");
        var c = scanner.nextFloat();
        System.out.print("Nhập vào góc của tam giác: ");
        var alpha = scanner.nextFloat();
        var a = c * Math.sin(Math.toDegrees(alpha));
        var b = c * Math.cos(Math.toDegrees(alpha));
        System.out.println(STR."Độ dài cạnh a = \{a}");
        System.out.println(STR."Độ dài cạnh b = \{b}");
        System.out.println(STR."Chu vi tam giác là: \{Math.round(a+b+c)}");
        System.out.println(STR."Diện tích tam giác là: \{Math.round(a*b*0.5)}");
    }
}
