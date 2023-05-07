package StudentService;

import java.util.ArrayList;
import java.util.List;

import StudentDomen.Emploee;
import StudentDomen.UserComparator;

/* Класс EmploeeService с интерфейсом iUserService*/
public class EmploeeService implements iUserService<Emploee> {
    private int count;
    private List<Emploee> emploees; // список сотрудников

    /** констрктор для класса */
    public EmploeeService() {
        this.emploees = new ArrayList<Emploee>();
    }

    /** метод создания работника из интерфейса iUserService */
    @Override
    public void create(String firstName, String secondName, int age) {
        Emploee per = new Emploee(firstName, secondName, age, count);
        count++; // получение айди
        emploees.add(per);
    }

    /** метод получения списка всех работников из интерфейса iUserService */
    @Override
    public List<Emploee> getAll() {
        return emploees;
    }

    /** метод сортировки работников по ФИО */
    public List<Emploee> getSortedByFIOStudentGroup(int numberGroup) {
        List<Emploee> emps = new ArrayList<>(emploees);
        emps.sort(new UserComparator<Emploee>());
        return emps;
    }
}
