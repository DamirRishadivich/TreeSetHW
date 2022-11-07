public class Person {
    protected String name;
    protected String surname;
    protected int age;

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " " + surname + ", " + age + " года.";
    }

    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public int wordsInSurname() { // Салтыков-Щедрин
        String[] word = surname.split(" ");
        int count = word.length;
        if (count == 1) {
            word = surname.split("-");
            if (word.length > 1) {
                count = word.length;
            }
        }
        return count;
    }
}
