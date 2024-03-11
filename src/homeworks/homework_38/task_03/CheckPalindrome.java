package homeworks.homework_38.task_03;
//3. Write a functional interface to check if a string is a palindrome.
public class CheckPalindrome {
    public static void main(String[] args) {
        FICheck<Boolean,String> checkPalindrom = (text) ->
        { String cleanText = text.replaceAll("[^a-zA-Z]", "").toLowerCase();

            int left = 0;
            int right = cleanText.length() - 1;

            while (left < right) {
                if (cleanText.charAt(left) != cleanText.charAt(right)) {
                    return false;
                }
                left++;
                right--;
            }
            return true;
        };

        Boolean isPalindrome1 = checkPalindrom.check("A man, a plan, a canal, Panama");
        Boolean isPalindrome2 = checkPalindrom.check("Taxi is coming!");

        System.out.println("Is Text ('A man, a plan, a canal, Panama') a palindrome? "+isPalindrome1);
        System.out.println("Is Text ('Taxi is coming!') a palindrome? "+isPalindrome2);
    }
}
