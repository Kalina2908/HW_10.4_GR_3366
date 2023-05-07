package StudentService;

import java.util.List;

/* интерфейс с типом Т */
public interface iUserService<T> {
    List<T> getAll(); // прототип метода получения списка всех 

    void create(String firstName, String secondName, int age); // прототип метода создания
}
