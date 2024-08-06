package Exercise.Ex_Chapter6.Ex67.Ex06_67;

/*
    Bài 6. Thông tin về môn học bao gồm: mã môn học có dạng SJxxxx(ví dụ SJ1005), phần số tự động tăng từ 1000, tên môn
    học, số tín chỉ, số tiết học, số lượng bài kiểm tra, số bài thực hành, số lượng bài tập lớn, loại môn học. Loại môn
    học bao gồm: đại cương, cơ sở ngành, chuyên ngành, tự chọn, bắt buộc. Bổ sung các constructor và tái sử dụng chúng
    sao cho phù hợp, sử dụng tính đóng gói dữ liệu và tự bổ sung các phương thức phụ trợ cần thiết. Viết chương trình
    có menu chọn thực hiện các chức năng sau:
        1. Thêm mới môn học vào danh sách môn học. Mỗi môn học xuất hiện không quá 1 lần trong danh sách này.
        2. Sửa thông tin về số tiết học theo mã môn học.
        3. Xóa môn học khỏi danh sách theo mã môn.
        4. Sửa thông tin số bài kiểm tra, bài thực hành và bài tập lớn theo mã môn.
        5. Hiển thị danh sách môn học dưới dạng bảng gồm các hàng các cột ngay ngắn.
        6. Hiển thị danh sách môn học theo từng loại môn học.
        7. Sắp xếp danh sách môn học theo tên môn tăng dần.
        8. Sắp xếp danh sách môn học theo số tín chỉ tăng dần.
        9. Sắp xếp môn học theo số lượng bài kiểm tra giảm dần.
        10. Tìm kiếm môn học theo thể loại.
        11. Tìm kiếm môn học theo tên môn.
        12. Tìm kiếm môn học theo số lượng bài kiểm tra.
        13. Tìm kiếm môn học theo số lượng tín chỉ.
        14. Liệt kê các môn học có nhiều tín chỉ nhất.
        15. Liệt kê các môn học có số tiết học nhiều nhất.
        16. Kết thúc chương trình.
 */

import java.util.ArrayList;
import java.util.Scanner;

