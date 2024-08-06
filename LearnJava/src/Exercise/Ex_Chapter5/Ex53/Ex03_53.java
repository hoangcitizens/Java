package Exercise.Ex_Chapter5.Ex53;

/*
    Bài 3. Viết chương trình cho phép nhập vào một mảng số nguyên gồm n phần tử. Hãy viết chương trình sắp xếp mảng này
    theo thứ tự tăng dần. Sau đó tìm giá trị lớn thứ hai trong mảng và liệt kê ra tất cả các vị trị của giá trị này
    trong mảng. In các kết quả tương ứng ra màn hình
    - Input: cho trên 2 dòng
        o Dòng thứ nhất gồm n là số lượng phần tử của mảng, n > 0.
        o Dòng thứ hai gồm các giá trị của n phần tử trong mảng, phân tách nhau bằng 1 dấu cách.
    - Output: hiển thị trên nhiều dòng
        o Dòng đầu tiên hiển thị các phần tử mảng được sắp xếp tăng dần, phân tách nhau bằng 1 dấu cách.
        o Dòng tiếp theo hiển thị giá trị lớn thứ hai trong mảng, nếu không có in ra màn hình
          “KHÔNG TỒN TẠI” và kết thúc chương trình.
        o Dòng cuối cùng hiển thị các vị trí của giá trị lớn thứ hai trong mảng, phân tách nhau bằng 1 dấu cách.
 */

import java.util.Arrays;
import java.util.Scanner;

public class Ex03_53 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử của mảng: ");
        var n = input.nextInt();
        var numbers = getNumbers(n, input); // gọi phương thức

        // sắp xếp và hiển thị
        Arrays.sort(numbers);
        showArray(numbers);

        int max2 = findMax2(numbers);

        if (max2 != numbers[numbers.length - 1]) {
            showMax2(numbers, max2);
        } else {
            System.out.println("KHÔNG TỒN TẠI");
        }
    }

    /**
     * phương thức hiển thị chỉ số các phần tử trùng với giá trị max2
     *
     * @param numbers là mảng chứa các phần tử cần xét
     * @param max2    là giá trị lớn thứ hai
     */
    private static void showMax2(int[] numbers, int max2) {
        System.out.println(STR."Giá trị lớn thứ 2 trong mảng là \{max2}");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == max2) {
                System.out.print(STR."Vị trí của phần tử lớn thứ 2 là \{i}");
            }
        }
    }

    /**
     * phương thức tìm và trả về giá trị max2 trong mảng đã sắp xếp
     *
     * @param numbers là mảng chứa các giá trị cần xét
     * @return giá trị max2 tìm được
     */
    private static int findMax2(int[] numbers) {
        int max = numbers[numbers.length - 1];
        // tìm max2
        for (int i = numbers.length - 1; i >= 0; i--) {
            if (numbers[i] != max) { // nếu tìm thấy max2
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
            System.out.print(numbers[i] + ", "); // in ra từng p.tử
        }
        System.out.println("\b\b");
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
            System.out.print(STR."Nhập a[\{i}] = ");
            numbers[i] = input.nextInt();
        }
        return numbers;
    }
}
