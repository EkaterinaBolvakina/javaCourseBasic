package lessons.lesson_12;

import homeworks.homework_08.ScannerUserInput;

public class Lift {
    public static void main(String[] args) {
        ScannerUserInput ui = new ScannerUserInput();
        int up = 7;
        int down = 4;
        int totalNumberOfFloor = ui.inputInt("Enter number of floors in the house: ");

        int currentFloor = 0;
        int iterations = 0;
        while (currentFloor < totalNumberOfFloor){
            iterations = iterations + 1;
            currentFloor = currentFloor + up;
            if (currentFloor < totalNumberOfFloor){
                currentFloor = currentFloor - down;
            }
        }
        System.out.println(iterations);

    }
}
