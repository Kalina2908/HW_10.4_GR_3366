package StudentDomen;

import java.util.Iterator;
import java.util.List;

/**
 * Класс AverageAge с итерированием и 
 * с дженериком типа Т с защитой только для User
 */
public class AverageAge<T extends User> implements Iterator<T> {

    private int counter; // счетчик
    private List<T> list; // список

    /** метод получения списка */
    public List<T> getList() {
        return list;
    }

    /** метод присвоения списка */
    public void setList(List<T> list) {
        this.list = list;
    }

    /** метод для расчета среднего возраста */
    static public <T extends User> Double meanAge(List<T> list) {
        double sum = 0.0;
        for (int i = 0; i < list.size(); i++) {
            sum = sum + list.get(i).getAge();
        }
        sum = sum / list.size();
        return sum;
    }

    /** метод, по которому узнаем дошли ли до конца списка */
    @Override
    public boolean hasNext() {
        return counter < list.size();
    }

    /** метод получение элемента(студента) из списка */
    @Override
    public T next() {
        if (!hasNext()) {
            return null;
        }
        return list.get(counter++);
    }
    
}
