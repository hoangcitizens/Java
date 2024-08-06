package Exercise.Ex_Chapter5.Ex54;

/*
    Bài 1. Viết chương trình cho phép nhập từ bàn phím một mảng số nguyên gồm n phần tử và một số nguyên x.
    Hãy tìm xem x có xuất hiện trong mảng không và in kết quả tương ứng ra màn hình.
    - Input: cho trên nhiều dòng
        o Dòng đầu tiên gồm n là số lượng phần tử của mảng, n > 0.
        o Dòng tiếp theo gồm các giá trị của n phần tử trong mảng, phân tách nhau bằng 1 dấu cách.
        o Dòng còn lại gồm số nguyên x là giá trị cần tìm trong mảng.
    - Output: hiển thị trên 1 dòng kết quả tương ứng YES nếu tìm thấy hoặc NO nếu không tìm thấy.
 */

import java.util.Scanner;

public class Ex01_54 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        var n = input.nextInt();
        var numbers = getNumbers(n, input); // gọi phương thức
        var x = input.nextInt();

        // tìm và kết luận
        if (isExist(numbers, x)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    /**
     * phương thức kiểm tra xem x có xuất hiện trong mảng hay không
     *
     * @param numbers là mảng chứa các giá trị cần kiểm tra
     * @param x       là giá trị cần tìm
     * @return true nếu tìm thấy x và false trong trường hợp ngược lại
     */
    private static boolean isExist(int[] numbers, int x) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == x) {
                return true;
            }
        }
        return false;
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
