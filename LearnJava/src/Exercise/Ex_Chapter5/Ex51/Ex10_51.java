package Exercise.Ex_Chapter5.Ex51;

import java.util.Scanner;

/*
    Bài 10. Nhập vào từ bàn phím số nguyên n > 0, trong đó n là số lượng nhân viên trong công ty. Với mỗi nhân viên hãy
    viết chương trình cho phép nhập vào ngày công của từng người. Sau đó tính và hiển thị ra màn hình thông tin chi tiết
    về số công, tổng lương cứng, tổng phụ cấp, tổng bonus và tổng lương được nhận của một danh sách gồm n nhân viên dưới
    dạng hàng và cột.
    Chú thích: số ngày công không quá 30 và được phép lẻ 0.5 ngày. Ví dụ 22.5, 15.5. Lương cứng của một ngày công là 330k.
    Phụ cấp 33k/công hoàn chỉnh. Lẻ 0.5 không được tính. Ví dụ 15.5 công chỉ đc phụ cấp 15 công. Nếu số công tháng >= 25
    thì nhân viên được bonus mỗi công từ 25 trở đi thêm 50k.
    - Input: cho trên nhiều dòng
        o Dòng đầu tiên gồm số nguyên dương n.
        o n dòng tiếp theo nhập vào số ngày công của từng nhân viên.
    - Output: hiển thị trên nhiều dòng dưới dạng hàng và cột thông tin chi tiết về số thứ tự, số công, tổng lương cứng,
    tổng phụ cấp, tổng bonus và tổng lương được nhận của từng nhân viên trong danh sách.
 */
public class Ex10_51 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.print("Nhập số lượng nhân viên: ");
        var n = input.nextInt();
        // lấy ngày công cho n nhân viên
        var works = getWorks(n, input);
        // thông báo kết quả:
        showResult(works);
    }

    /**
     * phương thức tính toán và hiển thị thông tin về lương bổng nhân viên
     *
     * @param works mảng danh sách ngày công nhân viên
     */
    private static void showResult(float[] works) {
        // dấu trừ để căn lề sang trái. Xem lại lý thuyết bài học về
        // kiểu dữ liệu trong Java
        System.out.printf("%-5s%-10s%-15s%-10s%-10s%-12s\n", "STT",
                "Số công", "Lương cứng", "Phụ cấp", "Bonus", "Tổng lương");
        for (int i = 0; i < works.length; i++) {
            var standard = 330 * works[i]; // lương chuẩn
            var pensision = 33 * (int) works[i]; // phụ cấp
            var bonusDay = (works[i] - 25 >= 0) ? (works[i] - 24) : 0;
            var bonus = bonusDay * 50; // tiền bonus
            var total = standard + pensision + bonus; // tổng lương
            System.out.printf("%-5d%-10.2f%-15.2f%-10d%-10.2f%-12.2f\n",
                    i + 1, works[i], standard, pensision, bonus, total);
        }
    }

    /**
     * phương thức nhập vào ngày công của từng nhân viên trong c.ty
     *
     * @param n     là số nhân viên
     * @param input là đối tượng của Scanner
     * @return danh sách ngày công của n nhân viên
     */
    private static float[] getWorks(int n, Scanner input) {
        var works = new float[n];
        for (int i = 0; i < n; i++) {
            System.out.print(STR."Nhập nhân viên thứ \{i + 1}: ");
            works[i] = input.nextFloat();
            if (works[i] < 0 || works[i] > 30) {
                i--; // không tăng i
            }
        }
        return works;
    }
}
