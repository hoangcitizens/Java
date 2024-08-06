package Lesson.Ls_Chapter4_Methods.Ls45_Recursive_DeQuy;

/*
    Bài 4.5: Phương thức đệ quy
    1. Định nghĩa
        - Đệ quy là chủ đề phức tạp sẽ được trình bày cụ thể trong môn học cấu trúc dữ liệu và giải thuật.
          Ở đây ta chỉ xem xét đệ quy ở mức độ cơ bản nhất.
        - Một phương thức đệ quy là phương thức gọi lại chính nó một cách trực tiếp hoặc gián tiếp thông qua
          các phương thức khác
        - Mở rộng ra, một cách giải quyết gọi là đệ quy nếu trong các bước thực hiện để giải quyết vấn đề
          lại chứa chính bản thân nó.
    2. Đặc điểm
        - Đệ quy thường áp dụng với các phương thức. Phương thức đệ quy thông thường chỉ biết cách giải quyết
          vấn đề ở trường hợp cơ bản nhất.
        - Trường hợp này còn có tên gọi là trường hợp cơ sở, điểm dừng.
        - Với các lời gọi trùng với trường hợp cơ sở thì phương thức đệ quy sẽ trả về giá trị của trường
          hợp cơ sở tương ứng.
        - Khi phương thức đệ quy được gọi với trường hợp phức tạp hơn, phương thức đệ quy thường chia vấn đề
          thành hai phần: phần thứ nhất là phần mà phương thức này biết cách giải quyết; phần thứ hai phương thức
          này không biết cách giải quyết.
        - Ở phần thứ hai này vấn đề cần xử lý có vẻ giống hệt vấn đề gốc ban đầu nhưng ở quy mô nhỏ hơn.
          Và để xử lý vấn đề thì phương thức đệ quy thực hiện lời gọi đến chính nó.
        - Hành động gọi lại chính nó được gọi là lời gọi đệ quy, bước đệ quy.
        - Phương thức chứa lời gọi đệ quy(thường đến chính nó) là phương thức đệ quy
        - Khi thực hiện lời gọi đệ quy, chương trình sẽ phải chờ đến khi tất cả các bước đệ quy trong lời gọi
          trả về kết quả thì nó mới có kết quả để trả về cho nơi đã gọi nó.
        - Để đảm bảo phương thức đệ quy có thể kết thúc được, sau mỗi lời gọi đệ quy vấn đề phải có xu hướng
          thu nhỏ lại, tiến dần đến trường hợp cơ sở, điểm dừng.
        - Đệ quy cũng có thể lặp vô hạn nếu vấn đề không nhỏ hơn sau mỗi bước đệ quy.
    3. Ý nghĩa sử dụng
        - Thường dùng phương thức đệ quy giải quyết vấn đề mang tính chất truy hồi.
        - Vấn đề nào đó có thể giải quyết bằng đệ quy thì có thể giải quyết bằng vòng lặp.
        - Cách giải quyết vấn đề bằng đệ quy ngắn gọn, tường minh hơn sử dụng vòng lặp
        - Mỗi cách giải quyết vấn đề luôn có ưu điểm và nhược điểm riêng. Trong đó nhược điểm của đệ quy
          là tốn tài nguyên CPU, bộ nhớ và thời gian thực hiện.
        - Lưu ý luôn đảm bảo vấn đề sẽ trở nên nhỏ hơn sau mỗi lời gọi đệ quy nếu không thì vấn đề sẽ không
          thể giải quyết được bằng đệ quy.
 */

import java.util.Scanner;

public class Lesson45_Recursive {
    public static void main(String[] args) {
        // VD 1: Tính tổng S = 1 + 2 + ... + n;
        var sc = new Scanner(System.in);
        var n = 6;
        System.out.println(STR."S = \{add(n)}");
        // Ví dụ 2: Tính n!
        System.out.println(STR."n! = \{factor(n)}");
        // VD3: Tìm số Fibonaci thứ n
        System.out.println(STR."Fn = \{fibonaci(n)}");
    }

    /**
     * phương thức tính fib thứ n đệ quy
     * @param n
     * @return
     */
    private static long fibonaci(int n) {
        if (n < 2)
            return n;
        else
            return fibonaci(n-1) + fibonaci(n-2);
    }

    public static int add(int n) {
        if (n == 1) // trường hợp cơ sở
            return 1;
        else
            return n + add(n-1);
    }

    /**
     * phương thức tính n! đệ quy
     * @param n
     * @return n!
     */
    public static long factor(int n){
        if (n < 2)
            return 1;
        else // lười gọi đệ quy
            return n * factor(n-1);
    }
}
