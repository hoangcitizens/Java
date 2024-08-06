package Exercise.Ex_Chapter6.Ex66.Ex06_66;

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
