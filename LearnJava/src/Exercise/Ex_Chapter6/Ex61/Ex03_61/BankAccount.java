package Exercise.Ex_Chapter6.Ex61.Ex03_61;

/*
    Bài 3. Giả định thông tin về tài khoản ngân hàng ở Wakanda gồm: số tài khoản, tên tài khoản, loại tài khoản, số dư,
    tên ngân hàng phát hành, ngày phát hành, ngày hết hạn. Phương thức khởi tạo ồm mặc định, một phương thức khác nhận
    vào số tài khoản và tên chủ thẻ. Hành động có thể thực hiện gồm: nạp tiền vào tài khoản, rút tiền khỏi tài khoản,
    chuyển khoản, kiểm tra số dư, thanh toán các giao dịch khác như điện nước, vé máy bay, … Thiết kế lớp mô tả đối
    tượng tài khoản ngân hàng như trên. Sau đó tạo các tài khoản ngân hàng bất kỳ trong hàm main và sử dụng các thuộc
    tính, phương thức tương ứng
 */

import java.text.DecimalFormat;

public class BankAccount {

    // todo 1: triển khai các thuộc tính
    public String accNumber; // số tài khoản
    public String accName; // tên tài khoản
    public String accType; // loại tài khoản
    public double balance; // số dư
    public String bankName; // tên ngân hàng
    public String startDate; // ngày phát hành
    public String endDate; // ngày hết hạn


    // todo 2: triển khai các phương thức khởi tạo
    public BankAccount() {
    }

    public BankAccount(String accNumber, String accName) {
        this.accNumber = accNumber;
        this.accName = accName;
    }

    // todo 3: triển khai các phương thức thể hiện hành động

    /**
     * Phương thức thể hiện hành động nạp tiền. Số tiền cần nạp phải là số dương.
     *
     * @param amount số lượng tiền muốn nạp
     * @return true nếu tiền được nạp thành công, false nếu không thành công
     */
    public boolean deposit(double amount) {
        if (amount > 0.0d) {
            balance += amount;
            return true;
        }
        return false;
    }


    /**
     * Phương thức thể hiện hành động rút tiền. Việc rút tiền chỉ thực hiện được
     * nếu số tiền cần rút nhỏ hơn hoặc bằng số dư hiện có trong tài khoản chủ thẻ.
     *
     * @param amount số tiền muốn rút
     * @return true nếu tiền được rút thành công, false nếu không thành công
     */
    public boolean withdraw(double amount) {
        if (amount > 0.0d && amount <= balance) {
            balance -= amount;
            return true;
        }
        return false;
    }


    /**
     * Phương thức để chuyển tiền cho tài khoản khác. Việc chuyển khoản chỉ thành công
     * khi số tiền cần chuyển nhỏ hơn hoặc bằng số tiền hiện có trong số dư tài khoản chuyển.
     *
     * @param other  tài khoản khác
     * @param amount số tiền muốn chuyển cho tài khoản đó
     * @return true nếu chuyển thành công, false nếu chuyển không thành công
     */
    public boolean transfer(BankAccount other, double amount) {
        if (amount > 0.0d && this.balance > 0.0d && amount <= this.balance) {
            this.balance -= amount;
            other.balance += amount;
            return true;
        }
        return false;
    }

    /**
     * Phương thức kiểm tra số dư hiện thời của tài khoản
     */
    public void checkBalance() {
        var formatter = new DecimalFormat("#,###.##");
        System.out.println(STR."Số dư của tài khoản \{accName} là \{formatter.format(balance)}");
    }

    /**
     * Phương thức thanh toán dịch khác với số tiền cho trước. Khi thanh toán số tiền
     * cần thanh toán phải nhỏ hơn hoặc bằng số tiền hiện có trong số dư tài khoản.
     *
     * @param service tên dịch vụ
     * @param amount  số tiền cần thanh toán
     * @return true nếu thanh toán thành công và false nếu ngược lại
     */
    public boolean pay(String service, double amount) {
        var formatter = new DecimalFormat("#,###.##");
        System.out.println(STR."Thanh toán dịch vụ \{service} số tiền: \{formatter.format(amount)}");
        if (balance >= amount) {
            balance -= amount;
            return true;
        }
        return false;
    }
}
