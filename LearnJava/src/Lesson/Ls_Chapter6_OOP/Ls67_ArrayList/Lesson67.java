package Lesson.Ls_Chapter6_OOP.Ls67_ArrayList;

/*
    Bài 6.7. Lớp ArrayList
    1. Bản chất ArrayList
        - Khi ta muốn lưu trữ một tập hợp các phần tử cùng kiểu, ta sử dụng mảng. Tuy nhiên nhược điểm của mảng là số
          phần tử của nó cố định. Do đó không thể mở rộng thêm hoặc giảm kích thước của nó đi kể từ sau khi mảng được
          cấp phát hoặc khởi tạo.
        - Để kế thừa các tính chất của mảng và mang đến những tính năng mềm dẻo và ưu việt hơn, ta dùng ArrayList.
        - ArrayList là một phần của collection framework trong Java. ArrayList nằm trong gói java.util. ArrayList cung
          cấp cho ta khả năng lưu trữ mảng động trong Java.
        - ArrayList có thể chậm hơn mảng thông thường nhưng nó có các tính năng hữu dụng giúp ta quản lý các phần tử dễ dàng.
        - ArrayList dùng để lưu trữ các đối tượng cùng kiểu, thay cho mảng.
        - Kích thước của ArrayList tự động tăng lên khi ta thêm các phần tử mới vào. Và tự động giảm đi khi ta loại bỏ
          các phần tử khỏi ArrayList.
        - ArrayList chỉ dùng để lưu trữ các đối tượng cùng kiểu của các kiểu tham chiếu. Không dùng để lưu trữ các giá
          trị kiểu nguyên thủy. Nếu muốn lưu giá trị kiểu nguyên thủy ta sẽ sử dụng lớp bao của chúng.
        - Ta có thể sử dụng chỉ số mảng để truy cập các phần tử trong ArrayList. Tư tưởng sử dụng chỉ số phần tử tương
          tự như trong mảng.
    2. Tạo mới ArrayList
    - Để tạo mới một ArrayList, ta có thể dùng 1 trong 3 phương thức khởi tạo sau:
    - ArrayList(): Tạo một đối tượng ArrayList rỗng với khả năng chứa 10 phần tử.
    - ArrayList(Collection c): Tạo một đối tượng ArrayList với khởi đầu là một tập các phần tử trong một collection c
      nào đó. Nếu tham số là null ta sẽ nhận NullPointerException.
    - ArrayList(int capacity): Tạo một đối tượng ArrayList rỗng với khả năng lưu trữ khởi đầu bằng số phần tử trong tham số.
         ArrayList<Order> orders = new ArrayList<>();
         ArrayList<Order> orders1 = new ArrayList<>(40);
         ArrayList<Order> orders2 = new ArrayList<>(orders);
         // hoặc sử dụng kiểu tự suy luận var:
         var pets = new ArrayList<Pet>();
 */

import java.util.ArrayList;

public class Lesson67 {
    public static void main(String[] args) {
        ArrayList<Pet> pets = new ArrayList<Pet>();
    }
}
