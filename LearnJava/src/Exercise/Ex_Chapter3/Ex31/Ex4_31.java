package Exercise.Ex_Chapter3.Ex31;/*
    Bài 4. Nhập vào hai chuỗi str1 và str2 từ bàn phím. Hãy so sánh và kết luận mối tương quan(chuỗi
    đứng trước, đứng sau hay tương đương) của hai chuỗi. Sau đó, in ra màn hình kết quả.
    - Input: cho trên 2 dòng
        + Dòng thứ nhất gồm chuỗi str1
        + Dòng thứ hai gồm chuỗi str2.
    - Output: hiển thị trên 1 dòng kết quả có dạng “str1 res str2”. Trong đó res là kết luận tương ứng
      gồm: đứng trước, đứng sau, tương đương.
 */
import java.util.Scanner;

public class Ex4_31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào chuỗi thứ nhất str1: ");
        String str1 = scanner.nextLine();
        System.out.print("Nhập vào chuỗi thứ hai str2: ");
        String str2 = scanner.nextLine();
        var result = str1.compareTo(str2);
        if (result < 0) {
            System.out.println("str1 đứng trước str2");
        } else if (result == 0) {
            System.out.println("str1 tương đương str2");
        } else {
            System.out.println("str1 đứng sau str2");
        }
    }
}
