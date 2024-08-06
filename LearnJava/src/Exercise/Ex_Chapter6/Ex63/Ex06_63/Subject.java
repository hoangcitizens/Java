/**
 * @author Branium Academy
 * @version 2024.02
 * @see <a href="https://braniumacademy.net/">Trang chủ</a>
 */

package Exercise.Ex_Chapter6.Ex63.Ex06_63;

@SuppressWarnings("unused")
public class Subject {
    // todo 1: triển khai các thuộc tính private theo yêu cầu của đề bài
    private String id;
    private String name;
    private int credit;
    private int numOfLesson;
    private int numOfExam;
    private int numOfPractice;
    private int numOfProject;
    private String type;

    // todo 2: triển khai các constructor và gọi tái sử dụng cho phù hợp
    public Subject() {
        this(null);
    }

    public Subject(String id) {
        this(id, null, 0);
    }

    public Subject(String id, String name, int credit) {
        this(id, name, credit, 0, 0, 0, 0, null);
    }

    // todo 3: sử dụng các setter trong constructor này
    public Subject(String id, String name, int credit, int numOfLesson,
                   int numOfExam, int numOfPractice, int numOfProject, String type) {
        this.setId(id);
        this.setName(name);
        this.setCredit(credit);
        this.setNumOfExam(numOfExam);
        this.setNumOfLesson(numOfLesson);
        this.setNumOfProject(numOfProject);
        this.setNumOfPractice(numOfPractice);
        this.setType(type);
    }

    // todo 2: triển khai các getter và setter cho các private attribute
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public int getNumOfLesson() {
        return numOfLesson;
    }

    public void setNumOfLesson(int numOfLesson) {
        this.numOfLesson = numOfLesson;
    }

    public int getNumOfExam() {
        return numOfExam;
    }

    public void setNumOfExam(int numOfExam) {
        this.numOfExam = numOfExam;
    }

    public int getNumOfPractice() {
        return numOfPractice;
    }

    public void setNumOfPractice(int numOfPractice) {
        this.numOfPractice = numOfPractice;
    }

    public int getNumOfProject() {
        return numOfProject;
    }

    public void setNumOfProject(int numOfProject) {
        this.numOfProject = numOfProject;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
