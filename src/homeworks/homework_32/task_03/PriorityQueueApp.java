package homeworks.homework_32.task_03;
/*
# Задача "Очередь приоритетов"
Описание: Реализуйте структуру данных "Очередь приоритетов",
которая поддерживает стандартные операции добавления элемента и извлечения
элемента с наивысшим приоритетом. Приоритет каждого элемента определяется
в момент добавления в очередь.

Цель: Создать класс PriorityQueue с методами enqueue(element, priority) для
добавления элемента с определенным приоритетом и dequeue(), который извлекает
и возвращает элемент с наивысшим приоритетом.
Если два элемента имеют одинаковый приоритет, они должны быть обработаны по
принципу FIFO.
 */

public class PriorityQueueApp {
    public static void main(String[] args) {

        PriorityQueue priorityQueue = new PriorityQueue();

        priorityQueue.enqueue("Task1",Priority.LOW);
        priorityQueue.enqueue("Task2",Priority.HIGH);
        priorityQueue.enqueue("Task3",Priority.HIGH);
        priorityQueue.enqueue("Task4",Priority.LOW);
        priorityQueue.enqueue("Task5",Priority.MID);
        priorityQueue.enqueue("Task6",Priority.HIGH);

        priorityQueue.printQueue();
        System.out.println(priorityQueue.dequeue());

    }
}
