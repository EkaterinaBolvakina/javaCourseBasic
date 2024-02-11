package projects.project_01.project_01_Variant_01;

import homeworks.homework_08.ScannerUserInput;

import java.util.Arrays;

public class ArrayService {

    public void sort(int[] array) {
        // sort with method ChooseSort descending:
        for (int i = 0; i < array.length; i++) {
            int max = array[i];
            int maxId = i;

            for (int j = i + 1; j < array.length; j++) {
                if (array[j] > max) {
                    max = array[j];
                    maxId = j;
                }
            }
            int temp = array[i];
            array[i] = max;
            array[maxId] = temp;
        }
    }

    public int[] createArrayFromUserInput(){
        ScannerUserInput ui = new ScannerUserInput();
        int arraySize = ui.inputInt("Please enter a number for size of array: ");
        return new int[arraySize];
    }
    public int[] fillArrayFromUserInput(int[] array){
        ScannerUserInput ui = new ScannerUserInput();
        for (int i = 0; i < array.length; i++) {
            array[i] = ui.inputInt("Please enter a whole number: ");
        }
        return array;
    }
    public void printArray(int[] array){
        sort(array);
        System.out.println("Array sorted: "+ Arrays.toString(array));
    }
}
