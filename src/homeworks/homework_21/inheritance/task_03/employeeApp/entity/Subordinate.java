package homeworks.homework_21.inheritance.task_03.employeeApp.entity;

public class Subordinate extends Employee{
    private String position;

    public Subordinate(String surname, String name, String department, String position) {
        super(surname, name, department);
        this.position = position;
    }

    @Override
    public void printData() {
        System.out.println("Position: "+position);
        System.out.println("Surname: "+getSurname());
        System.out.println("Name: "+getName());
        System.out.println();
    }
}
