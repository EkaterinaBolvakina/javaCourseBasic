package homeworks.homework_14.task_08;

import homeworks.homework_08.ScannerUserInput;

public class InputUser {

    public String inputLine(){
        ScannerUserInput ui = new ScannerUserInput();
        String userInputLine = ui.inputText("Please enter a line: ");
        return userInputLine;
    }

}
