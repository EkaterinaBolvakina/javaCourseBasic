package homeworks.homework_36.collections.easy;

import java.util.PriorityQueue;

/*
6 Create a PriorityQueue of 10 elements of type Integer, add some elements, extract the minimum element and display it.
 */
public class PriorityQueue_Task_06 {
    public static void main(String[] args) {
        PriorityQueue<Integer> integerPriorityQueue = new PriorityQueue<>();
        addElement(integerPriorityQueue,2);
        addElement(integerPriorityQueue,-100);
        addElement(integerPriorityQueue,20);
        addElement(integerPriorityQueue,25);
        addElement(integerPriorityQueue,-4000);
        addElement(integerPriorityQueue,24);
        addElement(integerPriorityQueue,1);
        addElement(integerPriorityQueue,-1);
        addElement(integerPriorityQueue,234);
        addElement(integerPriorityQueue,0);

        System.out.println(integerPriorityQueue);

        Integer minElement = findMinElement(integerPriorityQueue);
        printMinElement(minElement);
    }

    public static void addElement(PriorityQueue<Integer> integerPriorityQueue, Integer integer) {
        integerPriorityQueue.offer(integer);
    }

    public static Integer findMinElement(PriorityQueue<Integer> integerPriorityQueue) {
        // PriorityQueue automatically maintains the minimum element at the front
        return integerPriorityQueue.peek();
    }
    public static void printMinElement(Integer integer) {
        System.out.println("Min element: "+ integer);
    }
}
