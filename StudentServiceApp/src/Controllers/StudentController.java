package Controllers;

import StudentDomen.Student;
import StudentService.StudentService;

/** контролеер для студентов с интерфейсом iUserController */
public class StudentController implements iUserController<Student> {

    private final StudentService dataService = new StudentService();

    /** метод создания студента */
    @Override
    public void create(String firstName, String secondName, int age) {
        dataService.create(firstName, secondName, age);
    }

}
