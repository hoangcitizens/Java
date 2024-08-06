package Exercise.Ex_Chapter6.Ex66.Ex07_66;

public enum AcademicAbility {
    HIGHT_DISTINCTION("Xuất sắc"),
    DISTINCTION("Giỏi"),
    CREDIT("Khá"),
    AVERAGE("Trung bình"),
    WEAK("Yếu");

    private final String value;

    AcademicAbility(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
