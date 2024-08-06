package Lesson.Ls_Chapter6_OOP.Ls64_Enum;

public class Lesson64_VD1 {
    // enum mô tả tập các mùa trong năm
    enum Season {
        // các hằng số
        SPRING("MÙA XUÂN"), SUMMER("MÙA HẠ"),
        FALL("MÙA THU"), WINTER("MÙA ĐÔNG");
        // phương thức khởi tạo
        Season(String name) {
            seasonName = name;
        }
        // tên mùa trong tiếng Việt
        private final String seasonName;
        // phương thức trả về tên mùa trong tiếng việt
        public String getSeasonName() {
            return seasonName;
        }
    }

    public static void main(String[] args) {
        Season winter = Season.WINTER;
        System.out.println(STR."Tên mùa trong tiếng Anh: \{winter}");
        System.out.println(STR."Tên mùa trong tiếng Việt: \{winter.getSeasonName()}");
        System.out.println(Season.valueOf("WINTER"));
    }
}
