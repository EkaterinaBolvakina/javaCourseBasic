package homeworks.homework_36.collections.middle.task_04;

import java.util.Comparator;
import java.util.PriorityQueue;

public class ServicePriorityQueue {
    private PriorityQueue<Element> elementPriorityQueue = new PriorityQueue<>(Comparator.comparing(Element::getPriority));

    public void addElement(String name, Integer priority) {
        elementPriorityQueue.offer(new Element(name, priority));
    }
    public void printQueue() {
        System.out.println("Elements priority queue: ");
        while (!elementPriorityQueue.isEmpty()) {
            System.out.println(elementPriorityQueue.poll());
        }
    }
}
