package Exercise.Ex_Chapter6.Ex64.Ex07_64;

// todo 2: triển khai enum mô tả các cấp học lực
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
