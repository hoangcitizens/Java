package Exercise.Ex_Chapter6.Ex61.Ex03_61;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // todo 6: tạo đối tượng tài khoản ngân hàng myBankAccount1
        BankAccount myBankAccount1 = createBankAccount();

        // todo 7: rút tiền ra khỏi tài khoản myBankAccount1
        System.out.println(STR."\nNhập số tiền \{myBankAccount1.accName} muốn rút: ?");
        double withdrawAmount = Double.parseDouble(input.nextLine());
        if (myBankAccount1.withdraw(withdrawAmount)) {
            System.out.println("Rút tiền thành công!");
            myBankAccount1.checkBalance();
        } else {
            System.out.println("Rút tiền thất bại");
        }

        // todo 8: nạp thêm tiền vào tài khoản myBankAccount1
        System.out.println(STR."\nNhập số tiền \{myBankAccount1.accName} muốn nạp: ?");
        double depositAmount = Double.parseDouble(input.nextLine());
        if (myBankAccount1.deposit(depositAmount)) {
            System.out.println("Nạp tiền thành công!");
            myBankAccount1.checkBalance();
        } else {
            System.out.println("Nạp tiền thất bại");
        }

        // todo 9: tạo một đối tượng tài khoản ngân hàng khác myBankAccount2
        BankAccount myBankAccount2 = createBankAccount();

        // todo 10: in ra số dư của hai tài khoản
        System.out.println("\n==> Số dư hai tài khoản trước khi chưa chuyển <==");
        myBankAccount1.checkBalance();
        myBankAccount2.checkBalance();

        // todo 11: chuyển số tiền bất kỳ từ myBankAccount1 đến myBankAccount2
        System.out.println(STR."\nNhập số tiền \{myBankAccount1.accName} muốn chuyển cho \{myBankAccount2.accName}: ?");
        double transferAmount = Double.parseDouble(input.nextLine());
        if (myBankAccount1.transfer(myBankAccount2, transferAmount)) {
            System.out.println("==> Chuyển tiền thành công!");
        } else {
            System.out.println("==> Chuyển tiền thất bại!");
        }

        // todo 12: in ra số dư của hai tài khoản sau khi chuyển
        System.out.println("\n==> Số dư hai tài khoản sau khi chuyển <==");
        myBankAccount1.checkBalance();
        myBankAccount2.checkBalance();

        // todo 13: thanh toán tiền internet với số tiền 165k - 1560k
        System.out.println("Nhập số tiền internet cần thanh toán: ");
        var amount = input.nextDouble();
        if (myBankAccount1.pay("Internet FPT", amount)) {
            System.out.println("==> Thanh toán tiền internet thành công!");
        } else {
            System.out.println("==> Số dư không đủ. Thanh toán tiền internet thất bại.");
        }

        // todo 14: in ra thông tin tài khoản myBankAccount1 và myBankAccount2
        showBankAccountInfo(myBankAccount1);
        showBankAccountInfo(myBankAccount2);
    }

    // todo 4: triển khai phương thức tạo và trả về một tài khoản ngân hàng
    public static BankAccount createBankAccount() {
        Scanner input = new Scanner(System.in);
        System.out.println("================= XIN MỜI NHẬP THÔNG TIN TÀI KHOẢN MỚI =================");
        System.out.print("Số tài khoản: ");
        String accNumber = input.nextLine();
        System.out.print("Tên tài khoản: ");
        String accName = input.nextLine();
        System.out.print("Loại tài khoản: ");
        String accType = input.nextLine();
        System.out.print("Số dư trong tài khoản: ");
        double balance = Double.parseDouble(input.nextLine()); // ngăn không cho trôi lệnh khi nhập một số
        System.out.print("Tên ngân hàng chủ thẻ: ");
        String bankName = input.nextLine();
        // dd: ngày trong trong tháng, MM: tháng trong năm, yyyy: năm
        System.out.print("Ngày phát hành(nhập dưới dạng dd/MM/yyyy): ");
        String startDate = input.nextLine();
        System.out.print("Ngày hết hạn(nhập dưới dạng dd/MM/yyyy): ");
        String endDate = input.nextLine();

        // gán các giá trị cho các thuộc tính của bankAccount
        BankAccount bankAccount = new BankAccount();
        bankAccount.accNumber = accNumber;
        bankAccount.accName = accName;
        bankAccount.accType = accType;
        bankAccount.balance = balance;
        bankAccount.bankName = bankName;
        bankAccount.startDate = startDate;
        bankAccount.endDate = endDate;
        return bankAccount;
    }

    // todo 5: triển khai phương thức static in ra thông tin tài khoản ngân hàng
    public static void showBankAccountInfo(BankAccount bankAccount) {
        var formatter = new DecimalFormat("#,###.##");
        System.out.println("====================== THÔNG TIN TÀI KHOẢN ======================");
        System.out.println(STR."Số tài khoản: \{bankAccount.accNumber}");
        System.out.println(STR."Tên tài khoản: \{bankAccount.accName}");
        System.out.println(STR."Loại tài khoản: \{bankAccount.accType}");
        System.out.println(STR."Số dư tài khoản: \{formatter.format(bankAccount.balance)}");
        System.out.println(STR."Tên ngân hàng phát hành: \{bankAccount.bankName}");
        System.out.println(STR."Ngày phát hành: \{bankAccount.startDate}");
        System.out.println(STR."Ngày hết hạn: \{bankAccount.endDate}");
        System.out.println("=================================================================");
        System.out.println();
    }
}

