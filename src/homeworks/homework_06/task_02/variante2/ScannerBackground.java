package homeworks.homework_06.task_02.variante2;

import java.util.Scanner;

public class ScannerBackground {

    public String inputTextFromKeyboard(String message){
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        String inputTextFromKeyboard = scanner.nextLine();
       // scanner.close();
        return inputTextFromKeyboard;

    }



}
