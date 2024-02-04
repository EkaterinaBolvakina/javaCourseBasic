/*
№3
1. Создайте массив из 15 случайных целых чисел из отрезка [0;9].
2. Подсчитайте сколько в массиве чётных элементов и выведете это
   количество на экран на отдельной строке.
 */
package homeworks.homework_14.task_03;

import homeworks.homework_08.ScannerUserInput;

import java.util.Arrays;


public class Task_03 {
    public static void main(String[] args) {
        ScannerUserInput ui = new ScannerUserInput();
        int arrLength = ui.inputInt("Please enter a length of your array: ");
        int startInterval = ui.inputInt("Please enter min number, which should be in your array: ");
        int endInterval = ui.inputInt("Please enter max number, which should be in your array: ");

        int[] randomArr = new int[arrLength];
        for (int i = 0; i < randomArr.length; i++) {
            randomArr[i] = (int) (Math.random()*((endInterval - startInterval + 1)+ startInterval));
        }
        System.out.println(Arrays.toString(randomArr));

        int evenNumCounter = 0;
        for (int i = 0; i < randomArr.length; i++) {
            if (randomArr[i] % 2 == 0){
                evenNumCounter = evenNumCounter +1;
            }
        }
        System.out.println("в массиве "+ evenNumCounter + " чётных элементов");

    }
}
