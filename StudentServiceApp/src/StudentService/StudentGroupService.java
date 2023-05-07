package StudentService;

import java.util.ArrayList;
import java.util.List;

import StudentDomen.Student;
import StudentDomen.StudentGroup;
import StudentDomen.UserComparator;

/** Класс StudentGroupService */
public class StudentGroupService {
    private List<StudentGroup> groups; // список групп

    /* конструктор для класса */
    public StudentGroupService() {
        this.groups = new ArrayList<>();
    }

    /* получения списка всех групп */
    public List<StudentGroup> getAll() {
        return this.groups;
    }

    /** метод сортировки студентов по ФИО */
    public List<Student> getSortedByFIOStudentGroup(int numberGroup) {
        List<Student> students = new ArrayList<>(groups.get(numberGroup).getStudents());
        students.sort(new UserComparator<Student>());
        return students;
    }
}
