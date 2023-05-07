package StudentDomen;

import java.util.Comparator;

/* Сравнение всех юзеров с типом Т и c защитой extends User*/
public class UserComparator<T extends User> implements Comparator<T> {

    @Override
    public int compare(T o1, T o2) {
        int resultOfComparing = o1.getSecondName().compareTo(o2.getSecondName()); // сравним фамилии двух юзеров
        if (resultOfComparing == 0) {
            resultOfComparing = o1.getFirstName().compareTo(o2.getFirstName()); // сравниваем имена двух юзеров
            return resultOfComparing;
        } else {
            return resultOfComparing;
        }
    }

}
