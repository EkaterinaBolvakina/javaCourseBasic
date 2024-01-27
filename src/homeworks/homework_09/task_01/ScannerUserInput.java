package homeworks.homework_09.task_01;

import java.util.Scanner;

public class ScannerUserInput {

    public String inputText(String text){
        Scanner userInput = new Scanner(System.in);
        System.out.println(text);
        String inputText = userInput.nextLine();
        return inputText;
    }

    public int inputInteger(String text){
        Scanner userInput = new Scanner(System.in);
        System.out.println(text);
        int inputInteger = userInput.nextInt();
        return inputInteger;
    }

    public double inputDouble(String text){
        Scanner userInput = new Scanner(System.in);
        System.out.println(text);
        double inputDouble = userInput.nextDouble();
        return inputDouble;
    }


}
