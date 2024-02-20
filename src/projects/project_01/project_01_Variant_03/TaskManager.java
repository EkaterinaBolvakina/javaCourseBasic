package projects.project_01.project_01_Variant_03;

import java.util.Objects;

public class TaskManager {

    public Task[] createTasksArray(int arraySize) {
        Task[] tasks = new Task[arraySize];
        return tasks;
    }

    public Task[] fillTasksArray(Task[] tasks) { //добавлять задачу
        UserManager user = new UserManager();
        for (int i = 0; i < tasks.length; i++) {
            tasks[i] = user.createTaskFromUserInput();
        }
        return tasks;
    }

    public void changeStatusOfTask(Task[] task, String id, String newStatus) {  //change status of task with ID
        for (int i = 0; i < task.length; i++) {
            if (Objects.equals(task[i].getId(), id)) {
                task[i].setStatus(newStatus);

                System.out.println("_____________________________________________");
                System.out.println("Status of task ID:" + id + " is changed in:" + newStatus);
                System.out.println("_____________________________________________");
                }else {
                System.out.println("_____________________________________________");
                System.out.println("Task ID is not founded.Status is not changed");
                System.out.println("_____________________________________________");
            }
        }
    }
        public void printTasks (Task[]tasks){
            System.out.println("--------------------------------------");        //Добавьте метод printTasks для вывода массива задач (печать по одному элементу)
            for (int i = 0; i < tasks.length; i++) {
                System.out.println("Task " + (i + 1) + ": ");
                System.out.println("ID: " + tasks[i].getId());
                System.out.println("Title: " + tasks[i].getTaskTitle());
                System.out.println("Description: " + tasks[i].getTaskDescription());
                System.out.println("Priority: " + tasks[i].getPriority());
                System.out.println("Status: " + tasks[i].getStatus());
                System.out.println("--------------------------------------");
            }
        }
    /*Реализуйте метод sort, который сортирует задачи в порядке приоритета - от важного до простого.
      Если задачи одного приоритета - то по алфавиту.*/

        public Task[] sortTasksByPriority (Task[]tasks){
            String[] priority = {"high", "mid", "low"}; //define array how to sort (сортирует задачи в порядке приоритета - от важного до простого)
            boolean notSorted = true;
            Task temp;
            while (notSorted) {
                notSorted = false;
                for (int i = 0; i < tasks.length - 1; i++) {
                    int priorityNumberTaskCurrent = -1;
                    int priorityNumberTaskNext = -1;

                    for (int j = 0; j < priority.length; j++) {
                        if (priority[j].equals(tasks[i].getPriority().toLowerCase())) {
                            priorityNumberTaskCurrent = j;
                        }
                    }
                    for (int j = 0; j < priority.length; j++) {
                        if (priority[j].equals(tasks[i + 1].getPriority().toLowerCase())) {
                            priorityNumberTaskNext = j;
                        }
                    }
                    if (priorityNumberTaskCurrent > priorityNumberTaskNext) {
                        temp = tasks[i];
                        tasks[i] = tasks[i + 1];
                        tasks[i + 1] = temp;
                        notSorted = true;
                    }
                }
            }
            return tasks;
        }
        public Task[] sortTasksWithEqualPriorityByTitle (Task[]tasks){
                for (int i = 0; i < tasks.length - 1; i++) {
                    for (int j = i + 1; j < tasks.length; j++) {
                        if ((tasks[i].getPriority().toLowerCase().compareTo(tasks[j].getPriority().toLowerCase()) == 0) // if priorities are equal,
                                && (tasks[i].getTaskTitle().toLowerCase().compareTo(tasks[j].getTaskTitle().toLowerCase()) > 0)) { // and titles are different,
                            // then sort by title alphabetically
                            // Tausche die Positionen, wenn die Reihenfolge falsch ist
                            Task temp1 = tasks[i];
                            tasks[i] = tasks[j];
                            tasks[j] = temp1;
                    }
                }
            }
            return tasks;
        }
    }

