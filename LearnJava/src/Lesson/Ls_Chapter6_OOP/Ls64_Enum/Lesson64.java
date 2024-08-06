package Lesson.Ls_Chapter6_OOP.Ls64_Enum;

/*
    Bài 6.4. Kiểu enum
    1. Mục đích sử dụng
        - Đôi khi một biến chỉ nên chứa những giá trị đã được giới hạn trong một tập xác định nào đó. Enum giúp ta tạo
          ra tập hợp của các giá trị như vậy. Cụ thể hơn, enum giúp ta tạo ra tập hợp của các giá trị là hằng số.
        - Enum là một lớp đặc biệt dùng để tập hợp và vận hành dựa trên các thành phần hằng số.
        - Ví dụ 1: một tuần chỉ có 7 ngày từ thứ 2 đến chủ nhật. Điều này là không đổi, ta có thể dùng enum để tạo ta
          tập hợp của ngày trong tuần cho thuận tiện sử dụng.
        - Ví dụ 2: kích thước quần áo có các size siêu nhỏ, nhỏ, vừa, lớn và siêu lớn. Ta hoàn toàn có thể dùng enum để
          lưu trữ các hằng số trên để tiện sử dụng.
        - Ví dụ 3: một năm có 12 tháng từ January tới December, ta có thể dùng enum để biểu diễn các tháng trong năm.
        - Ví dụ 4: học lực có 5 mức gồm không đạt, trung bình, khá, giỏi, xuất sắc. Ta có thể sử dụng enum biểu diễn các
          mức học lực này.
        - Một trong những ưu điểm của enum so với việc sử dụng các giá trị thông thường là tránh được việc bị gán nhầm
          giá trị vì tên các thành phần hằng số của nó rất tường minh và trong mỗi tập hợp thì mỗi hằng số chỉ xuất hiện
          duy nhất 1 lần.
    2. Cú pháp tổng quát
        access enum name {
            // các hằng số
            // thuộc tính
            // phương thức khởi tạo
            // phương thức khác
        }
        Trong đó:
            - Phần access là access modifier – cấp độ truy cập. Có thể là public, protected, private hoặc bỏ trống.
              Ý nghĩa sử dụng của access modifier như áp dụng với lớp đã biết.
            - Mặc định enum là final nên ta không thêm keyword này vào. Ngoài ra không sử dụng từ khóa abstract trong
              khai báo enum.
            - Enum bắt buộc phải có từ khóa enum trong khai báo.
            - Phần name là tên của enum. Do tính chất tập hợp của enum nên ta đặt tên enum sao cho biểu đạt được ý nghĩa
              của tập hợp ở số ít. Ví dụ:
            - Size với tập hợp kích thước quần áo.
            - Season với tập hợp mùa của 1 năm.
            - Rank với học lực, các mức giải thưởng chẳng hạn.
            - Phần kế tiếp là danh sách các hằng số. Hằng số sẽ đặt tên theo quy ước hằng số đã biết. Chúng nên liên
              quan đến ý nghĩa chung của tập hợp mà enum đang mô tả.
            - Các hằng số phân biệt nhau bằng dấu phẩy. Các hằng số thành phần trong enum không được phép trùng nhau
              nhưng có thể trùng giá trị.
            - Các thuộc tính đặt theo quy ước tính đóng gói dữ liệu. Thường dùng các thuộc tính mô tả giá trị hoặc biểu
              hiện của các hằng số.
            - Tiếp theo là phần phương thức khởi tạo. Phương thức khởi tạo mặc định của enum là private. Nếu ta khai báo
              phương thức khởi tạo mà không xác định access modifier cho nó thì nó sẽ có access modifier là private.
            - Phần phương thức có thể chứa các phương thức cung cấp các hành động nào đó liên quan đến tập hợp đang mô tả.
              Ví dụ trả về giá trị tương ứng từng hằng số trong enum.
    3. Các thao tác với enum
        - Có thể dùng phép so sánh tương == đương để so sánh giá trị của các hằng số trong enum.
        - Dùng phương thức values() để lấy ra mảng các hằng số theo thứ tự khai báo trong enum hiện thời.
        - Dùng valueOf(name) để lấy ra hằng số trong enum với tên tương ứng.
        - Dùng tên enum.tên_hằng để truy cập đến hằng số nào đó trong enum. Ví dụ: Season.SPRING.
    4. Lấy hằng số enum khi biết giá trị
        - Khi biết giá trị của một hằng số thành phần trong enum ta hoàn toàn có thể lấy được hằng số enum tương ứng
              bằng cách sử dụng cú pháp
                enum_class_name.valueOf(constant_name)
            Trong đó:
                + enum_class_name là tên lớp enum.
                + constant_name là tên hằng số enum thành phần. Giá trị tên phải chính xác và phân biệt chữ hoa, chữ thường.
 */


import java.util.Scanner;

public class Lesson64 {
    public static void main(String[] args) {
        Season season;
        var scanner = new Scanner(System.in);
        System.out.println("Tên mùa: ");
        var seasonName = scanner.nextLine();

        season = Season.valueOf(seasonName);

        System.out.println(STR."Hằng số enum tương ứng: \{season}");
        System.out.println(STR."Tên mùa trong tiếng Việt: \{season.getSeasonName()}");
    }
}

enum Season {
    SPRING("MÙA XUÂN"),
    SUMMER("MÙA HẠ"),
    FALL("MÙA THU"),
    WINTER("MÙA ĐÔNG");

    private final String seasonName;

    Season(String name) {
        seasonName = name;
    }

    public String getSeasonName() {
        return seasonName;
    }
}
