package homeworks.homework_40.streamAPI.task_02;

import java.util.ArrayList;
import java.util.List;
/*
2) String collection - get a collection of elements with odd number of characters
 */
public class OddNumber {
    public static void main(String[] args) {

        List<String> stringList = new ArrayList<>();
        stringList.add("Banana");
        stringList.add("Apple");
        stringList.add("Schmetterling");
        stringList.add("Auf Wiedersehen!");

List<String> stringOddNumberCharacters = stringList.stream()
        .filter(string -> string.replace(" ","").length() % 2 != 0)
        .toList();

        System.out.println("List of strings with odd number of characters: " + stringOddNumberCharacters);

    }
}
