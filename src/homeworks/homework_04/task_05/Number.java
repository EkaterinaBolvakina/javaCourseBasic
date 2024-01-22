//Задача 5. Какие числа могут получаться в качестве остатка от деления какого-либо целого числа на 2? На 3?
// Покажите это на конкретных примерах.
package homeworks.homework_04.task_05;

public class Number {
    int num;
    int num1;

    public Number (int num, int num1){
        this.num = num;
        this.num1 = num1;
    }
    public void example (){
        int remainder = num % num1;
        System.out.println("Remainder when dividing a number "+num+" by number "+num1+" = "+remainder);
    }

}
