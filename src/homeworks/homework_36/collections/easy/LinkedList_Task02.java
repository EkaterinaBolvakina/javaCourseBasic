package homeworks.homework_36.collections.easy;
/*
2 Create a LinkedList of 10 items, remove items with indexes that are stored in another collection in Set
and display what remains of the List.
2 Создать LinkedList из 10 элементов, удалить элементы с индексами, которые хранятся другой коллекции в Set
и вывести на экран, то что останется от List.
 */
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class LinkedList_Task02 {
    public static void main(String[] args) {
        LinkedList<String> stringLinkedList = new LinkedList<>();
        stringLinkedList.add("Banana");
        stringLinkedList.add("Apple");
        stringLinkedList.add("Cherry");
        stringLinkedList.add("Banana");
        stringLinkedList.add("Kiwi");
        stringLinkedList.add("Orange");
        stringLinkedList.add("Grapefruit");
        stringLinkedList.add("Strawberry");
        stringLinkedList.add("Apple");
        stringLinkedList.add("Banana");
        System.out.println("Input LinkedList: "+stringLinkedList);

        Set<String> stringSet = new HashSet<>();
        stringSet.add("Banana");
        stringSet.add("Strawberry");
        System.out.println("Input SetList: "+stringSet);

        LinkedList<String> remainsOfLinkedList = deleteElementsFromSet(stringLinkedList,stringSet);
        System.out.println("Remains of the List: " + remainsOfLinkedList);

    }
    public static LinkedList<String> deleteElementsFromSet(LinkedList<String> stringLinkedList,Set<String> stringSet ) {
        for (int i = 0; i < stringLinkedList.size(); i++) {
            for (String stringSetElement : stringSet) {
                if (stringLinkedList.get(i).equals(stringSetElement)) {
                    stringLinkedList.remove(i);
                }
            }
        }
        return stringLinkedList;
    }
}
