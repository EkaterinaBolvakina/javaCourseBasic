//**Task 1**
//
//1. Необходимо написать программу, где бы пользователю предлагалось ввести число на выбор: 1, 2 или 3,
//а программа должна сказать, какое число ввёл пользователь: 1, 2, или 3
//
//2. Перепишите решение задачи с использованием switch вместо if-else:
//
//Необходимо написать программу, где бы пользователю предлагалось ввести число на выбор: 1, 2 или 3,
//а программа должна сказать, какое число ввёл пользователь: 1, 2, или 3
package homeworks.homework_09.task_01;

public class NumberChoiceSwitch {
    public static void main(String[] args) {
        ScannerUserInput ui = new ScannerUserInput();
        int a = ui.inputInteger("Please enter a whole number between 1 and 3: ");
        switch (a){
            case 1:
                System.out.println("You entered 1.");
                break;
            case 2:
                System.out.println("You entered 2.");
                break;
            case 3:
                System.out.println("You entered 3.");
                break;
            default:
                System.out.println("You entered a whole number, but not between 1 and 3.");
        }
    }
}
