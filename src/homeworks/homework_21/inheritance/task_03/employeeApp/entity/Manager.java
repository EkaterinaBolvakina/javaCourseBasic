package homeworks.homework_21.inheritance.task_03.employeeApp.entity;

import homeworks.homework_21.inheritance.task_03.employeeApp.service.SubordinatesArray;

public class Manager extends Employee{

    SubordinatesArray subordinatesArray;

    public Manager(String surname, String name, String department, SubordinatesArray subordinatesArray) {
        super(surname, name, department);
        this.subordinatesArray = subordinatesArray;
    }

    @Override
    public void printData() {
        System.out.println("Manager of Department: "+getDepartment());
        System.out.println("Surname: "+getSurname());
        System.out.println("Name: "+getName());
        subordinatesArray.printSubordinates();
        System.out.println();
    }
}
