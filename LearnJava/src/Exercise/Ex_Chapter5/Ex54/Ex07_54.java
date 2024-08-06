package Exercise.Ex_Chapter5.Ex54;

/*
    Bài 7. Viết chương trình cho phép nhập từ bàn phím một mảng số nguyên gồm n phần tử. Hãy hiển thị ra màn hình các
    phần tử trong mảng sao cho mỗi phần tử chỉ xuất hiện duy nhất 1 lần.
    - Input: cho trên 2 dòng
        o Dòng đầu tiên gồm n là số lượng phần tử của mảng, n > 0.
        o Dòng tiếp theo gồm các giá trị của n phần tử trong mảng, phân tách nhau bằng 1 dấu cách.
    - Output: hiển thị trên 1 dòng các phần tử trong mảng sao cho mỗi phần tử chỉ xuất hiện duy nhất 1 lần, phân tách
      nhau bằng 1 dấu cách.
 */

import java.util.Scanner;

public class Ex07_54 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        var n = input.nextInt();
        var numbers = getNumbers(n, input); // gọi phương thức
        filter(numbers);
    }

    /**
     * phương thức lọc bỏ các phần tử trùng nhau và chỉ hiển thị
     * mỗi phần tử duy nhất 01 lần
     *
     * @param numbers mảng chứa các phần tử
     */
    private static void filter(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            if (!isExist(numbers, numbers[i], i)) {
                System.out.print(numbers[i] + " ");
            }
        }
    }

    /**
     * phương thức kiểm tra xem n xuất hiện trong mảng trước đó chưa
     *
     * @param numbers mảng gốc
     * @param n       giá trị cần kiểm tra
     * @param bound   biên cần xét
     * @return true nếu n đã xuất hiện, false trong trường hợp ngược lại
     */
    private static boolean isExist(int[] numbers, int n, int bound) {
        for (int i = 0; i < bound; i++) { // duyệt từ đầu đến trước bound
            if (numbers[i] == n) { // nếu n đã xuất hiện
                return true; // trả về true
            }
        }
        return false; // mặc định trả về false
    }

    /**
     * phương thức hiển thị các phần tử mảng
     *
     * @param numbers là mảng chứa các phần tử cần hiển thị
     */
    private static void showArray(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) { // duyệt toàn bộ mảng
            System.out.print(numbers[i] + " "); // in ra từng p.tử
        }
        System.out.println(); // hiện xuống dòng mới
    }

    /**
     * phương thức nhập vào danh sách các số nguyên
     *
     * @param n     số lượng giá trị cần nhập
     * @param input đối tượng của lớp Scanner
     * @return mảng các phần tử đã nhập vào
     */
    private static int[] getNumbers(int n, Scanner input) {
        var numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = input.nextInt();
        }
        return numbers;
    }
}
