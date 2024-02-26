package homeworks.homework_cons_11.variant_02.entity;

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

    public void addBookByReader(Book bookToAdd){
       booksByReader.add(bookToAdd);

    }
    public void removeBookByReader(Reader reader,Book bookToRemove){
        if (reader.getBooksByReader().contains(bookToRemove)){
            booksByReader.remove(bookToRemove);
            System.out.println("--------------------------------------");
            System.out.println("Book ID:"+bookToRemove.getBookID()+ " removed by: "+reader.readerName);
            System.out.println("--------------------------------------");
        }else{
            System.out.println("--------------------------------------");
            System.out.println(reader.readerName+" has not book ID:"+bookToRemove.getBookID());
            System.out.println("it can not be removed");
            System.out.println("--------------------------------------");
        }
    }
}
