package Lesson.Ls_Chapter6_OOP.Ls63_Encapsulation;

/*
    Bài 6.3. Tính đóng gói dữ liệu (Encapsulation)
    1. Mục đích sử dụng
        - Tính đóng gói dữ liệu là 1 trong 4 tính chất của ngôn ngữ lập trình Java. Các tính chất còn lại là: tính kế thừa,
          tính đa hình và tính trừu tượng
        - Tính đóng gói dữ liệu là kĩ thuật gói gọn các dữ liệu và các chức năng vận hành trên dữ liệu đó vào trong một đơn
          vị đơn nhất(1 lớp).
        - Với tính đóng gói dữ liệu, dữ liệu của một lớp sẽ được bảo vệ khỏi thế giới bên ngoài lớp. Chỉ những thành phần
          bên trong lớp đó mới nhìn thấy và sử dụng được các dữ liệu này.
        - Nói cách khác, với tính đóng gói dữ liệu, dữ liệu của lớp nào chỉ lớp đó được phép trực tiếp truy xuất. Các lớp
          khác muốn sử dụng hoặc thao tác với các dữ liệu này phải thông qua các phương thức public mà lớp cung cấp.
        - Biểu hiện của tính đóng gói dữ liệu gồm:
            + Các thuộc tính(dữ liệu) sẽ có access modifier là private.
            + Có các getter/setter public để thao tác với các thuộc tính private kể trên.
    2. Các phương thức getter/setter
        - Để đọc dữ liệu của các thuộc tính tương ứng ra ta dùng các phương thức getX() gọi chung là các getter methods.
        - Kiểu dữ liệu của getter luôn cùng kiểu với kiểu của thuộc tính ta cần đọc ra.
        - Tên của getter luôn có dạng: getX() trong đó X là tên thuộc tính cần đọc. Ví dụ thuộc tính studentId sẽ có getter tương ứng là getStudentId().
        - Getter không nhận bất kì tham số nào.
        - Để thay đổi, cập nhật dữ liệu của đối tượng ta sử dụng các phương thức setX() gọi chung là các setter methods.
        - Setter thường có kiểu void với định dạng setX(value) với x là tên thuộc tính cần thay đổi giá trị.
        - Phương thức setter luôn nhận vào một tham số cùng kiểu với kiểu của thuộc tính private ta cần sửa đổi.
        - Trong setter có thể thực hiện các hành động kiểm tra, so khớp trước khi gán giá trị để đảm bảo dữ liệu luôn hợp lệ.
        - Một thuộc tính có thể có đầy đủ cả getter/setter hoặc cũng có thể chỉ có getter hoặc chỉ có setter.
    3. Các phương thức private
        - Tương tự như các thuộc tính private, phương thức private cũng chỉ có thể được sử dụng trực tiếp ở bên trong
          một lớp.
        - Khi ta loại bỏ các private medthod sẽ không ảnh hưởng gì đến code bên ngoài. Vì đơn giản không có bất kì lời
          gọi nào tới phương thức private xuất phát từ phía bên ngoài lớp hiện thời.
        - Mục đích của các private methods là để thực hiện các xử lý nội bộ nào đó trong một lớp. Thường dùng để tạo
          các helper method(phương thức phụ trợ) cục bộ của lớp.
        - Nếu một nhiệm vụ nào đó có nhiều vấn đề nhỏ hơn cần xử lý thì ta có thể chia các vấn đề đó thành các
          private method để xử lý.
        - Khi sinh code trong công cụ IntelliJ ta thấy rằng các phương thức sinh ra mặc định là private. Nếu muốn cho
          phép các phương thức này được sử dụng bởi các thành phần bên ngoài lớp, thì ta chỉ cần đổi private thành một
          trong các access modifier khác tùy mục đích: public, protected hoặc không có access modifier.
        - Mẫu kiểm tra họ tên có hợp lệ không, áp dụng cho cả tiếng Việt có dấu. Chi tiết về regular expression bạn xem
          trong chương biểu thức chính quy
 */


public class Lesson63 {
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println("Trước khi sửa đổi: ");
        System.out.println(STR."Mã sinh viên: \{student.getStudentId()}");

        // cập nhật thông tin sinh viên:
        student.setStudentId("SV1005");
        student.setGpa(3.25f);
        student.setFullName("Lê Nguyễn Bá Nam");

        System.out.println("Sau khi sửa đổi: ");
        System.out.println(STR."Mã sinh viên: \{student.getStudentId()}");
        System.out.println(STR."Họ và tên: \{student.getFullName()}");
        System.out.println(STR."Gpa: \{student.getGpa()}");
    }
}
