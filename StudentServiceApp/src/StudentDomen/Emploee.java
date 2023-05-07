package StudentDomen;

/** Работники с наследованием от User */
public class Emploee extends User {
    private int empId; // ID работника

    /** конструктор для раблтника */
    public Emploee(String firstName, String secondName, int age, int empId) {
        super(firstName, secondName, age);
        this.empId = empId;
    }

    /** метод получаем ID работника */
    public int getEmpId() {
        return empId;
    }

    /** метод присвоения ID работника */
    public void setEmpId(int empId) {
        this.empId = empId;
    }

}
