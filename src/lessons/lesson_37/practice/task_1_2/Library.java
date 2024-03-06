package lessons.lesson_37.practice.task_1_2;

import java.util.*;

public class Library<T> {
    private Map<T, List<Book<T>>> bookByGenre = new HashMap<>();

    public void addBook(Book<T> book) {
        List<Book<T>> books = bookByGenre.getOrDefault(book.getGenre(),new ArrayList<>());
 //       if (books == null) {
 //           books = new ArrayList<>();
 //       }
        books.add(book);
        bookByGenre.put(book.getGenre(),books);
    }

    public List<Book<T>> getBooksByGenre(T genre) {
        return bookByGenre.getOrDefault(genre,new ArrayList<>());
    }

    public Optional<Book<T>> findBookByTitle(String title){
        for (List<Book<T>> books : bookByGenre.values()) {
            for (Book<T> book : books) {
                if (book.getTitle().equals(title)) {
                    return Optional.of(book);
                }
            }
        }
        return Optional.empty();
    }
}
