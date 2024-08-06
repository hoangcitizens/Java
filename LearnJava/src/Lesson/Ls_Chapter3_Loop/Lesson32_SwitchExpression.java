package Lesson.Ls_Chapter3_Loop;// Bài 3.2: Cấu trúc ra quyết định switch
/*
    1. Mục đích sử dụng
    - Sử dụng cấu trúc switch khi một biểu thức nào đó có nhiều hơn 2 trường hợp cần đánh giá.
      Các biểu thức của cấu trúc này thường là các hằng số, các kiểu nguyên hoặc String.
    - Như vậy:
        + Nếu một biểu thức chỉ có hoặc đúng hoặc sai ta dùng cấu trúc if
        + Nếu một biểu thức cần đối chiếu với nhiều giá trị khác nhau, ta dùng cấu trúc switch
    2. Cú pháp tổng quát Switch Statement
    switch (biểu_thức) {
    case giá_trị1:
        // làm gì đó nếu trường hợp này xảy ra
        break;
    ...
    default:
        // làm gì đó nếu tất cả các case phía trên không xảy ra
    }
    3. Switch Expression
    * Cú pháp
    switch (variable) {
       case value1 -> {
            // làm gì đó nếu trường hợp này xảy ra
            // yield value; trả về giá trị của case này.
       }
       ...
       default -> // làm gì đó nếu trường hợp này xảy ra
    }
    * Về cơ bản thì biểu thức switch giống với câu lệnh switch truyền thống tuy nhiên có một số khác biệt như sau:
        + Ta có thể trả về giá trị từ biểu thức switch còn câu lệnh switch thì KHÔNG.
        + Với các câu lệnh đơn ta viết các lệnh cần thực thi của mỗi case sau dấu mũi tên -> thay vì dấu hai chấm.
        + Với các câu lệnh phức tạp, ta để đoạn code cần thực thi trong khối lệnh bao bởi ngoặc { } sau mũi tên.
        + Để trả về giá trị từ các case trong biểu thức switch ta sử dụng keyword yield.
        + Ta không cần sử dụng break để kết thúc mỗi case của biểu thức switch.
        + Ta có thể đánh giá nhiều giá trị trong mỗi case với biểu thức switch.
        + Nếu giá trị đánh giá là enum, ta không cần tới nhãn default trong biểu thức switch.
        + Nếu giá trị đánh giá không phải enum, ta phải cung cấp nhãn default trong biểu thức switch.
 */

import java.util.Scanner;

import static java.lang.StringTemplate.STR;

public class Lesson32_SwitchExpression {
    public static void main(String[] args) {
        /*
            Ví dụ 1: Một mùa của năm chỉ có thể là xuân, hạ, thu và đông. Yêu cầu nhập vào tên mùa tiếng Anh và đưa
                     ra màn hình tên mùa tương ứng bằng tiếng Việt.
                Các khả năng có thể của input:
                    input = “spring” => output là “Mùa Xuân”.
                    input = “summer” => output là “Mùa Hạ”.
                    input = “fall” => output là “Mùa Thu”.
                    input = “winter” => output là “Mùa Đông”.
                    input là các giá trị khác => output sẽ là “INVALID”.
         */
//        var scanner = new Scanner(System.in);
//        System.out.println("Nhập tên mùa trong tiếng anh: ");
//        var season = scanner.nextLine().trim().toLowerCase();
//        // switch Expression
//        String curentSeason = switch (season) {
//            case "spring" -> "Mùa xuân";
//            case "summer" -> "Mùa hạ";
//            case "fall" -> "Mùa thu";
//            case "winter" -> "Mùa đông";
//            default -> "INVALID";
//        };
        // switch Statement (switch truyền thống)
//        switch (season)
//        {
//            case "spring":
//                curentSeason = "Mùa xuân";
//                break;
//            case  "summer":
//                curentSeason = "Mùa hạ";
//                break;
//            case  "fall":
//                curentSeason = "Mùa thu";
//                break;
//            case "winter":
//                curentSeason = "Mùa đông";
//                break;
//            default:
//                curentSeason = "INVALID";
//        }
       // System.out.println(STR."Tiếng Anh: \{season} => Tiếng Việt: \{curentSeason}");
        /*
            Ví dụ 2: Viết chương trình cho phép người dùng nhập vào 2 số nguyên và các lựa chọn từ 0-4 và thực hiện
            các chức năng tương ứng như sau:
                0: thoát chương trình
                1: cộng hai số
                2: trừ hai số
                3: nhân hai số
                4: chia hai số
         */
        // switch Expression
        var scanner = new Scanner(System.in);
        System.out.print("Nhập số a = ");
        var a = scanner.nextDouble();
        System.out.print("Nhập số b = ");
        var b = scanner.nextDouble();
        System.out.println("============ Các lựa chọn ===========");
        System.out.println("1. Cộng hai số");
        System.out.println("2. Trừ a cho b");
        System.out.println("3. Nhân hai số");
        System.out.println("4. Chia a cho b");
        System.out.println("0. Thoát chương trình");
        System.out.print("Xin mời bạn lựa chọn: ");
        var choice = scanner.nextInt();
        var result = switch (choice) {
            case 0 -> "==> Chương trình kết thúc.";
            case 1 -> {
                var sum = a + b;
                yield STR."\{a} + \{b} = \{sum}";
            }
            case 2 -> {
                var diff = a - b;
                yield STR."\{a} - \{b} = \{diff}";
            }
            case 3 -> {
                var prod = a * b;
                yield  STR."\{a} * \{b} = \{prod}";
            }
            case 4 -> {
                var quot = a / b;
                yield STR."\{a} / \{b} = \{quot}";
            }
            default -> "==> Sai chức năng vui lòng chọn lại !!!";
        };
        System.out.printf(result);
        // switch Statement
//        switch (choice) {
//            case 0:
//                System.out.println("==> Chương trình kết thúc.");
//                break;
//            case 1:
//                var sum = a + b;
//                System.out.println(STR."\{a} + \{b} = \{sum}");
//                break;
//            case 2:
//                var diff = a - b;
//                System.out.println(STR."\{a} - \{b} = \{diff}");
//                break;
//            case 3:
//                var prod = a * b;
//                System.out.println(STR."\{a} * \{b} = \{prod}");
//                break;
//            case 4:
//                var quot = a / b;
//                System.out.println(STR."\{a} / \{b} = \{quot}");
//                break;
//            default:
//                System.out.println("==> Sai chức năng vui lòng chọn lại !!!");
//        }
    }
}
