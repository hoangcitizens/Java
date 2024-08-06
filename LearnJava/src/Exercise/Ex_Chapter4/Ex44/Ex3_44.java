package Exercise.Ex_Chapter4.Ex44;

import java.util.Scanner;

/*
    Bài 3. Thông tin về các cung hoàng đạo có ngày sinh và tháng sinh được cho trong bảng phía dưới.
    Giả định rằng chỉ nhập số. Nếu ngày không hợp lệ hoặc tháng không hợp lệ thì thông báo cho
    người dùng biết. Hãy viết chương trình cho người dùng nhập vào ngày sinh, tháng sinh từ bàn
    phím. Sau đó sử dụng switch expression để tìm cung hoàng đạo tương ứng và in ra màn hình.
    Bảng chi tiết các cung hoàng đạo:
        NGÀY SINH CUNG       HOÀNG ĐẠO
        21/03 - 20/04       Bạch Dương
        21/04 - 20/05       Kim Ngưu
        21/05 - 21/06       Song Tử
        22/06 - 22/07       Cự Giải
        23/07 - 22/08       Sư Tử
        23/08 - 22/09       Xử Nữ
        23/09 - 23/10       Thiên Bình
        24/10 - 22/11       Bọ Cạp
        23/11 - 21/12       Nhân Mã
        22/12 - 19/01       Ma Kết
        20/01 - 18/02       Bảo Bình
        19/02 - 20/03       Song Ngư
    Lưu ý: khi nhập các giá trị khác ngoài đoạn [0-12] thì chương trình sẽ lặp lại liên tục đến khi
    người dùng nhập 0 để thoát chương trình.
    - Input: gồm 1 dòng chứa giá trị của ngày sinh và tháng sinh, phân tách nhau bằng 1 dấu cách.
    - Output: hiển thị trên 1 dòng kết quả cung hoàng đạo tương ứng. Nếu ngày và tháng không
    hợp lệ thì in ra KHÔNG HỢP LỆ.
 */
public class Ex3_44 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        do {
            var day = input.nextInt();
            if (day == 0) {
                break;
            }
            var month = input.nextInt();
            var zodiac = ""; // biến lưu tên con giáp

            // ta xét tháng trước ngày sau vì số tháng ít hơn số ngày
            zodiac = switch (month) {
                case 1 -> (day < 20) ? "Ma Kết" : (day <= 31) ? "Bảo Bình" : "KHÔNG HỢP LỆ";
                case 2 -> (day < 19) ? "Bảo Bình" : (day <= 29) ? "Song Ngư" : "KHÔNG HỢP LỆ";
                case 3 -> (day < 21) ? "Song Ngư" : (day <= 31) ? "Bạch Dương" : "KHÔNG HỢP LỆ";
                case 4 -> (day < 21) ? "Bạch Dương" : (day <= 30) ? "Kim Ngưu" : "KHÔNG HỢP LỆ";
                case 5 -> (day < 21) ? "Kim Ngưu" : (day <= 31) ? "Song Tử" : "KHÔNG HỢP LỆ";
                case 6 -> (day < 22) ? "Song Tử" : (day <= 30) ? "Cự Giải" : "KHÔNG HỢP LỆ";
                case 7 -> (day < 23) ? "Cự Giải" : (day <= 31) ? "Sư Tử" : "KHÔNG HỢP LỆ";
                case 8 -> (day < 23) ? "Sư Tử" : (day <= 31) ? "Xử Nữ" : "KHÔNG HỢP LỆ";
                case 9 -> (day < 23) ? "Xử Nữ" : (day <= 30) ? "Thiên Bình" : "KHÔNG HỢP LỆ";
                case 10 -> (day < 24) ? "Thiên Bình" : (day <= 31) ? "Bọ Cạp" : "KHÔNG HỢP LỆ";
                case 11 -> (day < 23) ? "Bọ Cạp" : (day <= 30) ? "Nhân Mã" : "KHÔNG HỢP LỆ";
                case 12 -> (day < 22) ? "Nhân Mã" : (day <= 31) ? "Ma Kết" : "KHÔNG HỢP LỆ";
                default -> "KHÔNG HỢP LỆ";
            };
            System.out.println(zodiac);
        } while (true);
    }
}
