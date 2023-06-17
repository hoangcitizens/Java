/*
    Bài 17. Đọc vào một xâu họ tên theo cấu trúc: họ...đệm...tên; sau đó thực hiện chuyển xâu đó sang biểu diễn theo cấu trúc tên…họ…đệm.
            Ví dụ: Triệu Văn Thân -> Thân Triệu Văn.
            Áp dụng với file đầu vào có số dòng dữ liệu chưa biết trước, trong đó mỗi dòng chứa duy nhất một thông tin đầy đủ họ tên. Ghi kết quả ra file KETQUA.OUT
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.Scanner;

public class bai17_lab3 {
    public static void main(String[] args) throws IOException {
        Scanner inputFromFile = new Scanner(Paths.get("input.txt"), "UTF-8");
        PrintWriter printWriter = new PrintWriter("KETQUA.OUT", "UTF-8");
        // xu ly file:
        while (inputFromFile.hasNextLine()) { // nếu như có các dòng khác mới thực hiện vòng lặp bên trong
            String name = inputFromFile.nextLine();
            name = name.trim();
            String[] names = name.split(" ");
            StringBuilder builder = new StringBuilder();
            builder.append(names[names.length - 1] + " ");
            builder.append(names[0] + " ");
            for (int i = 1; i < names.length - 1; i++) {
                if (names[i].length() != 0) {
                    builder.append(names[i] + " ");
                }
            }
            name = builder.toString();
            printWriter.println(name);
        }
        printWriter.close();
        inputFromFile.close();
    }
}