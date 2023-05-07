package Controllers;

import StudentDomen.Emploee;
import StudentDomen.User;
import StudentService.EmploeeService;

/** Класс EmploeeController с интерфесом iUserController */
public class EmploeeController implements iUserController<Emploee> {
    private final EmploeeService empService = new EmploeeService();

    /** метод создания работника */
    @Override
    public void create(String firstName, String secondName, int age) {
        empService.create(firstName, secondName, age);
    }

    /**
     * метод назначение зарплаты (универсальный для всех потомков Emploee) +
     * статичный (можно обратиться из любого места)
     */
    static public <T extends Emploee> void paySalary(T person) {
        System.out.println(((User) person).getFirstName() + " зп 10000р ");
    }

    /** метод расчета среднего арифметического*/
    static public <T extends Number> Double mean(T[] num) {
        double sum = 0.0;
        for (int i = 0; i < num.length; i++) {
            sum = sum + num[i].doubleValue();
        }
        sum = sum / num.length;
        return sum;
    }
}
