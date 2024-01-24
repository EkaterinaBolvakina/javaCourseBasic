//## 5. Задание №5
//Реализовать программу, выводящую на экран результаты сложения,
//вычитания, умножения и деления двух чисел, введенных пользователем.
//Каждая из арифметических операций должна быть реализована как отдельный метод.
//Ввод пользователем данных реализуйте отдельным классом с соответствующим методом.

package homeworks.homework_06.task_05;

public class Program {
    public static void main(String[] args) {

          Input userInput = new Input();

          int number1 = userInput.inputFirstNumber();
          System.out.println("You entered the 1st number: " + number1);
          int number2 = userInput.inputSecondNumber();
          System.out.println("You entered the 2nd number: " + number2);

        System.out.println("Sum of your numbers: " + userInput.sum(number1, number2));
        System.out.println("Subtraction of your numbers: " + userInput.sub(number1, number2));
        System.out.println("Multiplication of your numbers: " + userInput.multiplication(number1, number2));
        System.out.println("Division of your numbers: " + userInput.div(number1, number2));

    }
}
