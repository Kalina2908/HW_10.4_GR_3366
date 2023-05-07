package StudentService;

import java.util.ArrayList;
import java.util.List;

import StudentDomen.Student;

/** Класс StudentService с интерфейсом iUserService */
public class StudentService implements iUserService<Student> {
    private int count; // сковзной номер студента
    private List<Student> students; // хранить список студентов

    /** конструктор для класса */
    public StudentService() {
        this.students = new ArrayList<Student>();
    }

    /* регистрация нового студента из интерфейса iUserService */
    @Override
    public void create(String firstName, String secondName, int age) {
        Student per = new Student(firstName, secondName, age, count);
        count++; // для получения айди
        students.add(per);
    }

    /* получить список всех студентов из интерфейса iUserService */
    @Override
    public List<Student> getAll() {
        return students;
    }

}
