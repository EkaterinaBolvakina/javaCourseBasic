package lessons.lesson_39.lambda.integer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class IntegerCollection {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(3);
        integerList.add(2);
        integerList.add(1);
        integerList.add(5);
        integerList.add(4);

        // Variant 1:
        Collections.sort(integerList, (a,b) -> b.compareTo(a));
        System.out.println(integerList);


        /* Variant 2: with creating by self Functional Interface (here: IntegerAbstractInterface)

     IntegerAbstractInterface<Integer> sortIntegerArray = (list) ->
     { Collections.sort(list, (a,b) -> b.compareTo(a));
         return list;
     };

     List<Integer> sortedList = sortIntegerArray.integerCompare(integerList);
        System.out.println("Sorted list: " + sortedList);

         */
    }
}
