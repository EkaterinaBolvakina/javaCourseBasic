package lessons.lesson_05.methodsWithReturnTypeData;

public class CalculatorVoid {
    int result;

    public void sum(int a, int b){
        result = a + b;
        System.out.println("Sum result of a = "+a+" and b = "+b+" is "+result);
    }
    public void sub(int a, int b){
        result = a - b;
        System.out.println("Subtraction result of a = "+a+" and b = "+b+" is "+result);
    }
    public void mult(int a, int b){
        result = a * b;
        System.out.println("Multiplication result of a = "+a+" and b = "+b+" is "+result);
    }
    public void div(int a, int b){
        result = a / b;
        System.out.println("Division result of a = "+a+" and b = "+b+" is "+result);
    }
}
