package homeworks.homework_36.generics;
/*
5)  Создайте класс Stack, реализующий стек на основе массива или списка.
    Используйте Generics для обеспечения типобезопасности и возможности
    передачи в стек объектов разных типов.
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Stack <T> {
    private List<T> stack;

    public Stack() {
        this.stack = new ArrayList<>();
    }
    public void push(T item) {
        stack.add(item);
    }

    public List<T> getStack() {
        return stack;
    }


    public static void main(String[] args) {
        Stack<List<Double>> listStack = new Stack<>();
        List<Double> doubles = new ArrayList<>();
        doubles.add(12.45);
        doubles.add(56.98);
        listStack.push(doubles);
        System.out.println(listStack.getStack());

        Stack<int[]>  intArrayStack = new Stack<>();
        int[] intArray = {1,3,4,6,7};
        intArrayStack.push(intArray);

    }
}

