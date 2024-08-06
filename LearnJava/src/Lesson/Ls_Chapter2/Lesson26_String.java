package Lesson.Ls_Chapter2;
/*
    Bài 2.6: Tìm hiểu lớp String
    - Kiểu String dùng để lưu trữ chuỗi các kí tự trong ngôn ngữ lập trình Java. Chuỗi kí tự là tập các kí tự
      được sắp đặt theo một trật tự nhất định nhằm biểu đạt một ý nghĩa nào đó và đặt trong cặp nháy kép “”.
            Ví dụ: String message = “I Love You”;
    - String là một kiểu bất biến (immutable) trong ngôn ngữ lập trình Java.
    - Về bản chất nó là một final class.
    - Kiểu bất biến là một kiểu mà giá trị của nó kể từ sau khi được gán thì không thể thay đổi.
    - Khi tạo biến kiểu String thì đó là biến kiểu đối tượng(object) không phải biến của kiểu nguyên thủy.
      Do đó ta có thể thực hiện các thao tác gọi phương thức trên đối tượng của kiểu String.
 */

import static java.lang.StringTemplate.STR;

public class Lesson26_String {
    public static void main(String[] args) {
        // Bản chất của String
//        var fullname = "Lê Nguyễn Bảo Ngọc";
//        var upCaseName = fullname.toUpperCase();
//        var lowerCaseName = fullname.toLowerCase();
//        System.out.println("Họ và tên: " + fullname);
//        System.out.println("Họ và tên viết hoa: " + upCaseName);
//        System.out.println("Họ và tên viết thường: " + lowerCaseName);

        // Phép nối chuỗi
        /**
         * Sử dụng toán tử +.
         * Sử dụng phương thức concat().
         * Sử dụng string template.
         * Sử dụng StringBuilder/StringBuffer. .
         */
//        var first = "Ngọc";
//        var last = "Lê";
//        var middle = "Nguyễn Bảo";
//        //var fullname = last + " " + middle + " " + first;
//        var fullname = STR."\{last} \{middle} \{first}"; // sử dụng cho jdk 21
//        //var fullname = last.concat(" ").concat(middle).concat(" ").concat(first);
//        System.out.println(fullname);

        // String template Java 21+
//        String fullName = "Nguyễn Hữu Hoàng";
//        var upperCaseName = fullName.toUpperCase();
//        var lowerCaseName = fullName.toLowerCase();
//        System.out.println(STR."Họ và tên: \{fullName}");
//        System.out.println(STR."Họ và tên viết hoa: \{upperCaseName}");
//        System.out.println(STR."Họ và tên viết thường: \{lowerCaseName}");

        // Các ký tự đặc biệt
//        var someMassage = "Xin chào bạn \"Hoàng\""; // xược / nháy kép " để tạo ra ký tự nháy kép trong chuỗi
//        System.out.println(someMassage);
//        System.out.println("Nguyễn Hữu \nHoàng"); // \n để xuống dòng
//        System.out.println("Nguyễn Hữu \tHoàng"); // \t tạo ra 4 khoảng cách
//        var path = "D:\\mc\\mc.jpg"; // \\ biểu diễn cho \ dùng cho đường dẫn
//        System.out.println(path);

        // Các phương thức của lớp String
        var fullName = "Nguyễn Hữu Hoàng";
        System.out.println(STR."Độ dài của fullname là: \{fullName.length()}");
        System.out.println(STR."Viết hoa: \{fullName.toUpperCase()}");
        System.out.println(STR."Viết thường: \{fullName.toLowerCase()}");
        System.out.println(STR."Vị trí đầu tiên của kí tự 'o': \{fullName.indexOf('o')}");
        System.out.println(STR."Vị trí cuối cùng của kí tự 'g': \{fullName.lastIndexOf('n')}");
        System.out.println(STR."Ký tự tại vị trí 5: \{fullName.charAt(5)}");
        var newFullName = fullName.replace('g', 'q');
        System.out.println(STR."Họ tên sau khi thay thế: \{newFullName}");
        var message = "         VTL          ";
        System.out.println(STR."Chuỗi ký tự sau khi loại bỏ khoảng trắng: \{message.trim()}");
        var words = fullName.split("\\s+"); // \\s+ : là có thể có 1 hoặc nhiều khoảng trắng
        System.out.println(STR."Số từ trong tên là: \{words.length}");

        /**
         * length()	Cho biết độ dài của chuỗi tính theo số kí tự. Luôn >= 0
         * toUpperCase() : Viết hoa toàn bộ chuỗi
         * toLowerCase() : Viết thường toàn bộ chuỗi
         * indexOf() : Tìm vị trí đầu tiên của một kí tự/một chuỗi con trong chuỗi kí tự
         * lastIndexOf() : Tìm vị trí cuối cùng của một kí tự/chuỗi con trong chuỗi gốc
         * charAt(index) : Lấy ra kí tự tại vị trí index. Giá trị index phải >= 0 và < length() của chuỗi đang xét
         * compareTo(other) :	So sánh sự tương đương có phân biệt chữ hoa, chữ thường về mặt giá trị của hai chuỗi.
                                Kết quả trả về giá trị số âm, 0 hoặc dương tùy vào mức độ tương quan của hai chuỗi.
         * compareToIgnoreCase(other) : So sánh hai chuỗi về mặt giá trị. Không phân biệt chữ hoa chữ thường.
                                        Kết quả trả về giá trị âm nếu chuỗi hiện thời đứng trước other. Bằng 0 nếu
                                        hai chuỗi cùng giá trị. Dương nếu chuỗi hiện thời đứng sau chuỗi other.
         * trim() : Loại bỏ kí tự khoảng trắng ở đầu và cuối chuỗi. Khoảng trắng là các kí tự
                    dấu cách, dấu tab, xuống dòng.
         * replace(old, newStr) : Thay thế kí chuỗi kí tự old bằng kí tự/chuỗi kí tự newStr.
                                  Thực hiện thay thế toàn bộ chuỗi old bằng newStr xuất hiện trong chuỗi.
         * replaceAll(regex, newStr) : Thay thế tất cả các chuỗi con thỏa mãn regex trong chuỗi gốc bằng newStr.
         * split(regex) : Tách chuỗi và trả về mảng String sau khi tách. regex là mẫu kí tự so khớp cần để
                          xác định điều kiện tách chuỗi. Ví dụ regex =”\\s+” chỉ định tách chuỗi tại vị trí có
                          1 hoặc nhiều dấu cách. Chi tiết về regex và các quy tắc so khớp bạn tìm hiểu trong
                          chương Regular Expression.
         * substring(startIndex) : Trích xuất chuỗi con của chuỗi gốc từ vị trí startIndex đến hết chuỗi gốc.
         * substring(start, end) : Trích xuất chuỗi con của chuỗi gốc từ vị trí start đến trước vị trí end.
         * isEmpty() : Kiểm tra xem chuỗi hiện thời có rỗng hay không. Kết quả nhận được là true nếu độ dài chuỗi
                       bằng 0 và ngược lại kết quả là false.
         * isBlank() : Kiểm tra xem chuỗi hiện thời có rỗng hoặc chỉ chứa các kí tự khoảng trắng hay không.
                       Kí tự khoảng trắng là các kí tự như dấu cách, dấu tab, xuống dòng.
                        Như vậy một chuỗi là blank chưa chắc empty.
         */
    }
}
