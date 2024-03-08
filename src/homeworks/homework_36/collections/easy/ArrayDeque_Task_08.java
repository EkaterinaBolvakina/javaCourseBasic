package homeworks.homework_36.collections.easy;

import java.util.ArrayDeque;

/*
8 Create an ArrayDeque, add some elements to it on each side,
extract the elements from one of the sides,
and display it on the screen.
 */
public class ArrayDeque_Task_08 {
    public static void main(String[] args) {

        ArrayDeque<String> stringArrayDeque = new ArrayDeque<>();
        addElementFirst(stringArrayDeque,"Banana 1");
        addElementFirst(stringArrayDeque,"Cherry");
        addElementFirst(stringArrayDeque,"Banana 2");
        addElementLast(stringArrayDeque,"Banana 3");
        addElementLast(stringArrayDeque,"Banana 4");

        System.out.println("Input ArrayDeque: " +stringArrayDeque);
        System.out.println("Extracted elements Last: " + extractElementsFromOneSide(stringArrayDeque));


    }
    public static void addElementFirst(ArrayDeque<String> stringArrayDeque, String string) {
        stringArrayDeque.addFirst(string);
    }
    public static void addElementLast(ArrayDeque<String> stringArrayDeque, String string) {
        stringArrayDeque.addLast(string);
    }

    public static ArrayDeque<String> extractElementsFromOneSide(ArrayDeque<String> stringArrayDeque) {
        ArrayDeque<String> extractedElementsLast = new ArrayDeque<>();
        while (!stringArrayDeque.isEmpty()) {
            extractedElementsLast.offer(stringArrayDeque.pollLast());
        }
        return extractedElementsLast;
    }

}
