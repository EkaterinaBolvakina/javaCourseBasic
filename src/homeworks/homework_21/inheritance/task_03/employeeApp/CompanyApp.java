package homeworks.homework_21.inheritance.task_03.employeeApp;

import homeworks.homework_21.inheritance.task_03.employeeApp.entity.Developer;
import homeworks.homework_21.inheritance.task_03.employeeApp.entity.Manager;
import homeworks.homework_21.inheritance.task_03.employeeApp.entity.Project;
import homeworks.homework_21.inheritance.task_03.employeeApp.entity.Subordinate;
import homeworks.homework_21.inheritance.task_03.employeeApp.service.EmployeeService;
import homeworks.homework_21.inheritance.task_03.employeeApp.service.ProjectArray;
import homeworks.homework_21.inheritance.task_03.employeeApp.service.SubordinatesArray;


public class CompanyApp {
    public static void main(String[] args) {
        SubordinatesArray demoSubordinates = new SubordinatesArray();
        demoSubordinates.addSubordinate(new Subordinate("Bublik","Olga","Finance","Accounting"));
        demoSubordinates.addSubordinate(new Subordinate("Pelz","Helga","Finance","Controller"));

        ProjectArray demoProjects = new ProjectArray();
        demoProjects.addProject(new Project(1,"Market place software for company XY"));
        demoProjects.addProject(new Project(2,"Web shop for company XY"));
        demoProjects.addProject(new Project(3,"DYI Workshop"));

        EmployeeService service = new EmployeeService();
        service.addEmployee(new Manager("Csapp","Hajnalka","Finance",demoSubordinates));
        service.addEmployee(new Developer("Otto","Paul","IT",demoProjects));
        System.out.println();

        service.printAllEmployees();
    }
}
