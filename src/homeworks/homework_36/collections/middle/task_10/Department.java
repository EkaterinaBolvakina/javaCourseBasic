package homeworks.homework_36.collections.middle.task_10;

public class Department implements Comparable<Department>{
    private String departmentName;

    public Department(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    @Override
    public String toString() {
        return "Department{" +
                "departmentName='" + departmentName + '\'' +
                '}';
    }

    @Override
    public int compareTo(Department o) {
        return departmentName.compareTo(o.getDepartmentName());
    }
}
