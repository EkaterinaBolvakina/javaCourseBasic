//**Task 3** (Использовать оператор switch)
//
//Программа просит пользователя ввести число от 1 до 7
//Если число равно 1, выводим на консоль “Понедельник”, 2 –”Вторник” и так далее. Если 6 или 7 – “Выходной”.
package homeworks.homework_09.task_03;

import homeworks.homework_09.task_01.ScannerUserInput;

public class DaysSwitch {
    public static void main(String[] args) {
        ScannerUserInput ui = new ScannerUserInput();
        int number = ui.inputInteger("Please enter a number between 1 and 7: ");

        switch (number){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
            case 7:
                System.out.println("Weekend");
                break;
            default:
                System.out.println("You entered a false number");
        }

    }

}
