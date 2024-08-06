package Exercise.Ex_Chapter6.Ex67.Ex06_67;

/**
 * @author Branium Academy
 * @version 2024.02
 * @see <a href="https://braniumacademy.net/">Trang chủ</a>
 */

public enum Type {
    GENERAL("Đại cương"),
    MAJOR_FOUNDATION("Cơ sở ngành"),
    MAJOR_SPECIALIZED("Chuyên ngành"),
    ELECTIVE("Tự chọn"),
    COMPULSORY("Bắt buộc");

    private final String value;

    Type(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
