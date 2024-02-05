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

    int numberOfDays = 7;
    int ind = 0;
    String[] dayOfWeek = new String[numberOfDays];
        for (int i = 0; i < dayOfWeek.length; i++) {
            if (i == ind++){ dayOfWeek[i] = "Montag";}
            else if (i == ind++){ dayOfWeek[i] = "Dienstag";}
            else if (i == ind++){ dayOfWeek[i] = "Mittwoch";}
            else if (i == ind++){ dayOfWeek[i] = "Donnerstag";}
            else if (i == ind++){ dayOfWeek[i] = "Freitag";}
            else if (i == ind++){ dayOfWeek[i] = "Samstag";}
            dayOfWeek[i] = "Sonntag";
            }

        System.out.println("массив: ");
        System.out.println(Arrays.toString(dayOfWeek));

        for (int i = dayOfWeek.length-1; i < dayOfWeek.length; i++) {
            System.out.println("значение последнего элемента: ");
            System.out.println(dayOfWeek[i]);
        }




    }
}
