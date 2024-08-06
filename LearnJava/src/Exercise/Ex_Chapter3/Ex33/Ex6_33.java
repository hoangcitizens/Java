package Exercise.Ex_Chapter3.Ex33;/*
    Bài 6 . Nhập vào hai số nguyên a và b từ bàn phím, trong đó a và b là hai thSỐ ÂM số của phương trình
            bậc nhất có dạng 𝑎𝑥 + 𝑏 = 0. Hãy sử dụng kiến thức về toán tử ba ngôi để giải và biện luận
            phương trình rồi sau đó in các kết quả tương ứng ra màn hình.
        - Input: 1 dòng chứa hai số nguyên a và b, phân tách nhau bởi 1 dấu cách.
        - Output: hiển thị trên 1 dòng kết quả nghiệm x tương ứng với từng trường hợp sau
            o Nếu phương trình vô nghiệm, in ra màn hình “VO NGHIEM”.
            o Nếu phương trình có vô số nghiệm, in ra màn hình “VO SO NGHIEM”
            o Nếu phương trình có một nghiệm, in ra màn hình theo định dạng “x = m”, trong đó m là giá trị
              nghiệm của phương trình.
 */


import java.util.Scanner;

public class Ex6_33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số a = ");
        var a = scanner.nextInt();
        System.out.print("Nhập số b = ");
        var b = scanner.nextInt();
        var x = -(float)b/a;
        var result = (a == 0) ? ((b == 0) ? ("Phương trình vô số nghiệm !")
                : ("Phương trình vô nghiệm")) : (STR."Phương trình có nghiệm \{x}");
        System.out.println(result);
    }
}
