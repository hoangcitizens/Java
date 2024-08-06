package Lesson.Ls_Chapter3_Loop;// Bài 3.3: Toán tử ba ngôi
/*
    1. Cấu trúc tổng quát
    - Toán tử ba ngôi, hay còn có tên là conditional operator, ternary operator.
    - Sau đây là cấu trúc tổng quát của toán tử ba ngôi:
        variable = (expression) ? value1 : value2;
    - Trong đó:
        + variable là biến nào đó cần gán giá trị.
        + expression là một biểu thức nào đó có tính đúng sai. Từ việc xét tính chất đúng sai của biểu thức này sẽ quyết
          định giá trị được gán cho biến.
        + Nếu giá trị trong expression là true thì value1 sẽ được gán cho biến variable.
        + Ngược lại, value2 sẽ được gán cho biến variable.
    - Khi sử dụng cú pháp trên để in ra màn hình hoặc làm giá trị trả về từ một phương thức, thì ta bỏ cụm cú pháp từ
      dấu bằng trở về trước.
     2. Mục đích sử dụng
     - Mục đích sử dụng của toán tử ba ngôi đó là làm cho câu lệnh điều kiện ngắn gọn lại trên 1 dòng.
     - Thường áp dụng khi các điều kiện đơn giản hoặc làm giá trị trả về của hàm tác vụ đơn giản.
     - Có thể sử dụng thay thế cho cấu trúc if-else.
     - Tuy nhiên việc sử dụng cấu trúc if-else hoặc toán tử ba ngôi là do bạn quyết định. Không bắt buộc.
 */


import java.text.DecimalFormat;
import java.util.Scanner;

public class Lesson33_TernaryOperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        // Ví dụ 1
//        int n = 200;
//        var result1 = "";
//        if(n % 2 == 0) {
//            result1 = "n là số chẵn";
//        } else {
//            result1 = "n là số lẻ";
//        }
//        System.out.println(result1);
//        int m = 200;
//        var result2 = (m % 2 == 0) ? "n là số chẵn" : "n là số lẻ";
//        System.out.println(result2);

        // Ví dụ 3: kiểm tra số đặc biệt. Số đặc biệt là số nguyên chia hết cho 2 hoặc 3 hoặc 5.
//        var n = scanner.nextInt();
//        var result3 = isSpecialNumber(n);
//        System.out.println(STR."\{n} is special number? \{result3}");

        // Ví dụ 4: xét mức học bổng nhận được theo điểm gpa hệ 4.
        //Nếu gpa >= 3.6 thì được học bổng loại khá, trị giá 10 củ.
        //Nếu gpa >= 3.2 thì được học bổng loại giỏi trị giá 5 củ.
        //Nếu gpa >= 3.0 thì được học bổng trị giá 3.5 củ.
        System.out.print("Your gpa: ");
        var gpa = scanner.nextFloat();
        var scholarship = (gpa < 3.0f || gpa > 4.0f) ? 0
                : (gpa >= 3.6f) ? 10_000_000
                : (gpa >= 3.2f) ? 5_000_000
                : 3_500_000;
        var numberFormat = new DecimalFormat("#,###");
        var result4 = numberFormat.format(scholarship);
        System.out.println(STR."Scholarship amount = \{result4}đ");
    }

    // Ví dụ 3
//    private static boolean isSpecialNumber(int n) {
////        if(n % 2 == 0){
////            return true;
////        } else if(n % 3 == 0) {
////            return true;
////        } else if(n % 5 == 0) {
////            return true;
////        }
////        return false;
//        // toán tử 3 ngôi
//        return (n % 2 == 0) ? true
//                : (n % 3 == 0) ? true
//                : n % 5 == 0 ? true : false;
//    }
    // Ví dụ 2: Kiểm tra và trả về giá trị n chẵn hay lẻ
//    public static boolean isEven1(int n) {
//        return (n % 2 == 0) ? true : false;
//    }
//    // Phương thức isEven1 <=> isEven2
//    public static boolean isEven2(int n) {
//        return (n % 2 == 0);
//    }
}
