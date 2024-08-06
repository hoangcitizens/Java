package Exercise.Ex_Chapter5.Ex51;

import java.util.Scanner;

/*
    Bài 11. Nhập vào một dòng họ và tên từ bàn phím. Các từ trong xâu họ-đệm-tên phân tách nhau bằng 1 dấu cách,
    không có dấu cách thừa ở đầu và cuối xâu. Hãy viết chương trình chuẩn hóa xâu họ-đệm-tên đó theo quy chuẩn
    (Viết hoa chữ cái đầu từ, các chữ cái còn lại viết thường) và in ra màn hình.
        - Input: gồm 1 dòng chứa xâu họ và tên.
        - Output: hiển thị trên 1 dòng xâu họ và tên sau khi chuẩn hóa.
 */
public class Ex11_51 {
    public static void main(String[] args) {
        // Yêu cầu: chuẩn hóa họ và tên. Biết rằng họ và tên có nhiều từ phân tách nhau bởi
        // 1 dấu cách.
        System.out.print("Nhập họ tên cần chuẩn hóa: ");
        String name = new Scanner(System.in).nextLine();// "lÊ tRần văN viNh"
        // kết quả: Lê Trần Văn Vinh

        // các bước thực hiện:
        // B1: Viết thường các kí tự trong mỗi từ
        // B2: Tách các từ trong câu tại vị trí có dấu cách
        // B3: Chuyển các kí tự trong từ đó sang mảng kí tự
        // B4: Viết hoa chữ cái đầu từ
        // B5: Thêm các từ vào chuỗi đích(kết quả)
        // B6: In ra kết quả

        var result = solve(name);
        // b6:
        System.out.println(result);
    }

    private static String solve(String name) {
        // b1 + b2
        var words = name.toLowerCase().split("\\s+");
        StringBuilder builder = new StringBuilder();
        for(var item : words ) {
            var characters = item.toCharArray();
            // b4
            characters[0] = Character.toUpperCase(characters[0]);
            // b5:
            builder.append(new String(characters));
            builder.append(" ");
        }
        return builder.toString().trim();
    }
}
