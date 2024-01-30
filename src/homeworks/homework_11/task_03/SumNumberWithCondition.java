//3. Используйте цикл, чтобы просуммировать все числа, которые ввел пользователь, до первого отрицательного.
package homeworks.homework_11.task_03;

import homeworks.homework_08.ScannerUserInput;

public class SumNumberWithCondition {
    public static void main(String[] args) {

        int sum = 0;
        boolean condition = true;

        while (condition){
            ScannerUserInput ui = new ScannerUserInput();
            int number = ui.inputInt("Please enter a number: ");
            if (number >= 0){
                sum = sum + number;
            } else {
                condition = false;
            }
        }
        System.out.println("Since your last number is negative, the sum of your previous positive numbers is: "+sum);

    }
}
