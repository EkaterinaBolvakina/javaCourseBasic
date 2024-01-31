//Задание 3.
//Написать метод для вычисления факториала числа (произведение всех чисел от 1 до заданного)
package lessons.lesson_12.task3;

import homeworks.homework_08.ScannerUserInput;

public class Task3 {
    public static void main(String[] args) {
        ScannerUserInput ui = new ScannerUserInput();
        int number = ui.inputInt("Please enter a number: ");
        int numberOfIteration = 0;
        int factorial = 1;
        for (int i = 0; i < number; i++) {
            numberOfIteration = numberOfIteration + 1;
            factorial = factorial * numberOfIteration;
            System.out.print(+numberOfIteration+"; ");
        }

        System.out.println("number of iterations: "+numberOfIteration);
        System.out.println("Factorial of number "+number+": "+factorial);
    }
}
