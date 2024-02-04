package homeworks.homework_14.task_08;

public class MethodPalindrome {

    boolean isPalindrome(String inputText) {
        int textLength = inputText.length();
        for (int i = 0; i < (textLength / 2); i++) {
            if (inputText.charAt(i) != inputText.charAt(textLength-i-1)) {
                return false;
            }
        }
        return true;
    }

    public void setCheck(boolean check) {
        if (check) {
            System.out.println("Line is palindrome");
        } else {
            System.out.println("Line is NOT palindrome");
        }
    }
}
