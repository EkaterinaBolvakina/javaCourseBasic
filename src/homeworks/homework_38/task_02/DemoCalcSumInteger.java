package homeworks.homework_38.task_02;
// 2. Write a functional interface to calculate the sum of two integers.
public class DemoCalcSumInteger {
    public static void main(String[] args) {

    CalcSumFI<Integer> integerCalcSumFI = ((num1, num2) ->
    {int sum = (num1 + num2);
        return sum;}
    );

    Integer integer1 = 10;
    Integer integer2 = 2;

    Integer sum = integerCalcSumFI.calculateSum(integer1,integer2);

    System.out.println("Sum of integers "+integer1+" and "+integer2+" is: "+sum);

    }
}
