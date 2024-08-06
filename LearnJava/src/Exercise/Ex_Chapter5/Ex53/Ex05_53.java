package Exercise.Ex_Chapter5.Ex53;

/*
    Bài 5. Viết chương trình cho phép nhập vào một mảng số nguyên gồm n phần tử. Hãy viết chương trình sắp xếp các
    phần tử của mảng thõa mãn cả hai yêu cầu sau và in kết quả ra màn hình.
    Yêu cầu:
    1. Nửa đầu của mảng sắp xếp theo thứ tự tăng dần.
    2. Nửa sau của mảng sắp xếp theo thứ tự giảm dần.
    - Input: cho trên 2 dòng
        o Dòng thứ nhất gồm n là số lượng phần tử của mảng, n > 0.
        o Dòng thứ hai gồm các giá trị của n phần tử trong mảng, phân tách nhau bằng 1 dấu cách.
    - Output: hiển thị trên 2 dòng
        o Dòng thứ nhất là các phần tử mảng trước khi sắp xếp, phân tách nhau bằng 1 dấu cách.
        o Dòng thứ hai là các phần tử của mảng được sắp xếp theo cả 2 yêu cầu trên, phân tách nhau bằng 1 dấu cách..
 */

import java.util.Arrays;
import java.util.Scanner;

public class Ex05_53 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        var n = input.nextInt();
        var numbers = getNumbers(n, input); // gọi phương thức
        // hiển thị mảng gốc:
        showArray(numbers);
        // sắp xếp và hiển thị
        // nửa đầu mảng sắp xếp tăng dần
        Arrays.sort(numbers, 0, numbers.length / 2);
        sort(numbers); // nửa sau của mảng sắp xếp giảm dần
        // mảng sau khi đã sắp xếp
        showArray(numbers);
    }

    /**
     * phương thức sắp xếp nổi bọt sắp xếp nửa sau của mảng giảm dần
     *
     * @param numbers mảng cần sắp xếp
     */
    private static void sort(int[] numbers) {
        for (int i = numbers.length / 2; i < numbers.length; i++) {
            for (int j = numbers.length - 1; j > i; j--) {
                if (numbers[j] > numbers[j - 1]) { // sắp xếp giảm dần
                    var x = numbers[j];
                    numbers[j] = numbers[j - 1];
                    numbers[j - 1] = x;
                }
            }
        }
    }

    /**
     * phương thức tìm và trả về giá trị min2 trong mảng đã sắp xếp
     *
     * @param numbers là mảng chứa các giá trị cần xét
     * @return giá trị min2 tìm được
     */
    private static int findMin2(int[] numbers) {
        int max = numbers[numbers.length - 1];
        // tìm min2
        for (int i = numbers.length - 1; i >= 0; i--) {
            if (numbers[i] != max) { // nếu tìm thấy min2
                return numbers[i];
            }
        }
        return max;
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
