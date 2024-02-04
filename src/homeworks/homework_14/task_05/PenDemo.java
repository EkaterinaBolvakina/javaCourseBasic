/*
№5
1. Создайте класс ручка (Pen)
   a. Определите свойство color типа String с доступом private
   b. Создайте методы getColor(); setColor(String newColor);
2. Создайте класс PenDemo (метод main)
3. Создайте три объекта типа Pen
4. Создайте массив L = 3
5. Сохраните все объекты в массив
6. Достаньте поочередно из массива ручки и измените цвет каждой на
   a. “Green”
   b. “Red”
   c. “Black”
7. Распечатайте цвета ручек из массива
 */
package homeworks.homework_14.task_05;

import java.util.Arrays;

public class PenDemo {
    public static void main(String[] args) {
        Pen pen1 = new Pen();
        Pen pen2 = new Pen();
        Pen pen3 = new Pen();

        Pen[] pens = {pen1,pen2,pen3};

        pen1.setColour("Green");
        pen2.setColour("Red");
        pen3.setColour("Black");

        for (int i = 0; i < pens.length; i++) {
            System.out.println("Pen nr.: "+(i+1));
            System.out.println("Colour: "+ pens[i].getColour());
        }
    }
}
