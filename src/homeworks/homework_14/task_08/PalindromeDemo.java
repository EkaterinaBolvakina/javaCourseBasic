/*№8 **
        Дана строка.
        Написать метод, который определяет, является ли данная строка палиндромом
        (читается одинаково в обоих направлениях)

 */
package homeworks.homework_14.task_08;

import homeworks.homework_08.ScannerUserInput;

public class PalindromeDemo {
    public static void main(String[] args) {

        InputUser inputLine = new InputUser();
        MethodPalindrome checkLine = new MethodPalindrome();
        checkLine.setCheck(checkLine.isPalindrome(inputLine.inputLine()));

        /* Variant 2:
        InputUser inputLine = new InputUser();
        String line = inputLine.inputLine();

        MethodPalindrome checkLine = new MethodPalindrome();
        boolean isPalindrome = checkLine.isPalindrome(line);
        checkLine.setCheck(isPalindrome);
        */
    }
}
