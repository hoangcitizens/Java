package Exercise.Ex_Chapter6.Ex67.Ex03_67;


import java.util.ArrayList;
import java.util.Scanner;

/*
    Bài 3. Giả định thông tin về tài khoản ngân hàng ở Wakanda gồm: số tài khoản 6 chữ số tự động tăng từ 100001, tên
    tài khoản, loại tài khoản, số dư, tên ngân hàng phát hành, ngày phát hành, ngày hết hạn, mã PIN 6 số, trạng thái tài
    khoản. Trong đó loại tài khoản gồm có: tài khoản thanh toán, tài khoản tiết kiệm, tài khoản tín dụng, tài khoản lương,
    tài khoản doanh nghiệp và tài khoản vay. Phương thức khởi tạo gồm mặc định, một phương thức khác nhận vào số tài khoản
    và tên chủ thẻ. Hành động có thể thực hiện gồm: nạp tiền vào tài khoản, rút tiền khỏi tài khoản, chuyển khoản, kiểm
    tra số dư, thanh toán các giao dịch khác như điện nước, vé xem phim, vé máy bay,… Thiết kế lớp mô tả đối tượng tài
    khoản ngân hàng như trên. Bổ sung các constructor và tái sử dụng constructor sao cho phù hợp, sử dụng tính đóng gói
    dữ liệu và tự bổ sung các phương thức phụ trợ cần thiết. Yêu cầu gọi từ constructor ít tham số sang constructor
    nhiều tham số khi tái sử dụng code. Viết chương trình có menu cho phép thực hiện các chức năng sau:
        1. Thêm mới tài khoản vào danh sách các tài khoản. Mỗi tài khoản xuất hiện không quá 1 lần trong danh sách này.
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
        Lưu ý: khi thực hiện các thao tác từ 3 đến 10 thì tài khoản phải đang hoạt động mới có hiệu lực.
        Nếu tài khoản đã bị khóa thì không thể thực hiện.
 */
