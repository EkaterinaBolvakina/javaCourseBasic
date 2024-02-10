package homeworks.homework_19.task_05;

import homeworks.homework_08.ScannerUserInput;
import homeworks.homework_08.variant_01.Book;

import java.util.Arrays;

public class Methods {
    //Пользователь должен ввести с клавиатуры размер массива - натуральное число больше 3.
    //Введенное пользователем число сохраняется в переменную n.
    //Если пользователь ввёл не подходящее число, то программа должна просить пользователя повторить ввод.
    private int n;
    public int inputUserArraySize(){
        ScannerUserInput ui = new ScannerUserInput();
        n = ui.inputInt("Please enter a number bigger then 3: ");
                while (n<=3) {
                        System.out.println("You entered a wrong number.");
                        n = ui.inputInt("Please enter a number again: ");
                }  return n;
    }
    //Создать массив из n случайных целых чисел из отрезка [0;n]:
    public int[] createArrayOne(int size){
        int[] arrayOne = new int[size];
        for (int i = 0; i < arrayOne.length; i++) {
            arrayOne[i] = (int) (Math.random()*(n));
        }
        return arrayOne;
    }
    //Создать второй массив только из чётных элементов первого массива, если они там есть, и вывести его на экран.
    public void createAndPrintArrayTwo(int[] arrayOne){
        int countEvenElements = 0;
        for (int i = 0; i < arrayOne.length; i++) {
            if (arrayOne[i]>0){
            if (arrayOne[i] % 2 == 0) {
                countEvenElements++;
            }
            }
        }
        if (countEvenElements > 0) {
            int indexEvenElements = 0;
            int[] arrayEvenElements = new int[countEvenElements];
            for (int i = 0; i < arrayOne.length; i++) {
                if (arrayOne[i]>0) {
                    if (arrayOne[i] % 2 == 0) {
                        arrayEvenElements[indexEvenElements++] = arrayOne[i];
                    }
                }
            }
            System.out.println("Array has "+countEvenElements+" even* elements (*Null is excluded)");
            System.out.println("New array only with even elements: "+Arrays.toString(arrayEvenElements));
        }
    }
}
