package homeworks.homework_36.collections.easy;

import java.util.HashSet;

/*
4 Create a HashSet, add some strings to it and check if it contains a particular string.
 */
public class HashSet_Task_04 {
    public static void main(String[] args) {

        HashSet<String> stringHashSet = new HashSet<>();

        stringHashSet.add("Banana");
        stringHashSet.add("Strawberry");
        stringHashSet.add("Orange");
        stringHashSet.add("Grapefruit");
        stringHashSet.add("Cherry");

        checkSetContainsString(stringHashSet,"Banana");
        checkSetContainsString(stringHashSet,"Kiwi");

    }
    public static void checkSetContainsString(HashSet<String> stringHashSet, String string) {
            if (stringHashSet.contains(string)) {
                System.out.println("Set contains: "+ string);
            }else {
                System.out.println("Set DOESN'T contain: "+ string);
            }
    }
}
