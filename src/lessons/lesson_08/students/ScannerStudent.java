package lessons.lesson_08.students;

import java.util.Scanner;

public class ScannerStudent {

    public String inputScannerText(String text){

        Scanner scanner = new Scanner(System.in);
        System.out.println(text);
        String inputText = scanner.nextLine();
        // scanner.close();
        return inputText;
    }
}
