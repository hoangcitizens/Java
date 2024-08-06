package Lesson.Ls_Chapter5_Arrays.Ls56_thamSoBienThien;

/*
    1. Giới thiệu
        - Tham số biến thiên varagrs được hỗ trợ từ phiên bản Java 5, cung cấp một cách ngắn gọn cho phép một
          phương thức nhận số lượng tham số tùy ý của cùng một kiểu dữ liệu.
        - Gọi là tham số biến thiên vì số lượng tham số truyền vào có thể tùy ý thay đổi.
        - Nội dung này ta sẽ tìm hiểu cách sử dụng, nguy cơ cũng như cách khắc phục các nguy cơ có thể gặp phải khi
          sử dụng tham số biến thiên.
    2. Tiền truyện
        - Trước Java 5, khi ta cần truyền số lượng đối số tùy ý ta phải để các đối số đó trong một mảng rồi truyền nó
          vào phương thức hoặc ta phải nạp chồng nhiều lần một phương thức cần sử dụng.
    3. Sử dụng tham số biến thiên
        - Để trả lời câu hỏi ở cuối phần trên, ta sử dụng một cú pháp mới trong Java gọi là tham số biến thiên.
        - Với cú pháp này ta có thể truyền vào số lượng các đối số tùy ý của cùng kiểu dữ liệu.
        - Về bản chất trong nội tại của nó sử dụng một mảng để lưu các tham số nhận được.
        - Ta biểu diễn nó bởi dấu ba chấm sau kiểu dữ liệu. Tên tham số biến thiên đặt theo quy tắc đặt tên cho biến mảng.
    4. Quy tắc sử dụng tham số biến thiên
        - Sau đây là một số quy tắc cần tuân thủ khi sử dụng tham số biến thiên:
            + Mỗi phương thức chỉ được phép có duy nhất 1 tham số biến thiên.
            + Nếu phương thức có nhiều tham số, trong đó bao gồm cả tham số thông thường và tham số biến thiên thì
              thằng tham số biến thiên phải là tham số cuối cùng trong danh sách tham số của phương thức.
    5. Nguy cơ khi sử dụng tham số biến thiên
        - Khi sử dụng tham số biến thiên với kiểu generic ta có thể sẽ gặp phải vấn đề gọi là heap polution. Nó xảy ra
          khi một biến của kiểu tham số hóa trỏ tới một đối tượng không cùng kiểu tham số hóa.
        - Thông thường, trình biên dịch sẽ phát hiện và cảnh báo vấn đề này cho ta.
        - Để tránh bị vấn đề heap pollution, ta có 2 cách:
            + Một là không lưu bất kì thứ gì khác trong mảng ngầm định(tham số biến thiên), ở ví dụ trên ta lưu một list
              giá trị double và một list giá trị integer vào strings thông qua biến objects.
            + Hai là không cho tham chiếu tới tham số biến thiên truyền ra ngoài phương thức.
 */

public class Lesson56 {
    public static void main(String[] args) {
        /* Cách 1: dùng một mảng chứa giá trị các đối số cần truyền vào phương thức, sau đó truyền mảng vào làm đối số
                   trong lời gọi phương thức. */
        var numbers = new int[]{1, 2, 5, 6, 9, 8, 7, 4, 1, 2, 0, 3, 6};
        // truyền mảng vào làm đối số trong lời gọi phương thức
        var sum = add1(numbers);
        System.out.println(STR."Tổng các phần tử trong mảng: \{sum}");

        /* Cách 2: dùng overloading */
        System.out.println(STR."Tổng 1 số: \{add(255)}");
        System.out.println(STR."Tổng 2 số: \{add(255, 354)}");
        System.out.println(STR."Tổng 3 số: \{add(255, 354, 788)}");
        System.out.println(STR."Tổng 4 số: \{add(255, 354, 788, 725)}");
    }

    // phương thức tính tổng các số nguyên, nó nhận vào một mảng các số nguyên
    public static int add1(int[] numbers) {
        var sum = 0;
        for (var item : numbers) {
            sum += item;
        }
        return sum;
    }
    public static int add(int number) {
        return number;
    }
    public static int add(int number1, int number2) {
        return number1 + number2;
    }
    public static int add(int number1, int number2, int number3) {
        return number1 + number2 + number3;
    }
    public static int add(int number1, int number2, int number3, int number4) {
        return number1 + number2 + number3 + number4;
    }
}
