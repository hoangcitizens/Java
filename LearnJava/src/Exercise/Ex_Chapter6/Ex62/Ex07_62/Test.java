package Exercise.Ex_Chapter6.Ex62.Ex07_62;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        // todo 4: tạo mảng sinh viên chứa tối đa 100 phần tử
        Student[] students = new Student[100];
        var numberOfStudent = createFakeStudents(students);
        // todo 5: tạo biến nhập lựa chọn và đối tượng nhập liệu Scanner
        var choice = 0;
        var scanner = new Scanner(System.in);
        // todo 6: tạo vòng lặp để lặp chương trình tới khi người dùng chọn kết thúc thì dừng
        do {
            showHint(); // hiện lời nhắc
            // todo 8: đọc vào lựa chọn của người dùng
            choice = Integer.parseInt(scanner.nextLine());
            // todo 9: xét các lựa chọn của người dùng
            switch (choice) {
                // todo 10: triển khai code ứng với lựa chọn số 1
                case 1 -> {
                    var student = createStudent(scanner);
                    if (student == null) {
                        System.out.println("==> Mã sinh viên không hợp lệ. Mã hợp lệ bắt đầu với \"STxxxx\"");
                    } else {
                        var isExisted = isStudentExisted(students, student.id);
                        if (!isExisted) {
                            students[numberOfStudent++] = student;
                            System.out.println("==> Thêm mới sinh viên thành công.");
                        } else {
                            System.out.println(STR."==> Sinh viên mã \"\{student.id}\" đã tồn tại.");
                        }
                    }
                }
                // todo 12: triển khai code ứng với lựa chọn số 2
                case 2 -> {
                    if (numberOfStudent > 0) {
                        showStudentInTable(students);
                    } else {
                        System.out.println("==> Danh sách sinh viên rỗng.");
                    }
                }
                // todo 14: triển khai code ứng với lựa chọn số 3, sau đó gọi hiển thị danh sách
                //  sinh viên sau khi sắp xếp
                case 3 -> {
                    if (numberOfStudent > 0) {
                        sortByGpaDESC(students, numberOfStudent);
                        System.out.println("==> Sau khi sắp xếp: ");
                        showStudentInTable(students);
                    } else {
                        System.out.println("==> Danh sách sinh viên rỗng.");
                    }
                }
                // todo 17: triển khai code ứng với lựa chọn số 4, sau đó gọi hiển thị danh sách
                //  sinh viên sau khi sắp xếp
                case 4 -> {
                    if (numberOfStudent > 0) {
                        sortByGpaASC(students, numberOfStudent);
                        System.out.println("==> Sau khi sắp xếp: ");
                        showStudentInTable(students);
                    } else {
                        System.out.println("==> Danh sách sinh viên rỗng.");
                    }
                }
                // todo 19: triển khai code ứng với chức năng số 5
                case 5 -> {
                    if (numberOfStudent > 0) {
                        scholarshipConsideration(students);
                    } else {
                        System.out.println("==> Danh sách sinh viên rỗng.");
                    }
                }
                // todo 23: triển khai code ứng với chức năng số 6
                case 6 -> {
                    if (numberOfStudent > 0) {
                        rankedAcademic(students);
                    } else {
                        System.out.println("==> Danh sách sinh viên rỗng.");
                    }
                }
                // todo 26: triển khai code ứng với chức năng số 7
                case 7 -> {
                    if (numberOfStudent > 0) {
                        System.out.println("Nhập tên cần tìm: ");
                        var name = scanner.nextLine();
                        findByName(students, name);
                    } else {
                        System.out.println("==> Danh sách sinh viên rỗng.");
                    }
                }
                // todo 28: triển khai code ứng với chức năng số 8
                case 8 -> {
                    if (numberOfStudent > 0) {
                        var gpa = scanner.nextFloat();
                        scanner.nextLine();
                        findByGpa(students, gpa);
                    } else {
                        System.out.println("==> Danh sách sinh viên rỗng.");
                    }
                }
                // todo 30: triển khai code ứng với chức năng số 9
                case 9 -> {
                    if (numberOfStudent > 0) {
                        topGpa(students, numberOfStudent);
                    } else {
                        System.out.println("==> Danh sách sinh viên rỗng.");
                    }
                }
                // todo 32: triển khai code ứng với chức năng số 10
                case 10 -> {
                    if (numberOfStudent > 0) {
                        statisticByMajor(students);
                    } else {
                        System.out.println("==> Danh sách sinh viên rỗng.");
                    }
                }
                // todo 36: triển khai code ứng với chức năng số 11
                case 11 -> {
                    if (numberOfStudent > 0) {
                        System.out.print("Nhập mã sinh viên: ");
                        var id = scanner.nextLine();
                        System.out.print("Nhập điểm: ");
                        var gpa = scanner.nextFloat();
                        scanner.nextLine(); // đọc bỏ dòng thừa
                        if (updateGpa(students, id, gpa)) {
                            System.out.println("==> Cập nhật điểm gpa thành công.");
                        } else {
                            System.out.println("==> Mã sinh viên không tồn tại. Cập nhật điểm gpa thất bại.");
                        }
                    } else {
                        System.out.println("==> Danh sách sinh viên rỗng.");
                    }
                }
                // todo 38: triển khai code ứng với chức năng số 12
                case 12 -> {
                    if (numberOfStudent > 0) {
                        System.out.print("Nhập mã sinh viên cần xóa: ");
                        var id = scanner.nextLine();
                        if (removeStudent(students, id, numberOfStudent)) {
                            System.out.println(STR."==> Sinh viên mã \"\{id}\" đã bị xóa khỏi danh sách.");
                            numberOfStudent--;
                        } else {
                            System.out.println(STR."==> Không tồn tại sinh viên mã \"\{id}\". Xóa thất bại.");
                        }
                    } else {
                        System.out.println("==> Danh sách sinh viên rỗng.");
                    }
                }
                // todo 40: triển khai code ứng với chức năng số 13
                case 13 -> {
                    if (numberOfStudent > 0) {
                        listFailedStudent(students, numberOfStudent);
                    } else {
                        System.out.println("==> Danh sách sinh viên rỗng.");
                    }
                }
                // todo 42: triển khai code ứng với chức năng số 14
                case 14 -> System.out.println("==> Kết thúc chương trình.");
                // todo 43: triển khai code ứng với chức năng không tồn tại
                default -> System.out.println("==> Sai chức năng, vui lòng chọn lại.");
            }
        } while (choice != 14);
    }

    // todo 7: triển khai code hiển thị lời nhắc các lựa chọn cho người dùng
    private static void showHint() {
        System.out.println("====================== CÁC LỰA CHỌN ======================");
        System.out.println("01. Thêm mới sinh viên vào danh sách.");
        System.out.println("02. Hiển thị danh sách sinh viên.");
        System.out.println("03. Sắp xếp danh sách theo điểm giảm dần.");
        System.out.println("04. Sắp xếp danh sách theo điểm tăng dần.");
        System.out.println("05. Xét học bổng cho sinh viên.");
        System.out.println("06. Xếp loại học lực cho sinh viên.");
        System.out.println("07. Tìm sinh viên theo tên.");
        System.out.println("08. Tìm sinh viên theo điểm gpa.");
        System.out.println("09. Cho biết top các sinh viên có điểm cao nhất.");
        System.out.println("10. Thống kê học lực sinh viên theo từng chuyên ngành.");
        System.out.println("11. Cập nhật điểm gpa cho sinh viên theo mã.");
        System.out.println("12. Xóa sinh viên theo mã sinh viên.");
        System.out.println("13. Danh sách sinh viên chưa đủ điều kiện tốt nghiệp.");
        System.out.println("14. Kết thúc chương trình.");
        System.out.print("==> XIN MỜI CHỌN(1-14): ");
    }

    // todo 44: (tùy chọn) tạo dữ liệu giả định ban đầu để test các chức năng đã code
    private static int createFakeStudents(Student[] students) {
        var counter = 0;
        students[counter++] = new Student("ST1001", "Nguyễn Ngọc Mai", "CNTT", "ngocmai@xmail.com", 3.77f);
        students[counter++] = new Student("ST1007", "Lý Thảo Mai", "QTKD", "thaomai@xmail.com", 3.77f);
        students[counter++] = new Student("ST1002", "Lê Thanh Mai", "ĐTVT", "thanhmai@xmail.com", 3.77f);
        students[counter++] = new Student("ST1003", "Trần Bích Mai", "CNTT", "bichmai@xmail.com", 3.05f);
        students[counter++] = new Student("ST1004", "Nguyễn Ngọc Ánh", "CNTT", "ngocanh@xmail.com", 3.59f);
        students[counter++] = new Student("ST1005", "Hoàng Thanh Tùng", "CNTT", "thanhtung@xmail.com", 3.74f);
        students[counter++] = new Student("ST1006", "Lưu Bá Nam", "HTTT", "banam@xmail.com", 3.15f);
        students[counter++] = new Student("ST1008", "Dương Trung Quốc", "ATTT", "trungquoc@xmail.com", 3.45f);
        return counter;
    }

    // kiểm tra xem sinh viên với mã sinh viên cho trước có tồn tại trong danh sách sv không
    private static boolean isStudentExisted(Student[] students, String studentId) {
        for (var student : students) {
            if (student == null) {
                break;
            }
            if (student.id.compareToIgnoreCase(studentId) == 0) {
                return true; // nếu tìm thấy return true
            }
        }
        return false; // không tìm thấy, return false
    }

    // todo 41: triển khai code liệt kê các sinh viên chưa đủ điều kiện tốt nghiệp
    public static void listFailedStudent(Student[] students, int size) {
        var counter = 0;
        for (var student : students) {
            if (student == null) {
                break;
            }
            if (student.gpa < 2.0f) {
                counter++;
            }
        }
        if (counter > 0) {
            System.out.printf("%-15s%-25s%-20s%-25s%-15s\n", "Mã SV",
                    "Họ và tên", "Chuyên ngành", "Email", "Điểm GPA");
            for (int i = 0; i < size; i++) {
                var student = students[i];
                if (student.gpa < 2.0f) {
                    System.out.printf("%-15s%-25s%-20s%-25s%-15.2f\n",
                            student.id, student.fullName,
                            student.major, student.email, student.gpa);
                }
            }
        } else {
            System.out.println("==> Không có sinh viên trượt tốt nghiệp.");
        }
    }

    // todo 39: triển khai code xóa sinh viên theo mã sinh viên cho trước
    public static boolean removeStudent(Student[] students, String id, int size) {
        boolean isExisted = isStudentExisted(students, id); // kiểm tra xem sv có tồn tại không đã
        if (isExisted) {
            for (int i = 0; i < size; i++) {
                if (students[i].id.compareToIgnoreCase(id) == 0) {
                    for (int j = i; j < size - 1; j++) {
                        students[j] = students[j + 1];
                    }
                }
            }
            // xóa bỏ phần tử cuối
            students[size - 1] = null;
        }
        return isExisted;
    }

    // todo 37: triển khai code cập nhật điểm gpa theo mã sinh viên
    public static boolean updateGpa(Student[] students, String studentId, float gpa) {
        var isExisted = isStudentExisted(students, studentId);
        for (var student : students) {
            if (student == null) {
                return false;
            } else if (student.id.compareToIgnoreCase(studentId) == 0) {
                student.gpa = gpa;
            }
        }
        return isExisted;
    }

    // todo 33: triển khai code thống kê sinh viên theo chuyên ngành
    public static void statisticByMajor(Student[] students) {
        for (var index = 0; index < students.length; index++) {
            var student = students[index];
            if (student == null) {
                break;
            } else {
                var isExisted = isMajorExisted(students, student.major, index);
                if (!isExisted) {
                    var excellent = countStudent(students, student.major, "Xuất sắc");
                    var veryGood = countStudent(students, student.major, "Giỏi");
                    var good = countStudent(students, student.major, "Khá");
                    var normal = countStudent(students, student.major, "Trung bình");
                    var failed = countStudent(students, student.major, "Trượt");
                    System.out.println(STR."==> Chuyên ngành: \{student.major}");
                    System.out.println(STR."Số lượng sinh viên xuất sắc: \{excellent}");
                    System.out.println(STR."Số lượng sinh viên giỏi: \{veryGood}");
                    System.out.println(STR."Số lượng sinh viên khá: \{good}");
                    System.out.println(STR."Số lượng sinh viên trung bình: \{normal}");
                    System.out.println(STR."Số lượng sinh viên trượt: \{failed}");
                }
            }
        }
    }

    // todo 35: triển khai code đếm số lượng sinh viên theo học lực của từng chuyên ngành
    private static int countStudent(Student[] students, String major, String level) {
        var counter = 0;
        for (var student : students) {
            if (student == null) {
                break;
            } else {
                if (student.major.compareToIgnoreCase(major) == 0) {
                    var rank = ranked(student.gpa);
                    if (level.compareToIgnoreCase(rank) == 0) {
                        counter++;
                    }
                }
            }
        }
        return counter;
    }

    // todo 34: kiểm tra xem tính đến trước vị trí post thì đã xuất hiện chuyên ngành cho trong major chưa
    private static boolean isMajorExisted(Student[] students, String major, int pos) {
        for (int i = 0; i < pos; i++) {
            if (major.compareTo(students[i].major) == 0) {
                return true;
            }
        }
        return false;
    }

    // todo 31: triển khai code liệt kê top các sinh viên có điểm gpa cao nhất
    public static void topGpa(Student[] students, int size) {
        sortByGpaASC(students, size);
        var maxGpa = students[size - 1].gpa;
        System.out.println("==> Top các sinh viên có điểm gpa cao nhất: ");
        System.out.printf("%-15s%-25s%-20s%-25s%-15s\n", "Mã SV",
                "Họ và tên", "Chuyên ngành", "Email", "Điểm GPA");
        for (int i = size - 1; i >= 0; i--) {
            var student = students[i];
            if (student.gpa < maxGpa) {
                break;
            }
            System.out.printf("%-15s%-25s%-20s%-25s%-15.2f\n",
                    student.id, student.fullName,
                    student.major, student.email, student.gpa);
        }
    }

    // todo 29: triển khai code tìm sinh viên theo điểm gpa cho trước
    //  tìm chính xác với điểm gpa nhận được
    public static void findByGpa(Student[] students, float gpa) {
        System.out.println("==> Kết quả tìm kiếm: ");
        System.out.printf("%-15s%-25s%-20s%-25s%-15s\n", "Mã SV",
                "Họ và tên", "Chuyên ngành", "Email", "Điểm GPA");
        for (var student : students) {
            if (student == null) {
                break;
            } else {
                if (gpa == student.gpa) {
                    System.out.printf("%-15s%-25s%-20s%-25s%-15.2f\n",
                            student.id, student.fullName,
                            student.major, student.email, student.gpa);
                }
            }
        }
    }

    // todo 27: triển khai code tìm sinh viên theo tên cho trước
    //  nếu không tìm thấy hiển thị không có kết quả tìm kiếm
    public static void findByName(Student[] students, String name) {
        System.out.println("==> Kết quả tìm kiếm: ");
        System.out.printf("%-15s%-25s%-20s%-25s%-15s\n", "Mã SV",
                "Họ và tên", "Chuyên ngành", "Email", "Điểm GPA");
        var counter = 0;
        for (var student : students) {
            if (student == null) {
                break;
            } else {
                var firstName = student.fullName
                        .substring(student.fullName.lastIndexOf(" ") + 1);
                if (firstName.compareToIgnoreCase(name) == 0) {
                    counter++;
                    System.out.printf("%-15s%-25s%-20s%-25s%-15.2f\n",
                            student.id, student.fullName,
                            student.major, student.email, student.gpa);
                }
            }
        }
        if (counter == 0) {
            System.out.println(STR."==> Không tìm thấy sinh viên nào có tên \"\{name}\"");
        }
    }

    // todo 24: triển khai code xếp loại học lực cho sinh viên dựa trên điểm gpa
    public static void rankedAcademic(Student[] students) {
        System.out.println("===================== BẢNG HỌC LỰC CỦA SINH VIÊN =====================");
        System.out.printf("%-10s%-10s%-25s%-15s%-15s\n",
                "STT", "Mã SV", "Họ và tên", "Điểm gpa", "Học lực");
        var counter = 1;
        for (var student : students) {
            if (student == null) {
                break;
            } else {
                var level = scholarshipLevel(student.gpa);
                if (level > 0) {
                    System.out.printf("%-10d%-10s%-25s%-15.2f%-15s\n",
                            counter++, student.id, student.fullName, student.gpa, ranked(student.gpa));
                }
            }
        }
    }

    // todo 25: triển khai code lấy tên mức học lực cho sinh viên dựa trên điểm gpa
    private static String ranked(float gpa) {
        if (gpa >= 3.6) {
            return "Xuất sắc";
        } else if (gpa >= 3.2) {
            return "Giỏi";
        } else if (gpa >= 2.8) {
            return "Khá";
        } else if (gpa >= 2.0) {
            return "Trung bình";
        }
        return "Trượt";
    }

    // todo 20: triển khai code xét học bổng cho sinh viên. Hiển thị kết quả lên màn hình định dạng rõ ràng
    public static void scholarshipConsideration(Student[] students) {
        System.out.println("===================== DANH SÁCH SINH VIÊN ĐẠT HỌC BỔNG =====================");
        System.out.printf("%-10s%-10s%-25s%-15s%-15s\n",
                "STT", "Mã SV", "Họ và tên", "Loại H.bổng", "Số tiền");
        var counter = 1;
        var formatter = new DecimalFormat("#,###.##");
        for (var student : students) {
            if (student == null) {
                break;
            } else {
                var level = scholarshipLevel(student.gpa);
                var levelStr = scholarshipLevelString(level);
                if (level > 0) {
                    System.out.printf("%-10d%-10s%-25s%-15s%-15s\n",
                            counter++, student.id, student.fullName, levelStr,
                            formatter.format(scholarshipAmount(level)));
                }
            }
        }
    }

    // todo 21: triển khai code xét mức học bổng dựa trên điểm gpa, các mức hợp lệ từ 0 - 3
    private static int scholarshipLevel(float gpa) {
        if (gpa > 4 || gpa < 0) {
            return 0; // không đạt
        } else if (gpa >= 3.7f) {
            return 1; // xuất sắc
        } else if (gpa >= 3.4f) {
            return 2; // giỏi
        } else if (gpa >= 3.15f) {
            return 3; // khá
        } else {
            return 0; // không đạt
        }
    }

    // todo 22: triển khai code lấy tên mức học bổng dựa trên mức học bổng ở todo 21
    private static String scholarshipLevelString(int level) {
        return switch (level) {
            case 1 -> "Xuất sắc";
            case 2 -> "Giỏi";
            case 3 -> "Khá";
            default -> "Không đạt";
        };
    }

    // số tiền của từng mức học bổng
    private static int scholarshipAmount(int level) {
        return switch (level) {
            case 1 -> 15_000_000;
            case 2 -> 8_000_000;
            case 3 -> 4_000_000;
            default -> 0;
        };
    }

    // todo 18: triển khai code sắp xếp danh sách sinh viên theo điểm gpa tăng dần
    private static void sortByGpaASC(Student[] students, int size) {
        for (var i = 0; i < size; i++) {
            for (var j = size - 1; j > i; j--) {
                if (students[j].gpa < students[j - 1].gpa) {
                    var student = students[j - 1];
                    students[j - 1] = students[j];
                    students[j] = student;
                }
            }
        }
    }

    // todo 15: sắp xếp danh sách sinh viên theo điểm gpa giảm dần, tên tăng dần, họ tăng dần
    private static void sortByGpaDESC(Student[] students, int size) {
        for (var i = 0; i < size; i++) {
            for (var j = size - 1; j > i; j--) {
                if (shouldSwapStudent(students[j], students[j - 1])) {
                    var student = students[j - 1];
                    students[j - 1] = students[j];
                    students[j] = student;
                }
            }
        }
    }

    // todo 16: triển khai phương thức ra quyết định liệu có đổi chỗ hai đối tượng
    //  sinh viên hay không
    private static boolean shouldSwapStudent(Student student1, Student student2) {
        var name1 = student1.fullName.substring(student1.fullName.lastIndexOf(" ") + 1);
        var name2 = student2.fullName.substring(student2.fullName.lastIndexOf(" ") + 1);
        var lastName1 = student1.fullName.substring(0, student1.fullName.indexOf(" "));
        var lastName2 = student2.fullName.substring(0, student2.fullName.indexOf(" "));
        if (student1.gpa > student2.gpa) {
            return true;
        } else if (student1.gpa == student2.gpa && name1.compareTo(name2) < 0) {
            return true;
        } else return student1.gpa == student2.gpa && name1.compareTo(name2) == 0 && lastName1.compareTo(lastName2) < 0;
    }

    // todo 11: triển khai code nhập dữ liệu tạo mới thông tin sinh viên
    //  chú ý kiểm tra tính đúng đắn của mã sinh viên
    private static Student createStudent(Scanner input) {
        System.out.print("Mã sinh viên: ");
        var id = input.nextLine().trim().toUpperCase(); // viết hoa mã sv lên
        if (id.startsWith("ST") && id.length() == 6) {
            System.out.print("Họ và tên: ");
            var fullName = input.nextLine();
            System.out.print("Chuyên ngành: ");
            var major = input.nextLine();
            System.out.print("Email: ");
            var email = input.nextLine();
            System.out.print("Điểm GPA: ");
            var gpa = Float.parseFloat(input.nextLine());
            return new Student(id, fullName, major, email, gpa);
        }
        return null;
    }

    // todo 13: triển khai code hiển thị danh sách sinh viên dưới dạng bảng gồm các hàng
    //  cột ngay ngắn
    public static void showStudentInTable(Student[] students) {
        var line = "======================================";
        System.out.println(STR."\{line} DANH SÁCH SINH VIÊN \{line}");
        System.out.printf("%-15s%-25s%-20s%-25s%-15s\n", "Mã SV",
                "Họ và tên", "Chuyên ngành", "Email", "Điểm GPA");
        for (Student student : students) {
            if (student != null) {
                System.out.printf("%-15s%-25s%-20s%-25s%-15.2f\n", student.id, student.fullName,
                        student.major, student.email, student.gpa);
            } else {
                break;
            }
        }
    }
}
