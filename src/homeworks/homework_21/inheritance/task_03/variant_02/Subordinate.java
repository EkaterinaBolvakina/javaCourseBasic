package homeworks.homework_21.inheritance.task_03.variant_02;

public class Subordinate extends Employee {


    public Subordinate(String surname, String name, String department) {
        super(surname, name, department);
    }

    @Override
    public String getSurname() {
        return super.getSurname();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getDepartment() {
        return super.getDepartment();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
