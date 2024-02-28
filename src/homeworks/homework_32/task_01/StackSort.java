package homeworks.homework_32.task_01;

import java.util.Stack;

/*
# Задача "Сортировка стека"

Описание: Дан стек целых чисел, который нужно отсортировать так,
чтобы наименьшие элементы оказались на вершине.
Вы можете использовать дополнительный временный стек,
но вы не должны копировать элементы в другие структуры данных (например, массивы).
Стек поддерживает следующие операции: push, pop, peek и isEmpty.

Цель: Написать функцию, которая отсортирует стек в порядке возрастания
элементов сверху вниз.
 */
public class StackSort {
    public static void main(String[] args) {
        Stack<Integer> integerStack = new Stack<>();

        integerStack.push(2);
        integerStack.push(4);
        integerStack.push(2);
        integerStack.push(25);
        integerStack.push(1);
        integerStack.push(10);
        integerStack.push(5);

        System.out.println("Stack original: "+integerStack);
        sortStack(integerStack);
        System.out.println("Stack sorted: "+integerStack);

    }
    public static void sortStack(Stack<Integer> integerStack){
        Stack<Integer> tempStack = new Stack<>();
        while (!integerStack.empty()) {
            int temp = integerStack.pop();

            while (!tempStack.empty() && tempStack.peek() > temp) {
                integerStack.push(tempStack.pop());
            }
            tempStack.push(temp);
        }

        while (!tempStack.empty()) {
            integerStack.push(tempStack.pop());
        }
    }
}
