/*
№1.

Дан массив размера  n-1, содержащий только различные целые числа в диапазоне от 1 до n . Найдите недостающий элемент.

input:
arr[] = {1,2,3,5}
out: 4

arr[] = {6,1,2,8,3,4,7,10,5}
out: 9
 */
package homeworks.homework_14.task_01;

import homeworks.homework_08.ScannerUserInput;

import java.util.Arrays;

public class task_01 {
    public static void main(String[] args) {
        ScannerUserInput ui = new ScannerUserInput();
        int maxNumberInArray = ui.inputInt("Please enter max number, which you want see in array: ");

        int[] ourArray = new int[maxNumberInArray - 1];
        for (int i = 0; i < ourArray.length; i++) {
            int inputNumber = ui.inputInt("Please enter a whole and different number between 1 and " + maxNumberInArray + ": ");
            ourArray[i] = inputNumber;
        }
        System.out.println("Input: ");
        System.out.println("Arr[] = " + Arrays.toString(ourArray));

        //Найдите недостающий элемент.
        //1. Sortieren mit "Bubble Sort"
        int n = ourArray.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (ourArray[j] < ourArray[j + 1]) {
                int temp = ourArray[j];
                ourArray[j] = ourArray[j+1];
                ourArray[j+1] =temp;
                }
            }
        }
       /* System.out.println("Sort: ");
        System.out.println("new sortArr[] = " + Arrays.toString(ourArray));
        */

        //2. Найдите недостающий элемент
        for (int i = 1; i < n; i++) {
            if (ourArray[i] == (ourArray[i-1]-1)){
            } else {
                System.out.println("Out: "+(ourArray[i-1]-1));
            }
        }
    }
}

