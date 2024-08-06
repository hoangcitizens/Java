package Lesson.Ls_Chapter2;

// Bài 2.9: Các định dạng dữ liệu thường gặp trong Java
/*
    - Các định dạng này thường gặp khi ta in dữ liệu ra màn hình, ghi file… và áp dụng cho các phương thức như printf(), String.format().
    - Cú pháp sử dụng: printf(“format”, valueToPrint); trong đó lưu ý rằng format là định dạng luôn để trong nháy kép “”.
    - Sau đây là các định dạng và ý nghĩa:
        “%d”: in ra các số nguyên.
        “%,d”: in ra các số nguyên, phân tách phần nghìn, triệu, tỉ.. bằng dấu phẩy.
        “%10d”: dành 10 vị trí ứng với 10 kí tự cho việc in ra 1 số nguyên, căn lề phải.
        “%-10d”: dành 10 vị trí ứng với 10 kí tự để in ra giá trị số nguyên, căn lề trái. Bạn có thể thay 10 bởi giá trị số nguyên bất kỳ.
        “%+d”: thêm dấu vào trước số nguyên cần in ra. Ví dụ +100, -200.
        “%o”: in ra số nguyên n ở hệ cơ số 8. Các giá trị biểu diễn chỉ gồm từ 0-7.
        “%x”: in ra số nguyên n ở hệ cơ số 16. Các giá trị biểu diễn chỉ gồm các kí tự 0-9, a,b,c,d,e,f và là các chữ cái thường.
        “%X”: tương tự %x nhưng các kí tự chữ cái là chữ hoa ABCDEF.
        “%h” hoặc “%H”: in ra giá trị mã băm tương ứng với giá trị đối số ở dạng hexa, biểu diễn bởi chữ cái thường như %x hoặc chữ cái hoa ở %X.
        “%c”: in ra một kí tự.
        “%f”: định dạng số thực.
        “%10f”: dành tối thiểu 10 vị trí để in ra giá trị số thực n. Căn lề phải.
        “%-10f”: dành tối thiểu 10 vị trí để in ra giá trị số thực n. Căn lề trái.
        “%-10.2f”: dành tối thiểu 10 vị trí để in ra giá trị số thực n, làm tròn 2 chữ số phần thập phân. Căn lề trái.
        “%e” và “%E”: định dạng số thực số mũ dạng khoa học. Ví dụ 9.31e-30.
        “%b” hoặc “%B” định dạng giá trị kiểu boolean.
        “%%” chèn kí tự % vào kết quả.
        “%n” in xuống dòng.
        “%s”: định dạng của chuỗi kí tự string.
        “%25s”: dành ra tối thiểu 25 kí tự in ra chuỗi string, căn lề phải.
        “%-25s”: dành ra tối thiểu 25 kí tự in ra chuỗi string, căn lề trái.
    - Một số định dạng thời gian:
        “%ty”: lấy phần hai số cuối của năm. Ví dụ 2024 -> 24.
        “%tY”: lấy đầy đủ phần năm 4 số, ví dụ 2025.
        “%tb”: lấy tên tháng viết tắt, ví dụ December -> Dec.
        “%tB”: lấy tên tháng đầy đủ trong tiếng Anh: December.
        “%tm”: tên tháng dạng số. 1-12.
        “%td”: lấy ngày của tháng, ví dụ các ngày từ 1-31 của tháng tương ứng.
        “%tD”: lấy ngày tháng năm dưới dạng 19/01/25.
        “%tH”: lấy giờ dạng 24 giờ. Trả về giá trị 0-23.
        “%tM”: lấy phút của thời gian hiện tại. Giá trị trả về 0-59.
        “%tS”: lấy giây của thời gian hiện tại. Giá trị 0-59.
        “%tL”: lấy mili giây của thời gian hiện tại. Giá trị từ 0-999.
    - Trong tất cả các định dạng trên, bạn có thể thay thế các con số trong đó thành những con số bạn mong muốn sao cho phù hợp.
 */


import java.time.LocalDateTime;

public class Lesson29_DataFormat {
    public static void main(String[] args) {
        // VD1: Định dạng các số nguyên
        // in ra số nguyên
//        var number = 999999L;
//        System.out.println(number);
//        var result = String.format("%,d", number);
//        System.out.println(result);
//        System.out.printf("%,+d",number);
//        // dành 10 vị trí in ra số nguyên number
//        System.out.printf("\n%,20d", number); // căn lề phải
//        System.out.printf("\n%,-20d", number); // căn lề trái
//        // in ra số nguyên ở dạng biểu diễn cơ số 8, 16, mã băm
//        System.out.println("Chuyển đổi sang hệ cơ số 8, 16, hash code");
//        System.out.printf("Hệ 8: %o%n", number);
//        System.out.printf("Hệ 16: %x%n", number);
//        System.out.printf("Hệ 16: %X%n", number); // viết hoa
//        System.out.printf("Hash code: %h%n", number);
//        System.out.printf("Hash code: %H%n", number); // mã băm cơ số 16 viết hoa

        // VD2: Định dạng số thực
//        var number = 3.1415926;
//        // in ra giá trị gốc:
//        System.out.printf("Giá trị gốc: %f\n", number);
//        // làm tròn số và căn lề
//        System.out.printf("Làm tròn đến 2 chữ số: %10.2f\n", number);
//        System.out.printf("Làm tròn đến 3 chữ số: %-10.3f\n", number);
//        // sử dụng biểu diễn khoa học cho số thực:
//        System.out.printf("%e%n", number);
//        var result = String.format("%E", number);
//        System.out.println(result);

        // VD3: Định dạng chuỗi ký tự
//        var fullName = "Họ và tên";
//        var address = "Địa chỉ";
//        var gpa = "Điểm Gpa";
//        var result = String.format("%-35s%-30s%-15s", fullName, address, gpa);
//        System.out.println(result);
//        System.out.printf("%-35s%-30s%-15.2f%n", "Lê Công Tuấn", "Hà Nội", 3.66);
//        System.out.printf("%-35s%-30s%-15.2f%n", "Hoàng Văn Nam", "Đà Nẵng", 3.24);
//        System.out.printf("%-35s%-30s%-15.2f%n", "Nguyễn Ngọc Mai", "Tp.Hồ Chí Minh", 3.66);

        //VD4: Định dạng thời gian
        var currentTime = LocalDateTime.now();
        System.out.printf("Năm: %ty%n", currentTime);
        System.out.printf("Năm: %tY\n", currentTime);
        System.out.printf("Tháng: %tb\n", currentTime);
        System.out.printf("Tháng: %tB\n", currentTime);
        System.out.printf("Ngày: %td\n", currentTime);
        System.out.printf("Ngày: %tD\n", currentTime);
        System.out.printf("Giờ: %tH\n", currentTime);
        System.out.printf("Phút: %tM\n", currentTime);
        System.out.printf("Giây: %tS\n", currentTime);
        System.out.printf("Mili giây: %tL\n", currentTime);
        System.out.printf("%td %tm %tY %tH:%tM:%tS.%tL",
                currentTime, currentTime, currentTime,
                currentTime, currentTime, currentTime,
                currentTime);
    }
}
