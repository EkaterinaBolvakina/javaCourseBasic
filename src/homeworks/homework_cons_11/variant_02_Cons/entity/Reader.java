package homeworks.homework_cons_11.variant_02_Cons.entity;

import java.util.ArrayList;
import java.util.List;

public class Reader {
    private Integer readerId;
    private String readerName;
    private List<Book> booksByReader;

    public Reader(Integer readerId, String readerName) {
        this.readerId = readerId;
        this.readerName = readerName;
        this.booksByReader = new ArrayList<>();
    }

    public Integer getReaderId() {
        return readerId;
    }

    public String getReaderName() {
        return readerName;
    }

    public List<Book> getBooksByReader() {
        return booksByReader;
    }

    @Override
    public String toString() {
        return "Reader{" +
                "readerId=" + readerId +
                ", readerName='" + readerName + '\'' +
                ", booksByReader=" + booksByReader +
                '}';
    }

}
