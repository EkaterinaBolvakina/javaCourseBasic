/*
№6
Дан массив слов.
Создать два массива:
- один из слов в котором нечетное количество букв
- второй в котором четное
 */
package homeworks.homework_14.task_06;

import java.util.ArrayList;
import java.util.Arrays;

public class task_06 {
    public static void main(String[] args) {
        String[] words = {"Ich", "Wetter", "Sommer", "Freude", "Schmetterling"};
        System.out.println("Array Input:");
        System.out.println(Arrays.toString(words));

        ArrayList<String> evenNumberOfSymbolInWord = new ArrayList<>();
        ArrayList<String> oddNumberOfSymbolInWord = new ArrayList<>();
        for (String word : words) {
            if ((word.length()) % 2 == 0) {
                evenNumberOfSymbolInWord.add(word);
            } else {
                oddNumberOfSymbolInWord.add(word);
            }
        }
        System.out.println("Array 1: Words with even number of letters: ");
        System.out.println(evenNumberOfSymbolInWord);
        System.out.println("Array 2: Words with odd number of letters: ");
        System.out.println(oddNumberOfSymbolInWord);

    }
}
/*
        for (int i = 0; i < words.length; i++) {
            if ((words[i].length()) % 2 == 0){
                evenCounter = evenCounter + 1;
                System.out.println("even: "+words[i]);
                } else {
                oddCounter = oddCounter +1;
                System.out.println("odd: "+words[i]);
            }
                }

        //String[] even = {words[i]};
        //System.out.println(Arrays.toString(even));
        System.out.println("Even number of letters: "+evenCounter);
        System.out.println("Odd number of letters: "+oddCounter);

 */
