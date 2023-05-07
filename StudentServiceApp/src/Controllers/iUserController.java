package Controllers;

import StudentDomen.User;

/**
 * интерфейс для класса User с типом Т с защитой 
 * (только для User и его потомков)
 */
public interface iUserController<T extends User> {
    void create(String firstName, String secondName, int age); // прототип метода создания для User
}
