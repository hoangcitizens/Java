package Exercise.Ex_Chapter6.Ex64.Ex07_64;

// todo 4: triển khai enum mô tả số tiền thưởng của các mức học bổng
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
