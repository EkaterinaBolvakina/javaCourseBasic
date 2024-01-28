package homeworks.homework_08;

import java.util.Scanner;

public class ScannerUserInput {

    public String inputText(String text){
        Scanner scanner = new Scanner(System.in);
        System.out.println(text);
        String inputText = scanner.nextLine();
        return inputText;
    }
    public int inputInt(String text){
        Scanner scanner = new Scanner(System.in);
        System.out.println(text);
        int inputInt = scanner.nextInt();
        return inputInt;
    }
    public double inputDouble(String text){
        Scanner scanner = new Scanner(System.in);
        System.out.println(text);
        Double inputDouble = scanner.nextDouble();
        return inputDouble;
    }
    public boolean inputBoolean(String text){
        Scanner scanner = new Scanner(System.in);
        System.out.println(text);
        Boolean inputBoolean = scanner.nextBoolean();
        return inputBoolean;
    }
}
