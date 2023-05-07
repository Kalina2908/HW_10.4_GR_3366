package Controllers;

import StudentDomen.Teacher;
import StudentService.TeacherService;

/** Контроллер для класса Teacher с интерфейсом iUserController */
public class TeacherController implements iUserController<Teacher> {
    private final TeacherService empService = new TeacherService();

    /** метод создания учителя */
    @Override
    public void create(String firstName, String secondName, int age) {
        empService.create(firstName, secondName, age);
    }

}
