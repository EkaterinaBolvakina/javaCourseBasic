package lessons.lesson_30.compareObjects.comparator.task_01;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/*
1) Создайте класс Pair
в нем объявите две переменные:
- String
- int

Создайте два компаратора для сортировки по каждому полю

Создайте коллекцию и используя компараторы продемонстрируйте разные
сортировки
 */
public class PairDemo {
    public static void main(String[] args) {
        Comparator<Pair> pairComparatorIdName = new PairComparatorId().thenComparing(new PairComparatorName());
        Comparator<Pair> pairComparatorNameId = new PairComparatorName().thenComparing(new PairComparatorId());
        Comparator<Pair> pairComparatorId = new PairComparatorId();

        Set<Pair> pairSet = new TreeSet<>(pairComparatorIdName);
        pairSet.add(new Pair("Katrin",2));
        pairSet.add(new Pair("Kate",2));
        pairSet.add(new Pair("Kirill",1));
        pairSet.add(new Pair("Anna",5));
        pairSet.add(new Pair("Oleg",4));

        System.out.println(pairSet);

        Set<Pair> pairSet2 = new TreeSet<>(pairComparatorNameId);
        pairSet2.add(new Pair("Katrin",2));
        pairSet2.add(new Pair("Kate",2));
        pairSet2.add(new Pair("Kirill",1));
        pairSet2.add(new Pair("Anna",5));
        pairSet2.add(new Pair("Oleg",4));

        System.out.println(pairSet2);

        Set<Pair> pairSet3 = new TreeSet<>(pairComparatorId);
        pairSet3.add(new Pair("Katrin",2));
        pairSet3.add(new Pair("Kate",2));
        pairSet3.add(new Pair("Kirill",1));
        pairSet3.add(new Pair("Anna",5));
        pairSet3.add(new Pair("Oleg",4));

        System.out.println(pairSet3);

    }
}
