package homeworks.homework_19.task_01;

import homeworks.homework_08.ScannerUserInput;

import java.util.Arrays;

public class Service {

    public int inputArrSizeFromUser(){
        ScannerUserInput ui = new ScannerUserInput();
        int arrSize = ui.inputInt("Please enter a size of your array: ");
        return arrSize;
    }

    public String[] createArray(int arrSize){
        String[] words = new String[arrSize];
        return words;
    }

    public String[] fillArrayFromUser(String[] array) {
        ScannerUserInput ui = new ScannerUserInput();
       // String[] words = array;
        for (int i = 0; i < array.length; i++) {
            array[i] = ui.inputText("Please enter a word nr. "+(i+1));
        }
        return array;
    }

    public void printWords(String[] words){
        System.out.println("Input words: "+ Arrays.toString(words));
    }
    public void sortArray(String[] arrayForSort) {
        int n = arrayForSort.length;
        for (int i = 0; i < n / 2; i++) {
            String temp = arrayForSort[n - i - 1];
            arrayForSort[n - i -1] = arrayForSort[i];
            arrayForSort[i] = temp;
        }
        System.out.println("Output sorted words: "+Arrays.toString(arrayForSort));
    }
}
