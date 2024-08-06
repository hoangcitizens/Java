package Lesson.Ls_Chapter2;// Bài 2.10: StringBuilder và StringBuffer
/*
    * Giới thiệu về StringBuilder
        - Lớp chứa một chuỗi các kí tự có thể sửa đổi được(mutable). Lớp này cung cấp một API tương thích với
          StringBuffer nhưng không đảm bảo tính đồng bộ hóa.
        - Lớp StringBuilder được thiết kế để sử dụng trong trường hợp đơn luồng. Khi có thể, ta nên sử dụng lớp này
          thay vì StringBuffer vì tốc độ của StringBuilder sẽ nhanh hơn trong hầu hết các triển khai.
        - Các phương thức chính của StringBuilder xoay quanh việc chèn thêm phần tử và nối phần tử vào cuối.
          Các phương thức tương ứng của chúng là insert() và append() được nạp chồng để có thể hoạt động với bất kì
          kiểu dữ liệu nào.
        - Cả hai phương thức trên đều chuyển đổi một cách hiệu quả dữ liệu được cung cấp sang string sau đó chèn hoặc
          thêm vào nội tại của đối tượng StringBuilder.
        - Mỗi StringBuilder có một khả năng chứa(capacity) nhất định. Chừng nào các kí tự chứa trong StringBuilder
          chưa vượt quá giới hạn này thì giá trị capacity chưa cần cấp phát để mở rộng.
        - Nếu bộ đệm nội tại bị tràn, nó sẽ tự động được nới ra với kích thước lớn hơn.
        - Khuyến nghị chỉ sử dụng StringBuilder trong trường hợp xử lý đơn luồng, với trường hợp đa luồng ta
          sử dụng StringBuffer.
        - Sử dụng StringBuilder khi ta muốn sửa đổi chuỗi kí tự: thêm, sửa xóa nội dung của chuỗi kí tự. Khi thực hiện,
          các thao tác này diễn ra trên cùng đối tượng StringBuilder.
    * Các phương thức thường gặp của StringBuilder
        - Đầu tiên là các phương thức khởi tạo: dùng để tạo đối tượng StringBuilder với các thông số khác nhau:
            + StringBuilder(): tạo lập một đối tượng StringBuilder mới không chứa bất kì kí tự nào trong nội tại của nó.
              Mặc định phương thức này tạo một bộ đệm với kích thước 16 kí tự.
            + StringBuilder(CharSequence seq): tạo đối tượng StringBuilder với bộ đệm chứa các kí tự như trong tham số
              kiểu CharSequence truyền vào.
            + StringBuilder(int capacity): tạo đối tượng StringBuilder rỗng với khả năng chứa capacity kí tự.
            + StringBuilder(String str): tạo một đối tượng StringBuilder với bộ đệm nội tại chứa nội dung của string
              cho trước.
        - Sau đây là các phương thức thường gặp và mô tả:
            + StringBuilder append(type param): nối nội dung string đại diện cho giá trị chứa trong param vào cuối
              bộ đệm chứa các kí tự của đối tượng StringBuilder hiện thời. Trong đó type có thể là các kiểu nguyên thủy,
              các lớp bao của kiểu nguyên thủy, mảng char[], CharSequence, Object, String, StringBuffer.
            + StringBuilder append(char[] str, int offset, int len): thêm string đại diện của một mảng con của mảng str
              vào bộ đệm nội tại của đối tượng StringBuilder. Chuỗi con gồm len kí tự lấy trong str tính từ vị trí offset.
              Kích thước bộ đệm nội tại trong StringBuilder sẽ tăng lên một lượng bằng len.
            + StringBuilder append(CharSequence s, int start, int end): nối một chuỗi con của s tính từ vị trí start
              đến trước end vào bộ đệm nội tại của đối tượng StringBuilder. Kích thước bộ đệm của StringBuilder tăng lên
              một lượng bằng end – start.
            + int capacity(): trả về khả năng chứa hiện tại của đối tượng StringBuilder.
            + char charAt(int index): trả về kí tự tại vị trí index trong bộ đệm nội tại của StringBuilder.
            + StringBuilder delete(int start, int end): xóa các kí tự từ vị trí start đến trước vị trí end trong bộ đệm
              nội tại của StringBuilder.
            + StringBuilder deleteCharAt(int index): xóa kí tự tại vị trí chỉ định trong bộ đệm của StringBuilder.
            + int indexOf(String str): trả về vị trí kí tự đầu tiên của chuỗi con đầu tiên trong StringBuilder có giá
              trị trùng với giá trị cho trong tham số str. Tức là vị trí của chuỗi con đầu tiên trong nội tại
              StringBuilder trùng với str. Không tìm thấy thì return -1.
            + int indexOf(String str, int fromIndex): trả về vị trí kí tự đầu tiên của chuỗi con đầu tiên trong
              StringBuilder tính từ vị trí fromIndex có giá trị trùng với giá trị cho trong tham số str.
              Tức là vị trí của chuỗi con đầu tiên trong nội tại StringBuilder trùng với str. Không tìm thấy return -1.
            + StringBuilder insert(int offset, type param): chèn nội dung trong tham số param vào nội tại
              StringBuilder tại vị trí offset. type có thể là bất kì kiểu dữ liệu nào trong số các kiểu nguyên thủy,
              các lớp bao của kiểu nguyên thủy, mảng char[], CharSequence, Object, String, StringBuffer.
            + StringBuilder insert(int offset, char[] str, int offset, int len): chèn len kí tự từ vị trí offset
              trong str vào bộ đệm nội tại của đối tượng StringBuilder.
            + StringBuilder insert(int offset, CharSequence seq, int start, int end): chèn các kí tự từ vị trí start
              đến trước end trong seq vào bộ đệm nội tại của đối tượng StringBuilder.
            + int lastIndexOf(String str): trả về vị trí của kí tự đầu tiên của chuỗi con cuối cùng trong nội tại
              StringBuilder có giá trị trùng với giá trị tham số str. Nếu không tìm thấy return -1.
            + int lastIndexOf(String str, int fromIndex): trả về vị trí của kí tự đầu tiên của chuỗi con cuối cùng
              trong nội tại StringBuilder tính từ vị trí fromIndex có giá trị trùng với giá trị tham số str. Nếu không
              tìm thấy return -1.
            + int length(): trả về số lượng kí tự của bộ đệm nội tại trong đối tượng StringBuilder. Giá trị luôn >= 0.
            + StringBuilder replace(int start, int end, String str): thay thế các kí tự từ vị trí start đến trước end
              bằng nội dung trong str.
            + StringBuilder reverse(): đảo ngược nội dung các kí tự trong bộ đệm nội tại của StringBuilder.
            + void setCharAt(int index, char ch): cập nhật giá trị kí tự tại vị trí index thành kí tự cho trong
              tham số ch.
            + void setLength(int newLength): thiết lập độ dài mới cho các kí tự trong bộ đệm nội tại của đối tượng
              StringBuilder. newLength phải đảm bảo >= 0.
            + CharSequence subSequence(int start, int end): trả về một chuỗi kí tự trích ra từ vị trí start đến trước
              end trong bộ đệm nội tại của StringBuilder.
            + String subString(int start): trả về chuỗi con trong bộ đệm của StringBuilder từ vị trí start đến hết bộ
              đệm của đối tượng StringBuilder.
            + String subString(int start, int end): trả về chuỗi con của các kí tự trong bộ đệm của StringBuilder
              từ vị trí start đến trước vị trí end.
            + String toString(): trả về một đối tượng String đại diện cho nội dung các kí tự lưu trong bộ đệm
              của StringBuilder.
            + void trimToSize(): giảm khả năng chứa kí tự của StringBuilder xuống. Cách thức hoạt động: nếu khả
              năng chứa  > số kí tự thực tế hiện có, nó tự động cắt giảm capacity cho phù hợp.
 */


