package lessons.lesson_41.exception;

import homeworks.homework_08.ScannerUserInput;


public class Example1WithTryCatch {
    public static void main(String[] args) {
        ScannerUserInput ui = new ScannerUserInput();

        int x = ui.inputInt("Введите первое число");
        int y = ui.inputInt("Введите второе число");


        try {
            System.out.println("результат деления: " + divide(x, y));
        } catch (Exception exception){
            System.out.println("произошла ошибка " + exception.getMessage());
        }


        System.out.println("Программа завершила свою работу");

    }

    static double divide(int x, int y){
        return x / y;
    }
}
