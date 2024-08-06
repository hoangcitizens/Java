/*
    1. Tổng quan về package
        - Package hay gói trong Java là kĩ thuật để đóng gói một nhóm các lớp, interface, các gói con có liên quan lại
        với nhau.
        - Gói trong Java dùng trong một số mục đích sau:
            + Tránh xung đột tên. Thông thường trong cùng một gói thì tên lớp, interface, enum là duy nhất. Nếu muốn có các
            tên giống nhau thì ta phải chia gói. Mỗi tên trong một gói khác nhau.
            + Làm cho quá trình tìm kiếm, sử dụng các lớp, interface, enum… trở nên đơn giản hơn. Vì các thứ liên quan đã
            được gom lại một chỗ.
            + Cho phép ta điều khiển khả năng truy cập và sử dụng các thành phần của lớp. Kết hợp với các access modifier
            như protected, và mặc định cấp độ truy cấp gói(bỏ trống). Các thành phần protected có thể được truy cập bởi
            các lớp cùng gói và các lớp con của nó. Còn các thành phần mặc định(không có access modifier) sẽ chỉ được
            truy cập ở bởi lớp chứa nó và các lớp trong cùng một gói.
            + Góp phần thể hiện tính đóng gói dữ liệu trong Java.
        - Như vậy ta chỉ cần gom nhóm các lớp có liên quan lại với nhau và bỏ chúng vào một gói phù hợp. Ở nơi sử dụng
        ta chỉ cần import class/interface/enum… từ nơi mà nó tồn tại và sử dụng như bình thường.
        - Có thể hình dung một gói là một thư mục, trong đó có thể chứa các lớp, interface, enum… liên quan đến một
        chức năng, modul nào đó.
        - Chúng ta có thể tái sử dụng lại các lớp đã có trong các gói trước đó một cách tùy ý.
    2. Các quy ước với package
        - Tên của package luôn viết thường hoàn toàn để tránh nhầm lẫn với tên các lớp, interface.
        - Tên package thường dùng tên miền ngược của trang web nếu như đó là một tổ chức nào đó. Ví dụ tên pakage là:
        net.braniumacademy.core hoặc net.braniumacademy.example. Với package đích là core, example.
        - Trong ngôn ngữ Java, các gói của ngôn ngữ mặc định bắt đầu với java. hoặc javax. như java.lang, java.util…
        - Với các project nhỏ, có thể không cần có tên package hoặc tên package là đơn giản. Tên của package phải
        là duy nhất.
        - Không dùng các keyword hay các gói gốc đã có trong project hay thư viện Java để đặt tên cho gói của bạn.
        Nếu tên gói là các keyword hoặc bắt đầu bởi số hoặc có dấu – phân tách thì thay bằng gạch dưới.
        * Để thêm một lớp hay interface vào một gói:
            - Ta tạo lớp/interface trong gói đã có hoặc đặt dòng package tên_package; ở đầu file .java và chuyển
              file .java vào thư mục cùng tên với package.
            - Ta thường tạo lớp mới có access modifier là public hoặc thêm lớp cần thêm vào file .java đã có.
            - Để có hiệu lực ta phải compile lại project.
            - Gói con(subpackage) là các gói ở trong một gói nào đó. Các gói này cũng là các gói độc lập và muốn sử
              dụng phải import chúng một cách tường minh.
     3. Các package có sẵn trong Java
        - Các gói trong Java chia làm hai loại:
            + Các gói có sẵn trong thư viện Java.
            + Và các gói do người dùng tự định nghĩa ra.
        - Một số gói có sẵn thường dùng được liệt kê và mô tả như sau:
            + java.lang: chứa các lớp nền tảng của ngôn ngữ lập trình Java. Ví dụ như các lớp định nghĩa các kiểu
              nguyên thủy trong Java, lớp Math… gói này mặc định được tự động import.
            + java.io: chứa các lớp hỗ trợ các hành động thao tác vào ra dữ liệu.
            + java.util: chứa các lớp tiện ích thực thi các cấu trúc dữ liệu như LinkedList, Dictionary… các lớp hỗ
              trợ về quản lý thời gian như Date…
            + java.aplet: chứa các lớp để tạo Applet.
            + java.awt: chứa các lớp hỗ trợ tạo giao diện đồ họa như các nút, menu, bảng…
            + java.net: chứa các lớp hỗ trợ các thao tác với networking.
        - Các gói do người dùng tự định nghĩa: các nhà phát triển có thể tự định nghĩa các gói theo nhu cầu của bản thân:
            + Đầu tiên tạo gói trong project với tên tuân thủ quy ước tên package đã nói ở trên.
            + Sau đó thêm các lớp/interface/enum… mới hoặc đã tồn tại vào package này.
            + Phần này sẽ được ví dụ minh họa chi tiết trong phần thực hành.
        - Để sử dụng gói ta import lớp cần dùng vào. Có hai cách import:
            + Import tường minh: chỉ rõ tên gói và tên lớp cần dùng(khuyến nghị).
            + Import chung chung: chỉ rõ tên gói nhưng không chỉ rõ tên lớp. Thay vào đó dùng dấu *. Đây là cách
              import cũ và khuyến nghị không nên sử dụng. (Ví dụ xem ở phần xử lý xung đột tên).
    4. Cú pháp static import
        - Static import là một tính năng của Java cho phép các thành phần như các trường, các phương thức static được
          nạp vào chương trình và sử dụng không cần phải cung cấp tên đầy đủ của lớp nơi thành phần đó được định nghĩa.
        - Đôi khi ta sử dụng static import để làm cho câu lệnh Java trở nên ngắn gọn hơn.
        - Ta muốn sử dụng phương thức add của lớp trên, ta có hai cách: sử dụng lời gọi thông thường hoặc dùng
          static import để khai báo nơi định nghĩa phương thức sau đó chỉ cần gọi tới tên phương thức đó và sử dụng.
    5. Xử lý xung đột tên
    - Thường chúng ta chỉ quan tâm đến package khi xảy ra xung đột về tên. Ví dụ ta định nghĩa nhiều lớp cùng tên
      trong nhiều gói khác nhau. Khi đó ta phải chỉ rõ lớp cần dùng là thuộc gói nào.
    - Một ví dụ về lớp của hệ thống là lớp Date. Trong cả hai gói java.util và java.sql đều có lớp này. Do đó ta phải
      chỉ rõ chúng thuộc gói nào tại nơi sử dụng.
    - Để xử lý vấn đề này ta sẽ import tường minh lớp Date cần dùng:
    - Lưu ý quan trọng:
        - Mỗi lớp đều nằm trong một package nào đó.
        - Nếu tên package không được chỉ rõ trong file .java thì lớp trong file đó tự động được bỏ vào một gói mặc
          định không có tên.
        - Các class/interface/enum trong một file đều thuộc cùng một gói. Một gói có thể chứa nhiều file.
        - Nếu tên package đã được chỉ định, file đó phải nằm trong thư mục của gói. Tên gói và tên thư mục phải trùng
          khớp nhau.
        - Ta có thể sử dụng các class/interface/enum có access modifier là public từ các gói khác.
    Ví dụ:
    example._123name
    example
    example.my_package
    net.braniumacademy.java.lesson4_3
 */

