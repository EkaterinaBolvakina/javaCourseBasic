package lessons.lesson_11.code.lessoncode.variableAreaVisible;

import homeworks.homework_08.ScannerUserInput;

public class ifStatementExample {
    public static void main(String[] args) {


        String text;

        ScannerUserInput userInput = new ScannerUserInput();

        if (userInput.inputInt("Please enter number:") > 0 ) {

             text = "Положительное число";

        } else {
             text = "отрицательное число";
        }

        System.out.println(text);


    }
}
