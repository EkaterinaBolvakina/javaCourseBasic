package homeworks.homework_36.collections.easy;

import java.util.Stack;

/*
7) Create a Stack, add several elements to it.
Check if there is a given element in the collection.
If there is, find its depth and display it on the screen.
 */
public class Stack_Task_07 {
    public static void main(String[] args) {

        Stack<String> stringStack = new Stack<>();
        addElement(stringStack,"Cheese");
        addElement(stringStack,"Banana");
        addElement(stringStack,"Banana");
        addElement(stringStack,"Bacon");
        addElement(stringStack,"Cherry");

        System.out.println("Stack elements: "+ stringStack);

        checkAddElement(stringStack,"Banana");
        checkAddElement(stringStack,"Milk");
    }
    public static void addElement(Stack<String> stringStack, String string) {
        stringStack.push(string);
    }
    public static void checkAddElement(Stack<String> stringStack, String string) {
        if (stringStack.contains(string)) {
           int depth = stringStack.search(string); // Returns the first-based position of the element (LiFo)
            System.out.println("Element '"+ string +"' found at depth: "+ depth);
        }else {
            System.out.println("Element '"+ string +"' NOT found in the stack");
        }
    }
}
