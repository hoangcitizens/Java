package Exercise.Ex_Chapter6.Ex63.Ex03_63;

/**
 * Lớp mô tả thông tin và hành động của tài khoản ngân hàng.
 *
 * @author Branium Academy
 * @version 2024.02
 * @see <a href="https://braniumacademy.net">Trang chủ</a>
 */

@SuppressWarnings("unused")
public class BankAccount {
    // todo 1: triển khai các thuộc tính private thể hiện tính đóng gói dữ liệu
    private String id;
    private String name;
    private String type;
    private double balance;
    private String issuingBank;
    private String startDate;
    private String endDate;
    private int pin;
    private boolean enabled;

    // todo 3: sử dụng các setter tương ứng trong constructor
    public BankAccount() {
        id = "";
        name = "";
        type = "";
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

    public BankAccount(String id, String name, String type, double balance,
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
        return STR."==> Số dư hiện tại của tài khoản \{name} là: \{balance} <==";
    }

    public void payService(String service) {
        System.out.println(STR."==> \{name} đang thành toán dịch vụ \{service}");
    }

    // todo 2: tạo các getter và setter
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
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
