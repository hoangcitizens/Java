package Exercise.Ex_Chapter6.Ex64.Ex07_64;

// todo 1: triển khai enum mô tả các mức học bổng
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
