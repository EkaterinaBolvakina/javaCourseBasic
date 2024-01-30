package lessons.lesson_11.code.lessoncode.forLoop;

import homeworks.homework_08.ScannerUserInput;

public class Example2ForOrWhile {
    public static void main(String[] args) {
        /*
        дан текст
        вывести отдельно каждую букву этого текста
         */

        ScannerUserInput userInput = new ScannerUserInput();


        String text = userInput.inputText("Введите текст:");

        System.out.println("---------- Теперь цикл FOR -----------");

        for (int i = 0; i < text.length(); i++) {

            char currentChar = text.charAt(i);
            System.out.println("Буква в тексте с индексом " + i + " : " + currentChar);
        }

        System.out.println("---------- Теперь цикл WHILE -----------");

        int counter = 0;

        while (counter < text.length()) {

            char currentChar = text.charAt(counter);
            System.out.println("Буква в тексте с индексом " + counter + " : " + currentChar);
            counter++;
        }

    }
}
