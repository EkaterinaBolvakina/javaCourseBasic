package homeworks.homework_21.inheritance.task_03.employeeApp.entity;

public class Project {
   private int id;
    private String projectName;

    public Project(int id, String projectName) {
        this.id = id;
        this.projectName = projectName;
    }

    public void printData() {
        System.out.println("Project ID: "+id);
        System.out.println("Name: "+projectName);
        System.out.println();
    }
}
