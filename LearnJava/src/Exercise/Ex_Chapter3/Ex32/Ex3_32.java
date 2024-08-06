package Exercise.Ex_Chapter3.Ex32;/*
    Bài 3: Thông tin về các cung hoàng đạo có ngày sinh và tháng sinh được cho trong bảng phía dưới.
    Hãy viết chương trình cho người dùng nhập vào ngày sinh, tháng sinh và từ đó tìm cung hoàng
    đạo tương ứng. Giả định rằng chỉ nhập số. Nếu ngày không hợp lệ hoặc tháng không hợp lệ thì
    thông báo cho người dùng biết.
        Bảng chi tiết các cung hoàng đạo:
        NGÀY SINH CUNG HOÀNG ĐẠO
            20/01 - 18/02 Bảo Bình
            19/02 - 20/03 Song Ngư
            21/03 - 20/04 Bạch Dương
            21/04 - 20/05 Kim Ngưu
            21/05 - 21/06 Song Tử
            22/06 - 22/07 Cự Giải
            23/07 - 22/08 Sư Tử
            23/08 - 22/09 Xử Nữ
            23/09 - 23/10 Thiên Bình
            24/10 - 22/11 Bọ Cạp
            23/11 - 21/12 Nhân Mã
            22/12 - 19/01 Ma Kết
    - Input: gồm 1 dòng chứa giá trị của ngày sinh và tháng sinh, phân tách nhau bằng 1 dấu cách.
    - Output: hiển thị trên 1 dòng kết quả cung hoàng đạo tương ứng. Nếu ngày và tháng không hợp lệ thì in ra KHÔNG HỢP LỆ.
 */


import java.util.Scanner;

public class Ex3_32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập ngày sinh: ");
        var d = scanner.nextInt();
        System.out.print("Nhập tháng sinh: ");
        var m = scanner.nextInt();
        System.out.print(STR."\{d}/\{m} : ");
        switch (m) {
            case 1:
                if (d > 19 && d <= 31)
                    System.out.println("Bảo Bình");
                else
                    System.out.println("Ma Kết");
                break;
            case 2:
                if (d > 18 && d <= 29)
                    System.out.println("Song Ngưu");
                else
                    System.out.println("Bảo Bình");
                break;
            case 3:
                if (d > 20 && d <= 31)
                    System.out.println("Bạch Dương");
                else
                    System.out.println("Song Ngưu");
                break;
            case 4:
                if (d > 20 && d <= 30)
                    System.out.println("Kim Ngưu");
                else
                    System.out.println("Bạch Dương");
                break;
            case 5:
                if (d > 20 && d <= 31)
                    System.out.println("Song Tử");
                else
                    System.out.println("Kim Ngưu");
                break;
            case 6:
                if (d > 21 && d <= 30)
                    System.out.println("Cự Giải");
                else
                    System.out.println("Song Tử");
                break;
            case 7:
                if (d > 22 && d <= 31)
                    System.out.println("Sư Tử");
                else
                    System.out.println("Cự Giải");
                break;
            case 8:
                if (d > 22 && d <= 31)
                    System.out.println("Xử Nữ");
                else
                    System.out.println("Sư Tử");
                break;
            case 9:
                if (d > 22 && d <= 30)
                    System.out.println("Thiên Bình");
                else
                    System.out.println("Xử Nữ");
                break;
            case 10:
                if (d > 23 && d <= 31)
                    System.out.println("Bọ Cạp");
                else
                    System.out.println("Thiên Bình");
                break;
            case 11:
                if (d > 22 && d <= 30)
                    System.out.println("Nhân Mã");
                else
                    System.out.println("Bọ Cạp");
                break;
            case 12:
                if (d > 21 && d <= 31)
                    System.out.println("Ma Kết");
                else
                    System.out.println("Nhân Mã");
                break;
            default:
                System.out.print("Không Hợp Lệ");
                break;
        }
    }
}
