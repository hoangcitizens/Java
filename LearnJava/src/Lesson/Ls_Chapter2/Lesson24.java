package Lesson.Ls_Chapter2;

public class Lesson24 {
    public static void main(String[] args) {
        // toán tử +, -
//        var a = 100;
//        var b = 250.25;
//        var sum = a + b;
//        var diff = a - b;
//        System.out.println(sum);
//        System.out.println(a + " + " + b + " = " + sum);
//        System.out.println(a + " - " + b + " = " + diff);
//        var suminfinity = Float.NEGATIVE_INFINITY + Float.POSITIVE_INFINITY;
//        System.out.println(suminfinity);
//        System.out.println(Float.NEGATIVE_INFINITY + Float.NEGATIVE_INFINITY);

        // toán tử *
//        var a = 100; // int
//        var b = 250.25; // double
//        var c = 999L; // long
//        var result = a * b * c;
//        System.out.println(a + " * " + b + " * " + c + " = " + result);
//        System.out.println(Double.NaN * Float.NaN);
//        System.out.println(b * Float.NaN);
//        System.out.println(Double.NaN * Float.NaN);
//        System.out.println(Double.POSITIVE_INFINITY * Float.NaN);
//        System.out.println(Double.POSITIVE_INFINITY * Double.NEGATIVE_INFINITY);
//        System.out.println(Double.POSITIVE_INFINITY * Double.POSITIVE_INFINITY);
//        System.out.println(Double.NEGATIVE_INFINITY * Double.NEGATIVE_INFINITY);

        // toán tử /
//        var a = 100; // int
//        var b = -250.25; // double
//        var c = -999L; // long
//        var result = a / b;
//        System.out.println(result);
//        System.out.println("1 / 2 = " + (1 * 1.0 / 2));
//        System.out.println(-1f/0); // -infinity
//        System.out.println(1f/0);  // +infinity
//        System.out.println(5 / 0); // error

        // phép chia lấy dư %
//        var a = 100; // int
//        var b = -250.25; // double
//        var c = -999L; // long
//        System.out.println(-20.333 % -3);
//        System.out.println(a % b);
//        System.out.println(a % c);
//        System.out.println(b % 0);
//        System.out.println(a % 0);

        // toán tử ++, --
//        var a = 100; // int
//        var afterA = ++a; // a = a + 1; afterA = a;
//        var b = 200;
//        var afterB = b++; // afterB = b; b = b + 1;
//        System.out.println("Sau khi thực hiện phép toán ++, --");
//        System.out.println("a = " + a);
//        System.out.println("afterA = " + afterA);
//        System.out.println("b = " + b);
//        System.out.println("afterB = " + afterB);

        // Các toán tử gán: =, +=, -=, *=, /=, %=
//        int a = 5;
//        int b = 6;
//        System.out.println("a = " + a);
//        a = a + 5; // tương đương a += 5
//        System.out.println("a = " + a);
//        a = a - 5; // tương đương a -= 5
//        System.out.println("a = " + a);
//        a = a * 5; // tương đương a *= 5
//        System.out.println("a = " + a);
//        a = a / 5; // tương đương a /= 5
//        System.out.println("a = " + a);
//        a = a % 5; // tương đương a %= 5
//        System.out.println("a = " + a);

        // Các toán tử so sánh: >, >=, <, <=, ==, !=
        int a = 5;
        int b = 6;
        System.out.println("a > b ? " + (a > b));
        System.out.println("a >= b ? " + (a >= b));
        System.out.println("a < b ? " + (a < b));
        System.out.println("a <= b ? " + (a <= b));
        System.out.println("a == b ? " + (a == b));
        System.out.println("a != b ? " + (a != b));
        // số thực
        System.out.println(Float.NaN == Float.NaN);
        System.out.println(Float.POSITIVE_INFINITY == Float.POSITIVE_INFINITY);
        System.out.println(Float.POSITIVE_INFINITY != Float.POSITIVE_INFINITY);
        System.out.println(Float.POSITIVE_INFINITY != Float.NEGATIVE_INFINITY);
        System.out.println(Float.POSITIVE_INFINITY == Float.NEGATIVE_INFINITY);
        System.out.println(-0 == +0);
        System.out.println(-0 != +0);

        // Các toán tử logic: &&, ||, !
//        int a = 5;
//        int b = 6;
//        // gpa >= 3.6 && rank(gpa) <= 100 && điểm rèn luyện >= 90đ
//        // (gpa >= 3.6 && điểm rèn luyện >= 90đ) || rank(gpa) <= 100 || đạt giải xuất sắc cuộc thi ACM
//        // !true  = false; !false = true
//        System.out.println(!(a == b));
//        System.out.println(!(a < b));
    }
}
