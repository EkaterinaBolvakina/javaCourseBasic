package homeworks.homework_36.collections.easy;
/*
1 Создать ArrayList из 10 элементов, отсортировать его по возрастанию и вывести на экран.
 */
import java.util.ArrayList;
import java.util.Collections;

public class ArrayList_Task01 {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("Banana");
        strings.add("Apple");
        strings.add("Cherry");
        strings.add("Banana");
        strings.add("Kiwi");
        strings.add("Orange");
        strings.add("Grapefruit");
        strings.add("Strawberry");
        strings.add("Apple");
        strings.add("Banana");
        System.out.println("Input ArrayList: "+strings);

        ArrayList<String> sortedList = sort(strings);
        System.out.println("Sorted ArrayList: "+sortedList);

    }
    public static ArrayList<String> sort(ArrayList<String> strings) {
        Collections.sort(strings);
        return strings;
    }
}
