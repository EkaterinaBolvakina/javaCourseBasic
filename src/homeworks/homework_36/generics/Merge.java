package homeworks.homework_36.generics;

import java.util.ArrayList;
import java.util.List;

/*
6)  Напишите метод merge, который принимает два отсортированных списка и
    возвращает объединенный отсортированный список. Используйте Generics
    для обеспечения возможности передачи в метод списков любого типа.
 */
public class Merge <T,V>{

    public List<Object> merge(List<T> sortedList1, List<V> sortedList2){
        List<Object> mergedList = new ArrayList<>();
        int i = 0;
        int j = 0;

        while (i < sortedList1.size()) {
            mergedList.add(sortedList1.get(i));
            i++;
        }

        while (j < sortedList2.size()) {
            mergedList.add(sortedList2.get(j));
            j++;
        }

        return mergedList;
    }

    public static void main(String[] args) {
        Merge<String,Integer> merge = new Merge<>();

        List<String> sortedList1 = new ArrayList<>();
        sortedList1.add("Anna");
        sortedList1.add("Anton");
        sortedList1.add("Bella");

        List<Integer> sortedList2 = new ArrayList<>();
        sortedList2.add(1);
        sortedList2.add(2);
        sortedList2.add(3);

        List<Object> mergerList = merge.merge(sortedList1,sortedList2);
        System.out.println("Merged list: "+ mergerList);

    }

}
