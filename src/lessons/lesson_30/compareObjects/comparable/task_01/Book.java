package lessons.lesson_30.compareObjects.comparable.task_01;

public class Book implements Comparable<Book>{
    private Integer bookId;
    private String bookName;

    public Book(Integer bookId, String bookName) {
        this.bookId = bookId;
        this.bookName = bookName;
    }

    public Integer getBookId() {
        return bookId;
    }

    public String getBookName() {
        return bookName;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", bookName='" + bookName + '\'' +
                '}';
    }

    @Override
    public int compareTo(Book bookToCompare) {
        int result = bookToCompare.bookId -bookId;
        if (result == 0){
            result = bookName.compareTo(bookToCompare.getBookName());
        }
        return result;
    }
}
