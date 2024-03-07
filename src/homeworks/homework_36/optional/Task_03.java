package homeworks.homework_36.optional;

import java.util.ArrayList;
import java.util.Optional;

import java.util.List;

/*
3)  Напишите метод, который получает список целых чисел и
    возвращает сумму всех чисел в списке, используя Optional.
 */
public class Task_03 {
    public Optional<Integer> sumNummerVar1(List<Integer> integers) {
        if (integers.size() > 0) {
            int sum = 0;
            for (int i = 0; i < integers.size(); i++) {
                sum = integers.get(i) + sum;
            }
            return Optional.of(sum);
        }else {
            return Optional.empty();
        }
    }
    public Integer sumNummerVar2(Optional<List<Integer>> integers) {
        if (integers.isPresent()) {
            int sum = 0;
            for (int i = 0; i < integers.get().size(); i++) {
                sum = integers.get().get(i) + sum;
            }
            return sum;
        }else {
            return null;
        }
    }

    public static void main(String[] args) {
        Task_03 demo = new Task_03();
        List<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(1);
        integers.add(1);
        integers.add(1);
        integers.add(1);
        System.out.println("Variant1: Sum of all numbers from list: "+ demo.sumNummerVar1(integers));

        List<Integer> integersNull = new ArrayList<>();
        System.out.println("Variant1: Sum of all numbers from empty list: "+ demo.sumNummerVar1(integersNull));

        Optional<List<Integer>> optionalIntegers = Optional.of(integers);
        System.out.println("Variant2: Sum of all numbers from list: "+ demo.sumNummerVar2(optionalIntegers));

        Optional<List<Integer>> optionalIntegersNull = Optional.of(integersNull);
        System.out.println("Variant2: Sum of all numbers from empty list: "+ demo.sumNummerVar2(optionalIntegersNull));

    }
}
