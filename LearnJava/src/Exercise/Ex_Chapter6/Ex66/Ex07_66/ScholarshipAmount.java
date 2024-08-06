package Exercise.Ex_Chapter6.Ex66.Ex07_66;

public enum ScholarshipAmount {
    EXCELLENCE(15_000_000),
    VERY_GOOD(8_000_000),
    GOOD(4_000_000),
    FAILED(0);

    private final int value;

    ScholarshipAmount(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
