package homeworks.homework_19.task_03;

import java.util.Arrays;

public class Methods {
    //Создайте массив из 8 случайных целых чисел из отрезка [1;10]

   public int[] createAndFillRandomArray(){
        int minRandom = 1;
        int maxRandom = 10;
        int sizeArray = 8;
        int[] randomArray = new int[sizeArray];
        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = (int) (Math.random()*(maxRandom - minRandom + 1) + minRandom);
        } return randomArray;
    }
   public int[] sortRandomArrayAscending(int[] array){
       // sort with method ChooseSort ascending по возрастанию aufsteigend:
        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            int minId = i;

            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    minId = j;
                }
            }

            int temp = array[i];
            array[i] = min;
            array[minId] = temp;
        } return array;
    }
    public int[] sortRandomArrayDescending(int[] array){
        // sort with method ChooseSort descending по убыванию absteigend:
        int n = array.length;
        for (int i = 0; i < array.length; i++) {
            int max = array[i];
            int maxId = i;

            for (int j = i + 1; j < array.length; j++) {
                if (array[j] > max) { // hier ändert sich das Vergleichszeichen
                    max = array[j];
                    maxId = j;
                }
            }

            int temp = array[i];
            array[i] = max;
            array[maxId] = temp;
        } return array;
    }
}
