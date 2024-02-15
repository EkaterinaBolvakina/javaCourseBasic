package homeworks.homework_21.inheritance.task_03.variant_02;

public class Project {
    String projectName;

    public Project(String projectName) {
        this.projectName = projectName;
    }

    @Override
    public String toString() {
        return projectName;
    }
}
