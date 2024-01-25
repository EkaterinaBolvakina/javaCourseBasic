package lessons.lesson_08.studentsWithGroup;

import java.util.Scanner;

public class ScannerStudent {

    public String inputScannerText(String text) {

        Scanner scanner = new Scanner(System.in);
        System.out.println(text);
        String inputText = scanner.nextLine();
        // scanner.close();
        return inputText;
    }

    public int inputScannerInt(String text) {

        Scanner scanner = new Scanner(System.in);
        System.out.println(text);
        int inputScannerInt = scanner.nextInt();
        // scanner.close();
        return inputScannerInt;

    }
    public double inputScannerDouble(String text) {

        Scanner scanner = new Scanner(System.in);
        System.out.println(text);
        double inputScannerDouble = scanner.nextInt();
        // scanner.close();
        return inputScannerDouble;

    }


}
