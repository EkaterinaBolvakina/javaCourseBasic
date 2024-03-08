package homeworks.homework_36.collections.easy;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;

/*
10) Create a HashSet of several items,
create a LinkedList of the same items,
and display the LinkedList items in the order in which they were added.
 */
public class HashSetToLinkedList_Task_10 {
    public static void main(String[] args) {
        String string1 = "Banana";
        String string2 = "Cherry";
        String string3 = "Chocolate";
        String string4 = "Milk";
        String string5 = "Bacon";

        HashSet<String> stringHashSet = new HashSet<>();
        stringHashSet.add(string1);
        stringHashSet.add(string2);
        stringHashSet.add(string3);
        stringHashSet.add(string4);
        stringHashSet.add(string5);

        System.out.println("Input HashSet collection: "+ stringHashSet);
        printHashSet(stringHashSet);

        LinkedList<String> stringLinkedList = new LinkedList<>();
        stringLinkedList.add(string1);
        stringLinkedList.add(string2);
        stringLinkedList.add(string3);
        stringLinkedList.add(string4);
        stringLinkedList.add(string5);

        printLinkedList(stringLinkedList);

        LinkedHashSet<String> stringLinkedHashSet = new LinkedHashSet<>();
        stringLinkedHashSet.add(string1);
        stringLinkedHashSet.add(string2);
        stringLinkedHashSet.add(string3);
        stringLinkedHashSet.add(string4);
        stringLinkedHashSet.add(string5);

        printLinkedHashSet(stringLinkedHashSet);

    }
    public static void printLinkedList(LinkedList<String> stringLinkedList) {
        System.out.println("Elements in LinkedList (order of insertion):");
        for (String item : stringLinkedList) {
            System.out.println(item);
        }
    }
    public static void printHashSet(HashSet<String> stringHashSet) {
        System.out.println("Elements in HashSet:");
        for (String item : stringHashSet) {
            System.out.println(item);
        }
    }
    public static void printLinkedHashSet(LinkedHashSet<String> stringLinkedHashSet) {
        System.out.println("Elements in LinkedHashSet (order of insertion):");
        for (String item : stringLinkedHashSet) {
            System.out.println(item);
        }
    }
}
