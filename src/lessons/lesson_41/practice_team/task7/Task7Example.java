package lessons.lesson_41.practice_team.task7;


import java.util.Arrays;
import java.util.List;

public class Task7Example{
    /*
Студент записывает книги которые прочитал,
задача вывести все прочитанные книги у всех студентов
(в качестве дополнения, применить фильтр на тему: найти книги которые не содержат HTML)
 */

    public static void main(String[] args) {
        Student student1 = new Student("Alex");
        student1.addBook("Java 8 vs Java 21");
        student1.addBook("Spring Boot in Action");
        student1.addBook("Effective Java");

        Student student2 = new Student("Thomas");
        student2.addBook("HTML introducing");
        student2.addBook("Effective Java");

        List<Student> students = Arrays.asList(student1, student2);

        // Вывод всех прочитанных книг у всех студентов
        System.out.println("Прочитанные книги у всех студентов:");
        students.stream()
                .flatMap(student -> student.getBook().stream())
                .filter(book -> !book.contains("HTML"))
                .sorted()
                .forEach(System.out::println);

    }
}
