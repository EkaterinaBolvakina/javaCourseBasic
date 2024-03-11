package homeworks.homework_36.generics.task_08;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/*
8) Write a filter method that takes a list of objects and a predicate,
   and returns a list of objects that satisfy the predicate.
   Use Generics to make it possible to pass a list of objects of any type to the method.
 */
public class FilterDemo {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(26);
        integers.add(17);

        Predicate<List<Integer>> checkIntList = (List<Integer> list) -> {
            if (list.size() < 10) {
                return true;
            }else {
                return false;
            }
        };

        Method<Integer> integerMethod = new Method<>();
        List<Integer> listChecked = integerMethod.filter(integers,checkIntList);
        System.out.println(listChecked);

    }

}
