/*
1. Напишите программу, которая меняет местами элементы одномерного массива из String в обратном порядке.
   Не используйте дополнительный массив для хранения результатов.
 */
package homeworks.homework_19.task_01;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        Service demo = new Service();
        int demoArrSize = demo.inputArrSizeFromUser();
        String[] demoArray = demo.createArray(demoArrSize);
       // System.out.println(Arrays.toString(demoArray));
        String[] demoFilledArray = demo.fillArrayFromUser(demoArray);
        demo.printWords(demoFilledArray);
        demo.sortArray(demoFilledArray);

    }
}
