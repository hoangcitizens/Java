package Exercise.Ex_Chapter5.Ex51;

import java.util.Scanner;

/*
    Bài 3. Nhập vào một số nguyên dương n từ bàn phím, n là số lượng phần tử của một mảng. Yêu cầu tự viết
    các phương thức phù hợp. Hãy kiểm tra mảng đó có đối xứng hay không. Sau đó in kết quả tương ứng ra màn hình.
    Chú thích: mảng đối xứng là mảng thỏa mãn a[i] = a[n – 1 – i].
    - Input: cho trên 2 dòng
        o Dòng thứ nhất gồm n là số lượng phần tử của mảng.
        o Dòng thứ hai gồm các giá trị của n phần tử trong mảng, phân tách nhau bằng 1 dấu cách.
    - Output: Hiển thị trên 1 dòng kết quả dạng YES hoặc NO tương ứng
 */
public class Ex03_51 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        var n = input.nextInt();
        var numbers = getNumbers(n, input); // gọi phương thức
        var result = isRevert(numbers) ? "YES" : "NO";
        System.out.println(result);
    }

    /**
     * phương thức kiểm tra mảng numbers có đối xứng hay không
     * thuật toán: lần lượt xét từng cặp phần tử thứ i và length-1-i
     * nếu có bất kì cặp nào khác nhau->không đối xứng
     * sau cùng mặc định sẽ trả về mảng đối xứng nếu quá trình xét
     * không return
     *
     * @param numbers mảng cần xét kiểu int
     * @return true nếu mảng đối xứng và false trong trường hợp ngược lại
     */
    private static boolean isRevert(int[] numbers) {
        // chỉ cần xét 1 nửa và lấy đối xứng qua tâm là xong
        for (int i = 0; i <= numbers.length / 2; i++) {
            if (numbers[i] != numbers[numbers.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }

    // phương thức nhập vào danh sách các số nguyên
    private static int[] getNumbers(int n, Scanner input) {
        var numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = input.nextInt();
        }
        return numbers;
    }
}
