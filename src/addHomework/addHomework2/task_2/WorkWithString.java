package addHomework.addHomework2.task_2;

import homeworks.homework_08.ScannerUserInput;

public class WorkWithString {
    public static void main(String[] args) {
        String myName = "Ekaterina";
        System.out.println(myName);

        String userName = "Alex";
        System.out.println("Hi "+userName+"!");

        ScannerUserInput ui = new ScannerUserInput();
        String name = ui.inputText("What is your name?");
        System.out.println("Hello "+name);
    }
}
