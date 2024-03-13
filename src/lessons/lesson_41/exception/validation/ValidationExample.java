package lessons.lesson_41.exception.validation;

import homeworks.homework_08.ScannerUserInput;

public class ValidationExample {
    public static void main(String[] args) {
        ScannerUserInput ui = new ScannerUserInput();

        String userName = ui.inputText("Введите ваше имя: ");

        System.out.println(checkUserName(userName));

    }

    static boolean checkUserName(String name){
        if (name.length() < 3) return false;
        if (name.length() > 15) return false;
        if (name.contains("&")) return false;

        return true;

    }
}
