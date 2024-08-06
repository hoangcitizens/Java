package Lesson.Ls_Chapter6_OOP.Ls62_Constructor;

/*
    Bài 6.2. Các phương thức khởi tạo
    1. Mục đích sử dụng
        - Mục đích sử dụng của phương thức khởi tạo là để tạo ra đối tượng của lớp với những dữ liệu ban đầu cho trước.
        - Mọi lớp muốn tạo đối tượng đều phải có phương thức khởi tạo với access modifier khác private.
        - Chúng ta không sử dụng phương thức khởi tạo với các mục đích khác.
    2. Cú pháp tổng quát
        - Sau đây là cú pháp tổng quát của phương thức khởi tạo:
            access name(params) {
                // các câu lệnh cần thực hiện
            }
        - Trong đó:
            + Phần access là access modifier, có thể là public, protected, private hoặc để trống. Ý nghĩa của
              access modifier là giới hạn việc cho phép phương thức khởi tạo được gọi từ bên ngoài lớp ở mức độ nào.
              Nếu access là public có nghĩa là mọi nơi đều có thể nhìn thấy và gọi phương thức khởi tạo để tạo đối tượng
              từ lớp. Nếu là private thì chỉ có thể gọi phương thức khởi tạo từ bên trong lớp. Riêng protected sẽ nói sau.
            + Phần name là tên phương thức khởi tạo. Bắt buộc tên của phương thức khởi tạo phải giống chính xác như tên
              lớp định nghĩa nó. Nếu không sẽ không có phương thức khởi tạo hợp lệ.
            + Tiếp sau đó là cặp ngoặc tròn chứa danh sách tham số params bên trong. Giống như phương thức thông thường,
              phương thức khởi tạo cũng có thể có 0, 1 hoặc nhiều tham số. Nhằm cung cấp các giá trị ban đầu cho đối
              tượng khi ta tạo ra nó.
            + Phần thân phương thức nằm trong cặp { } và chỉ chứa các câu lệnh thực hiện việc khởi tạo, gán hoặc gọi tới
              các phương thức cần thiết khác khi tạo lập đối tượng.
    3. Nhắc lại về constructor không tham số
        - Mỗi lớp Java khi được tạo ra mặc định sẽ có một phương thức khởi tạo mặc định không tham số đi liền với nó.
        - Phương thức này không được thể hiện trong định nghĩa lớp.
        - Do đó nếu bạn khai báo một lớp Car như sau:
            public class Car {
                public String name;
                public int year;
                public float weight;
            }
        - Thì sau đó bạn hoàn toàn có thể tạo mới đối tượng của lớp Car: Car myCar = new Car(). Hiển nhiên bạn không
          thấy phương thức khởi tạo Car() nào trong định nghĩa trên. Đó là tác dụng của default constructor.
        - Khi bạn sửa đổi lớp trên thành như sau:
            public class Car {
                public String name;
                public int year;
                public float weight;

                // phương thức khởi tạo 1 tham số
                public Car(String name) {
                    this.name = name;
                }
                // phương thức khởi tạo 3 tham số
                public Car(String name, int year, float weight) {
                    this.name = name;
                    this.year = year;
                    this.weight = weight;
                }
            }
        - Sau đó bạn thực hiện tạo đối tượng mới của Car:
            Car car = new Car(); // lỗi
            Car car = new Car("Testla Model W"); // ok
            Car car = new Car("Mazda CX8", 2025, 2050); // ok
        - Bạn nhận ra là không thể tạo đối tượng với default constructor nữa. Tại sao? Lí do là vì khi bạn nạp chồng
          các constructor với bộ n > 1 tham số, default constructor sẽ bị vô hiệu hóa. Do đó muốn sử dụng
          default constructor hay constructor không có tham số bạn phải định nghĩa tường minh nó trong lớp của bạn.
        - Ta sửa lại lớp Car như sau:
            public class Car {
                public String name;
                public int year;
                public float weight;
                // phương thức khởi tạo không tham số
                public Car() {
                    // không cần làm gì cả
                }
                // phương thức khởi tạo 1 tham số
                public Car(String name) {
                    this.name = name;
                }
                // phương thức khởi tạo 3 tham số
                public Car(String name, int year, float weight) {
                    this.name = name;
                    this.year = year;
                    this.weight = weight;
                }
            }
        - Lúc này bạn có thể tạo đối tượng của lớp Car tùy thích với cả 3 constructor đã khai báo.
        - Nhấn mạnh rằng TA CHỈ TẠO ĐƯỢC ĐỐI TƯỢNG CỦA LỚP VỚI CÁC CONSTRUCTOR ĐÃ ĐƯỢC KHAI BÁO/ĐỊNH NGHĨA TƯỜNG MINH
          TRONG LỚP đang muốn sử dụng:
                Car car = new Car(); // ok vì đã khai báo constructor Car() không tham số
                Car car = new Car("Testla Model Y"); // ok vì đã khai báo constructor Car(String name)
                Car car = new Car("Mazda CX8", 2025, 2050); // ok vì đã khai báo constructor 3 tham số
                // Car(String name, int year, float weight)
    4. Các đặc trưng của phương thức khởi tạo
        - Phần access của phương thức khởi tạo chỉ có thể chứa tối đa 01 keyword. Nếu có sự xuất hiện từ 2 keyword trở lên
          kể cả việc lặp lại keyword trước đó bạn sẽ bị báo lỗi.
        - Phương thức khởi tạo có thể được nạp chồng. Không được phép tồn tại hai phương thức khởi tạo cùng có bộ tham số y hệt nhau.
        - Phương thức khởi tạo không có kiểu trả về.
        - Không thực hiện gọi đệ quy tới chính nó.
        - Phương thức khởi tạo không thể là final, abstract, static, native, strictfp hay synchronized.
        - Nếu một lớp không được khai báo phương thức khởi tạo tường minh nào. Java sẽ tự động tạo cho lớp đó một phương
          thức khởi tạo ngầm định.
        - Phương thức khởi tạo mặc định có cùng access modifier, cùng tên với tên lớp, không chứa tham số, không có thực
          thi nào cả.
        - Nếu có một phương thức khởi tạo có tham số được định nghĩa tường minh thì phương thức khởi tạo mặc định sẽ bị ẩn đi.
          Muốn sử dụng ta phải khai báo tường minh phương thức này ra.
        - Các thuộc tính của lớp nếu không được khởi tạo thì nó sẽ nhận giá trị mặc định của kiểu mà nó đang mang. Các kiểu
          số giá trị mặc định là 0, kiểu boolean là false, kiểu tham chiếu là null.
    5. Sử dụng keyword this
        - Trong ví dụ trên ta đã thấy sự xuất hiện của từ khóa this. Về bản chất this chính là đối tượng của lớp, nó
          đang thực hiện các hành động được đề cập tại thời điểm hiện tại.
        - Và sau đây là các trường hợp sử dụng phổ biến của this:
            + Sử dụng this để chỉ rõ thuộc tính của lớp nếu như tham số của phương thức trùng với tên của thuộc tính.
              Để đơn giản hóa vấn đề.
            + Sử dụng this để gọi tới phương thức khởi tạo khác trong cùng một lớp. Mục đích tái sử dụng lại code đã có.
            + Sử dụng this để đại diện cho đối tượng hiện thời của lớp.
        - Lưu ý this không áp dụng cho các biến cục bộ, các thành phần static.
        - Với lời gọi tới phương thức khởi tạo khác qua this thì lời gọi này phải là lệnh đầu tiên trong phương thức khởi tạo.
    6. Cấm một lớp tạo đối tượng
        - Để ngăn chặn việc tạo đối tượng từ bên ngoài lớp ta sử dụng private package access hoặc private constructor.
        - private package constructor sẽ ngăn cản việc tạo đối tượng từ bên ngoài một gói(package).
        - Còn private constructor sẽ ngăn cản việc tạo đối tượng từ bên ngoài lớp.
        - Điều này rất hữu dụng nếu bạn muốn quản lý việc tạo đối tượng của lớp.
        - Ví dụ khi kết nối ứng dụng đến cơ sở dữ liệu. Bạn muốn kiểm soát đối tượng quản lý việc truy xuất DB và giới
          hạn nó về 1 đối tượng duy nhất. Lúc này giải pháp của bạn là sử dụng singleton parttern. Nguyên lý của phương
          pháp này là tạo ra một đối tượng duy nhất của lớp để dùng chung và constructor của lớp sẽ để cấp độ truy cập
          là private.
 */

public class Lesson62 {
    public static void main(String[] args) {
        // tạo lập các đối tượng của lớp Car
        Car car = new Car();
        Car car1 = new Car("Vios", "Toyota");
        Car car2 = new Car("Vios", "G", "Toyota", 2030);
        Car car3 = new Car("toy-vios", "Vios", "G", "Toyota", 2030, 1050.0f);
    }
}
