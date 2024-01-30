//2. проверить является ли число которое ввел пользователь - простым
//   (делится без остатка только на 1 и на себя)
package homeworks.homework_11.task_02;

import homeworks.homework_08.ScannerUserInput;

public class PrimeNumberCheck {
    public static void main(String[] args) {
        ScannerUserInput ui = new ScannerUserInput();
        int number = ui.inputInt("Please enter a number > 0: ");

        boolean conditionIsPrime = true;

        for (int i = 2; i <= number/2; ++i) {
             if (number % i == 0) {
                 conditionIsPrime = false;
             }
        }

        if (conditionIsPrime){
            System.out.println("Your number is prime");
        } else {
            System.out.println("Your number is composite");
        }
    }
}
