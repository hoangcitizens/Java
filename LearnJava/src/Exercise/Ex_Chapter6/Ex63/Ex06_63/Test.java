package Exercise.Ex_Chapter6.Ex63.Ex06_63;

/*
    Bài 6. Thông tin về môn học bao gồm: mã môn học có dạng SJxxxx(ví dụ SJ1005), tên môn học, số tín chỉ, số tiết học,
    số lượng bài kiểm tra, số bài thực hành, số lượng bài tập lớn, loại môn học. Bổ sung các constructor và tái sử dụng
    chúng sao cho phù hợp, sử dụng tính đóng gói dữ liệu và tự bổ sung các phương thức phụ trợ cần thiết. Viết chương
    trình có menu chọn thực hiện các chức năng sau:
        1. Thêm mới môn học vào danh sách. Mỗi môn học có một mã môn học duy nhất và chỉ xuất hiện đúng 1 lần trong danh sách.
        2. Sửa thông tin về số tiết học theo mã môn học.
        3. Xóa môn học khỏi danh sách theo mã môn.
        4. Sửa thông tin số bài kiểm tra, bài thực hành và bài tập lớn theo mã môn.
        5. Hiển thị danh sách môn học dưới dạng bảng gồm các hàng các cột ngay ngắn.
        6. Sắp xếp danh sách môn học theo tên môn tăng dần.
        7. Sắp xếp danh sách môn học theo số tín chỉ tăng dần.
        8. Sắp xếp môn học theo số lượng bài kiểm tra giảm dần.
        9. Tìm kiếm môn học theo thể loại.
        10. Tìm kiếm môn học theo tên môn.
        11. Tìm kiếm môn học theo số lượng bài kiểm tra.
        12. Tìm kiếm môn học theo số lượng tín chỉ.
        13. Liệt kê các môn học có nhiều tín chỉ nhất.
        14. Liệt kê các môn học có số tiết học nhiều nhất.
        15. Kết thúc chương trình.
 */

import java.util.Scanner;

