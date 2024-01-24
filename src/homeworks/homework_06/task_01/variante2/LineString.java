//## 1. Задание №1
//1 Создайте строку через new - I study Basic Java!
//2 Напишите метод, который принимает в качестве параметра строку, передайте в этот метод строку, которую создали в п.1
//3 Распечатать последний символ строки. Используем метод String.charAt().
//4 Проверить, содержит ли ваша строка подстроку “Java”. Используем метод String.contains().
//5 Заменить все символы “а” на “о”.
//6 Преобразуйте строку к верхнему регистру.
//7 Преобразуйте строку к нижнему регистру.
//8 Вырезать строку Java c помощью метода String.substring().
package homeworks.homework_06.task_01.variante2;

public class LineString {
    public static void main(String[] args) {
        //1 Создайте строку через new - I study Basic Java!
        String line = "I study Basic Java!";

        int lineLength = line.length();
        System.out.println(lineLength);

        //3 Распечатать последний символ строки. Используем метод String.charAt().
        char lastSymbol = line.charAt(lineLength -1);
        System.out.println(lastSymbol);

        //4 Проверить, содержит ли ваша строка подстроку “Java”. Используем метод String.contains().
        String innerLine = "Java";
        boolean innerLineCheck = line.contains(innerLine);
        System.out.println("содержит ли строка line подстроку “Java”? "+innerLineCheck);

        //5 Заменить все символы “а” на “о”.
        String changingAinO = line.replace('a','o');
        System.out.println("Заменить все символы “а” на “о”: "+changingAinO);

        //6 Преобразуйте строку к верхнему регистру.
        String lineAfterUpperCase = line.toUpperCase();
        System.out.println("Преобразуйте строку к верхнему регистру: "+lineAfterUpperCase);

        //7 Преобразуйте строку к нижнему регистру.
        String lineAfterLowerCase = line.toLowerCase();
        System.out.println("Преобразуйте строку к нижнему регистру: "+lineAfterLowerCase);

        //8 Вырезать строку Java c помощью метода String.substring().
        String substringJava = line.substring(14,18);
        System.out.println("Вырезать строку Java: "+substringJava);

    }
}
