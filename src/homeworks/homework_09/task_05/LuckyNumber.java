//**Task 5** *Повышенной сложности (опционально)
//
//- программа предлагает пользователю ввести четырехзначное число
//- Причем: мы можем получать от пользователя **ТОЛЬКО** строки. Данные в формате String
//- Если число не четырехзначное, должно вывестись на экран сообщение об ошибке и работа программы завершается
//- Проверить, является ли число "счастливым билетом". Т.е. совпадает ли сумма цифр первых двух цифр числа с суммой третьей и четвертой цифры
//
//Пример:
//- число 1450 -> (1+4) = 5; (5+0) = 5; 5 равно 5 - число счастливое
//- число 1654 -> (1+6) = 7; (5+4) = 9; 7 не равно 9 - число НЕ является счастливым

package homeworks.homework_09.task_05;

import homeworks.homework_09.task_01.ScannerUserInput;

public class LuckyNumber {
    public static void main(String[] args) {
        ScannerUserInput ui = new ScannerUserInput();
        String number = ui.inputText("Please enter four-digit number: ");

        int numberLength = number.length();
        if (numberLength != 4) {
            System.out.println("=== ERROR ===");
            System.out.println("You entered NO FOUR-DIGIT number!");
        } else {
            //Variant1:
            //int nullIndex = 0;
            //int firstIndex = 1;
            //String firstDigit = number.substring(nullIndex, firstIndex);
            //String secondDigit = number.substring(nullIndex + 1, firstIndex + 1);
            //String thirdDigit = number.substring(nullIndex + 2, firstIndex + 2);
            //String fourthDigit = number.substring(nullIndex + 3, firstIndex + 3);

            //Variant2: with CharAt()
            String firstDigit = String.valueOf(number.charAt(0));
            String secondDigit = String.valueOf(number.charAt(1));
            String thirdDigit = String.valueOf(number.charAt(2));
            String fourthDigit = String.valueOf(number.charAt(3));


            // How to convert String to Int? ==>> int nameInt = Integer.parseInt(String);
            int firstDigitInt = Integer.parseInt(firstDigit);
            int secondDigitInt = Integer.parseInt(secondDigit);
            int thirdDigitInt = Integer.parseInt(thirdDigit);
            int fourthDigitInt = Integer.parseInt(fourthDigit);

            int firstPartOfNumber = firstDigitInt + secondDigitInt;
            int secondPartOfNumber = thirdDigitInt + fourthDigitInt;

            if (firstPartOfNumber == secondPartOfNumber) {
                System.out.println("Number is LUCKY! :-) ");
            } else {
                System.out.println("Number is not LUCKY :-(");
            }
        }
    }
}
