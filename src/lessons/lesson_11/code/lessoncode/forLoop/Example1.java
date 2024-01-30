package lessons.lesson_11.code.lessoncode.forLoop;

import homeworks.homework_08.ScannerUserInput;

public class Example1 {
    public static void main(String[] args) {


        ScannerUserInput userInput = new ScannerUserInput();

        int numberOfIterations = userInput.inputInt("Please enter number of iteration: ");

        for (int i = 0; i < numberOfIterations; i++) {

            int userInt = userInput.inputInt("Please enter integer number: ");

            if (userInt > 0 ) {

                System.out.println("Положительное число");

            } else {
                System.out.println("отрицательное число");
            }
        }

    }
}
