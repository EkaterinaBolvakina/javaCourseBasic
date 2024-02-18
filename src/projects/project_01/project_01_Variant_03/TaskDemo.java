/*
Вариант 3.

Задание: Создайте класс TaskManager для управления задачами.
Включите в него метод createTaskFromUserInput, который позволяет
пользователю ввести данные для создания новой задачи и возвращает
объект Task.
Класс Task имеет поля id, taskTitle, taskDescription, priority, status.

Методы класса TaskManager должны позволять добавлять задачу,
изменять ее статус и получать список задач.

Реализуйте метод sort, который сортирует задачи в порядке приоритета - от важного до простого.
Если задачи одного приоритета - то по алфавиту.

Для реализации приложения реализуйте многоуровневый подход (хранение
отдельных элементов, массивов и сервисные функции должны быть реализованы
отдельно).

 Добавьте метод printTasks для вывода массива задач (печать по одному элементу).

 Реализуйте класс TaskDemo для демонстрации работы программы.
 */
package projects.project_01.project_01_Variant_03;

public class TaskDemo {
    public static void main(String[] args) {
     UserManager user = new UserManager();
     TaskManager demo = new TaskManager();

     int arraySize = user.createSizeArrayFromUserInput();
     Task[] arrayDemo = demo.createTasksArray(arraySize);
     Task[] filledArrayDemo = demo.fillTasksArray(arrayDemo);
     System.out.println("Entered tasks list:");
     demo.printTasks(filledArrayDemo);

     Task[] sortedArrayByPriorityDemo = demo.sortTasksByPriority(filledArrayDemo);
     System.out.println("Sorted tasks list - by priority:");
     demo.printTasks(sortedArrayByPriorityDemo);
     Task[] sortedAlphabetArrayDemo = demo.sortTasksWithEqualPriorityByTitle(sortedArrayByPriorityDemo);
     System.out.println("Sorted tasks list - by priority and by title alphabetical:");
     demo.printTasks(sortedAlphabetArrayDemo);


     demo.changeStatusOfTask(sortedAlphabetArrayDemo, user.createIDFromUserInput(), user.createNewStatusFromUserInput());
     System.out.println("Changed status tasks list:");
     demo.printTasks(sortedAlphabetArrayDemo); // print changed status


    }
}
