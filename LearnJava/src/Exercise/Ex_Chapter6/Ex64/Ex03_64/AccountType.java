package Exercise.Ex_Chapter6.Ex64.Ex03_64;

// todo 1: định nghĩa một enum mô tả các loại tài khoản ngân hàng của Wakanda
public enum AccountType {
    CREDIT_ACCOUNT("TK TÍN DỤNG"),
    SAVINGS_ACCOUNT("TK TIẾT KIỆM"),
    SALARY_ACCOUNT("TK LƯƠNG"),
    CHECKING_ACCOUNT("TK THANH TOÁN"),
    BUSINESS_ACCOUNT("TK DOANH NGHIỆP"),
    LOAN_ACCOUNT("TK VAY");
    private final String value;

    AccountType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
