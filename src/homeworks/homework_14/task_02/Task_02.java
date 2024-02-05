/*
№2
1. Создайте массив из всех нечётных чисел от 1 до 99.
2. Выведите его на экран в строку в обратном порядке
 */
package homeworks.homework_14.task_02;

import homeworks.homework_08.ScannerUserInput;

import java.util.Arrays;

public class Task_02 {
    public static void main(String[] args) {
        //1. Создайте массив из всех нечётных чисел от 1 до 99.
        ScannerUserInput ui = new ScannerUserInput();
        int maxNumber = ui.inputInt("Please enter max number, which should be in your array: ");
        int arrLength = (maxNumber/2)+1; // For odd number: (maxNumber/2)+1, for even number would be: (maxNumber/2)

        int[] oddArray = new int[arrLength];
        oddArray[0] = 1;
        for (int i = 1; i < oddArray.length; i=i+1) {
            oddArray[i] = oddArray[0] + (i * 2);
        }
        System.out.println("массив из всех нечётных чисел от 1 до "+maxNumber);
        System.out.println(Arrays.toString(oddArray));

        //2. Выведите его на экран в строку в обратном порядке
        int n = oddArray.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (oddArray[j] < oddArray[j + 1]) {
                    int temp = oddArray[j];
                    oddArray[j] = oddArray[j+1];
                    oddArray[j+1] =temp;
                }
            }
        }
        System.out.println("массив из всех нечётных чисел от 1 до "+maxNumber+" в обратном порядке:");
        System.out.println(Arrays.toString(oddArray));

    }
}
