package Exercise.Ex_Chapter6.Ex66.Ex07_66;

/*
    Bài 7. Thông tin về sinh viên bao gồm: mã sinh viên có dạng STxxxx(ví dụ ST1005), phần số tự động tăng từ 1000,
    họ và tên, chuyên ngành, email, điểm gpa. Trong đó chuyên ngành bao gồm: điện tử, viễn thông, công nghệ thông tin,
    an toàn thông tin, quản trị kinh doanh. Bổ sung các  constructor và tái sử dụng chúng sao cho phù hợp, sử dụng tính
    đóng gói dữ liệu và tự bổ sung các phương thức phụ trợ cần thiết. Viết chương trình có menu chọn cho phép thực hiện
    các chức năng sau:
        1. Thêm mới sinh viên vào danh sách. Mỗi sinh viên xuất hiện không quá 1 lần trong danh sách này.
        2. Hiển thị danh sách sinh viên dưới dạng bảng ngay ngắn.
        3. Hiển thị danh sách sinh viên theo từng chuyên ngành.
        4. Sắp xếp danh sách sinh viên theo điểm giảm dần, tên tăng dần, họ tăng dần.
        5. Sắp xếp danh sách sinh viên theo điểm gpa tăng dần.
        6. Xét học bổng cho sinh viên. Biết rằng có 3 mức học bổng:
            a. Xuất sắc: các sinh viên có điểm gpa từ 3.70 trở lên. Mức học bổng 15tr.
            b. Giỏi: các sinh viên có điểm gpa từ 3.40 trở lên. Mức học bổng 8tr.
            c. Khá: các sinh viên có điểm gpa từ 3.15 trở lên. Mức học bổng 4tr.
            d. Hiển thị danh sách các sinh viên đạt học bổng, loại học bổng, mức học bổng ra màn hình dưới dạng bảng.
        7. Xếp loại học lực cho sinh viên sau đó hiển thị danh sách xếp loại ra màn hình:
            a. Loại xuất sắc: gpa >= 3.6.
            b. Loại giỏi: gpa >= 3.2.
            c. Loại khá: gpa >= 2.8.
            d. Loại trung bình: gpa >= 2.0.
            e. Trượt: gpa < 2.0.
        8. Tìm sinh viên theo tên.
        9. Tìm sinh viên theo điểm gpa.
        10. Tìm sinh viên theo chuyên ngành.
        11. Cho biết top các sinh viên có điểm gpa cao nhất.
        12. Thống kê số lượng sinh viên của từng cấp học lực theo chuyên ngành.
        13. Cập nhật điểm gpa cho sinh viên theo mã sinh viên.
        14. Xóa sinh viên khỏi danh sách theo mã sinh viên.
        15. Hãy liệt kê các sinh viên chưa đủ điều kiện tốt nghiệp(gpa < 2.0).
        16. Kết thúc chương trình.
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class Test {
    // todo 3: sử dụng id tự tăng sao cho hợp lý
    public static void main(String[] args) {
        Student[] students = new Student[100];
        var numberOfStudent = createFakeStudents(students);
        var choice = 0;
        var scanner = new Scanner(System.in);
        do {
            showHint(); // hiện lời nhắc
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1 -> {
                    var student = createStudent(scanner);
                    var isExisted = isStudentExisted(students, student.getId());
                    if (!isExisted) {
                        students[numberOfStudent++] = student;
                        System.out.println("==> Thêm mới sinh viên thành công.");
                    } else {
                        System.out.println(STR."==> Sinh viên mã \"\{student.getId()}\" đã tồn tại.");
                    }
                }
                case 2 -> {
                    if (numberOfStudent > 0) {
                        showStudentInTable(students);
                    } else {
                        System.out.println("==> Danh sách sinh viên rỗng.");
                    }
                }
                case 3 -> {
                    if (numberOfStudent > 0) {
                        sortByGpaDESC(students, numberOfStudent);
                        System.out.println("==> Sau khi sắp xếp: ");
                        showStudentInTable(students);
                    } else {
                        System.out.println("==> Danh sách sinh viên rỗng.");
                    }
                }
                case 4 -> {
                    if (numberOfStudent > 0) {
                        sortByGpaASC(students, numberOfStudent);
                        System.out.println("==> Sau khi sắp xếp: ");
                        showStudentInTable(students);
                    } else {
                        System.out.println("==> Danh sách sinh viên rỗng.");
                    }
                }
                case 5 -> {
                    if (numberOfStudent > 0) {
                        scholarshipConsideration(students);
                    } else {
                        System.out.println("==> Danh sách sinh viên rỗng.");
                    }
                }
                case 6 -> {
                    if (numberOfStudent > 0) {
                        rankedAcademic(students);
                    } else {
                        System.out.println("==> Danh sách sinh viên rỗng.");
                    }
                }
                case 7 -> {
                    if (numberOfStudent > 0) {
                        System.out.println("Nhập tên cần tìm: ");
                        var name = scanner.nextLine();
                        findByName(students, name);
                    } else {
                        System.out.println("==> Danh sách sinh viên rỗng.");
                    }
                }
                case 8 -> {
                    if (numberOfStudent > 0) {
                        System.out.print("==> Nhập điểm gpa: ");
                        var gpa = scanner.nextFloat();
                        scanner.nextLine();
                        findByGpa(students, gpa);
                    } else {
                        System.out.println("==> Danh sách sinh viên rỗng.");
                    }
                }
                case 9 -> {
                    if (numberOfStudent > 0) {
                        topGpa(students, numberOfStudent);
                    } else {
                        System.out.println("==> Danh sách sinh viên rỗng.");
                    }
                }
                case 10 -> {
                    if (numberOfStudent > 0) {
                        statisticByMajor(students);
                    } else {
                        System.out.println("==> Danh sách sinh viên rỗng.");
                    }
                }
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
                case 13 -> {
                    if (numberOfStudent > 0) {
                        listFailedStudent(students, numberOfStudent);
                    } else {
                        System.out.println("==> Danh sách sinh viên rỗng.");
                    }
                }
                case 14 -> System.err.println("==> Cảm ơn bạn đã sử dụng dịch vụ của chúng tôi <==");
                default -> System.err.println("==> Error: Sai chức năng, vui lòng chọn lại(1-14) <==");
            }
        } while (choice != 14);
    }

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

    private static int createFakeStudents(Student[] students) {
        var counter = 0;
        students[counter++] = new Student(null, "Nguyễn Ngọc Mai", Major.CNTT, "ngocmai@xmail.com", 3.77f);
        students[counter++] = new Student(null, "Lý Thảo Mai", Major.QTKD, "thaomai@xmail.com", 3.77f);
        students[counter++] = new Student(null, "Lê Thanh Mai", Major.DT, "thanhmai@xmail.com", 3.77f);
        students[counter++] = new Student(null, "Trần Bích Mai", Major.CNTT, "bichmai@xmail.com", 3.05f);
        students[counter++] = new Student(null, "Nguyễn Ngọc Ánh", Major.CNTT, "ngocanh@xmail.com", 3.59f);
        students[counter++] = new Student(null, "Hoàng Thanh Tùng", Major.CNTT, "thanhtung@xmail.com", 3.74f);
        students[counter++] = new Student(null, "Lưu Bá Nam", Major.ATTT, "banam@xmail.com", 3.15f);
        students[counter++] = new Student(null, "Dương Trung Quốc", Major.ATTT, "trungquoc@xmail.com", 3.45f);
        return counter;
    }

    private static boolean isStudentExisted(Student[] students, String studentId) {
        for (var student : students) {
            if (student == null) {
                break;
            }
            if (student.getId().compareToIgnoreCase(studentId) == 0) {
                return true; // nếu tìm thấy return true
            }
        }
        return false; // không tìm thấy, return false
    }

    public static void listFailedStudent(Student[] students, int size) {
        var counter = 0;
        for (var student : students) {
            if (student == null) {
                break;
            }
            if (student.getGpa() < 2.0f) {
                counter++;
            }
        }
        if (counter > 0) {
            System.out.printf("%-15s%-25s%-20s%-25s%-15s\n", "Mã SV",
                    "Họ và tên", "Chuyên ngành", "Email", "Điểm GPA");
            for (int i = 0; i < size; i++) {
                var student = students[i];
                if (student.getGpa() < 2.0f) {
                    System.out.printf("%-15s%-25s%-20s%-25s%-15.2f\n",
                            student.getId(), student.getFullName(),
                            student.getMajor(), student.getEmail(), student.getGpa());
                }
            }
        } else {
            System.out.println("==> Không có sinh viên trượt tốt nghiệp.");
        }
    }

    public static boolean removeStudent(Student[] students, String id, int size) {
        boolean isExisted = isStudentExisted(students, id); // kiểm tra xem sv có tồn tại không đã
        if (isExisted) {
            for (int i = 0; i < size; i++) {
                if (students[i].getId().compareToIgnoreCase(id) == 0) {
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

    public static boolean updateGpa(Student[] students, String studentId, float gpa) {
        var isExisted = isStudentExisted(students, studentId);
        for (var student : students) {
            if (student == null) {
                return false;
            } else if (student.getId().compareToIgnoreCase(studentId) == 0) {
                student.setGpa(gpa);
            }
        }
        return isExisted;
    }

    public static void statisticByMajor(Student[] students) {
        for (var index = 0; index < students.length; index++) {
            var student = students[index];
            if (student == null) {
                break;
            } else {
                var isExisted = isMajorExisted(students, student.getMajor(), index);
                if (!isExisted) {
                    var excellent = countStudent(students, student.getMajor(), "Xuất sắc");
                    var veryGood = countStudent(students, student.getMajor(), "Giỏi");
                    var good = countStudent(students, student.getMajor(), "Khá");
                    var normal = countStudent(students, student.getMajor(), "Trung bình");
                    var failed = countStudent(students, student.getMajor(), "Trượt");
                    System.out.println(STR."==> Chuyên ngành: \{student.getMajor()}");
                    System.out.println(STR."Số lượng sinh viên xuất sắc: \{excellent}");
                    System.out.println(STR."Số lượng sinh viên giỏi: \{veryGood}");
                    System.out.println(STR."Số lượng sinh viên khá: \{good}");
                    System.out.println(STR."Số lượng sinh viên trung bình: \{normal}");
                    System.out.println(STR."Số lượng sinh viên trượt: \{failed}");
                }
            }
        }
    }

    private static int countStudent(Student[] students, String major, String level) {
        var counter = 0;
        for (var student : students) {
            if (student == null) {
                break;
            } else {
                if (student.getMajor().compareToIgnoreCase(major) == 0) {
                    var rank = ranked(student.getGpa());
                    if (level.compareToIgnoreCase(rank) == 0) {
                        counter++;
                    }
                }
            }
        }
        return counter;
    }

    private static boolean isMajorExisted(Student[] students, String major, int pos) {
        for (int i = 0; i < pos; i++) {
            if (major.compareTo(students[i].getMajor()) == 0) {
                return true;
            }
        }
        return false;
    }

    public static void topGpa(Student[] students, int size) {
        sortByGpaASC(students, size);
        var maxGpa = students[size - 1].getGpa();
        System.out.println("==> Top các sinh viên có điểm gpa cao nhất: ");
        System.out.printf("%-15s%-25s%-20s%-25s%-15s\n", "Mã SV",
                "Họ và tên", "Chuyên ngành", "Email", "Điểm GPA");
        for (int i = size - 1; i >= 0; i--) {
            var student = students[i];
            if (student.getGpa() < maxGpa) {
                break;
            }
            System.out.printf("%-15s%-25s%-20s%-25s%-15.2f\n",
                    student.getId(), student.getFullName(),
                    student.getMajor(), student.getEmail(), student.getGpa());
        }
    }

    public static void findByGpa(Student[] students, float gpa) {
        System.out.println("==> Kết quả tìm kiếm: ");
        System.out.printf("%-15s%-25s%-20s%-25s%-15s\n", "Mã SV",
                "Họ và tên", "Chuyên ngành", "Email", "Điểm GPA");
        for (var student : students) {
            if (student == null) {
                break;
            } else {
                if (gpa == student.getGpa()) {
                    System.out.printf("%-15s%-25s%-20s%-25s%-15.2f\n",
                            student.getId(), student.getFullName(),
                            student.getMajor(), student.getEmail(), student.getGpa());
                }
            }
        }
    }

    public static void findByName(Student[] students, String name) {
        System.out.println("==> Kết quả tìm kiếm: ");
        System.out.printf("%-15s%-25s%-20s%-25s%-15s\n", "Mã SV",
                "Họ và tên", "Chuyên ngành", "Email", "Điểm GPA");
        var counter = 0;
        for (var student : students) {
            if (student == null) {
                break;
            } else {
                var firstName = student.getFullName()
                        .substring(student.getFullName().lastIndexOf(" ") + 1);
                if (firstName.compareToIgnoreCase(name) == 0) {
                    counter++;
                    System.out.printf("%-15s%-25s%-20s%-25s%-15.2f\n",
                            student.getId(), student.getFullName(),
                            student.getMajor(), student.getEmail(), student.getGpa());
                }
            }
        }
        if (counter == 0) {
            System.out.println(STR."==> Không tìm thấy sinh viên nào có tên \"\{name}\"");
        }
    }

    public static void rankedAcademic(Student[] students) {
        System.out.println("===================== BẢNG HỌC LỰC CỦA SINH VIÊN =====================");
        System.out.printf("%-10s%-10s%-25s%-15s%-15s\n",
                "STT", "Mã SV", "Họ và tên", "Điểm gpa", "Học lực");
        var counter = 1;
        for (var student : students) {
            if (student == null) {
                break;
            } else {
                var level = scholarshipLevel(student.getGpa());
                if (level != ScholarshipLevel.FAILED) {
                    System.out.printf("%-10d%-10s%-25s%-15.2f%-15s\n",
                            counter++, student.getId(), student.getFullName(),
                            student.getGpa(), ranked(student.getGpa()));
                }
            }
        }
    }

    private static String ranked(float gpa) {
        if (gpa >= 3.6) {
            return AcademicAbility.HIGHT_DISTINCTION.getValue();
        } else if (gpa >= 3.2) {
            return AcademicAbility.DISTINCTION.getValue();
        } else if (gpa >= 2.8) {
            return AcademicAbility.CREDIT.getValue();
        } else if (gpa >= 2.0) {
            return AcademicAbility.AVERAGE.getValue();
        }
        return AcademicAbility.WEAK.getValue();
    }

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
                var level = scholarshipLevel(student.getGpa());
                if (level != ScholarshipLevel.FAILED) {
                    var amount = formatter.format(scholarshipAmount(level).getValue());
                    System.out.printf("%-10d%-10s%-25s%-15s%-15s\n",
                            counter++, student.getId(), student.getFullName(),
                            level.getValue(), amount);
                }
            }
        }
    }

    private static ScholarshipLevel scholarshipLevel(float gpa) {
        if (gpa > 4 || gpa < 0) {
            return ScholarshipLevel.FAILED; // không đạt
        } else if (gpa >= 3.7f) {
            return ScholarshipLevel.EXCELLENCE; // xuất sắc
        } else if (gpa >= 3.4f) {
            return ScholarshipLevel.VERY_GOOD; // giỏi
        } else if (gpa >= 3.15f) {
            return ScholarshipLevel.GOOD; // khá
        } else {
            return ScholarshipLevel.FAILED; // không đạt
        }
    }

    private static ScholarshipAmount scholarshipAmount(ScholarshipLevel level) {
        return switch (level) {
            case ScholarshipLevel.EXCELLENCE -> ScholarshipAmount.EXCELLENCE;
            case ScholarshipLevel.VERY_GOOD -> ScholarshipAmount.VERY_GOOD;
            case ScholarshipLevel.GOOD -> ScholarshipAmount.GOOD;
            default -> ScholarshipAmount.FAILED;
        };
    }

    private static void sortByGpaASC(Student[] students, int size) {
        for (var i = 0; i < size; i++) {
            for (var j = size - 1; j > i; j--) {
                if (students[j].getGpa() < students[j - 1].getGpa()) {
                    var student = students[j - 1];
                    students[j - 1] = students[j];
                    students[j] = student;
                }
            }
        }
    }

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

    private static boolean shouldSwapStudent(Student student1, Student student2) {
        var name1 = student1.getFullName().substring(student1.getFullName().lastIndexOf(" ") + 1);
        var name2 = student2.getFullName().substring(student2.getFullName().lastIndexOf(" ") + 1);
        var lastName1 = student1.getFullName().substring(0, student1.getFullName().indexOf(" "));
        var lastName2 = student2.getFullName().substring(0, student2.getFullName().indexOf(" "));
        if (student1.getGpa() > student2.getGpa()) {
            return true;
        } else if (student1.getGpa() == student2.getGpa() && name1.compareTo(name2) < 0) {
            return true;
        } else return student1.getGpa() == student2.getGpa()
                && name1.compareTo(name2) == 0
                && lastName1.compareTo(lastName2) < 0;
    }

    private static Student createStudent(Scanner input) {
        System.out.print("Họ và tên: ");
        var fullName = input.nextLine();
        var major = getMajor(input);
        System.out.print("Email: ");
        var email = input.nextLine();
        System.out.print("Điểm GPA: ");
        var gpa = Float.parseFloat(input.nextLine());
        return new Student(null, fullName, major, email, gpa);
    }

    private static Major getMajor(Scanner scanner) {
        System.out.print("==> Chuyên ngành: ");
        System.out.println(STR."1. \{Major.DT.getValue()}.");
        System.out.println(STR."2. \{Major.VT.getValue()}.");
        System.out.println(STR."3. \{Major.CNTT.getValue()}.");
        System.out.println(STR."4. \{Major.ATTT.getValue()}.");
        System.out.println(STR."5. \{Major.QTKD.getValue()}.");
        var choice = scanner.nextInt();
        scanner.nextLine();
        return switch (choice) {
            case 1 -> Major.DT;
            case 2 -> Major.VT;
            case 4 -> Major.ATTT;
            case 5 -> Major.QTKD;
            default -> Major.CNTT;
        };
    }

    public static void showStudentInTable(Student[] students) {
        var line = "======================================";
        System.out.println(STR."\{line} DANH SÁCH SINH VIÊN \{line}");
        System.out.printf("%-15s%-25s%-20s%-25s%-15s\n", "Mã SV",
                "Họ và tên", "Chuyên ngành", "Email", "Điểm GPA");
        for (Student student : students) {
            if (student != null) {
                System.out.printf("%-15s%-25s%-20s%-25s%-15.2f\n",
                        student.getId(), student.getFullName(),
                        student.getMajor(), student.getEmail(), student.getGpa());
            } else {
                break;
            }
        }
    }
}
