package Exercise.Ex_Chapter5.Ex54;

/*
    Bài 2. Viết chương trình cho phép nhập từ bàn phím một mảng số nguyên gồm n phần tử và một số nguyên x.
    Hãy đếm số lần xuất hiện của x trong mảng và in kết quả tương ứng ra màn hình.
    - Input: cho trên nhiều dòng
        o Dòng đầu tiên gồm n là số lượng phần tử của mảng, n > 0.
        o Dòng tiếp theo gồm các giá trị của n phần tử trong mảng, phân tách nhau bằng 1 dấu cách.
        o Dòng còn lại gồm số nguyên x là giá trị cần đếm số lần xuất hiện.
    - Output: hiển thị trên 1 dòng số lần x xuất hiện trong mảng
 */

import java.util.Scanner;

public class Ex02_54 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        var n = input.nextInt();
        var numbers = getNumbers(n, input); // gọi phương thức
        var x = input.nextInt();
        // tìm và kết luận
        System.out.println(countX(numbers, x));
    }

    /**
     * phương thức đếm số lần xuất hiện của x trong mảng
     *
     * @param numbers là mảng chứa các giá trị cần đếm
     * @param x       là giá trị cần tìm
     * @return số lần xuất hiện của x trong mảng
     */
    private static int countX(int[] numbers, int x) {
        int count = 0; // ban đầu count = 0
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == x) {
                count++; // tăng biến đếm lên 01 đơn vị
            }
        }
        return count;
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
