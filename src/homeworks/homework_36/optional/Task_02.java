package homeworks.homework_36.optional;

import homeworks.homework_36.generics.Optional;

/*
2)  Напишите метод, который получает значение типа Integer и
    возвращает его удвоенное значение, если оно не равно null,
    используя Optional.
 */
public class Task_02 {

    public Integer getDoubleInteger(Optional<Integer> integerOptional) {
        if (integerOptional.isPresent()) {
            return (integerOptional.get() * 2);
        } else {
            return null;
        }
    }

    public static void main(String[] args) {

        Task_02 demo = new Task_02();
        int num = 10;
        Optional<Integer> integer = new Optional<>(num);
        int result = demo.getDoubleInteger(integer);
        System.out.println("Result of: ("+num+" * 2)= "+result);

        Optional<Integer> integer2 = new Optional<>(null);
        System.out.println("Result of: ("+null+" * 2)= "+demo.getDoubleInteger(integer2));

    }

}
