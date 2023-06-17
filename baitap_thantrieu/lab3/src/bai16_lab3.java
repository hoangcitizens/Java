/*
    Bài 16. Viết chương trình thực hiện đọc vào một xâu ký tự gồm nhiều từ và tìm từ dài nhất trong xâu đó.
    Từ đó xuất hiện ở vị trí nào? (Nếu có nhiều từ có độ dài giống nhau thì chọn từ đầu tiên tìm thấy).
 */
import java.util.Scanner;
public class bai16_lab3 {
    public static void main(String[] args) {
        /*
            1. Nhập dữ liệu vào
            2. Tách từ
            3. Tìm độ dài từng từ, nếu từ nào dài nhất thì gán:
               + Lưu lại độ dài
               + Lưu lại giá trị chỉ số của nó
            4. Xuất ra kết quả.
            DONE!
         */
        Scanner scanner = new Scanner(System.in);
        String input;
        input = scanner.nextLine(); // đọc cả dòng
        // Tách từ
        String[] inputs = input.split(" "); // split() tách 1 chuỗi thành các chuỗi con dựa trên khoảng trắng " "
        // Tìm độ dài, dài max, index
        int index = 0;
        int lenMax = 0; // độ dài max của từ trong xâu
        for (int i = 0; i < inputs.length; i++) {
            int len = inputs[i].length();
            if (len > lenMax) {
                lenMax = len;
                index = i;
            }
        }
        //output
        System.out.println("Từ " + inputs[index] + " là từ thứ  " + (index + 1)  + " trong chuỗi có độ dài lớn nhất là " + lenMax);
    }
}