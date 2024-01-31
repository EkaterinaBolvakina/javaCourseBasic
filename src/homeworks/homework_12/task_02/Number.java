//Задание 2.
//Напишите программу, которая запрашивает у пользователя несколько чисел
//при вводе 0 - печатает сумму всех введенных чисел и их среднее арифметическое значение

package homeworks.homework_12.task_02;

import homeworks.homework_08.ScannerUserInput;

public class Number {
    public static void main(String[] args) {
        int number;
        int numberOfIteration = 0;
        int sum = 0;
        int avg = 0;
        boolean condition = true;
        
        while (condition) {
            ScannerUserInput ui = new ScannerUserInput();
            number = ui.inputInt("Please enter a number: ");
            if (number == 0){
                condition = false;
            }else {
                numberOfIteration = numberOfIteration+1;
                sum = sum + number;
                avg = sum / numberOfIteration;
            }
        }

        System.out.println("Sum: " +sum);
        System.out.println("Count of numbers: " +numberOfIteration);
        System.out.println("Average: " +avg);
        
    }
}
