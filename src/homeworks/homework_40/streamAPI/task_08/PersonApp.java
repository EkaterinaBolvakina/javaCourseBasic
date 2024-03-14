package homeworks.homework_40.streamAPI.task_08;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/*
8) Given a list of Person objects containing information about people, including name, age, gender and salary.
   You need to find the average salary of all men between the ages of 25 and 40.
 */
public class PersonApp {
    public static void main(String[] args) {

        List<Person> people = new ArrayList<>();
        people.add(new Person("Meyer",25,"Male",2599.00));
        people.add(new Person("Pelz",45,"Male",3000.00));
        people.add(new Person("Schuster",38,"Female",4299.00));
        people.add(new Person("Nitsche",28,"Male",2599.00));
        people.add(new Person("Schröder",55,"Male",5599.67));
        people.add(new Person("Merkel",33,"Male",2599.67));
        people.add(new Person("Benedikt",28,"Male",4500.00));
        people.add(new Person("Maier",39,"Female",2599.67));

        Double avgSalary = people.stream()
                .filter(age -> age.getAge() > 25 && age.getAge() < 40)
                        .filter(gender -> gender.getGender().equals("Male"))
                .collect(Collectors.averagingDouble(salary -> salary.getSalary()));

        System.out.println("Average salary of all men between the ages of 25 and 40: " + avgSalary);
    }
}
