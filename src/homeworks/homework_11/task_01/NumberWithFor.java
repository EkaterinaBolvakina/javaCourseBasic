//1. Подсчитать сумму всех четных чисел от 0 до N
//   при том что N вводится пользователем

package homeworks.homework_11.task_01;

import homeworks.homework_08.ScannerUserInput;

public class NumberWithFor {
    public static void main(String[] args) {
        ScannerUserInput ui = new ScannerUserInput();
        int n = ui.inputInt("Please enter a number > 0: ");
        int sum = 0;
        for (int i = 0; i < n; i= i+2) {
            System.out.println(i);
            sum = sum + i;
        }
        System.out.println("========");
        System.out.println("Sum of all even numbers between 0 and "+n+": " + sum);
    }
}
