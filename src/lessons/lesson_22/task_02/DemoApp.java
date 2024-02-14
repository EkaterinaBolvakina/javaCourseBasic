package lessons.lesson_22.task_02;

import java.util.Arrays;

public class DemoApp {
    public static void main(String[] args) {
Methods demo = new Methods();
String inputText = demo.inputWordFromUser();
String[] textArray = demo.prepareTextArray(inputText);
        System.out.println(Arrays.toString(textArray));
        String[] sortedTextArray = demo.sortTextArray(textArray);
        System.out.println(Arrays.toString(sortedTextArray));
        int count = demo.countWord(textArray,"die");
        System.out.println("Count of word 'die' in text: "+count);
        String longWord = demo.findLongestWord(textArray);
        System.out.println("Longest word in text: "+longWord);



    }
}
