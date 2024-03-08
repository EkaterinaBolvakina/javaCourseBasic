package homeworks.homework_36.collections.middle.task_05;

import java.util.LinkedList;
import java.util.List;

public class BookService {
    private List<Book> books = new LinkedList<>();

    public void addBook(String title, String author, Integer year) {
        books.add(new Book(title, author, year));
    }

    public void deleteBookUnderConditional(Integer year) {
        System.out.println("Books with year under "+year+ " deleted from the list:");
        boolean booksDeleted = false;
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getYear() < year){
                System.out.println(books.remove(i));
                booksDeleted = true;
                i--;
            }
        }
        if (!booksDeleted){
            System.out.println("No books with year under "+year+ " was found in the list");
        }
    }
}
