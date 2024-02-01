/*Задание №2.
1.	Создайте массив из 5 случайных целых чисел из интервала [10;99]
2.	Выведите его на консоль в строку.
3.	Определите и выведите на экран сообщение о том, является ли массив строго возрастающей последовательностью.*/
package homeworks.homework_13.task_02;

import homeworks.homework_08.ScannerUserInput;

import java.util.Arrays;

public class task_02_WithMethods {
        public int[] createRandomArray() {
            ScannerUserInput ui = new ScannerUserInput();
            int lengthOfRandomArray = ui.inputInt("Please enter a length of array: ");
            int[] randomArray = new int[lengthOfRandomArray];
            return randomArray;
        }

        public void fillRandomArray (int[] randomArray){
            ScannerUserInput ui = new ScannerUserInput();
            int min =ui.inputInt("Please enter min number, which should be in array: ");
            int max =ui.inputInt("Please enter max number, which should be in array: ");
            for (int i = 0; i < randomArray.length; i++) {
                randomArray[i] = (int) (Math.round(Math.random() * ((max-1) - min + 1) + min));
            }
        }

        public void checkRandomArray(int[] randomArray) {
            if ((randomArray[0] < randomArray[1]) &&
                    (randomArray[1] < randomArray[2]) &&
                    (randomArray[2] < randomArray[3]) &&
                    (randomArray[3] < randomArray[4])) {
                System.out.println("Array has a strictly increasing sequence");
            } else {
                System.out.println("Array has NO strictly increasing sequence");
            }
        }
}