/**
 * ================= XIN MỜI NHẬP THÔNG TIN TÀI KHOẢN MỚI =================
 * Số tài khoản: 0021000
 * Tên tài khoản: NGUYỄN NGỌC MAI
 * Loại tài khoản: THAN TOÁN
 * Số dư trong tài khoản: 68250000
 * Tên ngân hàng chủ thẻ: WAKANDA BANK
 * Ngày phát hành(nhập dưới dạng dd/MM/yyyy): 25/01/2024
 * Ngày hết hạn(nhập dưới dạng dd/MM/yyyy): 24/04/2029
 * <p>
 * Nhập số tiền NGUYỄN NGỌC MAI muốn rút: ?
 * 3200000
 * Rút tiền thành công!
 * Số dư của tài khoản NGUYỄN NGỌC MAI là 65,050,000
 * <p>
 * Nhập số tiền NGUYỄN NGỌC MAI muốn nạp: ?
 * 99250000
 * Nạp tiền thành công!
 * Số dư của tài khoản NGUYỄN NGỌC MAI là 164,300,000
 * <p>
 * ================= XIN MỜI NHẬP THÔNG TIN TÀI KHOẢN MỚI =================
 * Số tài khoản: 0056000
 * Tên tài khoản: LÝ THỊ THẢO MAI
 * Loại tài khoản: THANH TOÁN
 * Số dư trong tài khoản: 69780000
 * Tên ngân hàng chủ thẻ: WAKANDA BANK
 * Ngày phát hành(nhập dưới dạng dd/MM/yyyy): 20/01/2024
 * Ngày hết hạn(nhập dưới dạng dd/MM/yyyy): 20/01/2029
 * <p>
 * ==> Số dư hai tài khoản trước khi chưa chuyển <==
 * Số dư của tài khoản NGUYỄN NGỌC MAI là 164,300,000
 * Số dư của tài khoản LÝ THỊ THẢO MAI là 69,780,000
 * <p>
 * Nhập số tiền NGUYỄN NGỌC MAI muốn chuyển cho LÝ THỊ THẢO MAI: ?
 * 14520000
 * ==> Chuyển tiền thành công!
 * <p>
 * ==> Số dư hai tài khoản sau khi chuyển <==
 * Số dư của tài khoản NGUYỄN NGỌC MAI là 149,780,000
 * Số dư của tài khoản LÝ THỊ THẢO MAI là 84,300,000
 * Nhập số tiền internet cần thanh toán:
 * 720000
 * Thanh toán dịch vụ Internet FPT số tiền: 720,000
 * ==> Thanh toán tiền internet thành công!
 * ====================== THÔNG TIN TÀI KHOẢN ======================
 * Số tài khoản: 0021000
 * Tên tài khoản: NGUYỄN NGỌC MAI
 * Loại tài khoản: THAN TOÁN
 * Số dư tài khoản: 149,060,000
 * Tên ngân hàng phát hành: WAKANDA BANK
 * Ngày phát hành: 25/01/2024
 * Ngày hết hạn: 24/04/2029
 * =================================================================
 * <p>
 * ====================== THÔNG TIN TÀI KHOẢN ======================
 * Số tài khoản: 0056000
 * Tên tài khoản: LÝ THỊ THẢO MAI
 * Loại tài khoản: THANH TOÁN
 * Số dư tài khoản: 84,300,000
 * Tên ngân hàng phát hành: WAKANDA BANK
 * Ngày phát hành: 20/01/2024
 * Ngày hết hạn: 20/01/2029
 * =================================================================
 */
