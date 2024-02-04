/*
№4
1. Создать массив типа String с размером 7.
2. Записать в него значения дней недели.
3. Вывести на консоль значение последнего элемента.
 */
package homeworks.homework_14.task_04;

import java.util.Arrays;

public class Task_04 {
    public static void main(String[] args) {

    String[] dayOfWeek = new String[7];
    dayOfWeek[0] = "Montag";
    dayOfWeek[1] = "Dienstag";
    dayOfWeek[2] = "Mittwoch";
    dayOfWeek[3] = "Donnerstag";
    dayOfWeek[4] = "Freitag";
    dayOfWeek[5] = "Samstag";
    dayOfWeek[6] = "Sonntag";

        System.out.println("массив: ");
        System.out.println(Arrays.toString(dayOfWeek));
        System.out.println("значение последнего элемента: ");
        System.out.println(dayOfWeek[6]);



    }
}
