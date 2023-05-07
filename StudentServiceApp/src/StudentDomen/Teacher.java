package StudentDomen;

/** Класс учителей с наследованием от User */
public class Teacher extends User {
    private int teacherId; // ID учителя
    private String academicDegree; // ученая степень

    /** конструктор для учителя */
    public Teacher(String firstName, String secondName, int age, int teacherId, String academicDegree) {
        super(firstName, secondName, age);
        this.teacherId = teacherId;
        this.academicDegree = academicDegree;
    }

    /** метод получения ID учителя */
    public int getTeacerId() {
        return teacherId;
    }

    /** метод присвоения ID учителя */
    public void setTeacerId(int teacherId) {
        this.teacherId = teacherId;
    }

    /** метод получения ученой степени */
    public String getLevel() {
        return academicDegree;
    }

    /** метод присвоения ученой степени */
    public void setLevel(String academicDegree) {
        this.academicDegree = academicDegree;
    }

    /** метод перераспределения вывода в консоль */
    @Override
    public String toString() {
        return "Teacher {" + "firstName=" + super.getFirstName()
                + ", secondName=" + super.getSecondName()
                + ", age=" + super.getAge() +
                ", teacherID =" + teacherId + ", Degree - " + academicDegree + "}";
    }

}
