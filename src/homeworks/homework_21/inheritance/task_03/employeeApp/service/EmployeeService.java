package homeworks.homework_21.inheritance.task_03.employeeApp.service;

import homeworks.homework_21.inheritance.task_03.employeeApp.entity.Employee;

public class EmployeeService {

    private Employee[] employees = new Employee[70];

    private int employeeCount = 0;

    public void addEmployee(Employee newEmployee){
        if (employeeCount < employees.length){
            employees[employeeCount] = newEmployee;
            employeeCount++;
            System.out.println("New employee is added: "+newEmployee.getDepartment()+"; "+newEmployee.getSurname()+newEmployee.getName());
        }
    }

    public void printAllEmployees(){
        System.out.println("Company N.GmbH - Employee structure: " );
        System.out.println("______________________________________");
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null){
                employees[i].printData();
            }
        }
    }
}
