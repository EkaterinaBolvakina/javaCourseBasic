package homeworks.homework_36.collections.middle.task_03;

import java.util.LinkedHashSet;

public class PersonService {

    LinkedHashSet<Person> people = new LinkedHashSet<>();

    public void addPerson(String name, Integer age) {
        people.add(new Person(name, age));
    }

    public void printPersonYoungerAge(Integer age) {
        System.out.println("People under the age of "+age+": ");
            for (Person person : people) {
                if (person.getAge() < age) {
                    System.out.println(person);
                }
            }
    }
}
