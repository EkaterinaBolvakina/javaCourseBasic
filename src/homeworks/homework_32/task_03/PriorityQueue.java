package homeworks.homework_32.task_03;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class PriorityQueue {
    Queue<Element> priorityElements = new LinkedList<>();

    public void enqueue(String element, Priority priority) {
        Element newElement = new Element(element, priority);
        priorityElements.offer(newElement);
        sortQueue();
    }

    public Element dequeue() {
        if (isEmpty()) {
            return null;
        }
        Element dequeuedElement = priorityElements.poll();
        sortQueue();
        return dequeuedElement;
    }

    private void sortQueue() {
        LinkedList<Element> sortedList = new LinkedList<>(priorityElements);
        Collections.sort(sortedList);
        priorityElements.clear();
        priorityElements.addAll(sortedList);
    }

    public void printQueue() {
        System.out.println(priorityElements);
    }

    public boolean isEmpty() {
        return priorityElements.isEmpty();
    }

}

