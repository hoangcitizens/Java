package Lesson.Ls_Chapter4_Methods.Ls43_Package;

public class Calculator {
    public static double add(double a, double b, double c) {
        return a + b + c;
    }
    public static int adds(int ...numbers) {
        int sum = 0;
        for (var item : numbers)
        {
            sum += item;
        }
        return sum;
    }
}
