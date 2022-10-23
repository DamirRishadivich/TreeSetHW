import java.util.Comparator;

public class PersonWordsCountComparator implements Comparator<Person> {
    protected int maxCountOfSurname;
    public PersonWordsCountComparator(int maxCountOfSurname) {
        this.maxCountOfSurname = maxCountOfSurname;
    }


    @Override
    public int compare(Person o1, Person o2) {
        if (o1.wordsInSurname() >= maxCountOfSurname && o2.wordsInSurname() >= maxCountOfSurname) {
            return Integer.compare(o1.age, o2.age);
        } else if (o1.wordsInSurname() > o2.wordsInSurname()) {
            return 1;
        } else if (o1.wordsInSurname() < o2.wordsInSurname()) {
            return -1;
        } else {
            return Integer.compare(o1.name.length(), o2.name.length());
        }
    }

}
