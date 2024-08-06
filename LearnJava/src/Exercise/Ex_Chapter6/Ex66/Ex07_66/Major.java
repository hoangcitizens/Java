package Exercise.Ex_Chapter6.Ex66.Ex07_66;

public enum Major {
    DT("Điện tử"),
    VT("Viễn thông"),
    CNTT("Công nghệ thông tin"),
    ATTT("An toàn thông tin"),
    QTKD("Quản trị kinh doanh");

    private final String value;

    Major(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
