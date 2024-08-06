package Lesson.Ls_Chapter3_Loop;// Bài 3.6: Vòng lặp while, do-while
/*
    1. Mục đích sử dụng
    - Mục đích chung của vòng lặp là để thực hiện một nhóm các câu lệnh hay chức năng có tính chất lặp đi lặp lại.
    - Vòng lặp while và do-while thuộc nhóm vòng lặp không có biến kiểm soát lặp. Do đó việc quyết định xem có lặp tiếp
      hay không sẽ dựa vào kết quả có được trong từng lần lặp.
    - Vòng lặp while và do-while sử dụng khi cần lặp mà không biết chính xác số lần lặp.
    - Vòng lặp do-while đặc biệt được sử dụng khi muốn rằng phần thân vòng lặp luôn đảm bảo được thực hiện ít nhất một
      lần cho dù điều kiện lặp có xảy ra hay không.
    2. Cú pháp tổng quát
    - Sau đây là cú pháp tổng quát của vòng lặp while:
    while(điều_kiện) {
        // nội dung cần lặp
    }
    Trong đó:
        - Cấu trúc lặp bắt đầu với keyword while
        - Theo sau đó là cặp ngoặc (), phía trong () là điều kiện lặp
        - Phần điều_kiện là điều kiện lặp. Có thể gồm 1 hoặc nhiều điều kiện kết hợp lại. Điều kiện lặp chỉ có thể đúng
          hoặc sai.
        - Phần thân vòng lặp nằm trong cặp ngoặc {} và sẽ được thực hiện khi điều kiện lặp là true.
        - Nếu điều kiện lặp luôn đúng, vòng lặp sẽ lặp vô hạn.
        - Việc quyết định có lặp tiếp hay không phụ thuộc kết quả được kiểm soát ở trong thân vòng lặp.

    - Sau đây là cú pháp tổng quát của vòng lặp do-while:
    do {
    // nội dung cần lặp
    } while(điều_kiện);
    Trong đó:
        - Vòng lặp bắt đầu với keyword do.
        - Tiếp đó là cặp ngoặc {} chứa thân vòng lặp bên trong.
        - Nội dung thân vòng lặp chứa các câu lệnh cần lặp và luôn được đảm bảo thực hiện ít nhất 1 lần.
        - Sau khi kết thúc thân vòng lặp sẽ đến phần while(điều_kiện);
        - Điều kiện lặp có thể là điều kiện đơn hoặc điều kiện kết hợp và phải có tính đúng sai.
        - Nếu điều kiện lặp true, thân vòng lặp sẽ được thực hiện lặp lại.
        - Kết thúc cấu trúc lặp do-while là dấu chấm phẩy ;
        - Nếu điều kiện lặp luôn đúng, vòng lặp sẽ lặp vô hạn.
 */

import java.util.Scanner;

public class Lesson36_while_dowhile {
    public static void main(String[] args) {
        /* Ví dụ 1: Minh họa sử dụng vòng lặp while kiểm tra n có phải số đẹp không. Số đẹp là số mà đọc ngược
                    đọc xuôi vẫn cho cùng kết quả. Ví dụ: 123321. */
        Scanner scanner = new Scanner(System.in);
//        System.out.print("Nhập vào số nguyên dương n = ");
//        var n = scanner.nextInt();
//        var tmp = n; //  // lưu giá trị của n ra biến khác để tránh làm mất giá trị gốc
//        var rev = 0; // lưu giá trị đảo của
//        while (tmp > 0) {
//            rev = rev * 10 + tmp % 10;
//            tmp = tmp / 10;
//        }
//        if (n == rev)
//            System.out.println(STR."\{n} là số đẹp.");
//        else
//            System.out.println(STR."\{n} không là số đẹp.");
        // Ví dụ 2: minh họa sử dụng vòng lặp do-while để thực hiện menu lựa chọn các phép tính toán cộng trừ nhân chia.
        System.out.println("Nhập vào hai số thực a, b: ");
        var a = scanner.nextDouble();
        var b = scanner.nextDouble();
        var choice = 0; // khởi tạo biến lựa chọn
        do {
            System.out.println("======== MENU ========");
            System.out.println("1. Cộng hai số");
            System.out.println("2. Trừ hai số");
            System.out.println("3. Nhân hai số");
            System.out.println("4. Chia hai số");
            System.out.println("0. Thoát chương trình");
            System.out.println("Xin mời chọn: ");
            choice = scanner.nextInt(); // nhập lựa chọn
            // tiến hành đánh giá và thực hiện chương trình
            switch (choice) {
                case 0:
                    System.out.println("Xin chào và hẹn gặp lại!");
                    break;
                case 1: // nếu giá trị của choice = 1
                    var sum = a + b; // tính tổng hai số
                    System.out.println(STR."\{a} + \{b} = \{sum}");
                    break;
                case 2: // nếu giá trị của choice = 2
                    var dif = a - b;
                    System.out.println(STR."\{a} - \{b} = \{dif}");
                    break;
                case 3: // nếu giá trị của choice = 3
                    var prod = a * b;
                    System.out.println(STR."\{a} * \{b} = \{prod}");
                    break;
                case 4: // nếu giá trị của choice = 4
                    if (b != 0) {
                        var quot = a / b;
                        System.out.println(STR."\{a} / \{b} = \{quot}");
                    } else {
                        System.out.println("Mẫu số = 0. Không thực hiện được phép chia.");
                    }
                    break;
                default:
                    System.out.println("Sai chức năng. Vui lòng chọn lại.");
                    break;
            }
        } while (choice != 0); // đk lặp là choice != 0
    }
}
