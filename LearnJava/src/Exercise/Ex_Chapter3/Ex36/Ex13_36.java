package Exercise.Ex_Chapter3.Ex36;/*
    Bài 13: Thông tin về các cung hoàng đạo có ngày sinh và tháng sinh được cho trong bảng phía dưới.
    Giả định rằng chỉ nhập số. Nếu ngày không hợp lệ hoặc tháng không hợp lệ thì thông báo
    cho người dùng biết. Hãy viết chương trình sử dụng biểu thức switch kết hợp với vòng lặp dowhile để
    cho người dùng nhập vào ngày sinh, tháng sinh rồi từ đó tìm cung hoàng đạo tương ứng.
                Bảng chi tiết các cung hoàng đạo:
                NGÀY SINH CUNG      HOÀNG ĐẠO
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

import java.util.Scanner;

public class Ex13_36 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        while (true) {
            var day = input.nextInt();
            if (day == 0) {
                break;   // nếu ngày = 0 thì kết thúc chương trình
            }
            var month = input.nextInt();
            var zodiac = ""; // biến lưu tên con giáp
            // ta xét tháng trước ngày sau vì số tháng ít hơn số ngày
            switch (month) {
                case 1:
                    if (day < 20) { // 1 - 19/1
                        zodiac = "Ma Kết";
                    } else if (day <= 31) { // 20 - 31/1
                        zodiac = "Bảo Bình";
                    } else {
                        System.out.println("KHÔNG HỢP LỆ");
                    }
                    break;
                case 2:
                    if (day < 19) { // 1 - 18/2
                        zodiac = "Bảo Bình";
                    } else if (day <= 29) { // 19 - 29/2
                        zodiac = "Song Ngư";
                    } else {
                        System.out.println("KHÔNG HỢP LỆ");
                    }
                    break;
                case 3:
                    if (day < 21) { // 1 - 20/3
                        zodiac = "Song Ngư";
                    } else if (day <= 31) { // 21 - 31/3
                        zodiac = "Bạch Dương";
                    } else {
                        System.out.println("KHÔNG HỢP LỆ");
                    }
                    break;
                case 4:
                    if (day < 21) { // 1 - 20/4
                        zodiac = "Bạch Dương";
                    } else if (day <= 30) { // 21 - 30/4
                        zodiac = "Kim Ngưu";
                    } else {
                        System.out.println("KHÔNG HỢP LỆ");
                    }
                    break;
                case 5:
                    if (day < 21) { // 1 - 20/5
                        zodiac = "Kim Ngưu";
                    } else if (day <= 31) { // 21 - 31/5
                        zodiac = "Song Tử";
                    } else {
                        System.out.println("KHÔNG HỢP LỆ");
                    }
                    break;
                case 6:
                    if (day < 22) { // 1 - 21/6
                        zodiac = "Song Tử";
                    } else if (day <= 30) { // 22 - 30/6
                        zodiac = "Cự Giải";
                    } else {
                        System.out.println("KHÔNG HỢP LỆ");
                    }
                    break;
                case 7:
                    if (day < 23) { // 1 - 22/7
                        zodiac = "Cự Giải";
                    } else if (day <= 31) { // 23 - 31/7
                        zodiac = "Sư Tử";
                    } else {
                        System.out.println("KHÔNG HỢP LỆ");
                    }
                    break;
                case 8:
                    if (day < 23) { // 1 - 22/8
                        zodiac = "Sư Tử";
                    } else if (day <= 31) { // 23 - 31/8
                        zodiac = "Xử Nữ";
                    } else {
                        System.out.println("KHÔNG HỢP LỆ");
                    }
                    break;
                case 9:
                    if (day < 23) { // 1 - 22/9
                        zodiac = "Xử Nữ";
                    } else if (day <= 30) { // 23 - 30/9
                        zodiac = "Thiên Bình";
                    } else {
                        System.out.println("KHÔNG HỢP LỆ");
                    }
                    break;
                case 10:
                    if (day < 24) { // 1 - 23/10
                        zodiac = "Thiên Bình";
                    } else if (day <= 31) { // 24 - 31/10
                        zodiac = "Bọ Cạp";
                    } else {
                        System.out.println("KHÔNG HỢP LỆ");
                    }
                    break;
                case 11:
                    if (day < 23) { // 1 - 22/11
                        zodiac = "Bọ Cạp";
                    } else if (day <= 30) { // 23 - 30/11
                        zodiac = "Nhân Mã";
                    } else {
                        System.out.println("KHÔNG HỢP LỆ");
                    }
                    break;
                case 12:
                    if (day < 22) { // 1 - 21/12
                        zodiac = "Nhân Mã";
                    } else if (day <= 31) { // 22 - 31/12
                        zodiac = "Ma Kết";
                    } else {
                        System.out.println("KHÔNG HỢP LỆ");
                    }
                    break;
                default:
                    System.out.println("KHÔNG HỢP LỆ");
                    break;
            }

            if (!zodiac.isEmpty()) {
                System.out.println(zodiac);
            }
        }
    }
}
