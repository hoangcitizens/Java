package Exercise.Ex_Chapter6.Ex62.Ex03_62;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // todo 4: tạo mảng chứa các tài khoản ngân hàng
        BankAccount[] bankAccounts = new BankAccount[100];
        int accountCounter = 0;

        // todo 5: triển khai menu chứa các chức năng của chương trình, sử dụng while hoặc do-while
        int choice;
        do {
            displayMenu();
            System.out.print("==> Xin mời chọn(1-11): ");

            // todo 7: đọc vào lựa chọn của người dùng
            choice = Integer.parseInt(input.nextLine());

            switch (choice) {
                // todo 8: triển khai code ứng với lựa chọn chức năng số 1
                case 1:
                    if (accountCounter <= 100) {
                        BankAccount bankAccount = createBankAccount(bankAccounts, input);
                        bankAccounts[accountCounter++] = bankAccount;
                        System.out.println("==> Thêm tài khoản thành công <==");
                    } else {
                        System.err.println("==> Số lượng tài khoản đã đầy, không thể thêm! <==");
                    }
                    break;
                // todo 11: triển khai code ứng với lựa chọn chức năng số 2
                case 2:
                    if (accountCounter != 0) {
                        if (deleteBankAccountById(bankAccounts, input)) {
                            accountCounter--;
                        }
                    } else {
                        System.err.println("==> Danh sách tài khoản rỗng. <==");
                    }
                    break;
                // todo 14: triển khai code ứng với lựa chọn chức năng số 3
                case 3:
                    if (accountCounter != 0) {
                        showBalanceById(bankAccounts, input);
                    } else {
                        System.err.println("==> Danh sách tài khoản rỗng. <==");
                    }
                    break;
                // todo 17: triển khai code ứng với lựa chọn chức năng số 4
                case 4:
                    if (accountCounter != 0) {
                        depositBankAccountById(bankAccounts, input);
                    } else {
                        System.err.println("==> Danh sách tài khoản rỗng. <==");
                    }
                    break;
                // todo 19: triển khai code ứng với lựa chọn chức năng số 5
                case 5:
                    if (accountCounter != 0) {
                        withdrawBankAccountById(bankAccounts, input);
                    } else {
                        System.err.println("==> Danh sách tài khoản rỗng. <==");
                    }
                    break;
                // todo 21: triển khai code ứng với lựa chọn chức năng số 6
                case 6:
                    if (accountCounter != 0) {
                        transferBankAccountById(bankAccounts, input);
                    } else {
                        System.err.println("==> Danh sách tài khoản rỗng. <==");
                    }
                    break;
                // todo 23: triển khai code ứng với lựa chọn chức năng số 7
                case 7:
                    if (accountCounter != 0) {
                        payServiceBankAccountById(bankAccounts, input);
                    } else {
                        System.err.println("==> Danh sách tài khoản rỗng. <==");
                    }
                    break;
                // todo 25: triển khai code ứng với lựa chọn chức năng số 8
                case 8:
                    if (accountCounter != 0) {
                        reactivateBankAccountById(bankAccounts, input);
                    } else {
                        System.err.println("==> Danh sách tài khoản rỗng. <==");
                    }
                    break;
                // todo 27: triển khai code ứng với lựa chọn chức năng số 9
                case 9:
                    if (accountCounter != 0) {
                        deactivateBankAccountById(bankAccounts, input);
                    } else {
                        System.err.println("==> Danh sách tài khoản rỗng. <==");
                    }
                    break;
                // todo 29: triển khai code ứng với lựa chọn chức năng số 10
                case 10:
                    if (accountCounter != 0) {
                        changeBankAccountPinById(bankAccounts, input);
                    } else {
                        System.err.println("==> Danh sách tài khoản rỗng. <==");
                    }
                    break;
                // todo 31: triển khai code ứng với lựa chọn chức năng số 11
                case 11:
                    System.err.println("Bạn có muốn thực hiện giao dịch khác không ? (Y/N)");
                    String isEnabled = input.nextLine();
                    if (isEnabled.equalsIgnoreCase("y")) {
                        choice = 0;
                    } else {
                        System.err.println("==> Cảm ơn bạn đã sử dụng dịch vụ của chúng tôi ! <==");
                    }
                    break;
                // todo 32: triển khai code ứng với lựa chọn chức năng không tồn tại
                default:
                    System.err.println("==> Sai chức năng, vui lòng nhập số từ 1 -> 11 <==");
            }
        } while (choice != 11);
    }


    // todo 6: triển khai phương thức hiển thị ra menu chứa các lựa chọn
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

    // todo 9: triển khai phương thức thêm mới một tài khoản
    private static BankAccount createBankAccount(BankAccount[] bankAccounts, Scanner input) {
        String id;
        do {
            System.out.print("Số tài khoản(6 chữ số, ví dụ: 002519): ");
            id = input.nextLine().trim();
            if (id.length() != 6) {
                System.err.println("\n==> Error: Số tài khoản không hợp lệ. <==");
            } else {
                var used = isIdInUsed(bankAccounts, id);
                if (!used) {
                    break;
                }
            }
        } while (true);
        System.out.print("Tên tài khoản: ");
        String name = input.nextLine().trim().toUpperCase();
        System.out.print("Loại tài khoản (NORMAL hoặc PREMIUM): ");
        String type = input.nextLine();
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
        return new BankAccount(id, name, type, balance, issuingBank, startDate, endDate, pin, enabled);
    }

    // todo 10: triển khai code kiểm tra xem số tài khoản id đã tồn tại chưa
    private static boolean isIdInUsed(BankAccount[] bankAccounts, String id) {
        for (var acc : bankAccounts) {
            if (acc == null) {
                break;
            }
            if (acc.id.compareToIgnoreCase(id) == 0) {
                System.err.println(STR."==> Số tài khoản \"\{id}\" đã tồn tại. <==");
                return true; // số tài khoản đã được sử dụng
            }
        }
        return false; // số tài khoản hợp lệ
    }

    // todo 12: triển khai phương thức xóa tài khoản theo số tài khoản cho trước
    private static boolean deleteBankAccountById(BankAccount[] bankAccounts, Scanner input) {
        System.out.println("Nhập số tài khoản cần xóa: ");
        String id = input.nextLine();
        int index = findBankAccountById(bankAccounts, id);
        if (index != -1) {
            for (int i = index; i < bankAccounts.length - 1; i++) {
                if (bankAccounts[i] != null) {
                    bankAccounts[i] = bankAccounts[i + 1];
                }
            }
            System.out.println(STR."==> Xóa số tài khoản \{id} thành công <==");
        } else {
            System.err.println(STR."==> Không tìm thấy số tài khoản \{id} <==");
        }
        return index != -1;
    }

    // todo 13: triển khai code tim và trả về index của tài khoản trong mảng
    private static int findBankAccountById(BankAccount[] bankAccounts, String id) {
        for (int i = 0; i < bankAccounts.length; i++) {
            if (bankAccounts[i] != null && bankAccounts[i].id.equals(id)) {
                return i;  // trả về vị trí của bankAccount nếu tồn tại
            }
        }
        return -1; // trả về -1 nếu không tồn tại
    }

    // todo 15: triển khai phương thức xem thông tin tài khoản theo số tài khoản và mã pin
    private static void showBalanceById(BankAccount[] bankAccounts, Scanner input) {
        System.out.print("Nhập số tài khoản: ");
        String id = input.nextLine();
        int index = findBankAccountById(bankAccounts, id);
        if (index != -1) {
            BankAccount bankAccount = bankAccounts[index];
            if (bankAccount.enabled) {
                boolean pinCheckResult = checkBankAccountPin(bankAccount, input);
                System.err.println(STR."\{pinCheckResult
                        ? bankAccount.checkBalance()
                        : "==> Mã pin không đúng! <=="}"
                );
            } else {
                System.err.println(STR."==> Số tài khoản \{bankAccount.id} đã bị khóa. Không thể thực hiện hành động <==");
            }
        } else {
            System.err.println(STR."==> Không tìm thấy số tài khoản \{id} <==");
        }
    }

    // todo 16: triển khai code kiểm tra mã pin
    private static boolean checkBankAccountPin(BankAccount bankAccount, Scanner input) {
        System.out.println("Nhập mã pin: ");
        int pin = Integer.parseInt(input.nextLine());
        return bankAccount.pin == pin;
    }

    // todo 18: triển khai phương thức nạp tiền vào tài khoản theo mã tài khoản
    private static void depositBankAccountById(BankAccount[] bankAccounts, Scanner input) {
        System.out.println("Số tài khoản cần nạp tiền: ");
        String id = input.nextLine();
        int index = findBankAccountById(bankAccounts, id);
        if (index != -1) {
            System.out.println("Số tiền cần nạp: ");
            var amount = Double.parseDouble(input.nextLine());
            BankAccount bankAccount = bankAccounts[index];
            bankAccount.deposit(amount);
        } else {
            System.err.println(STR."==> Không tìm thấy số tài khoản \{id} <==");
        }
    }

    // todo 20: triển khai phương thức rút tiền khỏi tài khoản theo mã tài khoản
    private static void withdrawBankAccountById(BankAccount[] bankAccounts, Scanner input) {
        System.out.println("Số tài khoản cần rút tiền: ");
        String id = input.nextLine();
        int index = findBankAccountById(bankAccounts, id);
        if (index != -1) {
            System.out.println("Số tiền cần rút: ");
            var amount = Double.parseDouble(input.nextLine());
            BankAccount bankAccount = bankAccounts[index];
            boolean pinCheckResult = checkBankAccountPin(bankAccount, input);
            if (pinCheckResult) {
                bankAccount.withdraw(amount);
            } else {
                System.err.println(STR."==> Mã pin của số tài khoản \{bankAccount.id} không đúng! <==");
            }
        } else {
            System.err.println(STR."==> Không tìm thấy số tài khoản \{id} <==");
        }
    }

    // todo 22: triển khai phương thức chuyển tiền từ tài khoản A sang tài khoản B
    private static void transferBankAccountById(BankAccount[] bankAccounts, Scanner input) {
        System.out.println("Số tài khoản chuyển tiền: ");
        String idAcc1 = input.nextLine();
        System.out.println("Số tài khoản nhận tiền: ");
        String idAcc2 = input.nextLine();
        var indexAcc1 = findBankAccountById(bankAccounts, idAcc1);
        var indexAcc2 = findBankAccountById(bankAccounts, idAcc2);
        if (indexAcc1 != indexAcc2) {
            if (indexAcc1 != -1) {
                if (indexAcc2 != -1) {
                    System.out.println("Số tiền cần chuyển: ");
                    var amount = Double.parseDouble(input.nextLine());
                    BankAccount bankAccount1 = bankAccounts[indexAcc1];
                    boolean pinCheckResult1 = checkBankAccountPin(bankAccount1, input);
                    BankAccount bankAccount2 = bankAccounts[indexAcc2];
                    if (pinCheckResult1) {
                        bankAccount1.transfer(amount, bankAccount2);
                    } else {
                        System.err.println(STR."==> Mã pin của số tài khoản \{bankAccount1.id} không đúng! <==");
                    }
                } else {
                    System.err.println(STR."==> Không tìm thấy số tài khoản \{idAcc2} <==");
                }
            } else {
                System.err.println(STR."==> Không tìm thấy số tài khoản \{idAcc1} <==");
            }
        } else {
            System.err.println("==> Số tài khoản bị trùng khớp, vui lòng thử lại! <==");
        }
    }

    // todo 24: triển khai phương thức thanh toán hóa đơn điện nước
    private static void payServiceBankAccountById(BankAccount[] bankAccounts, Scanner input) {
        System.out.println("Số tài khoản cần thanh toán: ");
        String id = input.nextLine();
        int index = findBankAccountById(bankAccounts, id);
        if (index != -1) {
            System.out.println("Dịch vụ cần thanh toán: ");
            var service = input.nextLine();
            BankAccount bankAccount = bankAccounts[index];
            if (bankAccount.enabled) {
                boolean pinCheckResult = checkBankAccountPin(bankAccount, input);
                if (pinCheckResult) {
                    bankAccount.payService(service);
                } else {
                    System.err.println(STR."==> Mã pin của số tài khoản \{bankAccount.id} không đúng! <==");
                }
            } else {
                System.err.println(STR."==> Số tài khoản \{bankAccount.id} đã bị khóa. Không thể thực hiện hành động <==");
            }
        } else {
            System.err.println(STR."==> Không tìm thấy số tài khoản \{id} <==");
        }
    }

    // todo 26: triển khai phương thức kích hoạt lại tài khoản
    private static void reactivateBankAccountById(BankAccount[] bankAccounts, Scanner input) {
        System.out.println("Số tài khoản cần kích hoạt lại: ");
        String id = input.nextLine();
        int index = findBankAccountById(bankAccounts, id);
        if (index != -1) {
            BankAccount bankAccount = bankAccounts[index];
            if (!bankAccount.enabled) {
                boolean pinCheckResult = checkBankAccountPin(bankAccount, input);
                if (pinCheckResult) {
                    bankAccount.enabled = true;
                    System.out.println("Mã pin mới: ");
                    bankAccount.pin = Integer.parseInt(input.nextLine());
                    System.out.println(STR."==> Kích hoạt lại số tài khoản \{bankAccount.id} thành công với mã pin mới = \{bankAccount.pin}! <==");
                } else {
                    System.err.println(STR."==> Mã pin cũ của số tài khoản \{bankAccount.id} không đúng! <==");
                }
            } else {
                System.err.println(STR."==> Error: số tài khoản \{bankAccount.id} hiện tại đã được kích hoạt! <==");
            }
        } else {
            System.err.println(STR."==> Không tìm thấy số tài khoản \{id} <==");
        }
    }

    // todo 28: triển khai phương thức khóa tài khoản
    private static void deactivateBankAccountById(BankAccount[] bankAccounts, Scanner input) {
        System.out.println("Số tài khoản cần khóa lại: ");
        String id = input.nextLine();
        int index = findBankAccountById(bankAccounts, id);
        if (index != -1) {
            BankAccount bankAccount = bankAccounts[index];
            if (bankAccount.enabled) {
                boolean pinCheckResult = checkBankAccountPin(bankAccount, input);
                if (pinCheckResult) {
                    bankAccount.enabled = false;
                    System.out.println(STR."==> Khóa số tài khoản \{bankAccount.id} thành công! <==");
                } else {
                    System.err.println(STR."==> Mã pin của số tài khoản \{bankAccount.id} không đúng! <==");
                }
            } else {
                System.err.println(STR."==> Lỗi, số tài khoản \{bankAccount.id} hiện tại đã bị khóa! <==");
            }
        } else {
            System.err.println(STR."==> Không tìm thấy số tài khoản \{id} <==");
        }
    }

    // todo 30: triển khai phương thức thay đổi mã pin của tài khoản
    private static void changeBankAccountPinById(BankAccount[] bankAccounts, Scanner input) {
        System.out.println("Số tài khoản cần thay đổi mã pin: ");
        String id = input.nextLine();
        int index = findBankAccountById(bankAccounts, id);
        if (index != -1) {
            BankAccount bankAccount = bankAccounts[index];
            if (bankAccount.enabled) {
                boolean pinCheckResult = checkBankAccountPin(bankAccount, input);
                if (pinCheckResult) {
                    System.out.println("Mã pin mới: ");
                    bankAccount.pin = Integer.parseInt(input.nextLine());
                    System.out.println(STR."==> Thay đổi mã pin cho số tài khoản \{bankAccount.id} thành công! <==");
                } else {
                    System.err.println(STR."==> Mã pin cũ của số tài khoản \{bankAccount.id} không đúng! <==");
                }
            } else {
                System.err.println(STR."==> Số tài khoản \{bankAccount.id} đã bị khóa. Không thể thực hiện hành động <==");
            }
        } else {
            System.err.println(STR."==> Không tìm thấy số tài khoản \{id} <==");
        }
    }
}

