package lessons.lesson_41.practice.task_03;

import java.util.ArrayList;
import java.util.List;

public class TaskStream3 {
    /*
- найти сотрудников которые не CEO

     */

    public static void main(String[] args) {


        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee("Aleks", "Developer", 1500));
        employees.add(new Employee("Thomas", "Manager", 800.5));
        employees.add(new Employee("Thea", "CEO", 2000));
        employees.add(new Employee("Mary", "Manager", 700));
        employees.add(new Employee("John", "Developer", 1200));

//Variant1:
        List<Employee> employeeListFiltered1 = employees.stream()
                .filter(staff -> !staff.getStaff().equals("CEO"))
                .toList();
        System.out.println("сотрудников которые не CEO: "+employeeListFiltered1);
// Variant2:
        List<Employee> employeeListFiltered = employees.stream()
        .sorted((staff1, staff2) -> staff1.getStaff().compareTo(staff2.getStaff()))
        .skip(1)
        .toList();
        System.out.println(employeeListFiltered);


    }
}
