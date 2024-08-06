package Lesson.Ls_Chapter3_Loop;
/*
    Bài 3.7. Vòng lặp lồng nhau
    1. Mục đích sử dụng
        - Vòng lặp lồng nhau là vòng lặp chứa trong vòng lặp khác. Các vòng lặp không nhất thiết phải cùng kiểu.
        - Phổ biến nhất ta thấy là for lồng for.
        - Mục đích chủ yếu của vòng lặp lồng nhau là để thực hiện các thao tác với mảng, các thao tác tìm kiếm, sắp xếp, thao tác trong hệ tọa độ n chiều…
        - Khuyến nghị không nên lồng quá nhiều vòng lặp vào nhau vì sẽ làm tăng độ phức tạp, làm cho chương trình chạy chậm, giảm hiệu năng và trải nghiệm người dùng.
        - Chi tiết về độ phức tạp thuật toán sẽ trình bày cụ thể trong Khóa học cấu trúc dữ liệu và giải thuật. Còn bây giờ các bạn hiểu đơn giản là:
        - Nếu một vòng lặp đơn thì độ phức tạ thuật toán là O(n)
        - Nếu hai vòng lặp lồng nhau thì độ phức tạp sẽ là O(n^2)
        - Ba vòng lặp lồng nhau liên tiếp thì độ phức tạp là O(n^3)
    2. Cú pháp tổng quát
        Cú pháp vòng lặp lồng nhau tổng quát như sau:
            Vòng lặp cấp 1 {
                // nội dung vòng lặp cấp 1
                Vòng lặp cấp 2 {
                    // nội dung vòng lặp cấp 2
                    Vòng lặp cấp 3 {
                        // nội dung vòng lặp cấp 3
                    }
                }
            }
    Trong đó:
        - Mỗi vòng lặp được đánh dấu lần lượt là vòng lặp cấp I, ví dụ cấp 1, cấp 2.
        - Các vòng lặp lồng nhau không nhất thiết phải cùng loại.
        - Ngoài việc chứa vòng lặp khác thì thân các vòng lặp còn có thể chứa các câu lệnh bình thường khác.
        - Các cấu trúc ra quyết định cũng có thể lồng nhau.
 */


import java.util.Scanner;

public class Lesson37_NestedLoops {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        // Ví dụ 1: Viết chương trình vẽ hình chữ nhật đặc bằng các dấu * kích thước m x n ra màn hình.
//        System.out.println("Nhập chiều cao và chiều rộng của hình chữ nhật: ");
//        int m = input.nextInt();
//        int n = input.nextInt();
//        // tiến hành vẽ
//        for (int i = 1; i <= m; i++) {
//            for (int j = 1; j <= n; j++) {
//                System.out.print(" * "); // in ra n dấu *
//            }
//            System.out.println(); // in xuống dòng m lần
//        }
        // Ví dụ 2: Viết chương trình vẽ hình chữ nhật rỗng bằng các dấu * kích thước m x n ra màn hình.
//        System.out.println("Nhập chiều cao và chiều rộng của hình chữ nhật: ");
//        int m = input.nextInt();
//        int n = input.nextInt();
//        // tiến hành vẽ
//        for (int i = 1; i <= m; i++) {
//            for (int j = 1; j <= n; j++) {
//                // chú ý bỏ ln ở println đi.
//                if(i == 1 || j == 1 || i == m || j == n) {
//                    System.out.print(" * "); // in ra n dấu *
//                } else {
//                    System.out.print("   "); // in ra 3 dấu cách
//                }
//            }
//            System.out.println(); // in xuống dòng m lần
//        }
        // Ví dụ 3: Vẽ tam giác vuông góc trái dưới chiều cao h ra màn hình.
//        System.out.println("Nhập chiều cao của tam giác: ");
//        int h = input.nextInt();
//        // tiến hành vẽ
//        for (int i = 1; i <= h; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print(" * "); // in ra n dấu *
//            }
//            System.out.println(); // in xuống dòng h lần
//        }
        // Ví dụ 4: vẽ hình chữ nhật có lõi là các dấu – và viền tăng theo chiều kim đồng hồ từ giá trị x có 2 chữ số nào đó ví dụ
        System.out.println("Giá trị bắt đầu: ");
        int start = input.nextInt();
        System.out.println("Chiều cao: ");
        int width = input.nextInt();
        System.out.println("Chiều rộng: ");
        int height = input.nextInt();
        int counter1 = start;
        int counter2 = start + width;
        int counter3 = start + 2 * width + height - 3;
        int counter4 = start + 2 * (width + height) - 5;
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= width; j++) {
                if (i == 1) {
                    System.out.printf("%3d", counter1++);
                } else if (j == width) {
                    System.out.printf("%3d", counter2++);
                } else if (i == height) {
                    System.out.printf("%3d", counter3--);
                } else if (j == 1) {
                    System.out.printf("%3d", counter4--);
                } else {
                    System.out.printf("%3s", "-");
                }
            }
            System.out.println();
        }
    }
}
