package Exercise.Ex_Chapter6.Ex62.Ex06_62;

import java.util.Scanner;

import static java.lang.StringTemplate.STR;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // todo 3: tạo mảng các môn học với số lượng phần tử tối đa = 100
        Subject[] subjects = new Subject[100];
        int subjectCount = createFakeSubjects(subjects);

        // todo 4: triển khai menu chứa các chức năng của chương trình
        int choice;
        do {
            displayMenu();

            // todo 6: đọc vào lựa chọn của người dùng
            choice = Integer.parseInt(input.nextLine());
            switch (choice) {
                // todo 7: triển khai code ứng với lựa chọn chức năng số 1
                case 1:
                    if (subjectCount <= 100) {
                        Subject subject = createSubject(subjects, input);
                        subjects[subjectCount++] = subject;
                        System.out.println("==> Thêm môn học mới thành công! <==");
                    } else {
                        System.err.println("==> Số lượng môn học đầy. Không thể thêm! <==");
                    }
                    break;
                // todo 9: triển khai code ứng với lựa chọn chức năng số 2
                case 2:
                    if (subjectCount > 0) {
                        updateNumOfLesson(subjects, input);
                    } else {
                        System.err.println("==> Danh sách môn học rỗng! <==");
                    }
                    break;
                // todo 12: triển khai code ứng với lựa chọn chức năng số 3
                case 3:
                    if (subjectCount > 0) {
                        deleteSubjectById(subjects, input);
                        subjectCount--;
                    } else {
                        System.err.println("==> Danh sách môn học rỗng! <==");
                    }
                    break;
                // todo 14: triển khai code ứng với lựa chọn chức năng số 4
                case 4:
                    if (subjectCount > 0) {
                        updateSubjectInfo(subjects, input);
                    } else {
                        System.err.println("==> Danh sách môn học rỗng! <==");
                    }
                    break;
                // todo 16: triển khai code ứng với lựa chọn chức năng số 5
                case 5:
                    if (subjectCount > 0) {
                        displayAllSubjects(subjects);
                    } else {
                        System.err.println("==> Danh sách môn học rỗng! <==");
                    }
                    break;
                // todo 18: triển khai code ứng với lựa chọn chức năng số 6
                case 6:
                    if (subjectCount > 0) {
                        sortSubjectsByNameASC(subjects, subjectCount);
                        System.out.println("==> Sau khi sắp xếp tăng dần theo tên: <==");
                        displayAllSubjects(subjects);
                    } else {
                        System.err.println("==> Danh sách môn học rỗng! <==");
                    }
                    break;
                // todo 20: triển khai code ứng với lựa chọn chức năng số 7
                case 7:
                    if (subjectCount > 0) {
                        sortSubjectsByCreditASC(subjects, subjectCount);
                        displayAllSubjects(subjects);
                    } else {
                        System.err.println("==> Danh sách môn học rỗng! <==");
                    }
                    break;
                // todo 22: triển khai code ứng với lựa chọn chức năng số 8
                case 8:
                    if (subjectCount > 0) {
                        sortSubjectsByNumOfExamASC(subjects, subjectCount);
                        displayAllSubjects(subjects);
                    } else {
                        System.err.println("==> Danh sách môn học rỗng! <==");
                    }
                    break;
                // todo 24: triển khai code ứng với lựa chọn chức năng số 9
                case 9:
                    if (subjectCount > 0) {
                        System.out.print("Loại môn học cần tìm: ");
                        String type = input.nextLine();
                        var results = findSubjectsByType(subjects, type);
                        if (results != null) {
                            System.out.println("==> Kết quả tìm kiếm: <==");
                            displayAllSubjects(results);
                        } else {
                            System.err.println(STR."==> Không tồn tại loại môn học \"\{type}\" <==");
                        }
                    } else {
                        System.err.println("==> Danh sách môn học rỗng! <==");
                    }
                    break;
                // todo 26: triển khai code ứng với lựa chọn chức năng số 10
                case 10:
                    if (subjectCount > 0) {
                        System.out.print("Tên môn học cần tìm: ");
                        String name = input.nextLine().toLowerCase();
                        var results = findSubjectsByName(subjects, name);
                        if (results != null) {
                            System.out.println("==> Kết quả tìm kiếm: <==");
                            displayAllSubjects(results);
                        } else {
                            System.err.println(STR."==> Không tồn tại môn học nào có tên \"\{name}\" <==");
                        }
                    } else {
                        System.err.println("==> Danh sách môn học rỗng! <==");
                    }
                    break;
                // todo 28: triển khai code ứng với lựa chọn chức năng số 11
                case 11:
                    if (subjectCount > 0) {
                        System.out.print("Số lượng bài kiểm tra: ");
                        int numOfExam = Integer.parseInt(input.nextLine());
                        var results = findSubjectsByNumOfExam(subjects, numOfExam);
                        if (results != null) {
                            System.out.println("==> Kết quả tìm kiếm: <==");
                            displayAllSubjects(results);
                        } else {
                            System.err.println(STR."==> Không tồn tại môn học có số bài kiểm tra = \{numOfExam} <==");
                        }
                    } else {
                        System.err.println("==> Danh sách môn học rỗng! <==");
                    }
                    break;
                // todo 30: triển khai code ứng với lựa chọn chức năng số 12
                case 12:
                    if (subjectCount > 0) {
                        System.out.print("Số lượng tín chỉ: ");
                        int credit = Integer.parseInt(input.nextLine());
                        var results = findSubjectsByCredit(subjects, credit);
                        if (results != null) {
                            System.out.println("==> Kết quả tìm kiếm: <==");
                            displayAllSubjects(results);
                        } else {
                            System.err.println(STR."==> Không tồn tại môn học có số tín chỉ = \{credit} <==");
                        }
                    } else {
                        System.err.println("==> Danh sách môn học rỗng! <==");
                    }
                    break;
                // todo 32: triển khai code ứng với lựa chọn chức năng số 13
                case 13:
                    if (subjectCount > 0) {
                        var results = findSubjectsWithMostCredit(subjects);
                        displayAllSubjects(results);
                    } else {
                        System.err.println("==> Danh sách môn học rỗng! <==");
                    }
                    break;
                // todo 35: triển khai code ứng với lựa chọn chức năng số 14
                case 14:
                    if (subjectCount > 0) {
                        var results = findSubjectsWithMostLesson(subjects);
                        displayAllSubjects(results);
                    } else {
                        System.err.println("==> Danh sách môn học rỗng! <==");
                    }
                    break;
                // todo 38: triển khai code ứng với lựa chọn chức năng số 15
                case 15:
                    System.err.println("==> Kết thúc chương trình <==");
                    break;
                // todo 39: triển khai code ứng với lựa chọn chức năng không tồn tại
                default:
                    System.err.println("==> Sai chức năng, vui lòng nhập từ 1 -> 15 <==");
            }
        } while (choice != 15);
    }

    // todo 40: triển khai code tạo mới danh sách môn học giả định
    private static int createFakeSubjects(Subject[] subjects) {
        var index = 0;
        subjects[index++] = new Subject("SJ1001", "Đại số", 3, 36, 3, 0, 1, "Đại cương");
        subjects[index++] = new Subject("SJ1002", "Vật lý", 4, 48, 4, 4, 1, "Đại cương");
        subjects[index++] = new Subject("SJ1003", "Giải tích", 3, 36, 3, 0, 1, "Đại cương");
        subjects[index++] = new Subject("SJ1004", "Lập trình C++", 3, 36, 3, 4, 1, "Cơ sở ngành");
        subjects[index++] = new Subject("SJ1005", "Lập trình Java", 4, 48, 4, 4, 2, "Cơ sở ngành");
        subjects[index++] = new Subject("SJ1006", "SQL", 3, 36, 3, 4, 1, "Cơ sở ngành");
        subjects[index++] = new Subject("SJ1007", "Lập trình Java web", 5, 60, 5, 5, 2, "Chuyên ngành");
        subjects[index++] = new Subject("SJ1008", "Lập trình Android", 5, 60, 5, 5, 2, "Chuyên ngành");
        return index;
    }

    // todo 5: triển khai phương thức in ra menu của chương trình với các lựa chọn
    private static void displayMenu() {
        var line = "====================";
        System.out.println(STR."\{line} CÁC LỰA CHỌN \{line}");
        System.out.println("1. Thêm mới môn học vào danh sách.");
        System.out.println("2. Sửa thông tin về số tiết học.");
        System.out.println("3. Xoá môn học khỏi danh sách.");
        System.out.println("4. Sửa thông tin môn học.");
        System.out.println("5. Hiển thị danh sách môn học.");
        System.out.println("6. Sắp xếp danh sách môn học theo tên môn tăng dần.");
        System.out.println("7. Sắp xếp danh sách môn học theo tên môn giảm dần.");
        System.out.println("8. Sắp xếp danh sách môn học theo số tín tăng dần.");
        System.out.println("9. Tìm kiếm môn học theo thể loại.");
        System.out.println("10. Tìm kiếm môn học theo tên môn.");
        System.out.println("11. Tìm kiếm môn học theo số lượng bài kiểm tra.");
        System.out.println("12. Tìm kiếm môn học theo số lượng tín chỉ.");
        System.out.println("13. Liệt kê các môn học có nhiều số tín chỉ nhất.");
        System.out.println("14. Liệt kê các môn học có số tiết học nhiều nhất.");
        System.out.println("15. Kết thúc chương trình.");
        System.out.println("==> Lựa chọn của bạn:");
    }

    // todo 7: triển khai phương thức thêm mới một môn học
    private static Subject createSubject(Subject[] subjects, Scanner input) {
        String subjectId;
        do {
            System.out.println("Mã môn học(SJxxxx - ví dụ: SJ1005): ");
            subjectId = checkUniqueId(subjects, input.nextLine().trim().toUpperCase());
        } while (subjectId == null);
        System.out.println("Tên môn học: ");
        String subjectName = input.nextLine();
        System.out.println("Số tín chỉ: ");
        int credit = Integer.parseInt(input.nextLine());
        System.out.println("Số tiết học: ");
        int numOfLesson = Integer.parseInt(input.nextLine());
        System.out.println("Số bài kiểm tra: ");
        int numOfExam = Integer.parseInt(input.nextLine());
        System.out.println("Số bài thực hành: ");
        int numOfPractice = Integer.parseInt(input.nextLine());
        System.out.println("Số lượng bài tập lớn: ");
        int numOfProject = Integer.parseInt(input.nextLine());
        System.out.println("Loại môn học(đại cương,chuyên ngành, tự chọn): ");
        String subjectType = input.nextLine();
        return new Subject(subjectId, subjectName, credit, numOfLesson, numOfExam,
                numOfPractice, numOfProject, subjectType);
    }

    // todo 8: triển khai code kiểm tra tính hợp lệ của mã môn học và nó đã tồn tại chưa
    private static String checkUniqueId(Subject[] subjects, String subjectId) {
        if (!subjectId.startsWith("SJ") || subjectId.length() != 6) {
            System.err.println("==> Mã môn học không hợp lệ. <==");
            return null;
        }
        for (Subject subject : subjects) {
            if (subject == null) {
                break;
            }
            if (subject.id.equals(subjectId)) {
                System.err.println("==> Mã môn học đã tồn tại. Vui lòng nhập mã khác. <==");
                return null;
            }
        }
        return subjectId;
    }

    // todo 10: triển khai phương thức sửa thông tin về số tiết học theo mã môn học
    private static void updateNumOfLesson(Subject[] subjects, Scanner input) {
        System.out.print("Mã môn học cần cập nhật: ");
        String subjectId = input.nextLine().toUpperCase();
        int indexById = findSubjectById(subjects, subjectId);
        if (indexById != -1) {
            System.out.print("Số tiết học mới: ");
            int numOfLesson = Integer.parseInt(input.nextLine());
            if (numOfLesson > 0) {
                subjects[indexById].numOfLesson = numOfLesson;
                System.out.println(STR."==> Cập nhật số tiết học cho môn học mã \{subjectId} thành công <==");
            } else {
                System.err.println("==> Cập nhật số tiết học thất bại. Số tiết học phải > 0 <==");
            }
        } else {
            System.err.println(STR."==> Không tìm thấy môn học có mã \{subjectId}! <==");
        }
    }

    // todo 11: triển khai phương thức tìm môn học theo mã môn, trả về chỉ số phần tử tìm thấy
    //  hoặc trả về -1 nếu không tìm thấy.
    private static int findSubjectById(Subject[] subjects, String subjectId) {
        for (int i = 0; i < subjects.length; i++) {
            if (subjects[i] == null) {
                break;
            }
            if (subjects[i].id.compareToIgnoreCase(subjectId) == 0) {
                return i;
            }
        }
        return -1;
    }

    // todo 13: triển khai phương thức xoá môn học theo mã môn học
    private static void deleteSubjectById(Subject[] subjects, Scanner input) {
        System.out.print("Mã môn học cần xoá: ");
        String subjectId = input.nextLine().trim();
        int indexById = findSubjectById(subjects, subjectId);
        if (indexById != -1) {
            for (int i = indexById; i < subjects.length - 1; i++) {
                if (subjects[i] != null) {
                    subjects[i] = subjects[i + 1];
                }
            }
            subjects[subjects.length - 1] = null;
            System.out.println(STR."==> Xoá môn học mã \{subjectId} thành công <==");
        } else {
            System.err.println(STR."==> Không tìm thấy môn học có mã \{subjectId}! <==");
        }
    }

    // todo 15: triển khai phương thức sửa thông tin số bài kiểm tra, thực hành, bài tập lớn theo mã môn học
    private static void updateSubjectInfo(Subject[] subjects, Scanner input) {
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
                subjects[indexById].numOfExam = numOfExam;
                subjects[indexById].numOfPractice = numOfPractice;
                subjects[indexById].numOfProject = numOfProject;
                System.out.println(STR."==> Cập nhật thông tin cho môn học mã \{subjectId} thành công <==");
            } else {
                System.err.println("==> Cập nhật thông tin môn học thất bại. Các trường phải > 0 <==");
            }
        } else {
            System.err.println(STR."==> Không tìm thấy môn học có mã \{subjectId}! <==");
        }
    }

    // todo 17: triển khai phương thức hiển thị danh sách môn học dưới dạng hàng và cột ngay ngắn
    private static void displayAllSubjects(Subject[] subjects) {
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
                subject.id, subject.name, subject.credit, subject.numOfLesson,
                subject.numOfExam, subject.numOfPractice, subject.numOfProject, subject.type);
    }


    // todo 19: triển khai phương thức sắp xếp theo tên môn học tanwg dần
    private static void sortSubjectsByNameASC(Subject[] subjects, int size) {
        for (int i = 0; i < size - 1; i++) {
            for (int j = size - 1; j > i; j--) {
                if (subjects[j - 1].name.compareTo(subjects[j].name) > 0) {
                    var temp = subjects[j];
                    subjects[j] = subjects[j - 1];
                    subjects[j - 1] = temp;
                }
            }
        }
    }

    // todo 21: triển khai phương thức sắp xếp theo tên môn học giảm dần
    private static void sortSubjectsByCreditASC(Subject[] subjects, int size) {
        for (int i = 0; i < size - 1; i++) {
            for (int j = size - 1; j > i; j--) {
                if (subjects[j - 1].credit > subjects[j].credit) {
                    var temp = subjects[j];
                    subjects[j] = subjects[j - 1];
                    subjects[j - 1] = temp;
                }
            }
        }
    }

    // todo 23: triển khai phương thức sắp xếp theo tên môn học giảm dần
    private static void sortSubjectsByNumOfExamASC(Subject[] subjects, int size) {
        for (int i = 0; i < size - 1; i++) {
            for (int j = size - 1; j > i; j--) {
                if (subjects[j - 1].numOfExam < subjects[j].numOfExam) {
                    var temp = subjects[j];
                    subjects[j] = subjects[j - 1];
                    subjects[j - 1] = temp;
                }
            }
        }
    }

    // todo 25: triển khai phương thức tìm kiếm các môn học theo loại môn học
    private static Subject[] findSubjectsByType(Subject[] subjects, String type) {
        var result = new Subject[subjects.length];
        int count = 0;
        for (var subject : subjects) {
            if (subject == null) {
                break;
            }
            if (subject.type.toLowerCase().contains(type.toLowerCase())) {
                result[count++] = subject;
            }
        }
        if (count > 0) {
            return result;
        }
        return null; // không có kết quả tìm kiếm
    }

    // todo 27: triển khai phương thức tìm kiếm các môn học theo tên môn học
    private static Subject[] findSubjectsByName(Subject[] subjects, String name) {
        var results = new Subject[subjects.length];
        int count = 0;
        for (var subject : subjects) {
            if (subject != null && subject.name.toLowerCase().contains(name)) {
                results[count++] = subject;
            }
        }
        if (count > 0) {
            return results;
        }
        return null; // không có kết quả tìm kiếm
    }

    // todo 29: triển khai phương thức tìm kiếm các môn học theo số lượng bài kiểm tra
    private static Subject[] findSubjectsByNumOfExam(Subject[] subjects, int numOfExam) {
        var results = new Subject[subjects.length];
        int count = 0;
        for (var subject : subjects) {
            if (subject == null) {
                break;
            }
            if (subject.numOfExam == numOfExam) {
                results[count++] = subject;
            }
        }

        if (count > 0) {
            return results;
        }

        return null; // không có kết quả tìm kiếm
    }

    // todo 31: triển khai phương thức tìm kiếm các môn học theo số tín chỉ
    private static Subject[] findSubjectsByCredit(Subject[] subjects, int credit) {
        var results = new Subject[subjects.length];
        int count = 0;
        for (var subject : subjects) {
            if (subject == null) {
                break;
            }
            if (subject.credit == credit) {
                results[count++] = subject;
            }
        }

        if (count > 0) {
            return results;
        }

        return null; // không có kết quả tìm kiếm
    }

    // todo 33: triển khai phương thức liệt kê các môn học có nhiều tín chỉ nhất
    private static Subject[] findSubjectsWithMostCredit(Subject[] subjects) {
        var results = new Subject[subjects.length];
        int count = 0;
        int maxCredit = findMaxSubjectCredit(subjects);
        for (var subject : subjects) {
            if (subject == null) {
                break;
            }
            if (subject.credit == maxCredit) {
                results[count++] = subject;
            }
        }
        return results;
    }

    // todo 34: triển khai code tìm số tín chỉ lớn nhất của các môn học trong danh sách
    private static int findMaxSubjectCredit(Subject[] subjects) {
        var max = 0;
        for (var subject : subjects) {
            if (subject == null) {
                break;
            }
            if (subject.credit > max) {
                max = subject.credit;
            }
        }
        return max;
    }


    // todo 36: triển khai phương thức liệt kê các môn học có nhiều số tiết học nhất
    private static Subject[] findSubjectsWithMostLesson(Subject[] subjects) {
        var results = new Subject[subjects.length];
        int count = 0;
        int maxNumOfLesson = findMaxSubjectLesson(subjects);
        for (var subject : subjects) {
            if (subject == null) {
                break;
            }
            if (subject.numOfLesson == maxNumOfLesson) {
                results[count++] = subject;
            }
        }
        return results;
    }

    // todo 37: triển khai code tìm số lượng môn học có nhiều tiết học nhất
    private static int findMaxSubjectLesson(Subject[] subjects) {
        var max = 0;
        for (var subject : subjects) {
            if (subject == null) {
                break;
            }
            if (subject.numOfLesson > max) {
                max = subject.numOfLesson;
            }
        }
        return max;
    }
}
