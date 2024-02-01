/* Задание №1

1.	Создайте массив из 8 случайных целых чисел из интервала [1;50]
2.	Выведите массив на консоль в строку.
3.	Замените каждый элемент с нечетным индексом на ноль.
4.	Снова выведете массив на консоль в отдельной строке. */

package homeworks.homework_13.task_01;

import java.util.Arrays;

public class taskWithoutMethods {
    public static void main(String[] args) {

        //Die mathematische Methode random generiert die zufällige Zahl zwischen [0;1)
        //из интервала [1;50]
        int min = 1;
        int max = 49;

        int[] randomArray = new int[8]; // Создайте массив:
        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = (int) (Math.round(Math.random()*(max - min +1) + min));;
        }
        System.out.println(Arrays.toString(randomArray)); //Выведите массив на консоль в строку.

        // Замените каждый элемент с нечетным индексом на ноль.:
        int[] newRandomArray = new int[8];
        for (int i = 0; i < newRandomArray.length; i=i+2) {
            newRandomArray[i] = randomArray[i];;
        }
        System.out.println(Arrays.toString(newRandomArray)); //Снова выведете массив на консоль в отдельной строке.

    }
}
