package Lesson.Ls_Chapter6_OOP.Ls61_class_object;

/*
    Bài 6.1. Nhập môn lớp và đối tượng
    1. Khái niệm
    - Trong thế giới thực ta dễ dàng nhận thấy rất nhiều những thực thể hay đối tượng có các đặc điểm giống hệt nhau.
      Ví dụ như những chiếc iPhone 15 Pro Max, iPhone 15 Max, những chiếc xe Tesla model X, những chiếc Macbook Pro 16′
      phiên bản 2025, những chiếc laptop ASUS dòng XYZ nào đó… Tất cả các sản phẩm cùng phiên bản đó được tạo ra từ cùng
      một bản thiết kế. Do đó có các chức năng, đặc điểm và giá thành tương tự nhau.
    - Một đối tượng thường có các đặc điểm nhận biết đặc trưng và hành động cụ thể đi kèm.
    - Từ ý tưởng này, người ta cũng muốn tạo ra một chuẩn chung, bản mẫu chung để mô tả thông tin các đối tượng giống
      nhau trong ngôn ngữ lập trình. Để làm được điều này, ta sử dụng keyword class.
    - Một lớp là một bản mô tả cụ thể(có thể coi như bản vẽ, mẫu thiết kế, mô hình hóa) của một đối tượng trong ngôn ngữ lập trình.
    - Hoặc: một lớp là một bản mẫu thiết kế chi tiết mà từ đó các đối tượng riêng lẻ của nó được tạo ra.
    - Java là ngôn ngữ lập trình hướng đối tượng, đặc trưng của nó là tất cả các thành phần được xây dựng trên các lớp.
    - Các đối tượng có thể là đối tượng hữu hình, cụ thể: cái xe máy, ô tô, smartphone, con người, con vật, cây cối,
      vật dụng… hoặc cũng có thể là các đối tượng trừu tượng vô hình: đơn hàng, giỏ hàng, tài khoản facebook, tài khoản tiktok,…
    - Bất cứ thứ gì mà ta có thể dùng danh từ để đặt tên cho nó thì đều có thể đem nó vào làm đối tượng trong ngôn ngữ lập trình.
    2. Mục đích sử dụng
    - Vậy, mục đích của class là để mô hình hóa một đối tượng từ thế giới thực vào thế giới của ngôn ngữ lập trình để
      máy tính hiểu được.
    - Một lớp thường có hai thành phần chính: các thuộc tính và các phương thức.
    - Ngoài ra nó có thể chỉ có các phương thức, chỉ chứa thuộc tính hoặc có thêm các enum, các lớp, interface khác.
    - Các đặc điểm của đối tượng sẽ được mô tả thông qua các thuộc tính của lớp.
    - Các hành động của đối tượng sẽ được mô tả thông qua các phương thức.
    3. Cú pháp tổng quát
        - Sau đây là cú pháp tổng quát của một định nghĩa lớp trong Java:
            access non-access class name {
                // properties
                // constructors
                // methods
                // others
            }
      - Trong đó :
        + Phần access là access modifier, tức khả năng nhìn thấy của một thành phần so với thế giới bên ngoài lớp.
          Các access modifier có thể là public, protected, private. Mỗi lớp chỉ có 1 access modifier và nó chỉ xuất
          hiện 1 lần. Mỗi file chương trình Java chỉ có 1 và chỉ 1 public class. Ta sẽ lần lượt tìm hiểu kĩ hơn qua
          từng bài học.
        + non-acess là phần bổ trợ làm rõ nghĩa cho một lớp. Phần này có thể có hoặc không. non-access có thể là final,
          abstract, static, strictfp. Ta sẽ lần lượt tìm hiểu cụ thể trong các bài học. Bây giờ để cho đơn giản ta sẽ
          mặc định phần non-access là bỏ trống.
        + Tiếp theo là keyword class. Đây là keyword bắt buộc để khai báo và nhận biết lớp trong Java.
        + Phần name là tên của một lớp. Tên lớp là danh từ, cụm danh từ số ít mô tả đối tượng mà nó thể hiện. Tên lớp
          luôn bắt đầu bằng chữ cái hoa và nếu tên có nhiều từ, các từ viết liền nhau và viết hoa chữ cái đầu từ.
        + Trong cặp { } chứa các thành phần mô tả và bổ trợ nhằm làm rõ đối tượng cần mô hình hóa. Phần này có thể có
          nhiều loại thành phần cấu thành như trên hoặc cũng có thể chỉ có 1 thành phần bất kì trong số đó.
        + Phần properties là các thuộc tính, còn gọi là các trường(fields) là phần mô tả đặc điểm đặc trưng của đối tượng.
          Đây là thành phần dữ liệu của lớp. Giả định từ giờ đến khi học bài tính đóng gói dữ liệu ta sẽ coi rằng các
          thuộc tính là public.
        + Phần constructors là các phương thức khởi tạo dùng để tạo đối tượng với những thông tin ban đầu từ lớp.
        + Phần methods là các phương thức khác constructors. Dùng để thể hiện các hành động, nhiệm vụ, hành vi của đối
          tượng mà lớp mô tả.
        + Phần others có thể là các class, enum, interface. Để cho đơn giản thì phần này sẽ được đề cập chi tiết trong
          các bài học về sau.
    - Cú pháp tạo và sử dụng đối tượng
        + Để sử tạo ra đối tượng ta dùng cú pháp: type variable = new type(params); với type là tên của lớp muốn sử dụng.
          params là danh sách tham số(có hoặc không).
        + Ví dụ:
            Cat tom = new Cat("Tom");
            Student linh = new Student("Nguyễn Thùy Linh");
            Student nhan = new Student("B25DCCN111", "Hoàng Trọng Nhân");
            // ta có thể sử dụng kiểu tự suy luận:
            var student = new Student("B25DCCN102", "Nguyễn Ngọc Mai");
        + Để truy cập đến một thành phần nào đó của lớp, ta sử dụng tên đối tượng và toán tử dấu chấm sau đó là tên
          thành phần cần truy cập: objectName.componentName.
        + Trong đó objectName là tên đối tượng cần truy cập, componentName là tên thành phần public nào đó.
 */
public class Lesson61 {
}
