import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Дамир", "Галимов Великолепный Программист (нет)", 25));
        people.add(new Person("Анна", "Мария Превосходная", 17));
        people.add(new Person("Игорь", "Салтыков-Щедрин",24));
        people.add(new Person("Игорь", "Сушков Опель", 28));
        people.add(new Person("Ильнур", "Шарапов", 17));
        people.add(new Person("Данил", "Гумеров Сейчас В Казахстане", 27));
        people.add(new Person("Анна", "Каре-Нина-Нина-Нина-Нина", 65));

        people.removeIf(person -> person.age < 18);
        System.out.println(people);
    }
}
