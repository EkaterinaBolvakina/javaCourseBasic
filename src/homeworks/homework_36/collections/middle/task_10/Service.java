package homeworks.homework_36.collections.middle.task_10;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Service {
    TreeMap<Department, List<Employee>> treeMap = new TreeMap<>();
    public void addEmployee(String name,String departmentName, Double salary, List<Employee> employees) {
        employees.add(new Employee(name,new Department(departmentName),salary));
    }
    public void addEmployeesToDepartment(String departmentName,List<Employee> employees) {
        treeMap.put(new Department(departmentName),employees);
    }

    public void printAvgSalaryByDepartment() {
        for (Map.Entry<Department, List<Employee>> entry: treeMap.entrySet()) {

            double sum = 0;
            int count = 0;
            for (int i = 0; i <entry.getValue().size() ; i++) {
                count++;
                sum = entry.getValue().get(i).getSalary() + sum;
            }

            double avgSalary = Math.round(sum / count) ;
            System.out.println("Average salary in department '"+entry.getKey().getDepartmentName()+"': "+avgSalary);
        }
    }
}
