import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import Controllers.EmploeeController;
import StudentDomen.AverageAge;
import StudentDomen.Emploee;
import StudentDomen.Student;
import StudentDomen.StudentGroup;
import StudentDomen.StudentSteam;
import StudentDomen.Teacher;
import StudentDomen.User;
import StudentService.TeacherService;

public class App {
    public static void main(String[] args) throws Exception {
        User u1 = new User("Иван", "Иванов", 25);
        Student s1 = new Student("Сергей", "Иванов", 22, (long) 101);
        Student s2 = new Student("Андрей", "Сидоров", 22, (long) 111);
        Student s3 = new Student("Иван", "Петров", 22, (long) 121);
        Student s4 = new Student("Игорь", "Иванов", 23, (long) 301);
        Student s5 = new Student("Даша", "Цветкова", 23, (long) 171);
        Student s6 = new Student("Лена", "Незабудкина", 23, (long) 104);
        Student s7 = new Student("Павел", "Павлов", 23, (long) 106);
        Student s8 = new Student("Петр", "Сидоров", 25, (long) 107);
        Student s9 = new Student("Александр", "Александров", 24, (long) 108);
        Student s10 = new Student("Мария", "Маркова", 23, (long) 128);
        Student s11 = new Student("Марина", "Немаркова", 21, (long) 138);

        // создаем списки 3-х групп и заполняем студентами
        List<Student> listStudGroup1 = new ArrayList<Student>();
        List<Student> listStudGroup2 = new ArrayList<Student>();
        List<Student> listStudGroup3 = new ArrayList<Student>();
        listStudGroup2.add(s1);
        listStudGroup3.add(s2);
        listStudGroup1.add(s3);
        listStudGroup2.add(s4);
        listStudGroup2.add(s5);
        listStudGroup3.add(s6);
        listStudGroup2.add(s7);
        listStudGroup3.add(s8);
        listStudGroup2.add(s9);
        listStudGroup3.add(s10);
        listStudGroup1.add(s11);

        // Создаем три StudentGroup, которым назначаем имя и добавляем списки студентов
        StudentGroup group1 = new StudentGroup(listStudGroup1, "Group 1");
        StudentGroup group2 = new StudentGroup(listStudGroup2, "Group 2");
        StudentGroup group3 = new StudentGroup(listStudGroup3, "Group 3");

        // for(Student stud : group1){
        // System.out.println(stud);
        // }

        // System.out.println("============= после сортировки =============");
        Collections.sort(group2.getStudents()); // сортируем студентов в группе 2

        // for (Student stud : group2) {
        // System.out.println(stud);
        // }

        // System.out.println("============= потоки и группы =============");

        // создаем список групп, который заполняем группами со студентами
        List<StudentGroup> listGroup = new ArrayList<StudentGroup>();
        listGroup.add(group1);
        listGroup.add(group2);
        listGroup.add(group3);

        // Создаем поток, в который добавляем список групп со студентами и назначаем имя
        StudentSteam steam1 = new StudentSteam(listGroup, "Steam 1");

        // for (StudentGroup steam : steam1) {
        // System.out.println(steam);
        // }

        // System.out.println("============= после сортировки ГРУПП=============");
        Collections.sort(steam1.getStudentSteam()); // сортируем по количеству студентов в группе

        // for (StudentGroup st : steam1) {
        // System.out.println(st);
        // }

        System.out.println("============= для семинара по ОБОБЩЕНИЯМ =============");
        
        // создаем работников и учителей для проверки методов
        Emploee person1 = new Emploee("Сидор", "Сиддоров", 47, 160);
        Emploee person2 = new Emploee("Андрей", "Сидоров", 22, 111);
        Emploee person3 = new Emploee("Иван", "Петров", 22, 121);
        Emploee person4 = new Emploee("Игорь", "Иванов", 23, 301);
        Emploee person5 = new Emploee("Даша", "Цветкова", 23, 171);
        Emploee person6 = new Emploee("Лена", "Незабудкина", 23, 104);
        
        Teacher tech7 = new Teacher("Павел", "Павлов", 51, 106, "PhD");
        Teacher tech8 = new Teacher("Петр", "Сидоров", 63, 107, "PhD");
        Teacher tech9 = new Teacher("Александр", "Александров", 70, 108, "PhD");
        Teacher tech10 = new Teacher("Мария", "Маркова", 39, 128, "PhD");
        Teacher tech11 = new Teacher("Марина", "Немаркова", 48, 138, "PhD");

        // проверка метода назначения зарплаты из класса EmploeeController
        System.out.println("Метод назначения зарплаты: ");
        EmploeeController contrEmp = new EmploeeController();
        contrEmp.paySalary(person1);
        EmploeeController.paySalary(person1); // при статике можно не создавать экземпляр класса

        // проверка метода расчета среднего арифметического
        System.out.println("Метод расчета среднего арифметического: ");
        Integer studHour[] = { 124, 234, 231, 10, 45 };
        System.out.println(EmploeeController.mean(studHour));

        Double emplSalary[] = { 12555.23, 2584.45, 1055454.48 };
        System.out.println(EmploeeController.mean(emplSalary));

        // создаем список учителей
        List<Teacher> teachers = new ArrayList<>();
        teachers.add(tech7);
        teachers.add(tech8);
        teachers.add(tech9);
        teachers.add(tech10);
        teachers.add(tech11);

        // создаем список работников
        List<Emploee> emploees = new ArrayList<>();
        emploees.add(person1);
        emploees.add(person2);
        emploees.add(person3);
        emploees.add(person4);
        emploees.add(person5);
        emploees.add(person6);

        System.out.println("Метод сортировки по ФИО (для учителей): ");
        // сортируем список учителей по фамилии и имени, а также выводим на консоль 
        TeacherService.getSortedByFIOSTeacher(teachers);
        for (Teacher tec : teachers) {
            System.out.println(tec);
        }

        
        System.out.println("Расчет среднего возраста: ");
        System.out.println("Средний возраст учителей: " + AverageAge.meanAge(teachers));
        System.out.println("Средний возраст работников: " + AverageAge.meanAge(emploees));

    }
}
