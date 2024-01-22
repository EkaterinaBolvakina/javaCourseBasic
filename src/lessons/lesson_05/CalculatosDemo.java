package lessons.lesson_05;

public class CalculatosDemo {
    public static void main(String[] args) {
        CalculatorWithReturnResult calculatorWithReturnResult = new CalculatorWithReturnResult();
        int a = 10;
        int b = 12;
        int resultFromMethodSum = calculatorWithReturnResult.sum(a,b);
        System.out.println("Result of sum a = " + a + " and b = " + b +" is: " + resultFromMethodSum);
        int resultFromMethodSub = calculatorWithReturnResult.subtraction(a,b);
        System.out.println("Result of subtraction a = " + a + " and b = " + b +" is: " + resultFromMethodSub);
        int resultFromMethodMultiplication = calculatorWithReturnResult.multiplication(a,b);
        System.out.println("Result of multiplication a = " + a + " and b = " + b +" is: " + resultFromMethodMultiplication);
        int resultFromMethodDivision = calculatorWithReturnResult.division(a,b);
        System.out.println("Result of division a = " + a + " and b = " + b +" is: " + resultFromMethodDivision);
    }
}
