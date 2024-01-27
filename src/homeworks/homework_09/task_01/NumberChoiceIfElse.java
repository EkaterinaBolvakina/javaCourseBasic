//**Task 1**
//
//1. Необходимо написать программу, где бы пользователю предлагалось ввести число на выбор: 1, 2 или 3,
//а программа должна сказать, какое число ввёл пользователь: 1, 2, или 3
//Необходимо написать программу, где бы пользователю предлагалось ввести число на выбор: 1, 2 или 3,
//а программа должна сказать, какое число ввёл пользователь: 1, 2, или 3

package homeworks.homework_09.task_01;

public class NumberChoiceIfElse {
    public static void main(String[] args) {
        ScannerUserInput ui = new ScannerUserInput();
        int a = ui.inputInteger("Please enter a whole number between 1 and 3: ");

        if (a==1){
            System.out.println("You entered 1.");
        } else if (a==2){
            System.out.println("You entered 2.");
        } else if (a==3){
            System.out.println("You entered 3.");
        } else {
            System.out.println("You entered a whole number, but not between 1 and 3.");
        }
    }

}
