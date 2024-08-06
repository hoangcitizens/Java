package Lesson.Ls_Chapter3_Loop;// Bài 3.1: Cấu trúc ra quyết định if-else
/*
    1. Mục đích sử dụng
    - Cấu trúc if hoặc if-else hoặc if-else-if dùng để đưa ra quyết định có thực hiện chương trình hay không.
    - Nó còn có tên là cấu trúc rẽ nhánh, câu lệnh ra quyết định.
    - Ví dụ vấn đề: nếu điểm trung bình >= 3.20 thì sinh viên A sẽ được học bổng. Như vậy ta sẽ có một điều kiện là điểm
      trung bình >= 3.20 để xét xem sinh viên A có đạt học bổng không. Nếu có thì ta quyết định trao học bổng cho
      sinh viên A. Ngược lại sinh viên A sẽ không được học bổng. Làm sao để chương trình biết mà thực hiện thay chúng ta?
    - Khi nào thì sử dụng cấu trúc nào?
        + Nếu muốn chương trình chỉ thực hiện khi điều kiện thỏa mãn. Ta sử dụng cấu trúc if.
        + Nếu muốn khi điều kiện thỏa, thực hiện phương án A. Nếu không, thực hiện phương án B, ta dùng cấu trúc if-else.
        + Nếu có nhiều hơn 2 phương án để thực hiện và các phương án mang tính loại trừ nhau, dùng if-else-if.
    - Loại trừ nhau có nghĩa là các điều kiện có sự ràng buộc với nhau, không là cái này thì có thể là cái kia.
        + Ví dụ: phân loại điểm chữ chỉ có thể là A, B, C, D, F. Xét từ cao xuống thấp, nếu không phải điểm A thì
          chỉ có thể là B trở xuống, nếu không phải A, B thì chỉ có thể là C trở xuống. Nếu không phải là A, B, C thì
          chỉ có thể là D trở xuống… Vậy với một mức điểm ta có nhiều khả năng và chỉ 1 trong số các khả năng là chính xác.
        + Ví dụ 2: tiền giấy hiện hành chỉ có các mệnh giá 1k, 2k, 5k, 10k, 20k, 50k, 100k, 200k, 500k.
          Vậy nếu người khác đưa cho ta một tờ tiền thật, tờ tiền đó chỉ có thể là một trong các mệnh giá đã liệt
          kê ở trên. Khi xét từ cao xuống thấp: nếu ko phải 500k thì chỉ có thể là 200k hoặc nhỏ hơn, nếu ko phải
          200k thì chỉ có thể là 100k hoặc nhỏ hơn.
        + Như vậy ta thấy có mối liên hệ ràng buộc giữa các điều kiện và điều kiện đứng trước loại trừ khỏi các
          điều kiện đứng sau.
    2. Cú pháp tổng quát if
        if (condition) {
            // các câu lệnh cần thực hiện
        }
    Trong đó:
        + Luôn bắt đầu cấu trúc này với từ khóa if
        + Theo sau if là cặp ngoặc tròn ( ) và trong đó chứa điều kiện
        + condiion là các điều kiện cần thỏa mãn để phần thân if được thực hiện. Điều kiện của if luôn là giá trị hoặc
          biểu thức có tính đúng hoặc sai.
        + Phần thân if bao bởi cặp ngoặc { } chứa các câu lệnh cần thực hiện nếu điều kiện thỏa mãn
        + Cấu trúc if kết thúc bởi dấu }
    3. Cú pháp if-else
        if(condition) {
            // làm gì đó nếu điều kiện thỏa mãn
        } else {
            // làm gì đó nếu điều kiện không thỏa
        }
        Trong đó các thành phần giống với if và thêm:
            + else là một từ khóa đi liền sau dấu ngoặc } của if trước nó.
            + Mỗi if chỉ có nhiều nhất 1 else.
            + Mỗi else chỉ thuộc về duy nhất 1 if liền trước nó.
            + Nếu condition không xảy ra thì nội dung khối else sẽ được thực hiện
    4. Cấu trúc if-else-if
        if(điều_kiện1) {
        // làm gì đó nếu điều_kiện1 thỏa
        } else if(điều_kiện2) {
            // làm gì đó nếu điều_kiện2 thỏa
        } else if(điều_kiện3) {
            // làm gì đó nếu điều_kiện3 thỏa
        } else {
            // làm gì đó nếu tất cả điều kiện không thỏa
        }
        Trong đó giống cấu trúc if-else và thêm:
            + Cấu trúc else if nối liền sau cấu trúc if trước đó. Nếu không phải là else if mà chỉ là if thì nó trở về
              cấu trúc if đơn đầu tiên ở trên.
            + Cấu trúc else cuối cùng là tùy chọn, tức có thể có hoặc không tùy bài toán.
            + Nếu điều_kiện1 thỏa, nội dung thân if đầu tiên được thực hiện.
            + Nếu không, biểu thức điều_kiện2 sẽ được đánh giá. Nếu thỏa(tức true) thì khối if thứ hai sẽ được thực hiện.
            + Nếu không, biểu thức điều_kiện3 sẽ được đánh giá. Nếu thỏa, khối if thứ 3 sẽ được thực hiện.
            + Tương tự đánh giá được thực hiện cho biểu thức if thứ n.
            + Sau cùng, nếu mọi điều kiện trên không thỏa. Khối code của vế else ở cuối(nếu có) sẽ được thực hiện.
 */

import java.util.Scanner;

public class Lesson31_IfElse {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Nhập số nguyên n: ");
        var number = scanner.nextInt();

        // kiểm tra xem number có phải số chẵn không
        if (number % 2 == 0) {
            System.out.println(STR."\{number} là số chẵn.");
        }
        System.out.println("Nhập số nguyên k: ");
        var k = scanner.nextInt();
        // số chia hết cho k
        if (number % k == 0) {
            System.out.println(STR."\{number} chia hết cho \{k}.");
        } else {
            System.out.println(STR."\{number} KHÔNG chia hết cho \{k}.");
        }

    }

}
