//Задание 1. У вас есть текст
//Требуется:
//убрать все специальные символы, такие "(", ")", "@"
//(методом replaceAll не пользоваться)
package lessons.lesson_12.task1;

import homeworks.homework_08.ScannerUserInput;

public class Task1 {
    public static void main(String[] args) {
        ScannerUserInput ui = new ScannerUserInput();
        String text = ui.inputText("Please enter your text which contains symbols like @ ( ) : ");
        String changedText = "";

        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
                if ((currentChar =='(') ||
                    (currentChar ==')') ||
                    (currentChar =='@'))
            {} else {
                changedText = changedText + currentChar;
            }
        }
        System.out.println("Your text after special symbol replace: "+changedText);
    }
}

