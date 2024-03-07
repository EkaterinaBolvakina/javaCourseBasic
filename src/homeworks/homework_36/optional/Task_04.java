package homeworks.homework_36.optional;

import java.util.Optional;

/*
4)  Напишите метод, который получает значение типа String и
    возвращает его длину, если оно не равно null, используя Optional.
 */
public class Task_04 {

    public Integer calcLengthOfString(Optional<String> stringOptional) {
        if (stringOptional.isPresent()) {
            return stringOptional.get().length();
        }else {
            return null;
        }
    }

    public static void main(String[] args) {
        Task_04 demo = new Task_04();
        String string = "Banana republic";
        Optional<String> stringOptional = Optional.of(string);
        System.out.println("Length of string: '"+string+"' is "+demo.calcLengthOfString(stringOptional));

        String stringNull = null;
        Optional<String> stringOptionalNull = Optional.ofNullable(stringNull);
        System.out.println("Length of string: '"+stringNull+"' is "+demo.calcLengthOfString(stringOptionalNull));
    }
}
