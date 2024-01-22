package lessons.lesson_05.methodsWithReturnTypeData;

public class CalculatorsDemo {
    public static void main(String[] args) {

        //Using Method WITH RETURN of variable:
        CalculatorWithReturnResult calculatorWithReturnResult = new CalculatorWithReturnResult();
        int a = 10;
        int b = 12;

        int resultFromMethodSum = calculatorWithReturnResult.sum(a,b);
        System.out.println("Result of sum a = " + a + " and b = " + b +" is: " + resultFromMethodSum);

        System.out.println("Result of subtraction a = " + a + " and b = " + b +" is: " + calculatorWithReturnResult.subtraction(a,b));

        System.out.println("Result of multiplication a = " + a + " and b = " + b +" is: " + calculatorWithReturnResult.multiplication(a,b));

        System.out.println("Result of division a = " + a + " and b = " + b +" is: " + calculatorWithReturnResult.division(a,b));

        System.out.println();

        //Using Method WITHOUT RETURN of variable, method VOID:
        System.out.println("Using Method WITHOUT RETURN of variable, method VOID:");
        CalculatorVoid calculatorVoid = new CalculatorVoid();
        calculatorVoid.sum(5,4);
        calculatorVoid.sub(5,4);
        calculatorVoid.mult(5,4);
        calculatorVoid.div(5,4);
    }
}
