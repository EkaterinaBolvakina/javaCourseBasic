package lessons.lesson_30.compareObjects.comparable.task_02;

import java.util.Set;
import java.util.TreeSet;

/*
2)Создайте класс Person с двумя параметрами (имя и фамилия)
Создайте коллекцию уникальных элементов отсортированных
по фамилии и имени
 */
public class PersonDemo {
    public static void main(String[] args) {
        Set<Person> personSet = new TreeSet<>();

        personSet.add(new Person("Max","Schulz"));
        personSet.add(new Person("Anna","Sobko"));
        personSet.add(new Person("Anna","Schulz"));
        personSet.add(new Person("Marina","Weber"));
        personSet.add(new Person("Marina","Schulz"));

        System.out.println(personSet);
    }
}
