package homeworks.homework_41.task_02;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*
Task 2: Grouping elements and counting the number of elements

Task: Given a list of Employee objects,
where each object contains the name and department where the employee works.
It is necessary to group employees by departments and calculate the number of employees in each department.
number of employees in each department.

 */
public class EmployeeGroup {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Otto","Marketing"));
        employees.add(new Employee("Schröder","Sales"));
        employees.add(new Employee("Schulz","CEO"));
        employees.add(new Employee("Bacari","Finance"));
        employees.add(new Employee("Graf","Purchasing"));
        employees.add(new Employee("Fürst","Purchasing"));
        employees.add(new Employee("Maier","Sales"));
        employees.add(new Employee("Doroshko","Sales"));
        employees.add(new Employee("Rusim","Purchasing"));
        employees.add(new Employee("Nitsche","Marketing"));

        Map<String,List<Employee>> employeesByDepartment = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));  // analog with: groupingBy(employee -> employee.getDepartment())
        System.out.println(employeesByDepartment);

        for (Map.Entry<String,List<Employee>> entry : employeesByDepartment.entrySet()) {
         //   System.out.println("Department: " + entry.getKey());
            int count = entry.getValue().size();
            System.out.println("Number of employees in department '" +entry.getKey()+"': " +count);
        }
    }
}
