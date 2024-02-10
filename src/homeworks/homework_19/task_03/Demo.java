/*
3. Создайте массив из 8 случайных целых чисел из отрезка [1;10]
   Отсортируйте массив по убыванию любым из алгоритмов.
 */
package homeworks.homework_19.task_03;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        Methods demo = new Methods();
        int[] demoRandomArray = demo.createAndFillRandomArray();
        System.out.println("Random array: "+ Arrays.toString(demoRandomArray));
        int[] demoSortedArrayAscending = demo.sortRandomArrayAscending(demoRandomArray);
        System.out.println("Random array sorted ascending: "+ Arrays.toString(demoSortedArrayAscending));
        int[] demoSortedArrayDescending = demo.sortRandomArrayDescending(demoRandomArray);
        System.out.println("Random array sorted descending: "+ Arrays.toString(demoSortedArrayDescending));
    }
}
