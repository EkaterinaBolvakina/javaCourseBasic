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
    // Print für array muss man extra method schreiben:
    public void printArray() {
        for (T item : stack) {
            if (item instanceof int[]) {     //nur für array aus Integers, für Array aus Objekten muss Object[] stehen anstatt int[]
                System.out.println(Arrays.toString((int[]) item));
            } else {
                System.out.println(item);
            }
        }
    }


    public static void main(String[] args) {
        Stack<List<Double>> listStack = new Stack<>();
        List<Double> doubles = new ArrayList<>();
        doubles.add(12.45);
        doubles.add(56.98);
        listStack.push(doubles);
        System.out.println(listStack.getStack());
        listStack.printArray();

        Stack<int[]>  intArrayStack = new Stack<>();
        int[] intArray = {1,3,4,6,7};
        intArrayStack.push(intArray);

        int[] intArray2 = {1,56,78,6,7};
        intArrayStack.push(intArray2);

        // Print the arrays in the stack
        intArrayStack.printArray();
    }
}

