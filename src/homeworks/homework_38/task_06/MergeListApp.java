package homeworks.homework_38.task_06;
// 6. Write a functional interface to merge two lists into a single list
import java.util.ArrayList;
import java.util.List;

public class MergeListApp {
    public static void main(String[] args) {

// With STRING - List:

        ListFunctionalInterface<String> combineLists = (list1,list2) ->
        { List<String> mergedList = new ArrayList<>(list1);
            mergedList.addAll(list2);
            return mergedList;
        };

        List<String> stringList1 = new ArrayList<>();
        stringList1.add("Banana");
        stringList1.add("Apple");
        stringList1.add("Orange");

        List<String> stringList2 = new ArrayList<>();
        stringList2.add("Milk");
        stringList2.add("Juice");
        stringList2.add("Tea");

        List<String> resultMergedList = combineLists.mergeTwoLists(stringList1,stringList2);
        System.out.println(resultMergedList);

// With INTEGER - List:
        ListFunctionalInterface<Integer> combineListInt = (list1,list2) ->
        { List<Integer> mergedList = new ArrayList<>(list1);
            mergedList.addAll(list2);
            return mergedList;
        };

        List<Integer> intList1 = new ArrayList<>();
        intList1.add(10);
        intList1.add(20);
        intList1.add(50);

        List<Integer> intList2 = new ArrayList<>();
        intList2.add(100);
        intList2.add(200);
        intList2.add(500);

        List<Integer> resultMergedIntList = combineListInt.mergeTwoLists(intList1,intList2);
        System.out.println(resultMergedIntList);
    }
}
