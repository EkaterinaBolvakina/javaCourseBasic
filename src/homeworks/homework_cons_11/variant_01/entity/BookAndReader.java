package homeworks.homework_cons_11.variant_01.entity;

public class BookAndReader {
    private Integer bookId;
    private Integer readerId;

    public BookAndReader(Integer bookId, Integer readerId) {
        this.bookId = bookId;
        this.readerId = readerId;
    }

    public Integer getBookId() {
        return bookId;
    }

    public Integer getReaderId() {
        return readerId;
    }
}
