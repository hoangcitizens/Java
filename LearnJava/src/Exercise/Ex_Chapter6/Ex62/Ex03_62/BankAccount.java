package Exercise.Ex_Chapter6.Ex62.Ex03_62;

/*
    Bài 3. Giả định thông tin về tài khoản ngân hàng ở Wakanda gồm: số tài khoản 6 chữ số(ví dụ 002159), tên tài khoản,
    loại tài khoản, số dư, tên ngân hàng phát hành, ngày phát hành, ngày hết hạn, mã PIN 6 số, trạng thái tài khoản.
    Phương thức khởi tạo gồm mặc định, một phương thức khác nhận vào số tài khoản và tên chủ thẻ. Hành động có thể thực
    hiện gồm: nạp tiền vào tài khoản, rút tiền khỏi tài khoản, chuyển khoản, kiểm tra số dư, thanh toán các giao dịch
    khác như điện nước, vé xem phim, vé máy bay, … Thiết kế lớp mô tả đối tượng tài khoản ngân hàng như trên. Bổ sung
    các constructor và tái sử dụng constructor sao cho phù hợp. Yêu cầu gọi từ constructor ít tham số sang constructor
    nhiều tham số khi tái sử dụng code. Viết chương trình có menu cho phép thực hiện các chức năng sau:
        1. Thêm mới tài khoản vào danh sách các tài khoản(lưu trong mảng). Mỗi tài khoản với một số tài khoản chỉ được
           xuất hiện một lần trong danh sách.
        2. Xóa tài khoản theo số tài khoản cho trước.
        3. Xem số dư theo số tài khoản và mã PIN.
        4. Nạp tiền vào tài khoản, số tiền cần nạp phải > 0.
        5. Rút tiền khỏi tài khoản, khi rút phải cung cấp số tài khoản và mã PIN.
        6. Chuyển tiền từ tài khoản A sang tài khoản B. Khi chuyển cần cung cấp mã PIN. Chỉ có thể chuyển khoản khi tài
           khoản A và B cùng tồn tại và A khác B, mã PIN của tài khoản A trùng khớp.
        7. Thanh toán hóa đơn điện nước, khi thực hiện cần cung cấp đúng mã PIN.
        8. Kích hoạt lại tài khoản, khi thực hiện cần cung cấp mã PIN cũ.
        9. Khóa tài khoản, khi thực hiện cần cung cấp mã PIN hiện tại.
        10. Đổi mã PIN, cần cung cấp mã PIN hiện tại, xác nhận mã PIN mới trùng khớp thì mới đổi thành công.
        11. Kết thúc chương trình.
            Lưu ý: khi thực hiện các thao tác từ 3 đến 11 thì tài khoản phải đang hoạt động mới có hiệu lực.
        Nếu tài khoản đã bị khóa thì không thể thực hiện.
 */

public class BankAccount {
    // todo 1: triển khai các thuộc tính theo yêu cầu đề bài
    public String id;
    public String name;
    public String type;  // NORMAL, PREMIUM
    public double balance;
    public String issuingBank;
    public String startDate;
    public String endDate;
    public int pin;
    public boolean enabled;

    // todo 2: triển khai hàm khởi tạo mặc định và các hàm khởi tạo có tham số phù hợp
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
        this.id = id;
        this.name = name;
    }

    public BankAccount(String id, String name, String type, double balance,
                       String issuingBank, String startDate, String endDate, int pin, boolean enabled) {
        this(id, name);
        this.type = type;
        this.balance = balance;
        this.issuingBank = issuingBank;
        this.startDate = startDate;
        this.endDate = endDate;
        this.pin = pin;
        this.enabled = enabled;
    }

    // todo 3: triển khai các phương thức thể hiện hành động của tài khoản ngân hàng
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
        return STR."==> Số dư hiện tại của tài khoản \{id} là: \{balance} <==";
    }

    public void payService(String service) {
        System.out.println(STR."==> \{name} đang thành toán dịch vụ \{service}");
    }
}

