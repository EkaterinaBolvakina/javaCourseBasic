package homeworks.homework_21.inheritance.task_03.employeeApp.entity;

public abstract class Employee {
    private String surname;
    private String name;
    private String department;

    public Employee(String surname, String name, String department) {
        this.surname = surname;
        this.name = name;
        this.department = department;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public abstract void printData();
}