package Lesson.Ls_Chapter4_Methods.Ls43_Package;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import static Lesson.Ls_Chapter4_Methods.Ls43_Package.Calculator.add;
import static java.lang.Math.sin;
import static java.lang.Math.toRadians;

public class Lesson43_Package {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
//        System.out.print("Mức lương: ");
//        float salary = scanner.nextFloat();
//        DecimalFormat format = new DecimalFormat("#,###.##");
//        System.out.println(STR."Lương: \{format.format(salary)}");

        // VD về các package có sẵn trong Java
//        var dateFormat = "dd/MM/yyyy";
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(dateFormat);
//        System.out.print("Nhập vào ngày sinh(dd/MM/yyyy): "); // 26/11/2003
//        var dateStr = scanner.nextLine();
//        Date birthday = simpleDateFormat.parse(dateStr);
//        System.out.println(birthday);
//        System.out.println(simpleDateFormat.format(birthday));

        // VD về static import
//        var angle = 90;
//        var angleRadian = toRadians(angle);
//        var sinX = sin(angleRadian);
//        var sum = add(18.98,45.2,35.36);
//        System.out.println(sum);

        // VD xử lý xung đột tên
//        Date now = new Date();
//        java.sql.Date sqlDate = new java.sql.Date(now.getTime());
//        Calculator.add(1,2,3);

    }
}
