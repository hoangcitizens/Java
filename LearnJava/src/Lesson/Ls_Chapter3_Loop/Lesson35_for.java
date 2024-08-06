package Lesson.Ls_Chapter3_Loop;// Bài 3.5: Vòng lặp for
/*
    1. Mục đích sử dụng
    - Cấu trúc lặp hay vòng lặp được sử dụng để lặp lại một đoạn chương trình nào đó. Hãy tưởng tượng, bạn muốn thực
      hiện 1 chức năng nào đó 99 lần. Bạn sẽ làm như nào? Copy đoạn code của chức năng đó và pate lại 99 lần?
      Có vẻ khả thi. Nhưng điều gì xảy ra nếu bạn phải copy pate 1000 lần, 10000 lần? Quả là tốn thời gian và tẻ nhạt
      đúng không nào. Rất may mắn, ngôn ngữ Java đã có sẵn cấu trúc lặp hỗ trợ ta. Bạn chỉ cần viết 1 lần chạy tùy ý.
    - Có 2 loại vòng lặp:
        + Vòng lặp có biến kiểm soát lặp: for
        + Vòng lặp không có biến kiểm soát lặp: while, do-while
    - Vòng lặp có biến kiểm soát lặp thường được sử dụng trong trường hợp biết trước số lần lặp.
    - Vòng lặp không có biến kiểm soát lặp thường được sử dụng khi không biết trước số lần lặp. Để kiểm soát vòng
      lặp loại này ta dựa vào giá trị tính toán được/kết quả nhận được trong quá trình thực hiện lặp.

    2. Cú pháp tổng quát
    - Sau đây là cú pháp tổng quát của vòng lặp for:
    for(khởi_tạo; điều_kiện; bước_nhảy) {
        // nội dung cần lặp
    }
    - Trong đó:
        + Vòng lặp for bắt đầu với keyword for.
        + Theo sau for là cặp ngoặc tròn ( ).
        + Trong ngoặc tròn gồm 3 thành phần phân tách nhau bằng dấu ; dùng để kiểm soát vòng lặp.
        + Phần khởi_tạo được thực hiện trước nhất và duy nhất 1 lần ở lần lặp đầu. Nhiệm vụ của phần này là khởi tạo
          biến kiểm soát lặp. Biến kiểm soát lặp thường đặt là i, j, k.
        + Phần điều_kiện là nơi kiểm tra xem điều kiện lặp có thỏa mãn(true) hay không. Nếu điều kiện lặp là true, thân
          vòng lặp sẽ được thực hiện. Ngược lại vòng lặp kết thúc.
        + Phần bước_nhảy là nơi thay đổi giá trị biến kiểm soát lặp. Việc thay đổi có thể là tăng hoặc giảm tùy ngữ cảnh
          cụ thể. Thường thì phần bước nhảy sẽ thay đổi theo hướng làm cho biến kiểm soát lặp tiến đến giá trị mà tại đó
          điều kiện lặp không còn thỏa mãn. Như vậy vòng lặp sẽ tiến đến điểm kết thúc.
        + Phần thân vòng lặp trong cặp { } chứa các câu lệnh cần thực hiện lặp.
    - Nếu điều kiện lặp luôn đúng, vòng lặp sẽ lặp vô hạn. Do đó khi sử dụng vòng lặp cần hết sức chú ý.
    - Nguyên nhân dẫn đến lặp vô hạn có thể là do giá trị ở biểu thức điều kiện luôn đúng. Hoặc phần bước nhảy không
      làm thay đổi biến kiểm soát lặp theo hướng tiến đến điểm kết thúc vòng lặp.
    - Thứ tự thực hiện vòng lặp được mô tả trong phần kế tiếp.

 */


import java.util.Scanner;

public class Lesson35_for {
    public static void main(String[] args) {
    /* Ví dụ 1: Đếm số chữ cái trong một chuỗi kí tự nhập vào từ keyboard. chữ cái là các kí tự a-z và A-Z.
                Không tính khoảng trắng, kí tự đặc biệt. */
     var scanner = new Scanner(System.in);
//        System.out.print("Nhập vào chuỗi kí tự: ");
//        var str = scanner.nextLine();
//        // viết thường toàn bộ chuỗi str
//        str = str.toLowerCase();
//        var count = 0; // đếm số kí tữ chữ cái
//        for (int i = 0; i < str.length(); i++) {
//            if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
//                count++;
//            }
//        }
//        System.out.println("Chuỗi \"" + str + "\"");
//        System.out.println("Số chữ cái: " + count);
        // Ví dụ 2: nhập một giá trị nguyên dương n. Tính tổng 1 + 1/2 + 1/3 + … + 1/n.
        System.out.print("Nhập vào số nguyên dương n: ");
        var n = scanner.nextInt(); // đọc vào số n
        var sum = 0.0; // khởi tạo biến tổng
        // thực hiện việc cộng tổng
        for (int i = 1; i <= n; i++) {
            sum += 1.0/i; // nhớ ép kiểu sang double
        }
        // hiện kết quả:
        System.out.printf("Tổng sum = %10.2f", sum);
    }
}
