/*
№7 **
Создать массив размера , полученного от пользователя
Наполнить этот массив случайными числами в диапазоне до 100
- найти максимум среди элементов массива и его индекс (если значения повторяются то найти первый)
- найти сумму всех элементов

если максимальный элемент повторяется несколько раз то создать массив из индесов

в идеале - оформить основные модули вашей программы отдельными методами
 */
package homeworks.homework_14.task_07;

import homeworks.homework_14.task_08.InputUser;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        Input inputDemo = new Input();
        int arrSize = inputDemo.inputArraySize();

        Methods demo = new Methods();
        int[] arrDemo = demo.createArray(arrSize);
        System.out.println("Array: "+ Arrays.toString(arrDemo));
        demo.findMaxAndItsIndexOfElementsInArray(arrDemo);
            int sum = demo.findSumOfElementsInArray(arrDemo);
        System.out.println("Sum of elements in array: "+ sum);
       demo.createArrayOfIndexDoubleMax(arrDemo);
    }
}
