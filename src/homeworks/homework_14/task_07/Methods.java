package homeworks.homework_14.task_07;

import java.util.Arrays;

public class Methods {

    int[] createArray(int arrSize) {

        int[] array = new int[arrSize];
        for (int i = 0; i < arrSize; i++) {
            array[i] = (int) (Math.random() * (101));
        }
        return array;
    }

    public void findMaxAndItsIndexOfElementsInArray(int[] workingArray) {

        int maxElement = workingArray[0];
        int indexOfMaxElement = 0;
        for (int i = 1; i < workingArray.length; i++) {
            if (workingArray[i] > maxElement) {
                maxElement = workingArray[i];
                indexOfMaxElement = i;
            } else if (workingArray[i] == maxElement) {
                indexOfMaxElement = indexOfMaxElement;
            }
        }
        System.out.println("Max element: " + maxElement);
        System.out.println("Index of Max element: " + indexOfMaxElement);

    }

    public int findSumOfElementsInArray(int[] workingArray) {
        int sum = 0;
        for (int i = 0; i < workingArray.length; i++) {
            sum = workingArray[i] + sum;
        }
        return sum;
    }

    public void createArrayOfIndexDoubleMax(int[] workingArray) {

        int countOfMax = 0;
        int maxElement = workingArray[0];
        for (int i = 1; i < workingArray.length; i++) {
            if (workingArray[i] == maxElement) {
                countOfMax = countOfMax +1;
            }
        }
        if (countOfMax > 1) {
            int[] arrayOfIndexDoubleMax = new int[countOfMax];
            int currentIndex = 0;
            for (int i = 0; i < workingArray.length; i++) {
                if (workingArray[i] == maxElement) {
                    arrayOfIndexDoubleMax[currentIndex++] = i;
                }
            }
            System.out.println("Array has "+countOfMax+" maximums");
            System.out.println("Maximums have further indexes: "+Arrays.toString(arrayOfIndexDoubleMax));
        }
        System.out.println("Array has only one maximum");
    }
}

