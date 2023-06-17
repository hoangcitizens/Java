/*
    Bài 14. Xây dựng tập thao tác với các số nguyên lớn (nhiều hơn 20 chữ số)
        a) Tổng hai số nguyên lớn
        b) Hiệu hai số nguyên lớn
        c) Tích hai số nguyên lớn
        d) Thương hai số nguyên lớn
 */

import java.math.BigDecimal;
import java.math.BigInteger;
public class bai14_lab3 {
    public static void main(String[] args) {
        BigInteger number1, number2;
        number1 = new BigInteger("44444444444444444444444444");
        number2 = new BigInteger("-99999999999999999999999");
        System.out.printf("Tổng: " + number1.add(number2));
        System.out.printf("\nHiệu: " + number1.subtract(number2));
        System.out.printf("\nTích: " + number1.multiply(number2));
        System.out.printf("\nThương: " + number1.divide(number2));
    }
}
