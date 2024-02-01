/*Задание №2.
1.	Создайте массив из 5 случайных целых чисел из интервала [10;99]
2.	Выведите его на консоль в строку.
3.	Определите и выведите на экран сообщение о том, является ли массив строго возрастающей последовательностью.*/
package homeworks.homework_13.task_02;

import java.util.Arrays;

public class task_02 {
    public static void main(String[] args) {

        //Die mathematische Methode random generiert die zufällige Zahl zwischen [0;1)

        int[] randomArray = new int[5];                   // Создайте массив из 5 случайных целых чисел
        int min = 10;                                     //из интервала [10;99]
        int max = 98;
        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = (int) (Math.round(Math.random() * (max - min + 1) + min));
        }
        System.out.println(Arrays.toString(randomArray)); //Выведите массив на консоль в строку.

        // Определите , является ли массив строго возрастающей последовательностью.
        if ((randomArray[0]<randomArray[1]) &&
            (randomArray[1]<randomArray[2]) &&
            (randomArray[2]<randomArray[3]) &&
            (randomArray[3]<randomArray[4]))
        {
            System.out.println("Array has a strictly increasing sequence");
        } else {System.out.println("Array has NO strictly increasing sequence");

        }
    }
}
