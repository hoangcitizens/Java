package Exercise.Ex_Chapter6.Ex67.Ex05_67;

/**
 * @author Branium Academy
 * @version 2024.02
 * @see <a href="https://braniumacademy.net/">Trang chủ</a>
 */
public enum Category {
    NEWS("thời sự"),
    WORLD("thế giới"),
    BUSINESS("kinh doanh"),
    SCIENCE("khoa học"),
    LAW("pháp luật"),
    TECHNOLOGY("công nghệ"),
    EDUCATION("giáo dục"),
    CAR("xe hơi"),
    RELAX("thư giãn");

    private final String value;

    Category(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
