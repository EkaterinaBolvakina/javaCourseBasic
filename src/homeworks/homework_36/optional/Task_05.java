package homeworks.homework_36.optional;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

/*
5)  Напишите метод, который получает список строк и возвращает
    первую строку в списке, если она существует, или бросает
    исключение NoSuchElementException, используя Optional.
 */
public class Task_05 {
    public Optional<String> getFirstString(List<String> strings) {
        if (!strings.isEmpty()) {
            return Optional.of(strings.getFirst());
        } else {
            return Optional.of("NoSuchElementException");
        }
    }

    public static void main(String[] args) {
        Task_05 demo = new Task_05();
        List<String> list = new LinkedList<>();
        System.out.println("No elements in collection: "+ demo.getFirstString(list));

        list.add("One");
        list.add("Two");
        System.out.println("After add elements in collection, First element is: "+ demo.getFirstString(list));
    }
}
