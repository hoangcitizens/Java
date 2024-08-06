package Exercise.Ex_Chapter6.Ex66.Ex04_66;

public enum ItemType {
    LUONG_THUC("LƯƠNG THỰC"),
    THUC_PHAM("THỰC PHẨM"),
    DUOC_PHAM("DƯỢC PHẨM"),
    DIEN_TU("ĐIỆN TỬ"),
    GIA_DUNG("GIA DỤNG"),
    MAY_MAC("MAY MẶC"),
    VAT_LIEU_XAY_DUNG("VL XÂY DỰNG");

    private final String value;

    ItemType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
