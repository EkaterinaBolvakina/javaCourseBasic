package homeworks.homework_21.inheritance.task_03.variant_02;

public class Manager extends Employee {
Subordinates subordinates;

    public Manager(String surname, String name, String department,Subordinates subordinates) {
        super(surname, name, department);
        this.subordinates = subordinates;
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

    public Subordinates getSubordinates() {
        return subordinates;
    }

    public void print(){
        System.out.println("---Manager-----");
        System.out.println("Surname: "+getSurname());
        System.out.println("Name: "+getName());
        System.out.println("Department: "+getDepartment());
        System.out.println("Subordinates: "+getSubordinates());
    }
}
