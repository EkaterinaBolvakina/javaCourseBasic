package homeworks.homework_32.task_02;
/*
# Задача "Ротация очереди"
Описание: Дана очередь целых чисел и число k, представляющее количество
операций ротации, которые необходимо выполнить с очередью.
Ротация очереди означает перемещение последнего элемента очереди в её начало.
Реализуйте функцию, которая модифицирует очередь, выполняя k ротаций.

Цель: Написать функцию, которая принимает очередь и число k, затем
выполняет k ротаций очереди. */
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class QueueRotation {
    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();
        addElement(queue,1);
        addElement(queue,2);
        addElement(queue,3);
        addElement(queue,4);
        addElement(queue,5);

        System.out.println("Original queue: "+queue);
        int k = 4;
        rotation(queue,k);
        System.out.println("Queue after "+k+" rotations: "+queue);

    }
    public static void rotation(Queue<Integer> queue, Integer k){

        if ((queue == null) || (k < 0)){
            System.out.println("Input parameters are not correct");
        }
        for (int i = 0; i < k; i++) {
            if (!queue.isEmpty()){
                int lastElement = queue.poll();
                queue.offer(lastElement);
            }
        }
    }
    public static void addElement(Queue<Integer> queue, Integer integer){
        queue.offer(integer);
    }
}
