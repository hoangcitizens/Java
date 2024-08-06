package Lesson.Ls_Chapter2;// Bài 2.7: Kiểu tự suy luận
 /*
    Khái niệm
        - Kiểu tự suy luận là kiểu dữ liệu của một biến được chương trình Java tự động xác định dựa trên
          giá trị mà ta gán cho biến.
        - Kiểu tự suy luận trong Java được khai báo với keyword var.
     Cú pháp tổng quát của khai báo: var name = value;
        Trong đó:
            - var là keyword
            - Name là tên biến, đặt theo quy tắc đặt tên biến
            - Trong khai báo bắt buộc phải có thao tác khởi tạo giá trị
            - Value là giá trị gán cho biến. Chương trình sẽ dựa vào giá trị này để xác định kiểu cho biến.
        Các giới hạn:
            - Chỉ khai báo duy nhất 1 biến với 1 keyword var.
            - Bắt buộc phải khởi tạo giá trị cho biến ngay sau khi ta khai báo biến với keyword var.
            - Giá trị khởi tạo bắt buộc phải khác null. Nếu bạn gán giá trị null, chương trình sẽ báo lỗi
              vì giá trị null không đủ thông tin để xác định kiểu của biến.
            - Không được chứa tham chiếu đến chính nó trong khi khởi tạo giá trị.
            - Không được khai báo biến kiểu mảng với var.
            - Không được gán cú pháp khởi tạo mảng cho biến của var.
            - Không sử dụng var như là kiểu trả về của phương thức(học sau).
            - Không sử dụng var làm kiểu của tham số(học sau).
            - Sau khi khai báo biến với var thì kiểu của biến không thể thay đổi.
              Nhưng giá trị của biến có thể thay đổi.
*/

public class Lesson27_Var {
    public static void main(String[] args) {
//     var scanner = new Scanner(System.in);
//     var age = scanner.nextInt();
//     var fullName = scanner.nextLine();
//     var pi = scanner.nextDouble();
//     final var MAX_AGE = 125;
//     final var MONDAY = "Monday";
     /*
        những vd lỗi
        var arr[] = new int[10]; // error: khai báo kiểu mảng với var
        var y = (y = 99); // error: chứa cú pháp tự tham chiếu trong ()
        var something = {1, 2, 3}; // không hợp lệ vì chứa cú pháp khởi tạo mảng
        var b = null; // không thể xác định được kiểu dữ liệu từ giá trị null
      */

    /*
    - Để kiểm tra kiểu của một biến sau khi tạo biến với var, ta dùng cú pháp:
        System.out.println(((Object)age).getClass().getName());
    - Trong đó name là tên biến cần kiểm tra.
    - Kết quả sẽ cho chúng ta tên lớp bao của kiểu tương ứng nếu kiểu của name là nguyên thủy.
    - Và tên kiểu của biến name nếu kiểu nó không phải kiểu nguyên thủy.
    */
    }
    /*
        - Ta thường sử dụng keyword var để khai báo các biến cục bộ.
        - Biến cục bộ là biến khai báo trong một khối code ví dụ trong một phương thức, vòng lặp,
          cấu trúc ra quyết định, biểu thức lambda.
        - Có thể dùng để thay thế các kiểu tường minh trong cú pháp khai báo biến mà có khởi tạo.
        - Khi kiểu dữ liệu của biến không được biết trước.
        - Ví dụ sử dụng trong vòng lặp:
     */
    private static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        var bound = (int) Math.sqrt(number);
        for (var i = 2; i < bound; i++) {
            if (number % i == 0)
                return false;
        }
        return true;
    }
    private static long sumPrimeNumbers(int[] numbers) {
        var sum = 0L; // kiểu long
        for (var number : numbers) {
            if (isPrime(number)) {
                sum += number;
            }
        }
        return sum;
    }
}
