package homeworks.homework_36.collections.middle.task_10;
/*
10) Create an Employee class with name, department and salary properties, then create a TreeMap mapping,
where the key is the department and the value is the list of employees working in that department.
Then add several employees to each department and display the average salary for each department on the console.
 */
import java.util.ArrayList;
import java.util.List;

public class EmployeeApp {
    public static void main(String[] args) {
        Service service = new Service();
        List<Employee> employeeList1 = new ArrayList<>();
        service.addEmployee("Otto","Marketing",4080.00,employeeList1);
        service.addEmployee("Schulz","Marketing",3580.00,employeeList1);
        service.addEmployee("Mustermann","Marketing",4650.00,employeeList1);

        List<Employee> employeeList2 = new ArrayList<>();
        service.addEmployee("Otto","Sales",2080.00,employeeList2);
        service.addEmployee("Schulz","Sales",3330.00,employeeList2);
        service.addEmployee("Mustermann","Sales",4650.00,employeeList2);

        service.addEmployeesToDepartment("Marketing",employeeList1);
        service.addEmployeesToDepartment("Sales",employeeList2);

        service.printAvgSalaryByDepartment();
    }
}
