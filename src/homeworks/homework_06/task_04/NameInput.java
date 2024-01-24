//## 4. Задание №4
//Тема: создание переменной типа String.
//Напишите программу в которой создайте переменную
//типа String и присвойте ей в качестве начального значения
//ваше имя. Выведете на консоль значение этой переменной.
//
//Тема: Конкатенация строк.
//Напишите программу в которой создайте переменную
//типа String и присвойте ей в качестве начального значения
//ваше имя. Выведете на консоль приветствие типа "Hi YourName".
//
//Тема: Считывание строк с консоли.
//Программа должна спрашивать как зовут пользователя,
//считывать его имя с консоли и выводить приветствие
//в виде: "Hello UserName!".
package homeworks.homework_06.task_04;

import java.util.Scanner;

public class NameInput {
    public static void main(String[] args) {
        //Тема: создание переменной типа String.
        String nameInput1 = "Ekaterina";
        System.out.println(nameInput1);

        //Тема: Конкатенация строк.
        String nameInput2 = "Ekaterina";
        System.out.println("Hi "+nameInput2);

        //Тема: Считывание строк с консоли.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your Name: ");
        String name = scanner.nextLine();
        System.out.println("Hello, "+name+"!");

        scanner.close();

    }


}
