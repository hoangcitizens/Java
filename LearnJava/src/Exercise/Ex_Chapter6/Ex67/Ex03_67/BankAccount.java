package Exercise.Ex_Chapter6.Ex67.Ex03_67;

import java.text.DecimalFormat;

/**
 * Lớp mô tả thông tin và hành động của tài khoản ngân hàng.
 *
 * @author Branium Academy
 * @version 2024.02
 * @see <a href="https://braniumacademy.net">Trang chủ</a>
 */

@SuppressWarnings("unused")
public class BankAccount {
    private static int autoId = 100001;
    private String id;
    private String name;
    private AccountType type;
    private double balance;
    private String issuingBank;
    private String startDate;
    private String endDate;
    private int pin;
    private boolean enabled;

    public BankAccount() {
        id = "";
        name = "";
        type = AccountType.CHECKING_ACCOUNT;
        balance = 0.0d;
        issuingBank = "";
        startDate = "";
        endDate = "";
        pin = 0;
        enabled = false;
    }

    public BankAccount(String id, String name) {
        setId(id);
        setName(name);
    }

    public BankAccount(String id, String name, AccountType type, double balance,
                       String issuingBank, String startDate, String endDate, int pin, boolean enabled) {
        this(id, name);
        setType(type);
        setBalance(balance);
        setIssuingBank(issuingBank);
        setStartDate(startDate);
        setEndDate(endDate);
        setPin(pin);
        setEnabled(enabled);
    }

    public void deposit(double amount) {
        if (enabled) {
            if (amount > 0) {
                balance += amount;
                System.out.println(STR."==> Nạp số tiền \{amount} cho Số tài khoản \{id} thành công <==");
                System.out.println(checkBalance());
            } else {
                System.out.println("==> Số tiền cần nạp phải lớn hơn 0 <==");
            }
        } else {
            System.out.println(STR."==> Số tài khoản \{id} đã bị khóa. Không thể thực hiện hành động <==");
        }
    }

    public void withdraw(double amount) {
        if (enabled) {
            if (balance > 0) {
                if (amount > 0 && amount <= balance) {
                    balance -= amount;
                    System.out.println(STR."==> Rút số tiền \{amount} khỏi tài khoản \{name} thành công <==");
                    System.out.println(checkBalance());
                } else {
                    System.out.println("==> Số tiền rút không hợp lệ hoặc vượt quá số dư tài khoản <==");
                }
            } else {
                System.out.println(STR."==> Số tài khoản \{id} có số dư = 0. Không thể thực hiện rút! <==");
            }
        } else {
            System.out.println(STR."==> Số tài khoản \{id} đã bị khóa. Không thể thực hiện hành động <==");
        }
    }

    public void transfer(double amount, BankAccount otherAcc) {
        if (enabled) {
            if (otherAcc.enabled) {
                if (balance > 0) {
                    if (amount > 0 && amount <= balance) {
                        balance -= amount;
                        otherAcc.balance += amount;
                        System.out.println(STR."==> Chuyển số tiền \{amount} cho số tài khoản \{otherAcc.id} thành công <==");
                        System.out.println(checkBalance());
                        System.out.println(otherAcc.checkBalance());
                    } else {
                        System.out.println("==> Số tiền chuyển không hợp lệ hoặc vượt quá số dư tài khoản <==");
                    }
                } else {
                    System.out.println(STR."==> Số tài khoản \{name} có số dư = 0. Không thể thực hiện chuyển tiền! <==");
                }
            } else {
                System.out.println(STR."==> Số tài khoản \{otherAcc.id} đã bị khóa. Không thể thực hiện hành động <==");
            }
        } else {
            System.out.println(STR."==> Số tài khoản \{id} đã bị khóa. Không thể thực hiện hành động <==");
        }
    }

    public String checkBalance() {
        var formatter = new DecimalFormat("#,###.##");
        return STR."==> Số tài khoản: \{id}\n"
                + STR."==> Tên tài khoản: \{name}\n"
                + STR."==> Loại tài khoản: \{type.getValue()}\n"
                + STR."==> Trạng thái tài khoản: \{enabled ? "Đang hoạt động" : "Đã bị khóa"}\n"
                + STR."==> Số dư hiện tại: \{formatter.format(balance)}$ <==";
    }

    public void payService(String service) {
        System.out.println(STR."==> \{name} đang thành toán dịch vụ \{service}");
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = (id == null || id.isBlank()) ? String.valueOf(autoId++) : id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(AccountType type) {
        this.type = type;
    }

    public AccountType getType() {
        return this.type;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setIssuingBank(String issuingBank) {
        this.issuingBank = issuingBank;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }
}
