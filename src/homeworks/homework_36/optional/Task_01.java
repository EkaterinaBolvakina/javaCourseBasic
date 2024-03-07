package homeworks.homework_36.optional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/*
1)  Напишите метод, который получает список строк и возвращает
    первую строку в списке, если она существует,
    или пустую строку в противном случае, используя Optional.

 */
public class Task_01 {
    public Optional<String> getFirstString(List<String> strings) {
        if (strings.size() > 0) {
            return Optional.of(strings.get(0));
        } else {
            return Optional.empty();
        }
    }

    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        Task_01 demo = new Task_01();
        System.out.println("First string: "+demo.getFirstString(strings).orElse("List is empty"));
        strings.add("Second");
        strings.add("First");
        System.out.println("First string after add: "+demo.getFirstString(strings).orElse("List is empty"));
    }
}
