/*
    Представим, что у нас есть лифт.

    У него есть два параметра: на сколько этажей он поднимается и
    на сколько этажей он спускается.
    То есть up = 7, down = 4 - это означает что за один цикл подъема
    с 0 этажа он поднимется на 7 и тут же спустится на 4, то есть будет на 4 этаже

    Задача: если известна высота здание (сколько этажей),
    то за сколько итераций лифт поднимется на крышу?


     */
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
