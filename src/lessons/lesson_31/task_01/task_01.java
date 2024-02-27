package lessons.lesson_31.task_01;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
/*
1) дан список целых чисел
написать метод, который удаляет из него все числа, которые больше заданного X

в качестве результата выведите измененный список
 */

public class task_01 {
    public static void main(String[] args) {
        Set<Integer> integerSet = new HashSet<>();
        integerSet.add(7);
        integerSet.add(5);
        integerSet.add(1);
        integerSet.add(4);
        integerSet.add(15);
        integerSet.add(3);
        integerSet.add(17);
        System.out.println(integerSet);

       Iterator<Integer> integerIterator = integerSet.iterator();
        while (integerIterator.hasNext()){
            Integer tempInt = integerIterator.next();
            System.out.println(tempInt);
            if (tempInt > 10){
                integerIterator.remove();
            }
        }
        System.out.println(integerSet);
    }
}
