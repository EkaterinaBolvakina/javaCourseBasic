package homeworks.homework_21.inheritance.task_03.employeeApp.service;

import homeworks.homework_21.inheritance.task_03.employeeApp.entity.Project;

public class ProjectArray {
    Project[] projects = new Project[10];
    int countProject = 0;
    public void addProject(Project project){
        if (countProject < projects.length){
            projects[countProject] = project;
            countProject++;
        }
    }
    public void printProjects(){
        System.out.println("Projects: ");
        System.out.println("----------------");
        for (int i = 0; i < projects.length; i++) {
            if (projects[i] != null) {
                System.out.println("Nr.: "+(i+1));
                projects[i].printData();
            }
        }
        System.out.println("----------------");
    }
}
