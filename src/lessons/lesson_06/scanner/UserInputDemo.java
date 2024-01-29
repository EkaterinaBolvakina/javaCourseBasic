package lessons.lesson_06.scanner;

public class UserInputDemo {
    public static void main(String[] args) {
        scanner.UserInput ui = new scanner.UserInput();

        String text = ui.inputText("Введите текст: ");

        System.out.println("Вы ввели: " + text);
    }
}
