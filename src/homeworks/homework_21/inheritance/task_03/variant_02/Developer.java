package homeworks.homework_21.inheritance.task_03.variant_02;

public class Developer extends Employee {
    Projects projects;

    public Developer(String surname, String name, String department,Projects projects) {
        super(surname, name, department);
        this.projects = projects;
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

    public Projects getProjects() {
        return projects;
    }

    public void print(){
        System.out.println("---Developer-----");
        System.out.println("Surname: "+getSurname());
        System.out.println("Name: "+getName());
        System.out.println(getProjects());
    }
}
