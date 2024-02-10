/*
2. Напишите программу, которая определит, сколько слов Вы ввели с консоли.
 */
package homeworks.homework_19.task_02;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        Methods demoMethods = new Methods();

        /* Variant 1:
    Start situation nr.1: we don't know how much words user want to enter =>
         */
        int countWords = demoMethods.countEnteredWords();
        System.out.println("You entered "+countWords+" word(s)");

        /* Variant 2:
    Start situation nr.2: we ask user how much words user want to enter and print words in array =>
         */
        System.out.println("========Variant 2===========");
        int countDemo = demoMethods.countWords();
        String[] wordsDemo = demoMethods.createWordsArray(countDemo);
        String[] filledWordsArray = demoMethods.fillWordsArray(wordsDemo);
        System.out.println("You entered "+countDemo+" word(s): ");
        System.out.println(Arrays.toString(filledWordsArray));

    }
}
