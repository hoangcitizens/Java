package Exercise.Ex_Chapter3.Ex38;/*
    Bài 7*. Nhập vào từ bàn phím 3 giá trị d, m và y, trong đó d là ngày của tháng, m là tháng của
    năm và y là năm. Dựa trên dự kiện ngày, tháng, năm vừa nhập hãy tìm xem hôm đó là thứ mấy.
    In kết quả tương ứng ra màn hình.
    Lưu ý:
        • Ngày, tháng, năm nhập vào phải là một giá trị hợp lệ, nếu không hợp lệ in ra INVALID DATE.
        • Các giá trị thứ trong tuần in ra màn hình phải đúng định dạng thuộc tập hợp sau {Thứ Hai,
          Thứ Ba, Thứ Tư, Thứ Năm, Thứ Sáu, Thứ Bảy, Chủ Nhật} và không có ngoại lệ nào.
    - Input: cho trên 3 dòng
        o Dòng đầu là giá trị của ngày.
        o Dòng tiếp theo là giá trị của tháng.
        o Dòng cuối cùng là giá trị của năm.
    - Output: hiển thị trên 1 dòng giá trị thứ trong tuần tương ứng, nếu ngày, tháng, năm không hợp lệ thì
              in ra INVALID DATE.
 */

import java.util.Scanner;

public class Ex7_38 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập ngày
        int day = scanner.nextInt();

        // Nhập tháng
        int month = scanner.nextInt();

        // Nhập năm
        int year = scanner.nextInt();

        // Kiểm tra tính hợp lệ của ngày, tháng và năm
        if (isValidDate(day, month, year)) {
            // Tính toán và in kết quả
            String dayOfWeek = getDayOfWeek(day, month, year);
            System.out.println(dayOfWeek);
        } else {
            // Ngày, tháng, năm không hợp lệ
            System.out.println("INVALID DATE");
        }
    }

    // Kiểm tra tính hợp lệ của ngày, tháng và năm
    public static boolean isValidDate(int day, int month, int year) {
        // Kiểm tra năm hợp lệ
        if (year < 1) {
            return false;
        }

        // Kiểm tra tháng hợp lệ
        if (month < 1 || month > 12) {
            return false;
        }

        // Kiểm tra ngày hợp lệ
        if (day < 1 || day > getDaysInMonth(month, year)) {
            return false;
        }

        return true;
    }

    // Tính số ngày trong một tháng
    public static int getDaysInMonth(int month, int year) {
        if (month == 2) {
            // Nếu là tháng 2
            if (isLeapYear(year)) {
                return 29;
            } else {
                return 28;
            }
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            // Nếu là tháng 4, 6, 9, 11
            return 30;
        } else {
            // Các tháng còn lại (1, 3, 5, 7, 8, 10, 12)
            return 31;
        }
    }

    // Kiểm tra năm nhuận
    public static boolean isLeapYear(int year) {
        if (year % 4 != 0) {
            return false;
        } else if (year % 100 != 0) {
            return true;
        } else if (year % 400 != 0) {
            return false;
        } else {
            return true;
        }
    }

    // Tính thứ của một ngày trong tuần (0: Chủ Nhật, 1: Thứ Hai, ..., 6: Thứ Bảy)
    public static int getDayOfWeekIndex(int day, int month, int year) {
        int[] t = {0, 3, 2, 5, 0, 3, 5, 1, 4, 6, 2, 4};
        if (month < 3) {
            year--;
        }
        return (year + year / 4 - year / 100 + year / 400 + t[month - 1] + day) % 7;
    }

    // Lấy tên thứ từ thứ của một ngày trong tuần
    public static String getDayOfWeek(int day, int month, int year) {
        String[] daysOfWeek = {"Chủ Nhật", "Thứ Hai", "Thứ Ba", "Thứ Tư", "Thứ Năm", "Thứ Sáu", "Thứ Bảy"};
        int dayOfWeekIndex = getDayOfWeekIndex(day, month, year);
        return daysOfWeek[dayOfWeekIndex];
    }
}