// todo 4: sử dụng các getter và setter sao cho phù hợp
public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Subject[] subjects = new Subject[100];
        int subjectCount = createFakeSubjects(subjects);

        int choice;
        do {
            displayMenu();
            choice = Integer.parseInt(input.nextLine());
            switch (choice) {
                case 1:
                    if (subjectCount <= 100) {
                        Subject subject = createSubject(subjects, input);
                        subjects[subjectCount++] = subject;
                        System.out.println("==> Thêm môn học mới thành công! <==");
                    } else {
                        System.err.println("==> Số lượng môn học đầy. Không thể thêm! <==");
                    }
                    break;
                case 2:
                    if (subjectCount > 0) {
                        updateNumOfLesson(subjects, input);
                    } else {
                        System.err.println("==> Danh sách môn học rỗng! <==");
                    }
                    break;
                case 3:
                    if (subjectCount > 0) {
                        deleteSubjectById(subjects, input);
                        subjectCount--;
                    } else {
                        System.err.println("==> Danh sách môn học rỗng! <==");
                    }
                    break;
                case 4:
                    if (subjectCount > 0) {
                        updateSubjectInfo(subjects, input);
                    } else {
                        System.err.println("==> Danh sách môn học rỗng! <==");
                    }
                    break;
                case 5:
                    if (subjectCount > 0) {
                        displayAllSubjects(subjects);
                    } else {
                        System.err.println("==> Danh sách môn học rỗng! <==");
                    }
                    break;
                case 6:
                    if (subjectCount > 0) {
                        sortSubjectsByNameASC(subjects, subjectCount);
                        System.out.println("==> Sau khi sắp xếp tăng dần theo tên: <==");
                        displayAllSubjects(subjects);
                    } else {
                        System.err.println("==> Danh sách môn học rỗng! <==");
                    }
                    break;
                case 7:
                    if (subjectCount > 0) {
                        sortSubjectsByCreditASC(subjects, subjectCount);
                        displayAllSubjects(subjects);
                    } else {
                        System.err.println("==> Danh sách môn học rỗng! <==");
                    }
                    break;
                case 8:
                    if (subjectCount > 0) {
                        sortSubjectsByNumOfExamASC(subjects, subjectCount);
                        displayAllSubjects(subjects);
                    } else {
                        System.err.println("==> Danh sách môn học rỗng! <==");
                    }
                    break;
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
                case 13:
                    if (subjectCount > 0) {
                        var results = findSubjectsWithMostCredit(subjects);
                        displayAllSubjects(results);
                    } else {
                        System.err.println("==> Danh sách môn học rỗng! <==");
                    }
                    break;
                case 14:
                    if (subjectCount > 0) {
                        var results = findSubjectsWithMostLesson(subjects);
                        displayAllSubjects(results);
                    } else {
                        System.err.println("==> Danh sách môn học rỗng! <==");
                    }
                    break;
                case 15:
                    System.err.println("==> Kết thúc chương trình <==");
                    break;
                default:
                    System.err.println("==> Sai chức năng, vui lòng nhập từ 1 -> 15 <==");
            }
        } while (choice != 15);
    }

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

    private static void displayMenu() {
        var line = "====================";
        System.out.println(STR."\{line} CÁC LỰA CHỌN \{line}");
        System.out.println("1. Thêm mới môn học vào danh sách.");
        System.out.println("2. Sửa thông tin về số tiết học.");
        System.out.println("3. Xoá môn học khỏi danh sách.");
        System.out.println("4. Sửa thông tin môn học.");
        System.out.println("5. Hiển thị danh sách môn học.");
        System.out.println("6. Sắp xếp danh sách môn học theo tên môn tăng dần.");
        System.out.println("7. Sắp xếp danh sách môn học theo số tín tăng dần.");
        System.out.println("8. Sắp xếp DS môn học theo số bài kiểm tra giảm dần.");
        System.out.println("9. Tìm kiếm môn học theo thể loại.");
        System.out.println("10. Tìm kiếm môn học theo tên môn.");
        System.out.println("11. Tìm kiếm môn học theo số lượng bài kiểm tra.");
        System.out.println("12. Tìm kiếm môn học theo số lượng tín chỉ.");
        System.out.println("13. Liệt kê các môn học có nhiều số tín chỉ nhất.");
        System.out.println("14. Liệt kê các môn học có số tiết học nhiều nhất.");
        System.out.println("15. Kết thúc chương trình.");
        System.out.println("==> Lựa chọn của bạn:");
    }

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

    private static String checkUniqueId(Subject[] subjects, String subjectId) {
        if (!subjectId.startsWith("SJ") || subjectId.length() != 6) {
            System.err.println("==> Mã môn học không hợp lệ. <==");
            return null;
        }
        for (Subject subject : subjects) {
            if (subject == null) {
                break;
            }
            if (subject.getId().equals(subjectId)) {
                System.err.println("==> Mã môn học đã tồn tại. Vui lòng nhập mã khác. <==");
                return null;
            }
        }
        return subjectId;
    }

    private static void updateNumOfLesson(Subject[] subjects, Scanner input) {
        System.out.print("Mã môn học cần cập nhật: ");
        String subjectId = input.nextLine().toUpperCase();
        int indexById = findSubjectById(subjects, subjectId);
        if (indexById != -1) {
            System.out.print("Số tiết học mới: ");
            int numOfLesson = Integer.parseInt(input.nextLine());
            if (numOfLesson > 0) {
                subjects[indexById].setNumOfLesson(numOfLesson);
                System.out.println(STR."==> Cập nhật số tiết học cho môn học mã \{subjectId} thành công <==");
            } else {
                System.err.println("==> Cập nhật số tiết học thất bại. Số tiết học phải > 0 <==");
            }
        } else {
            System.err.println(STR."==> Không tìm thấy môn học có mã \{subjectId}! <==");
        }
    }

    private static int findSubjectById(Subject[] subjects, String subjectId) {
        for (int i = 0; i < subjects.length; i++) {
            if (subjects[i] == null) {
                break;
            }
            if (subjects[i].getId().compareToIgnoreCase(subjectId) == 0) {
                return i;
            }
        }
        return -1;
    }

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
                subjects[indexById].setNumOfExam(numOfExam);
                subjects[indexById].setNumOfPractice(numOfPractice);
                subjects[indexById].setNumOfProject(numOfProject);
                System.out.println(STR."==> Cập nhật thông tin cho môn học mã \{subjectId} thành công <==");
            } else {
                System.err.println("==> Cập nhật thông tin môn học thất bại. Các trường phải > 0 <==");
            }
        } else {
            System.err.println(STR."==> Không tìm thấy môn học có mã \{subjectId}! <==");
        }
    }

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
                subject.getId(), subject.getName(), subject.getCredit(),
                subject.getNumOfLesson(), subject.getNumOfExam(),
                subject.getNumOfPractice(), subject.getNumOfProject(), subject.getType());
    }


    private static void sortSubjectsByNameASC(Subject[] subjects, int size) {
        for (int i = 0; i < size - 1; i++) {
            for (int j = size - 1; j > i; j--) {
                if (subjects[j - 1].getName().compareTo(subjects[j].getName()) > 0) {
                    var temp = subjects[j];
                    subjects[j] = subjects[j - 1];
                    subjects[j - 1] = temp;
                }
            }
        }
    }

    private static void sortSubjectsByCreditASC(Subject[] subjects, int size) {
        for (int i = 0; i < size - 1; i++) {
            for (int j = size - 1; j > i; j--) {
                if (subjects[j - 1].getCredit() > subjects[j].getCredit()) {
                    var temp = subjects[j];
                    subjects[j] = subjects[j - 1];
                    subjects[j - 1] = temp;
                }
            }
        }
    }

    private static void sortSubjectsByNumOfExamASC(Subject[] subjects, int size) {
        for (int i = 0; i < size - 1; i++) {
            for (int j = size - 1; j > i; j--) {
                if (subjects[j - 1].getNumOfExam() < subjects[j].getNumOfExam()) {
                    var temp = subjects[j];
                    subjects[j] = subjects[j - 1];
                    subjects[j - 1] = temp;
                }
            }
        }
    }

    private static Subject[] findSubjectsByType(Subject[] subjects, String type) {
        var result = new Subject[subjects.length];
        int count = 0;
        for (var subject : subjects) {
            if (subject == null) {
                break;
            }
            if (subject.getType().toLowerCase().contains(type.toLowerCase())) {
                result[count++] = subject;
            }
        }
        if (count > 0) {
            return result;
        }
        return null; // không có kết quả tìm kiếm
    }

    private static Subject[] findSubjectsByName(Subject[] subjects, String name) {
        var results = new Subject[subjects.length];
        int count = 0;
        for (var subject : subjects) {
            if (subject != null && subject.getName().toLowerCase().contains(name)) {
                results[count++] = subject;
            }
        }
        if (count > 0) {
            return results;
        }
        return null; // không có kết quả tìm kiếm
    }

    private static Subject[] findSubjectsByNumOfExam(Subject[] subjects, int numOfExam) {
        var results = new Subject[subjects.length];
        int count = 0;
        for (var subject : subjects) {
            if (subject == null) {
                break;
            }
            if (subject.getNumOfExam() == numOfExam) {
                results[count++] = subject;
            }
        }

        if (count > 0) {
            return results;
        }

        return null; // không có kết quả tìm kiếm
    }

    private static Subject[] findSubjectsByCredit(Subject[] subjects, int credit) {
        var results = new Subject[subjects.length];
        int count = 0;
        for (var subject : subjects) {
            if (subject == null) {
                break;
            }
            if (subject.getCredit() == credit) {
                results[count++] = subject;
            }
        }

        if (count > 0) {
            return results;
        }

        return null; // không có kết quả tìm kiếm
    }

    private static Subject[] findSubjectsWithMostCredit(Subject[] subjects) {
        var results = new Subject[subjects.length];
        int count = 0;
        int maxCredit = findMaxSubjectCredit(subjects);
        for (var subject : subjects) {
            if (subject == null) {
                break;
            }
            if (subject.getCredit() == maxCredit) {
                results[count++] = subject;
            }
        }
        return results;
    }

    private static int findMaxSubjectCredit(Subject[] subjects) {
        var max = 0;
        for (var subject : subjects) {
            if (subject == null) {
                break;
            }
            if (subject.getCredit() > max) {
                max = subject.getCredit();
            }
        }
        return max;
    }


    private static Subject[] findSubjectsWithMostLesson(Subject[] subjects) {
        var results = new Subject[subjects.length];
        int count = 0;
        int maxNumOfLesson = findMaxSubjectLesson(subjects);
        for (var subject : subjects) {
            if (subject == null) {
                break;
            }
            if (subject.getNumOfLesson() == maxNumOfLesson) {
                results[count++] = subject;
            }
        }
        return results;
    }

    private static int findMaxSubjectLesson(Subject[] subjects) {
        var max = 0;
        for (var subject : subjects) {
            if (subject == null) {
                break;
            }
            if (subject.getNumOfLesson() > max) {
                max = subject.getNumOfLesson();
            }
        }
        return max;
    }
}
