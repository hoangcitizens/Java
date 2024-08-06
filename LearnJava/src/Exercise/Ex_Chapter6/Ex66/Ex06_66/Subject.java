package Exercise.Ex_Chapter6.Ex66.Ex06_66;

@SuppressWarnings("unused")
public class Subject {
    // todo 1: tạo id tự tăng từ 1000
    private static int autoId = 1000;
    private String id;
    private String name;
    private int credit;
    private int numOfLesson;
    private int numOfExam;
    private int numOfPractice;
    private int numOfProject;
    private Type type;

    public Subject() {
        this(null);
    }

    public Subject(String id) {
        this(id, null, 0);
    }

    public Subject(String id, String name, int credit) {
        this(id, name, credit, 0, 0, 0, 0, null);
    }

    public Subject(String id, String name, int credit, int numOfLesson,
                   int numOfExam, int numOfPractice, int numOfProject, Type type) {
        this.setId(id);
        this.setName(name);
        this.setCredit(credit);
        this.setNumOfExam(numOfExam);
        this.setNumOfLesson(numOfLesson);
        this.setNumOfProject(numOfProject);
        this.setNumOfPractice(numOfPractice);
        this.setType(type);
    }

    public String getId() {
        return id;
    }

    // todo 2: thiết lập id cho môn học sao cho phù hợp
    public void setId(String id) {
        this.id = (id == null || id.isBlank()) ? STR."SJ\{autoId++}" : id;
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

    public Type getType() {
        return type;
    }

    public String getTypeValue() {
        return type.getValue();
    }

    public void setType(Type type) {
        this.type = type;
    }
}
