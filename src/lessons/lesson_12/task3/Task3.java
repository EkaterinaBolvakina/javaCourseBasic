//Задание 3.
//Написать метод для вычисления факториала числа (произведение всех чисел от 1 до заданного)
package lessons.lesson_12.task3;

import homeworks.homework_08.ScannerUserInput;

public class Task3 {
    public static void main(String[] args) {
        ScannerUserInput ui = new ScannerUserInput();
        int number = ui.inputInt("Please enter a number: ");
        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial = factorial * i;
            System.out.print(+i+"; ");
        }

        System.out.println("Factorial of number "+number+": "+factorial);
    }
}
