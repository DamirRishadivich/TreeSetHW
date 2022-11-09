import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Дамир", "Галимов Великолепный Программист (нет)", 24));
        people.add(new Person("Анна", "Мария Превосходная", 27));
        people.add(new Person("Игорь", "Салтыков-Щедрин",24));
        people.add(new Person("Игорь", "Сушков Опель", 28));
        people.add(new Person("Ильнур", "Шарапов", 30));
        people.add(new Person("Данил", "Гумеров Сейчас В Казахстане", 27));
        people.add(new Person("Анна", "Каре-Нина-Нина-Нина-Нина", 20));

        people.sort((o1, o2) -> {
            int check = 4;
            if (o1.wordsInSurname() >= check && o2.wordsInSurname() >= check) {
                return Integer.compare(o1.age, o2.age);
            } else {
                return o1.wordsInSurname() - o2.wordsInSurname();
            }
        });

        System.out.println(people);
    }
}
