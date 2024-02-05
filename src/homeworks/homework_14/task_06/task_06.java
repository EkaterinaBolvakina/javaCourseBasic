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

        int evenCounter = 0;
        int oddCounter =0;
        for (int i = 0; i < words.length; i++) {
            if ((words[i].length()) % 2 == 0){
                evenCounter = evenCounter + 1;
            } else {
                oddCounter = oddCounter +1;
            }
        }
        System.out.println("Count of words in array with even number of letters: "+evenCounter);
        System.out.println("Count of words in array with odd number of letters: "+oddCounter);
        System.out.println("============================================");

        String[] evenArray = new String[evenCounter];
        String[] oddArray = new String[oddCounter];
        int evenArrayIndex = 0;
        int oddArrayIndex = 0;
        for (int i = 0; i < words.length; i++) {
            if ((words[i].length()) % 2 == 0){
                evenArray[evenArrayIndex++] = words[i];
            } else {
                oddArray[oddArrayIndex++] = words[i];
            }
        }
        System.out.println("Array 1: Words with even number of letters: ");
        System.out.println(Arrays.toString(evenArray));
        System.out.println("Array 2: Words with odd number of letters: ");
        System.out.println(Arrays.toString(oddArray));

    }
}

/*    Variante 2:
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

 */