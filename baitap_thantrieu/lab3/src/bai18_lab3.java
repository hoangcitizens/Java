/*
    Bài 18. Tính giá trị của một số viết dưới dạng LA MÃ.
    Ví dụ: MDCLXVI = 1666. M: 1000 ; D: 500 ; C: 100; L: 50; X :10 ; V: 5 ; I: 1
 */
import java.util.HashMap;
import java.util.Map;
public class bai18_lab3 {
    public static void main(String[] args) {
        String roman = "MDCLXVI";
        int result = romanToInteger(roman);
        System.out.println(result);
    }
    public static int romanToInteger(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int result = 0;
        int prev = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            int curr = map.get(s.charAt(i));
            if (curr < prev) {
                result -= curr;
            } else {
                result += curr;
            }
            prev = curr;
        }
        return result;
    }
}

