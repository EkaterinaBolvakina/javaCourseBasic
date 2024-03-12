package homeworks.homework_40.streamAPI.task_03;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/*
3) String collection - get a string containing all elements of this collection
 */
public class StringElements {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Ich");
        list.add("lebe");
        list.add("in");
        list.add("Deutschland");
        System.out.println(list);

// Concatenate elements into a single string
        String stringConcat = list.stream()
                .collect(Collectors.joining());

        System.out.println("String containing all elements of collection 'list': "+ stringConcat);


    }
}
