package projects.project_01.project_01_Variant_03;

public class Task {
    //Класс Task имеет поля id, taskTitle, taskDescription, priority, status.
    private String id;
    private String taskTitle;
    private String taskDescription;
    private String priority;
    private String status;

    public Task(String id, String taskTitle, String taskDescription, String priority, String status) {
        this.id = id;
        this.taskTitle = taskTitle;
        this.taskDescription = taskDescription;
        this.priority = priority;
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public String getTaskTitle() {
        return taskTitle;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public String getPriority() {
        return priority;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
