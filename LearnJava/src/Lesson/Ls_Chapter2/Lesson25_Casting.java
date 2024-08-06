package Lesson.Ls_Chapter2;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Lesson25_Casting {
    public static void main(String[] args) {
        // Ép cùng kiểu
//        String x = "Hello";
//        String y = x; // tương đương String y = (String)x;
//        System.out.println(y.toUpperCase());
//        int a = 200;
//        int b = a; // tương đương int b = (int)a;
//        b++;
//        a--;
//        System.out.println("a = " + a);
//        System.out.println("b = " + b);

        // Ép sang kiểu hẹp hơn
//        int a = 100;
//        int bound = (int)Math.sqrt(a); // ép từ kiểu double sang kiểu int
//        float pi = 3.14f;
//        int intPi = (int)pi; // ép từ kiểu float sang kiểu int

        // Ép sang kiểu rộng hơn
//        int a = 99;
//        long newA = a; // <=> long newA = (long)a;
//        float fA = a; // <=> float fA = (float)a;
//        var result = 99 * fA;

        // Ép kiểu đóng hộp
//        int x = 200;
//        Integer interger = x; // muốn gọi phương thức từ x phải chuyển về kiểu obj
//        double d = interger.doubleValue();
//        interger.toString();
//        Double doubleX = Double.NaN;
//        Double doubleY = 2.55;
//        System.out.println(doubleY.longValue());
//        System.out.println(doubleX.isNaN());
//        int y = doubleY.intValue(); // ép kiểu mở hộp
//        float l = doubleY.floatValue();
//        double dd = doubleX;

        // Ép kiểu mở hộp
//        Integer xObject = 500; // xObject là kiểu tham chiếu
//        int x = xObject.intValue(); // x là kiểu nguyên thủy <=> x = xObject;
//        Double dObject = 123.456;
//        double d = dObject.doubleValue(); // <=>  d = dObject;
        // Làm tròn số
        /*
            - Sử dụng phương thức Math.ceil() để làm tròn lên số nguyên gần nhất.
            - Sử dụng phương thức Math.floor() để làm tròn xuống số nguyên gần nhất.
            - Sử dụng phương thức Math.round() để làm tròn tự động lên hoặc xuống giá trị nguyên gần nhất.
              Quy ước mọi phần thập phân lẻ >= 0.5 sẽ làm tròn lên, ngược lại làm tròn xuống.
            - Làm tròn đến k chữ số với printf() và %n.kf.
              Trong đó n là độ rộng tính theo số kí tự để in ra kết quả. Còn k là số chữ số cần làm tròn phần thập phân.
            - Sử dụng đối tượng của lớp DecimalFormat.
              Trong đó mỗi chữ số sẽ được đánh dấu bởi dấu thăng phân tách phần nguyên, thập phân bởi dấu .
        */
        double x = 2;
        double y = 3;
        double result = x / y; // kết quả 0.6666666(6)
        System.out.println(Math.ceil(result)); // kq = 1
        System.out.println(Math.floor(result)); // kq = 0
        System.out.println(Math.round(result)); // kq = 1
        // sử dụng DecimalFormat
        // NumberFormat là kiểu cha của DecimalFormat
        NumberFormat numberFormat = new DecimalFormat("#,###.#########");
        System.out.println(numberFormat.format(result));
        // sử dụng printf và chuỗi chuyển đổi định dạng:
        System.out.printf("%8.9f", result);

    }
}
