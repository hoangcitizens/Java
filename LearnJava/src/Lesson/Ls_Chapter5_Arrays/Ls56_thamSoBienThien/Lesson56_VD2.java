package Lesson.Ls_Chapter5_Arrays.Ls56_thamSoBienThien;

public class Lesson56_VD2 {
    public static void main(String[] args) {
        var line1 = createLine("Hi", "there!");
        var line2 = createLine("Today", "is", "a", "good", "day", "to", "fight");
        var line3 = createLine("This", "is", "Java", "5", "feature");
        System.out.println(STR."Dòng 1: \"\{line1}\"");
        System.out.println(STR."Dòng 2: \"\{line2}\"");
        System.out.println(STR."Dòng 3: \"\{line3}\"");
    }

    /**
     * Phương thức nối các từ lại với nhau thành câu hoàn chỉnh.
     *
     * @param words chứa các từ cần nối
     * @return câu hoàn chỉnh sau khi nối
     */
    public static String createLine(String... words) {
        var line = new StringBuilder();
        for (var word : words) {
            if (!word.isBlank()) {
                line.append(word).append(' ');
            }
        }
        if (!line.isEmpty()) {
            line.deleteCharAt(line.lastIndexOf(" "));
        }
        return line.toString();
    }
}
