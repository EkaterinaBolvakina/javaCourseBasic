package lessons.lesson_32.practice.task01_Stack;

import java.util.Stack;
// перепишите логику кода таким образом, чтобы в стек помещались не
// открывающиеся скобки, а "ожидаемые" закрывающиеся
public class Task_01_var2 {
    public static void main(String[] args) {
        String[] stringsForTest = {
                "()",
                "[]{({})",
                "([()[](){()}])",
                ")[]()",
                "({([])})"
        };

        for (String arrayElement : stringsForTest) {
            System.out.println(arrayElement + " is correct : " + isCorrectBracket(arrayElement));
        }
    }
    public static boolean isCorrectBracket(String stringLine) {
        Stack<Character> stack = new Stack<>();
        for (char ch : stringLine.toCharArray()) {
            // Помещаем в стек "ожидаемые" закрывающиеся скобки

            if (ch == '(') stack.push(')');
            else if (ch == '{') stack.push('}');
            else if (ch == '[') stack.push(']');
            else if (stack.isEmpty() || stack.pop() != ch) return false;
            }

        // Если стек пуст после обработки всех символов, последовательность верна
        return stack.empty();
    }
}

