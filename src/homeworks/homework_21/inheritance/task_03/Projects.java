package homeworks.homework_21.inheritance.task_03;

import java.util.Arrays;

public class Projects {
    Project project1 = new Project("Project 1: User");
    Project project2 = new Project("Project 2: Sales");
    Project project3 = new Project("Project 3: MarketingApp");

    Project[] projects = {project1,project2,project3};

    public Project[] getProjects() {
        return projects;
    }

    @Override
    public String toString() {
        return Arrays.toString(projects);
    }
}
