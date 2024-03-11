package homeworks.homework_38.task_04;

public class Factorial {
    public static void main(String[] args) {

        FICalculate<Integer> calculateFactorial = (number) ->
        {
            int factorial = 1;
            for (int i = 1; i <= number; i++) {
                factorial = factorial * i;
            }
            return factorial;
        };

        System.out.println("Factorial of 5: "+calculateFactorial.calculate(5));
    }
}
