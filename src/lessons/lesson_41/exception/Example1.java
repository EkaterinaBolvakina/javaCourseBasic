package lessons.lesson_41.exception;

import homeworks.homework_08.ScannerUserInput;

public class Example1 {
    public static void main(String[] args) {
        ScannerUserInput ui = new ScannerUserInput();

        int x = ui.inputInt("Введите первое число");
        int y = ui.inputInt("Введите второе число");

        System.out.println("результат деления: " + divide(x, y));
        System.out.println("Программа завершила свою работу");

    }

    static double divide(int x, int y){
        return x / y;
    }
}
