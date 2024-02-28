package lessons.lesson_32.practice.task_03_Dequeue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Locale;

/*
3. Dequeue
написать метод который проверяет что строка текста является полиндром
и возвращает true или false
 */
public class Task_03 {
    public static void main(String[] args) {

        String text1 = "Ein Krokodil mag am Lido Kork nie!";
        String text2 = "Ich liebe Dich. Du liebst mich nicht";

        System.out.println("'"+text1+"'"+" is palindrome: "+ isPalindrome(text1));
        System.out.println("'"+text2+"'"+" is palindrome: "+ isPalindrome(text2));
    }

    public static boolean isPalindrome(String textInput){

        String modifiedText = textInput.toLowerCase();
        modifiedText = modifiedText.replace(" ","");
        modifiedText = modifiedText.replace("!","");
        modifiedText = modifiedText.replace(".","");
        modifiedText = modifiedText.replace(":","");
        modifiedText = modifiedText.replace("'","");
        modifiedText = modifiedText.replace("?","");
        modifiedText = modifiedText.replace(")","");
        modifiedText = modifiedText.replace("(","");

        Deque<Character> deque = new ArrayDeque<>();

        for (char ch : modifiedText.toCharArray()) {
            deque.offerLast(ch);
        }

        while (deque.size() > 1) {
            if (!deque.pollFirst().equals(deque.pollLast())) {
                return false;
            }
        }
        return true;
    }
}
