package lessons.lesson_39.lambda.stringInteger;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PersonCompare {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Boris",30));
        people.add(new Person("Paul",25));
        people.add(new Person("Anna",38));
        people.add(new Person("Boris",42));
        people.add(new Person("Anna",30));

        Collections.sort(people, (a,b) -> {
           int compareByName = b.getName().compareTo(a.getName());
            return (compareByName != 0) ? compareByName: b.getAge() - a.getAge();
        });

        System.out.println(people);
    }
}
