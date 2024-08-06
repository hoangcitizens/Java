package Exercise.Ex_Chapter5.Ex51;

import java.util.Scanner;

/*
    Bài 12. Nhập vào một xâu kí tự từ bàn phím. Các từ trong xâu phân tách nhau bằng 1 dấu cách, không có dấu cách
    thừa ở đầu và cuối xâu. Hãy viết chương trình viết hoa các chữ cái đầu mỗi từ với điều kiện từ đó phải bắt đầu
    bằng nguyên âm. In kết quả ra màn hình.
        - Input: gồm 1 dòng chứa xâu kí tự.
        - Output: hiển thị trên 1 dòng xâu sau khi viết hoa các chữ cái theo điều kiện.
 */
public class Ex12_51 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();

        String[] words = input.split("\\s+");
        String result = "";

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            char firstChar = word.charAt(0);

            if (isVowel(firstChar)) {
                word = capitalizeFirstChar(word);
            }

            result += word + " ";
        }

        // Xóa dấu cách thừa ở cuối xâu kết quả
        result = result.trim();

        // in kết quả nè
        System.out.println(result);
    }

    // Phương thức kiểm tra ký tự có phải là nguyên âm hay không
    private static boolean isVowel(char c) {
        char lowerCaseC = Character.toLowerCase(c);
        return lowerCaseC == 'a' || lowerCaseC == 'á' || lowerCaseC == 'ả' || lowerCaseC == 'à' || lowerCaseC == 'ạ'
                || lowerCaseC == 'e' || lowerCaseC == 'é' || lowerCaseC == 'ẻ' || lowerCaseC == 'è' || lowerCaseC == 'ẹ'
                || lowerCaseC == 'i' || lowerCaseC == 'í' || lowerCaseC == 'ỉ' || lowerCaseC == 'ì' || lowerCaseC == 'ị'
                || lowerCaseC == 'o' || lowerCaseC == 'ó' || lowerCaseC == 'ỏ' || lowerCaseC == 'ò' || lowerCaseC == 'ọ'
                || lowerCaseC == 'u' || lowerCaseC == 'ú' || lowerCaseC == 'ủ' || lowerCaseC == 'ù' || lowerCaseC == 'ụ'
                || lowerCaseC == 'ư' || lowerCaseC == 'ứ' || lowerCaseC == 'ử' || lowerCaseC == 'ừ' || lowerCaseC == 'ự';
    }

    // Phương thức viết hoa ký tự đầu tiên của từ
    private static String capitalizeFirstChar(String word) {
        char firstChar = Character.toUpperCase(word.charAt(0));
        return firstChar + word.substring(1);
    }
}
