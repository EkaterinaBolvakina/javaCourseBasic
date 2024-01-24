//## 1. Задание №1
//1 Создайте строку через new - I study Basic Java!
//2 Напишите метод, который принимает в качестве параметра строку, передайте в этот метод строку, которую создали в п.1
//3 Распечатать последний символ строки. Используем метод String.charAt().
//4 Проверить, содержит ли ваша строка подстроку “Java”. Используем метод String.contains().
//5 Заменить все символы “а” на “о”.
//6 Преобразуйте строку к верхнему регистру.
//7 Преобразуйте строку к нижнему регистру.
//8 Вырезать строку Java c помощью метода String.substring().

package homeworks.homework_06.task_01;

public class LineDemo {
    public static void main(String[] args) {
        //1 Создайте строку через new - I study Basic Java!
        Line line1 = new Line();
        line1.message = "I study Basic Java!";
        System.out.println(line1.message);

       //2 ..., передайте в этот метод строку, которую создали в п.1
        line1.setMessage(line1.message);
        line1.print();

        //3 Распечатать последний символ строки. Используем метод String.charAt().
        line1.lineLastSymbol();

        //4 Проверить, содержит ли ваша строка подстроку “Java”. Используем метод String.contains().
        line1.containsUnderLine();

        //5 Заменить все символы “а” на “о”.
        line1.replaceSymbols();

        //6 Преобразуйте строку к верхнему регистру.
        line1.lineToUpperCase();

        //7 Преобразуйте строку к нижнему регистру.
        line1.lineToLowerCase();

        //8 Вырезать строку Java c помощью метода String.substring().
        line1.lineSubstring();
    }
}