// todo 1: sử dụng ArrayList thay cho mảng và sửa đổi code sao cho hợp lý
public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Subject> subjects = new ArrayList<>();
        createFakeSubjects(subjects);

        int choice;
        do {
            displayMenu();
            choice = Integer.parseInt(input.nextLine());
            switch (choice) {
                case 1:
                    Subject subject = createSubject(input);
                    subjects.add(subject);
                    System.out.println("==> Thêm môn học mới thành công! <==");
                    break;
                case 2:
                    if (!subjects.isEmpty()) {
                        updateNumOfLesson(subjects, input);
                    } else {
                        System.err.println("==> Danh sách môn học rỗng! <==");
                    }
                    break;
                case 3:
                    if (!subjects.isEmpty()) {
                        deleteSubjectById(subjects, input);
                    } else {
                        System.err.println("==> Danh sách môn học rỗng! <==");
                    }
                    break;
                case 4:
                    if (!subjects.isEmpty()) {
                        updateSubjectInfo(subjects, input);
                    } else {
                        System.err.println("==> Danh sách môn học rỗng! <==");
                    }
                    break;
                case 5:
                    if (!subjects.isEmpty()) {
                        displayAllSubjects(subjects);
                    } else {
                        System.err.println("==> Danh sách môn học rỗng! <==");
                    }
                    break;
                case 6:
                    if (!subjects.isEmpty()) {
                        displayAllSubjectsByType(subjects);
                    } else {
                        System.err.println("==> Danh sách môn học rỗng! <==");
                    }
                    break;
                case 7:
                    if (!subjects.isEmpty()) {
                        sortSubjectsByNameASC(subjects);
                        System.out.println("==> Sau khi sắp xếp tăng dần theo tên: <==");
                        displayAllSubjects(subjects);
                    } else {
                        System.err.println("==> Danh sách môn học rỗng! <==");
                    }
                    break;
                case 8:
                    if (!subjects.isEmpty()) {
                        sortSubjectsByCreditASC(subjects);
                        displayAllSubjects(subjects);
                    } else {
                        System.err.println("==> Danh sách môn học rỗng! <==");
                    }
                    break;
                case 9:
                    if (!subjects.isEmpty()) {
                        sortSubjectsByNumOfExamASC(subjects);
                        displayAllSubjects(subjects);
                    } else {
                        System.err.println("==> Danh sách môn học rỗng! <==");
                    }
                    break;
                case 10:
                    if (!subjects.isEmpty()) {
                        System.out.print("Loại môn học cần tìm: ");
                        String type = input.nextLine();
                        var results = findSubjectsByType(subjects, type);
                        if (!results.isEmpty()) {
                            System.out.println("==> Kết quả tìm kiếm: <==");
                            displayAllSubjects(results);
                        } else {
                            System.err.println(STR."==> Không tồn tại loại môn học \"\{type}\" <==");
                        }
                    } else {
                        System.err.println("==> Danh sách môn học rỗng! <==");
                    }
                    break;
                case 11:
                    if (!subjects.isEmpty()) {
                        System.out.print("Tên môn học cần tìm: ");
                        String name = input.nextLine().toLowerCase();
                        var results = findSubjectsByName(subjects, name);
                        if (!results.isEmpty()) {
                            System.out.println("==> Kết quả tìm kiếm: <==");
                            displayAllSubjects(results);
                        } else {
                            System.err.println(STR."==> Không tồn tại môn học nào có tên \"\{name}\" <==");
                        }
                    } else {
                        System.err.println("==> Danh sách môn học rỗng! <==");
                    }
                    break;
                case 12:
                    if (!subjects.isEmpty()) {
                        System.out.print("Số lượng bài kiểm tra: ");
                        int numOfExam = Integer.parseInt(input.nextLine());
                        var results = findSubjectsByNumOfExam(subjects, numOfExam);
                        if (!results.isEmpty()) {
                            System.out.println("==> Kết quả tìm kiếm: <==");
                            displayAllSubjects(results);
                        } else {
                            System.err.println(STR."==> Không tồn tại môn học có số bài kiểm tra = \{numOfExam} <==");
                        }
                    } else {
                        System.err.println("==> Danh sách môn học rỗng! <==");
                    }
                    break;
                case 13:
                    if (!subjects.isEmpty()) {
                        System.out.print("Số lượng tín chỉ: ");
                        int credit = Integer.parseInt(input.nextLine());
                        var results = findSubjectsByCredit(subjects, credit);
                        if (!results.isEmpty()) {
                            System.out.println("==> Kết quả tìm kiếm: <==");
                            displayAllSubjects(results);
                        } else {
                            System.err.println(STR."==> Không tồn tại môn học có số tín chỉ = \{credit} <==");
                        }
                    } else {
                        System.err.println("==> Danh sách môn học rỗng! <==");
                    }
                    break;
                case 14:
                    if (!subjects.isEmpty()) {
                        var results = findSubjectsWithMostCredit(subjects);
                        displayAllSubjects(results);
                    } else {
                        System.err.println("==> Danh sách môn học rỗng! <==");
                    }
                    break;
                case 15:
                    if (!subjects.isEmpty()) {
                        var results = findSubjectsWithMostLesson(subjects);
                        displayAllSubjects(results);
                    } else {
                        System.err.println("==> Danh sách môn học rỗng! <==");
                    }
                    break;
                case 16:
                    System.err.println("==> Kết thúc chương trình <==");
                    break;
                default:
                    System.err.println("==> Sai chức năng, vui lòng nhập từ 1 -> 16 <==");
            }
        } while (choice != 16);
    }

    private static void displayAllSubjectsByType(ArrayList<Subject> subjects) {
        var types = new ArrayList<Type>();
        for (Subject subject : subjects) {
            if (!isTypeExisted(types, subject.getType())) {
                types.add(subject.getType());
            }
        }

        for (Type type : types) {
            if (type == null) {
                break;
            }
            System.out.println(STR."==> DANH SÁCH MÔN HỌC THỂ LOẠI '\{type.getValue().toUpperCase()}': ");
            System.out.printf("%-10s%-25s%-10s%-10s%-10s%-10s%-10s%-15s\n",
                    "Mã môn", "Tên môn học", "Số tín", "Số tiết",
                    "Số bài KT", "Số BTH", "Số BTL", "Loại MH");
            for (Subject subject : subjects) {
                if (subject.getType() == type) {
                    displaySubject(subject);
                }
            }
        }
    }

    private static boolean isTypeExisted(ArrayList<Type> types, Type type) {
        for (Type t : types) {
            if (t == type) {
                return true;
            }
        }
        return false;
    }

    private static void createFakeSubjects(ArrayList<Subject> subjects) {
        subjects.add(new Subject(null, "Đại số", 3, 36, 3, 0, 1, Type.GENERAL));
        subjects.add(new Subject(null, "Vật lý", 4, 48, 4, 4, 1, Type.GENERAL));
        subjects.add(new Subject(null, "Giải tích", 3, 36, 3, 0, 1, Type.GENERAL));
        subjects.add(new Subject(null, "Lập trình C++", 3, 36, 3, 4, 1, Type.MAJOR_FOUNDATION));
        subjects.add(new Subject(null, "Lập trình Java", 4, 48, 4, 4, 2, Type.MAJOR_FOUNDATION));
        subjects.add(new Subject(null, "SQL", 3, 36, 3, 4, 1, Type.MAJOR_FOUNDATION));
        subjects.add(new Subject(null, "Lập trình Java web", 5, 60, 5, 5, 2, Type.MAJOR_SPECIALIZED));
        subjects.add(new Subject(null, "Lập trình Android", 5, 60, 5, 5, 2, Type.MAJOR_SPECIALIZED));
    }

    private static void displayMenu() {
        var line = "====================";
        System.out.println(STR."\{line} CÁC LỰA CHỌN \{line}");
        System.out.println("1. Thêm mới môn học vào danh sách.");
        System.out.println("2. Sửa thông tin về số tiết học.");
        System.out.println("3. Xoá môn học khỏi danh sách.");
        System.out.println("4. Sửa thông tin môn học.");
        System.out.println("5. Hiển thị danh sách môn học.");
        System.out.println("6. Hiển thị danh sách môn học theo từng thể loại.");
        System.out.println("7. Sắp xếp danh sách môn học theo tên môn tăng dần.");
        System.out.println("8. Sắp xếp DS môn học theo số tín chỉ tăng dần.");
        System.out.println("9. Sắp xếp DS môn học theo số bài kiểm tra giảm dần.");
        System.out.println("10. Tìm kiếm môn học theo thể loại.");
        System.out.println("11. Tìm kiếm môn học theo tên môn.");
        System.out.println("12. Tìm kiếm môn học theo số lượng bài kiểm tra.");
        System.out.println("13. Tìm kiếm môn học theo số lượng tín chỉ.");
        System.out.println("14. Liệt kê các môn học có nhiều số tín chỉ nhất.");
        System.out.println("15. Liệt kê các môn học có số tiết học nhiều nhất.");
        System.out.println("16. Kết thúc chương trình.");
        System.out.println("==> Lựa chọn của bạn:");
    }

    private static Subject createSubject(Scanner input) {
        System.out.print("Tên môn học: ");
        String subjectName = input.nextLine();
        System.out.print("Số tín chỉ: ");
        int credit = Integer.parseInt(input.nextLine());
        System.out.print("Số tiết học: ");
        int numOfLesson = Integer.parseInt(input.nextLine());
        System.out.print("Số bài kiểm tra: ");
        int numOfExam = Integer.parseInt(input.nextLine());
        System.out.print("Số bài thực hành: ");
        int numOfPractice = Integer.parseInt(input.nextLine());
        System.out.print("Số lượng bài tập lớn: ");
        int numOfProject = Integer.parseInt(input.nextLine());
        var type = getSubjectType(input);
        return new Subject(null, subjectName, credit, numOfLesson, numOfExam,
                numOfPractice, numOfProject, type);
    }

    private static Type getSubjectType(Scanner scanner) {
        System.out.println("Loại môn học: ");
        System.out.println("1. Đại cương");
        System.out.println("2. Cơ sở ngành");
        System.out.println("3. Chuyên ngành");
        System.out.println("4. Tự chọn");
        System.out.println("5. Bắt buộc");
        System.out.println("==> Xin mời chọn(1-5): ");
        int choice = scanner.nextInt();
        scanner.nextLine(); // đọc bỏ dòng thừa sau khi đọc số
        return switch (choice) {
            case 2 -> Type.MAJOR_FOUNDATION;
            case 3 -> Type.MAJOR_SPECIALIZED;
            case 4 -> Type.ELECTIVE;
            case 5 -> Type.COMPULSORY;
            default -> Type.GENERAL;
        };
    }

    private static void updateNumOfLesson(ArrayList<Subject> subjects, Scanner input) {
        System.out.print("Mã môn học cần cập nhật: ");
        String subjectId = input.nextLine().toUpperCase();
        int indexById = findSubjectById(subjects, subjectId);
        if (indexById != -1) {
            System.out.print("Số tiết học mới: ");
            int numOfLesson = Integer.parseInt(input.nextLine());
            if (numOfLesson > 0) {
                subjects.get(indexById).setNumOfLesson(numOfLesson);
                System.out.println(STR."==> Cập nhật số tiết học cho môn học mã \{subjectId} thành công <==");
            } else {
                System.err.println("==> Cập nhật số tiết học thất bại. Số tiết học phải > 0 <==");
            }
        } else {
            System.err.println(STR."==> Không tìm thấy môn học có mã \{subjectId}! <==");
        }
    }

    private static int findSubjectById(ArrayList<Subject> subjects, String subjectId) {
        for (int i = 0; i < subjects.size(); i++) {
            if (subjects.get(i) == null) {
                break;
            }
            if (subjects.get(i).getId().compareToIgnoreCase(subjectId) == 0) {
                return i;
            }
        }
        return -1;
    }

    private static void deleteSubjectById(ArrayList<Subject> subjects, Scanner input) {
        System.out.print("Mã môn học cần xoá: ");
        String subjectId = input.nextLine().trim();
        int index = findSubjectById(subjects, subjectId);
        if (index != -1) {
            subjects.remove(index);
            System.out.println(STR."==> Xoá môn học mã \{subjectId} thành công <==");
        } else {
            System.err.println(STR."==> Không tìm thấy môn học có mã \{subjectId}! <==");
        }
    }

    private static void updateSubjectInfo(ArrayList<Subject> subjects, Scanner input) {
        System.out.print("Mã môn học cần cập nhật: ");
        String subjectId = input.nextLine().trim();
        int indexById = findSubjectById(subjects, subjectId);
        if (indexById != -1) {
            System.out.print("Số bài kiểm tra mới: ");
            int numOfExam = Integer.parseInt(input.nextLine());
            System.out.print("Số bài thực hành mới: ");
            int numOfPractice = Integer.parseInt(input.nextLine());
            System.out.print("Số bài tập lớn mới: ");
            int numOfProject = Integer.parseInt(input.nextLine());
            if (numOfExam > 0 && numOfPractice > 0 && numOfProject > 0) {
                subjects.get(indexById).setNumOfExam(numOfExam);
                subjects.get(indexById).setNumOfPractice(numOfPractice);
                subjects.get(indexById).setNumOfProject(numOfProject);
                System.out.println(STR."==> Cập nhật thông tin cho môn học mã \{subjectId} thành công <==");
            } else {
                System.err.println("==> Cập nhật thông tin môn học thất bại. Các trường phải > 0 <==");
            }
        } else {
            System.err.println(STR."==> Không tìm thấy môn học có mã \{subjectId}! <==");
        }
    }

    private static void displayAllSubjects(ArrayList<Subject> subjects) {
        var line = "========================================";
        System.out.println(STR."\{line} DANH SÁCH MÔN HỌC \{line}");
        System.out.printf("%-10s%-25s%-10s%-10s%-10s%-10s%-10s%-15s\n",
                "Mã môn", "Tên môn học", "Số tín", "Số tiết",
                "Số bài KT", "Số BTH", "Số BTL", "Loại MH");
        for (Subject subject : subjects) {
            if (subject != null) {
                displaySubject(subject);
            }
        }
    }

    private static void displaySubject(Subject subject) {
        System.out.printf("%-10s%-25s%-10d%-10d%-10d%-10d%-10d%-15s\n",
                subject.getId(), subject.getName(), subject.getCredit(),
                subject.getNumOfLesson(), subject.getNumOfExam(),
                subject.getNumOfPractice(), subject.getNumOfProject(),
                subject.getType().getValue());
    }


    private static void sortSubjectsByNameASC(ArrayList<Subject> subjects) {
        for (int i = 0; i < subjects.size() - 1; i++) {
            for (int j = subjects.size() - 1; j > i; j--) {
                if (subjects.get(j - 1).getName().compareToIgnoreCase(subjects.get(j).getName()) > 0) {
                    var temp = subjects.get(j - 1);
                    subjects.set(j - 1, subjects.get(j));
                    subjects.set(j, temp);
                }
            }
        }
    }

    private static void sortSubjectsByCreditASC(ArrayList<Subject> subjects) {
        for (int i = 0; i < subjects.size() - 1; i++) {
            for (int j = subjects.size() - 1; j > i; j--) {
                if (subjects.get(j - 1).getCredit() > subjects.get(j).getCredit()) {
                    var temp = subjects.get(j);
                    subjects.set(j, subjects.get(j - 1));
                    subjects.set(j - 1, temp);
                }
            }
        }
    }

    private static void sortSubjectsByNumOfExamASC(ArrayList<Subject> subjects) {
        for (int i = 0; i < subjects.size() - 1; i++) {
            for (int j = subjects.size() - 1; j > i; j--) {
                if (subjects.get(j - 1).getNumOfExam() < subjects.get(j).getNumOfExam()) {
                    var temp = subjects.get(j);
                    subjects.set(j, subjects.get(j - 1));
                    subjects.set(j - 1, temp);
                }
            }
        }
    }

    private static ArrayList<Subject> findSubjectsByType(ArrayList<Subject> subjects, String type) {
        var results = new ArrayList<Subject>();
        for (var subject : subjects) {
            if (subject.getTypeValue().toLowerCase().contains(type.toLowerCase())) {
                results.add(subject);
            }
        }
        return results;
    }

    private static ArrayList<Subject> findSubjectsByName(ArrayList<Subject> subjects, String name) {
        var results = new ArrayList<Subject>();
        for (var subject : subjects) {
            if (subject != null && subject.getName().toLowerCase().contains(name)) {
                results.add(subject);
            }
        }
        return results;
    }

    private static ArrayList<Subject> findSubjectsByNumOfExam(ArrayList<Subject> subjects, int numOfExam) {
        var results = new ArrayList<Subject>();
        for (var subject : subjects) {
            if (subject.getNumOfExam() == numOfExam) {
                results.add(subject);
            }
        }
        return results;
    }

    private static ArrayList<Subject> findSubjectsByCredit(ArrayList<Subject> subjects, int credit) {
        var results = new ArrayList<Subject>();
        for (var subject : subjects) {
            if (subject.getCredit() == credit) {
                results.add(subject);
            }
        }
        return results;
    }

    private static ArrayList<Subject> findSubjectsWithMostCredit(ArrayList<Subject> subjects) {
        var results = new ArrayList<Subject>();
        int maxCredit = findMaxSubjectCredit(subjects);
        for (var subject : subjects) {
            if (subject.getCredit() == maxCredit) {
                results.add(subject);
            }
        }
        return results;
    }

    private static int findMaxSubjectCredit(ArrayList<Subject> subjects) {
        var max = 0;
        for (var subject : subjects) {
            if (subject.getCredit() > max) {
                max = subject.getCredit();
            }
        }
        return max;
    }

    private static ArrayList<Subject> findSubjectsWithMostLesson(ArrayList<Subject> subjects) {
        var results = new ArrayList<Subject>();
        int maxNumOfLesson = findMaxSubjectLesson(subjects);
        for (var subject : subjects) {
            if (subject.getNumOfLesson() == maxNumOfLesson) {
                results.add(subject);
            }
        }
        return results;
    }

    private static int findMaxSubjectLesson(ArrayList<Subject> subjects) {
        var max = 0;
        for (var subject : subjects) {
            if (subject.getNumOfLesson() > max) {
                max = subject.getNumOfLesson();
            }
        }
        return max;
    }
}
