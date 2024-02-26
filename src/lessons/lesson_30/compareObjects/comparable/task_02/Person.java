package lessons.lesson_30.compareObjects.comparable.task_02;

public class Person implements Comparable<Person>{
    private String name;
    private String surname;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }

    @Override
    public int compareTo(Person personToCompare) {
        int result = surname.compareTo(personToCompare.getSurname());
        if (result == 0){
            result = name.compareTo(personToCompare.getName());
        }
        return result;
    }
}
