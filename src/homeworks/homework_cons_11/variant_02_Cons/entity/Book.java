package homeworks.homework_cons_11.variant_02_Cons.entity;

public class Book {
    private Integer bookID;
    private String isbn;
    private String bookTitel;
    private Author author;

    public Book(Integer bookID, String isbn, String bookTitel, Author author) {
        this.bookID = bookID;
        this.isbn = isbn;
        this.bookTitel = bookTitel;
        this.author = author;
    }

    public Integer getBookID() {
        return bookID;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getBookTitel() {
        return bookTitel;
    }

    public Author getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookID=" + bookID +
                ", isbn='" + isbn + '\'' +
                ", bookTitel='" + bookTitel + '\'' +
                ", author=" + author +
                '}';
    }
}
