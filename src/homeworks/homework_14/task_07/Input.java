package homeworks.homework_14.task_07;

import homeworks.homework_08.ScannerUserInput;

public class Input {

    public int inputArraySize(){
        ScannerUserInput ui = new ScannerUserInput();
        int inputArraySize = ui.inputInt("Please enter a length of array: ");
        return inputArraySize;
    }

}
