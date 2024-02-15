package homeworks.homework_21.inheritance.task_03.employeeApp.entity;

import homeworks.homework_21.inheritance.task_03.employeeApp.service.ProjectArray;

public class Developer extends Employee{
ProjectArray projectArray;

    public Developer(String surname, String name, String department, ProjectArray projectArray) {
        super(surname, name, department);
        this.projectArray = projectArray;
    }

    @Override
    public void printData() {
        System.out.println("Developer of Department: "+getDepartment());
        System.out.println("Surname: "+getSurname());
        System.out.println("Name: "+getName());
        System.out.println("Responsible for: ");
        projectArray.printProjects();
        System.out.println();
    }
}
