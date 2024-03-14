package homeworks.homework_40.streamAPI.task_10;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
/*
10) Given a list of Book objects containing information about books, including title, author and list of tags.
    You need to get a list of all unique tags
 */
public class BookApp {
    public static void main(String[] args) {

        List<Book> books = new ArrayList<>();
        List<String> tags1 = new ArrayList<>();
        tags1.add("dog");
        tags1.add("pet");
        tags1.add("voltaireDogs");
        tags1.add("family");
        tags1.add("adultBooks");
        tags1.add("history");
        tags1.add("lovelyPets");

        List<String> tags2 = new ArrayList<>();
        tags2.add("history");
        tags2.add("pet");
        tags2.add("AmericaPets");
        tags2.add("lovelyPets");

        List<String> tags3 = new ArrayList<>();
        tags3.add("history");
        tags3.add("pet");
        tags3.add("childrenBooks");
        tags3.add("adultBooks");
        tags3.add("AliceWonderland");

        books.add(new Book("Dogs: Man’s Best Friend","Voltaire",tags1));
        books.add(new Book("The History of Pets in America","Katherine C. Grier",tags2));
        books.add(new Book("Alice’s Adventures in Wonderland","Lewis Carroll",tags3));

        Set<String> uniqueTags = books.stream()
                .flatMap(book -> book.getTags().stream().distinct())
                        .collect(Collectors.toSet());

        System.out.println("List of all unique tags: " +uniqueTags);

    }
}
