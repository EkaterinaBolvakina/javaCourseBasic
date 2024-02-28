package lessons.lesson_32.practice.task01_Stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/*
1. Stack
1. используя задачу на проверку правильности последовательности скобок
добавить логику проверки если используются скобки (,),{,},[,]

(){}[]
({})
{[]([])}

// 2. перепишите логику кода таким образом, чтобы в стек помещались не
    // открывающиеся скобки, а "ожидаемые" закрывающиеся
 */
public class Task_01 {
    public static void main(String[] args) {
        String[] stringsForTest = {
                "(){}[]",
                "({})",
                "{[]([])}",
                "}{[]"
        };

        for (String arrayElement : stringsForTest) {
            System.out.println(arrayElement + " is correct : " + isCorrectBracket(arrayElement));
        }
    }

    public static boolean isCorrectBracket(String stringLine) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < stringLine.length(); i++) {
            char ch = stringLine.charAt(i);
            // если элемент - открывающаяся скобка
            if ((ch == '(')||(ch == '{')||(ch == '[')) {
                // Помещаем в стек открывающие скобки:
                stack.push(ch);
            } else {
                // если наш стек - пуст, то значит что нет первоначальной открывающейся скобки
                // OR: Если стек пуст при встрече закрывающей скобки, последовательность неверна
                if (stack.empty()) {
                    return false;
                }
                // Проверяем, соответствует ли верхний элемент стека текущей закрывающей скобке
                char top = stack.pop();   // Получаем и удаляем верхний элемент стека

                if (((ch == ')') &&(top != '('))||
                        ((ch == '}') &&(top != '{'))||
                        ((ch == ']') &&(top != '['))) {
                    return false;  // Если не соответствует, последовательность неверна
                }
            }
        }
        // Если стек пуст после обработки всех символов, последовательность верна
        return stack.empty();
    }
    // перепишите логику кода таким образом, чтобы в стек помещались не
    // открывающиеся скобки, а "ожидаемые" закрывающиеся

    public static boolean isCorrectBracketType2(String stringLine) {

        Map<Character, Character> map = new HashMap<>();
        map.put('(', ')');
        map.put('{', '}');
        map.put('[', ']');

        Stack<Character> stack = new Stack<>();
        for (char ch : stringLine.toCharArray()) {

            if (map.containsKey(ch)) {
                stack.push(map.get(ch));
            } else {
                if (stack.empty() || stack.pop() != ch) {
                    return false;
                }
            }
        }
        // Если стек пуст после обработки всех символов, последовательность верна
        return stack.empty();
    }

}


