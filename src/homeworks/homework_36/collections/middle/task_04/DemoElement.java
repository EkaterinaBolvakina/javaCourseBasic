package homeworks.homework_36.collections.middle.task_04;
/*
4) Create a PriorityQueue and add a number of items to it that have name and priority properties.
  Then retrieve the items from the queue in priority order and display them on the console.
 */
public class DemoElement {
    public static void main(String[] args) {

        ServicePriorityQueue servicePriorityQueue = new ServicePriorityQueue();

        servicePriorityQueue.addElement("Termin 1",5);
        servicePriorityQueue.addElement("Termin 4",1);
        servicePriorityQueue.addElement("Termin 3",3);
        servicePriorityQueue.addElement("Termin 6",1);
        servicePriorityQueue.addElement("Termin 5",4);
        servicePriorityQueue.addElement("Termin 2",2);

        servicePriorityQueue.printQueue();

    }
}
