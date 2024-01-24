//## 2. Задание №2
//Введите 2 слова, используйте сканер.
//Получить слово, состоящее из первой половины первого слова и второй половины второго слова.
//Если количество букв в слове - нечетное, то среднюю букву в слове не учитывать.????
//Распечатать на консоль.
package homeworks.homework_06.task_02;

import java.util.Scanner;

public class ScannerInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the first word: ");
        String inputWord1 = scanner.nextLine();
        System.out.println("Please enter the second word: ");
        String inputWord2 = scanner.nextLine();
        scanner.close();

        String firstHalfOfWord1 = inputWord1.substring(0,inputWord1.length()/2);
        String SecondHalfOfWord2 = inputWord2.substring((int) Math.ceil(inputWord2.length()/2.0));
        System.out.println(firstHalfOfWord1+SecondHalfOfWord2);



    }

    }

