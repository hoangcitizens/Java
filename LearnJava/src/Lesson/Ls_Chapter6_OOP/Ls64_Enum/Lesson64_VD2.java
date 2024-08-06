package Lesson.Ls_Chapter6_OOP.Ls64_Enum;

public class Lesson64_VD2 {
    // enum mô tả size quần áo
    public enum Size{
        EXTRA_SMALL, SMALL, MEDIUM, LARGE, EXTRA_LARGE
    }

    public static void main(String[] args) {
        // minh họa sử dụng
        Size mySize = Size.EXTRA_LARGE;
        Size myBrotherSize = Size.LARGE;

        if(myBrotherSize == mySize) {
            System.out.println("We can share our clothes with each other.");
        } else {
            System.out.println("We cannot share our clothes with each other.");
        }
    }
}
