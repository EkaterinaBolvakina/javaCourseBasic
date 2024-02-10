package homeworks.homework_19.task_04;

import java.util.Arrays;

public class Methods {

    private int sizeArray = 5;
    private int maxRandom = 5;
    private int minRandom = 0;
    public int[] createAndFillArrayOne(){
        int[] arrayOne = new int[sizeArray];
        for (int i = 0; i < arrayOne.length; i++) {
            arrayOne[i] = (int) (Math.random()*(maxRandom - minRandom) + minRandom);
        } return arrayOne;
    }

    public int[] createAndFillArrayTwo(){
        int[] arrayTwo = new int[sizeArray];
        for (int i = 0; i < arrayTwo.length; i++) {
            arrayTwo[i] = (int) (Math.random()*(maxRandom - minRandom) + minRandom);
        } return arrayTwo;
    }

    public void printArrays(int[] arrayOne, int[] arrayTwo){
        System.out.println("Array nr.1: "+ Arrays.toString(arrayOne));
        System.out.println("Array nr.2: "+ Arrays.toString(arrayTwo));
    }

    public double calculateAverageArrayOne(int[] arrayOne){
        double sum = 0;
        double count = 0;

        for (int i = 0; i < arrayOne.length; i++) {
            sum = arrayOne[i] + sum;
            count++;
        }
        double avgOfElementsArrayOne = sum / count;
        return avgOfElementsArrayOne;
    }
    public double calculateAverageArrayTwo(int[] arrayTwo){
        double sum = 0;
        double count = 0;

        for (int i = 0; i < arrayTwo.length; i++) {
            sum = arrayTwo[i] + sum;
            count++;
        }
        double avgOfElementsArrayTwo = sum/ count;
        return avgOfElementsArrayTwo;
    }

    public void compareAverages(double avgOne, double avgTwo){
        System.out.println("Average of elements from array nr.1 is: "+avgOne);
        System.out.println("Average of elements from array nr.2 is: "+avgTwo);
        if (avgOne < avgTwo){
            System.out.println("Average of elements from array nr.2 is bigger");
        } else if (avgOne == avgTwo){
                System.out.println("Averages are equal");
        } else {
            System.out.println("Average of elements from array nr.1 is bigger");
        }
    }
}
