package homeworks.homework_36.collections.middle.task_08;
/*
8) Create a HashSet and add some strings to it. Then create a second set and add to it some same and other strings.
Then print to the console only those strings that are in both sets.
 */
import java.util.HashSet;

public class HashSetCollections {
    public static void main(String[] args) {

        String string1 = "Text One";
        String string2 = "Text Two";
        String string3 = "Text Three";
        String string4 = "Text Four";
        String string5 = "Text Five";
        String string6 = "Text Six";

        HashSet<String> hashSet1 = new HashSet<>();
        hashSet1.add(string1);
        hashSet1.add(string2);
        hashSet1.add(string3);
        hashSet1.add(string4);
        hashSet1.add(string5);
        System.out.println("HashSet1: " + hashSet1);

        HashSet<String> hashSet2 = new HashSet<>();
        hashSet2.add(string5);
        hashSet2.add(string3);
        hashSet2.add(string1);
        hashSet2.add(string6);
        System.out.println("HashSet2: " + hashSet2);

        // Find and print common strings
        HashSet<String> commonSet = new HashSet<>(hashSet1);
        commonSet.retainAll(hashSet2);

        System.out.println("Common Strings: " + commonSet);
    }
}
