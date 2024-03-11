package homeworks.homework_38.task_01;
// 1. Write a functional interface to convert a string to upper case.
public class StringToUpperCaseDemo {
    public static void main(String[] args) {

        StringFI<String> convert = (s -> { return s.toUpperCase();} );

        String string1 = "banaNa";
        String string1ToUpperCaseConverted = convert.convertStringToUpperCase(string1);
        System.out.println(string1ToUpperCaseConverted);
    }
}
