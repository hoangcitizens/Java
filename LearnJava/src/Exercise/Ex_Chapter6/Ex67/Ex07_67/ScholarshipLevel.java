package Exercise.Ex_Chapter6.Ex67.Ex07_67;

public enum ScholarshipLevel {
    EXCELLENCE("Xuất Sắc"),
    VERY_GOOD("Giỏi"),
    GOOD("Khá"),
    FAILED("Không đạt");
    private final String value;

    ScholarshipLevel(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
