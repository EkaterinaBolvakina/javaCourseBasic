package homeworks.homework_cons_11.variant_02.service;

import homeworks.homework_cons_11.variant_02.entity.Book;
import homeworks.homework_cons_11.variant_02.entity.Reader;

import java.util.List;

public class LibraryManagement {
    private List<Book> books;
    private List<Reader> readers;

    public LibraryManagement(List<Book> books, List<Reader> readers) {
        this.books = books;
        this.readers = readers;
    }

    public List<Book> getBooks() {
        return books;
    }

    public List<Reader> getReaders() {
        return readers;
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void addReader(Reader reader) {
        readers.add(reader);
    }



    public void printBooksByReader(List<Reader> readers, Integer readerId){
       for (Reader reader : readers){
           if (reader.getReaderId().equals(readerId)){
               System.out.println("Reader ID:"+readerId);
              // System.out.println(reader.getBooksByReader());
               for (Book book : reader.getBooksByReader()){
                   System.out.println("_______________________________");
                   System.out.println("Book ID: "+book.getBookID());
                   System.out.println("Book ISBN: "+book.getIsbn());
                   System.out.println(book.getBookTitel());
                   System.out.println(book.getAuthor());
               }
           }
        }
    }
    public void printBooksByAllReader(List<Reader> readers){
        for (Reader reader : readers){
            System.out.println("==============================================================================");
            System.out.println("Reader ID:"+reader.getReaderId());
                // System.out.println(reader.getBooksByReader());
                for (Book book : reader.getBooksByReader()){
                    System.out.println("___________");
                    System.out.println("Book ID: "+book.getBookID());
                    System.out.println("Book ISBN: "+book.getIsbn());
                    System.out.println(book.getBookTitel());
                    System.out.println(book.getAuthor());
                }
            }
        }


}
