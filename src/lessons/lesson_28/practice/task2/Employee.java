package lessons.lesson_28.practice.task2;

public class Employee {
    private Integer employeeID;
    private String name;


    public Employee(Integer employeeID, String name) {
        this.employeeID = employeeID;
        this.name = name;
    }

    public Integer getEmployeeID() {
        return employeeID;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeID=" + employeeID +
                ", name='" + name + '\'' +
                '}';
    }
}
