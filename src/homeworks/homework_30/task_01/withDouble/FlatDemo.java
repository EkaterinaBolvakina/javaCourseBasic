package homeworks.homework_30.task_01.withDouble;

import java.util.Set;
import java.util.TreeSet;

/*
даны два класса:
1) Flat - у которого основными параметрами являются площадь и количество спален
   создать класс который сразу бы определял правила сортировки -
   1) по количеству комнат и 2) по площади
   создать коллекцию TreeSet, добавить несколько элементов и проверить работу коллекции
 */
public class FlatDemo {
    public static void main(String[] args) {
        Set<Flat> flatSet = new TreeSet<>();
        flatSet.add(new Flat(63.25,2));
        flatSet.add(new Flat(42.35,1));
        flatSet.add(new Flat(63.28,2));
        flatSet.add(new Flat(80.0,3));
        flatSet.add(new Flat(97.5,3));
        flatSet.add(new Flat(100.0,5));
        flatSet.add(new Flat(30.5,1));

        System.out.println(flatSet);


    }
}
