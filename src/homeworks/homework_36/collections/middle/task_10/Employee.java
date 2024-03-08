package homeworks.homework_36.collections.middle.task_10;

public class Employee implements Comparable<Employee>{
    private String name;
    private Department department;
    private Double salary;

    public Employee(String name, Department department, Double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public Department getDepartment() {
        return department;
    }

    public Double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", department=" + department +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Employee o) {
        return name.compareTo(o.getName());
    }
}
