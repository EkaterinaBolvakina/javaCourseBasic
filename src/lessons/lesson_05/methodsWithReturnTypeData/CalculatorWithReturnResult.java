package lessons.lesson_05.methodsWithReturnTypeData;

public class CalculatorWithReturnResult {

    public int sum(int a, int b){
        int result = a + b;
        return result;
    }

    public int subtraction(int a, int b){
        int result = a - b;
    return result;
}
    public int multiplication(int a, int b){
        int result = a * b;
        return result;
    }
    public double division(int a, int b){
        double result = (double) a / b;
        return result;
    }

}
