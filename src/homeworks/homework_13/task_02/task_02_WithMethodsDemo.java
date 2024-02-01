/*Задание №2.
1.	Создайте массив из 5 случайных целых чисел из интервала [10;99]
2.	Выведите его на консоль в строку.
3.	Определите и выведите на экран сообщение о том, является ли массив строго возрастающей последовательностью.*/
package homeworks.homework_13.task_02;

import java.util.Arrays;

public class task_02_WithMethodsDemo {
    public static void main(String[] args) {
        task_02_WithMethods methods = new task_02_WithMethods();
        int[] taskRandomArray = methods.createRandomArray();
        methods.fillRandomArray(taskRandomArray);
        System.out.println(Arrays.toString(taskRandomArray));
        methods.checkRandomArray(taskRandomArray);

    }
}
