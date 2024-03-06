package lessons.lesson_37.practice.task_1_2;

import java.util.Objects;

public class Book <T> {
    private String title;
    private T genre;

    public Book(String title, T genre) {
        this.title = title;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public T getGenre() {
        return genre;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", genre=" + genre +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book<?> book = (Book<?>) o;
        return Objects.equals(title, book.title) && Objects.equals(genre, book.genre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, genre);
    }
}
