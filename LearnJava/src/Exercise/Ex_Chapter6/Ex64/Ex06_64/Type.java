package Exercise.Ex_Chapter6.Ex64.Ex06_64;

// todo 1: triển khai lớp enum chứa các loại môn học bao gồm: đại cương, cơ sở ngành, chuyên ngành, tự chọn, bắt buộc.
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
