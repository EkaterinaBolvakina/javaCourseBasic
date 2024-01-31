//Задание 1. У вас есть текст
//Требуется:
//убрать все специальные символы, такие "(", ")", "@"
//(методом replaceAll не пользоваться)
package lessons.lesson_12.task1;

import homeworks.homework_08.ScannerUserInput;

public class Task1 {
    public static void main(String[] args) {
        ScannerUserInput ui = new ScannerUserInput();
        String text = ui.inputText("Please enter your text: ");

        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
           // System.out.println("Symbol in text with index "+i+": "+currentChar);
            if ((currentChar =='(') ||(currentChar ==')') ||(currentChar =='@')){
                text.substring(0,i);
            }else {
                System.out.print(currentChar);
            }
        }
    }
}


