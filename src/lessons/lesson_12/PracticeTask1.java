/*
    Представим, что у нас есть устройство, в котором две колбы.
    Прибор работает корректно, если температура первой колбы выше 100 градусов,
    а температура второй колбы меньше 100 градусов.

a.	Вы должны написать метод, который проверяет это устройство.
b.	Ваша программа должна иметь переменные temperature1 и temperature2.
c.	В результате метод возвращает true или false.


     */
package lessons.lesson_12;

import homeworks.homework_08.ScannerUserInput;

public class PracticeTask1 {
    public static void main(String[] args) {

        ScannerUserInput ui = new ScannerUserInput();
        int temp1 = ui.inputInt("Please enter temperature of first flask: ");
        int temp2 = ui.inputInt("Please enter temperature of second flask: ");

        boolean check = true;
        if ((temp1> 100)&&(temp2<=100)){
        }else {
            check = false;
        }
        System.out.println("It works correct: " +check);
        System.out.println("It works NOT correct: "+ check);
    }
}
