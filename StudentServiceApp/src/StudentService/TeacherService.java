package StudentService;

import java.util.ArrayList;
import java.util.List;

import StudentDomen.Teacher;
import StudentDomen.UserComparator;

//* Класс eacherService с интерфейсом iUserService */
public class TeacherService implements iUserService<Teacher> {

    private int count; // счетчик для ID
    private String academicDegree; // ученая степень
    private List<Teacher> teachers; // список сотрудников

    /** констрктор для класса */
    public TeacherService() {
        this.teachers = new ArrayList<Teacher>();
    }

    /** метод создания учителя из интерфейса iUserService */
    @Override
    public void create(String firstName, String secondName, int age) {
        Teacher per = new Teacher(firstName, secondName, age, count, academicDegree);
        count++; // получение айди
        academicDegree = "PhD";
        teachers.add(per);
    }

    /** метод получения всех учителей из интерфейса iUserService */
    @Override
    public List<Teacher> getAll() {
        return teachers;
    }

    /** метод сортировки учителей по фамилии и имени */
    public static List<Teacher> getSortedByFIOSTeacher(List<Teacher> teachers) {
        teachers.sort(new UserComparator<Teacher>());
        return teachers;
    }

}
