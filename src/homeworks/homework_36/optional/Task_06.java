package homeworks.homework_36.optional;

import java.util.Optional;

/*
6)  Напишите метод, который получает значение типа Integer и
    возвращает его удвоенное значение, если оно не равно null,
    или бросает исключение IllegalArgumentException, используя Optional.
 */
public class Task_06 {

    public Integer calcDoubleInt(Integer integer){
        if (integer != null) {
            return (integer * 2);
        }else {
            throw new IllegalArgumentException("Input value is null");
        }
    }

    public static void main(String[] args) {
        Task_06 demo = new Task_06();

        int num1 = 13;
        System.out.println("Result: "+demo.calcDoubleInt(num1));

        Integer num2 = null;
        System.out.println("Result: "+demo.calcDoubleInt(num2));
    }
}
