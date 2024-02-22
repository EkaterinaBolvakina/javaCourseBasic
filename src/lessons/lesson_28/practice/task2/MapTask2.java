package lessons.lesson_28.practice.task2;

import lessons.lesson_04.create_03_classConstructor.Person;

import java.util.*;

public class MapTask2 {
    public static void main(String[] args) {
        Employee person1 = new Employee(1,"Person 1");
        Employee person2 = new Employee(2,"Person 2");
        Employee person3 = new Employee(3,"Person 3");
        Employee person4 = new Employee(4,"Person 4");
        Employee person5 = new Employee(5,"Person 5");
        List<Employee> employees = new ArrayList<>();
        employees.add(person1);
        employees.add(person2);
        employees.add(person3);
        employees.add(person4);
        employees.add(person5);
        System.out.println("Collection of all employees:");
        System.out.println(employees);
        System.out.println();

        List<Employee> employeesDep1 = new ArrayList<>();
        employeesDep1.add(person1);
        employeesDep1.add(person2);
        employeesDep1.add(person3);
        List<Employee> employeesDep2 = new ArrayList<>();
        employeesDep2.add(person4);
        employeesDep2.add(person5);

        Department department1 = new Department("Marketing");
        Department department2 = new Department("Accounting");
        List<Department> departments = new ArrayList<>();
        departments.add(department1);
        departments.add(department2);
        System.out.println("Collection of all departments:");
        System.out.println(departments);
        System.out.println();

        //3) Создайте коллекцию по отделам и сотрудникам в каждом отделе
        System.out.println("Collection of employees from department 1:");
        HashMap<Department,List<Employee>> collectionDep1 = new HashMap<>();
        collectionDep1.put(department1,employeesDep1);
        System.out.println(collectionDep1);
        System.out.println();

        System.out.println("Collection of employees from department 2:");
        HashMap<Department,List<Employee>>  collectionDep2 = new HashMap<>();
        collectionDep2.put(department2,employeesDep2);
        System.out.println(collectionDep2);
        System.out.println();

       // 4) создайте коллекцию всех отделов
        System.out.println("Collection of all departments with all employees:");
        List<HashMap> collectionAllDep = new ArrayList();
        collectionAllDep.add(collectionDep1);
        collectionAllDep.add(collectionDep2);
        System.out.println(collectionAllDep);





    }
}
