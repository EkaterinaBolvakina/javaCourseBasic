package lessons.lesson_12;

import homeworks.homework_08.ScannerUserInput;

public class PracticeTask1 {
    public static void main(String[] args) {

        ScannerUserInput ui = new ScannerUserInput();
        int temp1 = ui.inputInt("Please enter temperature of first flask: ");
        int temp2 = ui.inputInt("Please enter temperature of second flask: ");

        boolean check = true;
        if ((temp1> 100)&&(temp2<=100)){
        }else {
            check = false;
        }
        System.out.println("It works correct: " +check);
        System.out.println("It works NOT correct: "+ check);
    }
}
