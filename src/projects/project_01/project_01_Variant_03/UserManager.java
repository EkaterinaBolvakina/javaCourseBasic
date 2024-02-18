package projects.project_01.project_01_Variant_03;

import homeworks.homework_08.ScannerUserInput;

public class UserManager {
    public Task createTaskFromUserInput(){
        ScannerUserInput ui = new ScannerUserInput();
        String id = ui.inputText("Please enter task ID number: ");
        String taskTitle = ui.inputText("Please enter a task title: ");
        String taskDesc = ui.inputText("Please enter task description: ");
        String prio = ui.inputText("Please enter priority of task (HIGH / MID / LOW): ");
        String status = ui.inputText("Please enter status of task (Done / In Progress / Not Started): ");
        Task task = new Task(id,taskTitle,taskDesc,prio,status);
        return task;
    }

    public int createSizeArrayFromUserInput(){
        ScannerUserInput ui = new ScannerUserInput();
        int arraySize = ui.inputInt("Please enter count of tasks: ");
        return arraySize;
    }

    public String createIDFromUserInput() {              // if user want to change status, he must enter id at first
        ScannerUserInput ui = new ScannerUserInput();
        String id = ui.inputText("Please enter task ID number, which status you want to change: ");
        return id;
    }
    public String createNewStatusFromUserInput() {              // if user want to change status, he must enter new status at first
        ScannerUserInput ui = new ScannerUserInput();
        String status = ui.inputText("Please enter status of task you want change (Done / In Progress / Not Started): ");
        return status;
    }

}
