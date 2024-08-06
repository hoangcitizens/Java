package Lesson.Ls_Chapter2;// Bài 2.8: Tìm hiểu lớp Math
/*
    Mục đích sử dụng
        - Lớp Math chứa các hằng số và các công thức tính toán toán học đã được xây dựng sẵn.
        - Ta sử dụng các hằng số và công thức tính toán này khi muốn tính toán toán học.
        - Ví dụ tính trị tuyệt đối, căn bậc hai, bậc ba, tính sin, cos…
    Cú pháp
        - Cú pháp tổng quát để sử dụng lớp Math:
        - Với các hằng số: Math.tên_thành_phần
        - Với các phương thức: Math.phương_thức(các tham số)
        Các phương thức thường dùng và mô tả
     Danh sách các phương thức thường dùng của lớp Math và mô tả:
        abs(v)	: Lấy trị tuyệt đối của v. Kiểu của v là các kiểu số trong Java.
        sqrt(v)	: Tính căn bậc hai của v. Giá trị của v phải là số dương.
        cbrt(v)	: Tính căn bậc ba của v. Kiểu của v là các kiểu số.
        sin(x)	: Tính sin của x. Giá trị của x ở hệ radian.
        cos(x)	: Tính cos của x. Giá trị của x ở hệ radian.
        tan(x)	: Tính tan của x. Giá trị của x ở hệ radian.
        asin(a)	: Tính góc x từ giá trị a = sin(x). Kết quả ở hệ radian.
        ceil(x)	: Làm tròn giá trị số x lên số nguyên gần nhất. Kết quả ở dạng double.
        floor(x): Làm tròn giá trị số x xuống số nguyên gần nhất. Kết quả ở dạng double.
        round(x): Làm tròn tự động giá trị số x đến số nguyên gần nhất. Kết quả ở dạng double.
        log(x)	: Tính logrit cơ số tự nhiên(e) của x.
        exp(x)	: Tính e^x. Với e = Math.E
        log10(x):	Tính logarit cơ số 10 của x.
        min(a, b) : Tìm giá trị min trong hai số a, b.
        max(a, b) : Tìm giá trị max trong hai số a, b.
        pow(a, b) : Tính a^b.
        random()  : Sinh số ngẫu nhiên trong đoạn từ 0.0 đến < 1.0
        toRadians(x) : Chuyển x từ độ sang radian
        toDegrees(x) : Chuyển x từ radian sang độ
 */
import static java.lang.StringTemplate.STR;

public class Lesson28_Math {
    public static void main(String[] args) {
        int x = -200;
        int newX = Math.abs(x);
        System.out.println(STR."newX = \{newX}");
        float degree = 90;
        System.out.println(Math.toRadians(degree));
        System.out.println(Math.toDegrees(Math.PI / 2));
        System.out.println(STR."sin(PI / 3) = \{Math.sin(Math.PI / 3)}");
        System.out.println(STR."cos(PI / 3) = \{Math.cos(Math.PI / 3)}");
        System.out.println(STR."tan(PI / 3) = \{Math.tan(Math.PI / 3)}");

        var radius = 125.66;
        var perimeter = 2 * Math.PI * radius;
        var area = Math.PI * Math.pow(radius, 2);
        System.out.println(STR."Chu vi đường tròn bán kính \{radius} = \{perimeter}");
        System.out.println(STR."Diện tích đường tròn bán kính \{radius} = \{area}");

        var a = 200;
        var b = 500;
        System.out.println(STR."min(a, b) = \{Math.min(a, b)}");
        System.out.println(STR."max(a, b) = \{Math.max(a, b)}");
    }
}