import java.util.Scanner;

public class Lesson210_StringBuilder {
    public void main(String[] args) {
        // VD1: Tạo họ và tên đầy đủ từ các thành phần đơn lẻ họ – đệm – tên
        var scanner = new Scanner(System.in);
        System.out.print("Họ: ");
        var lastName = scanner.nextLine();
        System.out.print("Đệm: ");
        var midName = scanner.nextLine();
        System.out.print("Tên: ");
        var firstName = scanner.nextLine();
        // tạo họ tên đầy đủ với StringBuilder
        var nameBuilder = new StringBuilder();
        nameBuilder.append(lastName)
                .append(" ")
                .append(midName)
                .append(" ")
                .append(firstName);
        var fullName = nameBuilder.toString();
        System.out.println(STR."Họ và tên: \{fullName}");
        System.out.println(STR."Họ và tên viết Hoa: \{fullName.toUpperCase()}");

        // VD2: Viết hoa chữ cái đầu từ của họ và tên, các kí tự khác viết thường
//        var scanner = new Scanner(System.in);
//        System.out.print("Họ: ");
//        var lastName = scanner.nextLine().trim();
//        System.out.print("Đệm: ");
//        var midName = scanner.nextLine().trim();
//        System.out.print("Tên: ");
//        var firstName = scanner.nextLine().trim();
//        // tạo họ tên đầy đủ với StringBuilder
//        var nameBuilder = new StringBuilder();
//        nameBuilder.append(lastName.toLowerCase())
//                .append(" ")
//                .append(midName.toLowerCase())
//                .append(" ")
//                .append(firstName.toLowerCase());
//        // viết hoa chữ cái đầu tiên
//        nameBuilder.setCharAt(0, Character.toUpperCase(nameBuilder.charAt(0)));
//        var previousIndex = 0;
//        while (true) {
//            var index = nameBuilder.indexOf(" ", previousIndex);
//            if (index == -1) {
//                break;
//            }
//            var character = nameBuilder.charAt(index + 1);
//            nameBuilder.setCharAt(index + 1, Character.toUpperCase(character));
//            previousIndex = index + 1;
//        }
//        System.out.println(STR."Họ và tên: \{nameBuilder.toString()}");
    }
}