// todo 1: sử dụng ArrayList thay cho mảng và sửa đổi code sao cho hợp lý
public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<BankAccount> accounts = new ArrayList<>();
        createFakeAccounts(accounts);

        int choice;
        do {
            displayMenu();
            System.out.print("==> Xin mời chọn(1-11): ");

            choice = Integer.parseInt(input.nextLine());

            switch (choice) {
                case 1 -> {
                    var bankAccount = createBankAccount(input);
                    accounts.add(bankAccount);
                    System.out.println("==> Thêm tài khoản thành công <==");
                }
                case 2 -> {
                    if (!accounts.isEmpty()) {
                        deleteBankAccountById(accounts, input);
                    } else {
                        System.err.println("==> Danh sách tài khoản rỗng. <==");
                    }
                }
                case 3 -> {
                    if (!accounts.isEmpty()) {
                        showBalanceById(accounts, input);
                    } else {
                        System.err.println("==> Danh sách tài khoản rỗng. <==");
                    }
                }
                case 4 -> {
                    if (!accounts.isEmpty()) {
                        depositBankAccountById(accounts, input);
                    } else {
                        System.err.println("==> Danh sách tài khoản rỗng. <==");
                    }
                }
                case 5 -> {
                    if (!accounts.isEmpty()) {
                        withdrawBankAccountById(accounts, input);
                    } else {
                        System.err.println("==> Danh sách tài khoản rỗng. <==");
                    }
                }
                case 6 -> {
                    if (!accounts.isEmpty()) {
                        transferBankAccountById(accounts, input);
                    } else {
                        System.err.println("==> Danh sách tài khoản rỗng. <==");
                    }
                }
                case 7 -> {
                    if (!accounts.isEmpty()) {
                        payServiceBankAccountById(accounts, input);
                    } else {
                        System.err.println("==> Danh sách tài khoản rỗng. <==");
                    }
                }
                case 8 -> {
                    if (!accounts.isEmpty()) {
                        reactivateBankAccountById(accounts, input);
                    } else {
                        System.err.println("==> Danh sách tài khoản rỗng. <==");
                    }
                }
                case 9 -> {
                    if (!accounts.isEmpty()) {
                        deactivateBankAccountById(accounts, input);
                    } else {
                        System.err.println("==> Danh sách tài khoản rỗng. <==");
                    }
                }
                case 10 -> {
                    if (!accounts.isEmpty()) {
                        changeBankAccountPinById(accounts, input);
                    } else {
                        System.err.println("==> Danh sách tài khoản rỗng. <==");
                    }
                }
                case 11 -> {
                    System.err.println("Bạn có muốn thực hiện giao dịch khác không ? (Y/N)");
                    String isEnabled = input.nextLine();
                    if (isEnabled.equalsIgnoreCase("y")) {
                        choice = 0;
                    } else {
                        System.err.println("==> Cảm ơn bạn đã sử dụng dịch vụ của chúng tôi ! <==");
                    }
                }
                default -> System.err.println("==> Sai chức năng, vui lòng nhập số từ 1 -> 11 <==");
            }
        } while (choice != 11);
    }

    private static void createFakeAccounts(ArrayList<BankAccount> accounts) {
        accounts.add(new BankAccount(null, "TRAN VAN NAM", AccountType.CHECKING_ACCOUNT, 99000000, "WBank", "01/01/2024", "01/01/2029", 111111, true));
        accounts.add(new BankAccount(null, "TRAN DINH NAM", AccountType.CHECKING_ACCOUNT, 56000000, "WBank", "01/01/2024", "01/01/2029", 222222, true));
        accounts.add(new BankAccount(null, "TRAN BA NAM", AccountType.CHECKING_ACCOUNT, 52000000, "WBank", "01/01/2024", "01/01/2029", 333333, true));
        accounts.add(new BankAccount(null, "TRAN HUU NAM", AccountType.CHECKING_ACCOUNT, 19000000, "WBank", "01/01/2024", "01/01/2029", 444444, true));
        accounts.add(new BankAccount(null, "TRAN VU NAM", AccountType.CHECKING_ACCOUNT, 90000000, "WBank", "01/01/2024", "01/01/2029", 555555, true));
    }

    private static void displayMenu() {
        System.out.println("========== CÁC CHỨC NĂNG ==========");
        System.out.println("1. Thêm mới tài khoản.");
        System.out.println("2. Xóa tài khoản.");
        System.out.println("3. Xem số dư tài khoản.");
        System.out.println("4. Nạp tiền vào tài khoản.");
        System.out.println("5. Rút tiền khỏi tài khoản.");
        System.out.println("6. Chuyển tiền cho tài khoản khác.");
        System.out.println("7. Thanh toán hóa đơn điện nước.");
        System.out.println("8. Kích hoạt lại tài khoản.");
        System.out.println("9. Khóa tài khoản.");
        System.out.println("10. Đổi mã pin tài khoản.");
        System.out.println("11. Kết thúc chương trình.");
    }

    private static BankAccount createBankAccount(Scanner input) {
        System.out.print("Tên tài khoản: ");
        String name = input.nextLine().trim().toUpperCase();
        System.out.print("""
                Loại tài khoản:
                1. CREDIT.
                2. SAVINGS
                3. SALARY.
                4. CHECKING
                5. BUSINESS.
                6. LOAN.
                Xin mời bạn lựa chọn(1-6):\s""");
        int typeNumber = Integer.parseInt(input.nextLine());
        var type = getType(typeNumber);
        System.out.print("Số dư tài khoản: ");
        double balance = Double.parseDouble(input.nextLine());
        System.out.print("Ngân hàng phát hành: ");
        String issuingBank = input.nextLine().toUpperCase();
        System.out.print("Ngày phát hành: ");
        String startDate = input.nextLine();
        System.out.print("Ngày hết hạn: ");
        String endDate = input.nextLine();
        System.out.print("Mã pin 6 số: ");
        int pin = Integer.parseInt(input.nextLine());
        System.out.print("Trạng thái tài khoản (0 là bị khóa, 1 là kích hoạt): ");
        boolean enabled = Integer.parseInt(input.nextLine()) == 1;
        return new BankAccount(null, name, type, balance, issuingBank, startDate, endDate, pin, enabled);
    }

    // lấy loại tài khoản từ lựa chọn cho trước:
    private static AccountType getType(int type) {
        return switch (type) {
            case 1 -> AccountType.CREDIT_ACCOUNT;
            case 2 -> AccountType.SAVINGS_ACCOUNT;
            case 3 -> AccountType.SALARY_ACCOUNT;
            case 4 -> AccountType.CHECKING_ACCOUNT;
            case 5 -> AccountType.BUSINESS_ACCOUNT;
            default -> AccountType.LOAN_ACCOUNT;
        };
    }

    private static void deleteBankAccountById(ArrayList<BankAccount> accounts, Scanner input) {
        System.out.println("Nhập tài khoản cần xóa: ");
        String id = input.nextLine();
        int index = findBankAccountById(accounts, id);
        if (index != -1) {
            accounts.remove(index);
            System.out.println(STR."==> Xóa tài khoản '\{id}' thành công <==");
        } else {
            System.err.println(STR."==> Không tìm thấy tài khoản '\{id}' <==");
        }
    }

    private static int findBankAccountById(ArrayList<BankAccount> accounts, String id) {
        for (int i = 0; i < accounts.size(); i++) {
            if (accounts.get(i) != null && accounts.get(i).getId().equals(id)) {
                return i;  // trả về vị trí của bankAccount nếu tồn tại
            }
        }
        return -1; // trả về -1 nếu không tồn tại
    }

    private static void showBalanceById(ArrayList<BankAccount> accounts, Scanner input) {
        System.out.print("Nhập tài khoản: ");
        String id = input.nextLine();
        int index = findBankAccountById(accounts, id);
        if (index != -1) {
            BankAccount bankAccount = accounts.get(index);
            if (bankAccount.isEnabled()) {
                boolean pinCheckResult = checkBankAccountPin(bankAccount, input);
                System.err.println(STR."\{pinCheckResult
                        ? bankAccount.checkBalance()
                        : "==> Mã pin không đúng! <=="}"
                );
            } else {
                System.err.println(STR."==> Tài khoản \{bankAccount.getId()} đã bị khóa. Không thể thực hiện giao dịch <==");
            }
        } else {
            System.err.println(STR."==> Không tìm thấy tài khoản '\{id}' <==");
        }
    }

    private static boolean checkBankAccountPin(BankAccount bankAccount, Scanner input) {
        System.out.println("Nhập mã pin: ");
        int pin = Integer.parseInt(input.nextLine());
        return bankAccount.getPin() == pin;
    }

    private static void depositBankAccountById(ArrayList<BankAccount> accounts, Scanner input) {
        System.out.println("Tài khoản cần nạp tiền: ");
        String id = input.nextLine();
        int index = findBankAccountById(accounts, id);
        if (index != -1) {
            System.out.println("Số tiền cần nạp: ");
            var amount = Double.parseDouble(input.nextLine());
            BankAccount bankAccount = accounts.get(index);
            bankAccount.deposit(amount);
        } else {
            System.err.println(STR."==> Không tìm thấy tài khoản '\{id}' <==");
        }
    }

    private static void withdrawBankAccountById(ArrayList<BankAccount> accounts, Scanner input) {
        System.out.println("Tài khoản cần rút tiền: ");
        String id = input.nextLine();
        int index = findBankAccountById(accounts, id);
        if (index != -1) {
            System.out.println("Số tiền cần rút: ");
            var amount = Double.parseDouble(input.nextLine());
            BankAccount bankAccount = accounts.get(index);
            boolean pinCheckResult = checkBankAccountPin(bankAccount, input);
            if (pinCheckResult) {
                bankAccount.withdraw(amount);
            } else {
                System.err.println(STR."==> Mã pin của tài khoản '\{bankAccount.getId()}' không đúng! <==");
            }
        } else {
            System.err.println(STR."==> Không tìm thấy tài khoản '\{id}' <==");
        }
    }

    private static void transferBankAccountById(ArrayList<BankAccount> accounts, Scanner input) {
        System.out.println("Tài khoản chuyển tiền: ");
        String idAcc1 = input.nextLine();
        System.out.println("Tài khoản nhận tiền: ");
        String idAcc2 = input.nextLine();
        var indexAcc1 = findBankAccountById(accounts, idAcc1);
        var indexAcc2 = findBankAccountById(accounts, idAcc2);
        if (indexAcc1 != indexAcc2) {
            if (indexAcc1 != -1) {
                if (indexAcc2 != -1) {
                    System.out.println("Số tiền cần chuyển: ");
                    var amount = Double.parseDouble(input.nextLine());
                    BankAccount bankAccount1 = accounts.get(indexAcc1);
                    boolean pinCheckResult1 = checkBankAccountPin(bankAccount1, input);
                    BankAccount bankAccount2 = accounts.get(indexAcc2);
                    if (pinCheckResult1) {
                        bankAccount1.transfer(amount, bankAccount2);
                    } else {
                        System.err.println(STR."==> Mã pin của tài khoản '\{bankAccount1.getId()}' không đúng! <==");
                    }
                } else {
                    System.err.println(STR."==> Không tìm thấy tài khoản '\{idAcc2}' <==");
                }
            } else {
                System.err.println(STR."==> Không tìm thấy tài khoản '\{idAcc1}' <==");
            }
        } else {
            System.err.println("==> Tài khoản bị trùng khớp, vui lòng thử lại! <==");
        }
    }

    private static void payServiceBankAccountById(ArrayList<BankAccount> accounts, Scanner input) {
        System.out.println("Tài khoản cần thanh toán: ");
        String id = input.nextLine();
        int index = findBankAccountById(accounts, id);
        if (index != -1) {
            System.out.println("Dịch vụ cần thanh toán: ");
            var service = input.nextLine();
            BankAccount bankAccount = accounts.get(index);
            if (bankAccount.isEnabled()) {
                boolean pinCheckResult = checkBankAccountPin(bankAccount, input);
                if (pinCheckResult) {
                    bankAccount.payService(service);
                } else {
                    System.err.println(STR."==> Mã pin của tài khoản '\{bankAccount.getId()}' không đúng! <==");
                }
            } else {
                System.err.println(STR."==> Tài khoản '\{bankAccount.getId()}' đã bị khóa. Không thể thực hiện giao dịch <==");
            }
        } else {
            System.err.println(STR."==> Không tìm thấy tài khoản '\{id}' <==");
        }
    }

    private static void reactivateBankAccountById(ArrayList<BankAccount> accounts, Scanner input) {
        System.out.println("Tài khoản cần kích hoạt lại: ");
        String id = input.nextLine();
        int index = findBankAccountById(accounts, id);
        if (index != -1) {
            BankAccount bankAccount = accounts.get(index);
            if (!bankAccount.isEnabled()) {
                boolean pinCheckResult = checkBankAccountPin(bankAccount, input);
                if (pinCheckResult) {
                    bankAccount.setEnabled(true);
                    System.out.println("Mã pin mới: ");
                    bankAccount.setPin(Integer.parseInt(input.nextLine()));
                    System.out.println(STR."==> Kích hoạt thành công mã pin mới: '\{bankAccount.getPin()}'! <==");
                } else {
                    System.err.println(STR."==> Mã pin cũ của tài khoản '\{bankAccount.getId()}' không đúng! <==");
                }
            } else {
                System.err.println(STR."==> Error: tài khoản '\{bankAccount.getId()}' đã được kích hoạt! <==");
            }
        } else {
            System.err.println(STR."==> Không tìm thấy tài khoản '\{id}' <==");
        }
    }

    private static void deactivateBankAccountById(ArrayList<BankAccount> accounts, Scanner input) {
        System.out.println("Tài khoản cần khóa lại: ");
        String id = input.nextLine();
        int index = findBankAccountById(accounts, id);
        if (index != -1) {
            BankAccount bankAccount = accounts.get(index);
            if (bankAccount.isEnabled()) {
                boolean pinCheckResult = checkBankAccountPin(bankAccount, input);
                if (pinCheckResult) {
                    bankAccount.setEnabled(false);
                    System.out.println(STR."==> Khóa tài khoản '\{bankAccount.getId()}' thành công! <==");
                } else {
                    System.err.println(STR."==> Mã pin của tài khoản '\{bankAccount.getId()}' không đúng! <==");
                }
            } else {
                System.err.println(STR."==> Lỗi, tài khoản '\{bankAccount.getId()}' hiện tại đã bị khóa! <==");
            }
        } else {
            System.err.println(STR."==> Không tìm thấy tài khoản '\{id}' <==");
        }
    }

    private static void changeBankAccountPinById(ArrayList<BankAccount> accounts, Scanner input) {
        System.out.println("Tài khoản cần đổi mã pin: ");
        String id = input.nextLine();
        int index = findBankAccountById(accounts, id);
        if (index != -1) {
            BankAccount bankAccount = accounts.get(index);
            if (bankAccount.isEnabled()) {
                boolean pinCheckResult = checkBankAccountPin(bankAccount, input);
                if (pinCheckResult) {
                    System.out.println("Mã pin mới: ");
                    bankAccount.setPin(Integer.parseInt(input.nextLine()));
                    System.out.println(STR."==> Đổi mã pin cho tài khoản '\{bankAccount.getId()}' thành công! <==");
                } else {
                    System.err.println(STR."==> Mã pin cũ của tài khoản '\{bankAccount.getId()}' không đúng! <==");
                }
            } else {
                System.err.println(STR."==> Tài khoản '\{bankAccount.getId()}' đã bị khóa. Không thể thực hiện giao dịch <==");
            }
        } else {
            System.err.println(STR."==> Không tìm thấy tài khoản '\{id}' <==");
        }
    }
}
