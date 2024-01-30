//5. Пользователь ввел число N.
// Подсчитайте количество четных и не четных чисел в диапазоне от 0 до N

package homeworks.homework_11.task_05;

import homeworks.homework_08.ScannerUserInput;

public class EvenOddNumbersSum {
    public static void main(String[] args) {
        int sumOfEvenNumbers = 0;
        int sumOfOddNumbers = 0;

        ScannerUserInput ui = new ScannerUserInput();
        int number = ui.inputInt("Please enter a positive number: ");
        System.out.println("You entered number: "+number);

        System.out.print("Even numbers in interval (0;"+number+"): ");
        for (int i = 0; i < number; i=i+2) {
            System.out.print(" "+i+";");
            sumOfEvenNumbers = sumOfEvenNumbers + i;
        }
        System.out.println();
        System.out.print("Odd numbers in interval (0;"+number+"): ");
        for (int i = 1; i < number; i=i+2) {
            System.out.print(" "+i+";");
            sumOfOddNumbers = sumOfOddNumbers + i;
        }
        System.out.println();
        System.out.println("Sum of even numbers: "+ sumOfEvenNumbers);
        System.out.println("Sum of odd numbers: "+ sumOfOddNumbers);
    }









}
