package homeworks.homework_cons_11.variant_02_Cons;

import homeworks.homework_cons_11.variant_02_Cons.entity.Author;
import homeworks.homework_cons_11.variant_02_Cons.entity.Book;
import homeworks.homework_cons_11.variant_02_Cons.entity.Reader;
import homeworks.homework_cons_11.variant_02_Cons.service.LibraryManagement;

import java.util.ArrayList;
import java.util.List;

public class LibraryApp2 {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        List<Reader> readers = new ArrayList<>();

        LibraryManagement management = new LibraryManagement(books, readers);

        Author author1 = new Author(1, "Пушкин");
        Author author2 = new Author(2, "Дюма");
        Author author3 = new Author(3, "Драйзер");
        Author author4 = new Author(4, "Блок");
        Author author5 = new Author(5, "Твен");

        Book book1 = new Book(1,"123-456","Руслан и Людмила", author1);
        Book book2 = new Book(2,"zbzdbzd","Сказка о царе Салтане", author1);
        Book book3 = new Book(3,"123-456","Графиня де Монсоро", author2);
        Book book4 = new Book(4,"123-456","Три мушкетера", author2);
        Book book5 = new Book(5,"123-456","Граф Монте-Кристо", author2);
        Book book6 = new Book(6,"123-456","Американская трагедия", author3);
        Book book7 = new Book(7,"123-456","Финансист", author3);
        Book book8 = new Book(8,"123-456","Стихи", author4);
        Book book9 = new Book(9,"123-456","Приключения Тома Сойера и Гекельберри Финна", author5);

        management.addBook(book1);
        management.addBook(book2);
        management.addBook(book3);
        management.addBook(book4);
        management.addBook(book5);
        management.addBook(book6);
        management.addBook(book7);
        management.addBook(book8);
        management.addBook(book9);

        management.addReader(new Reader(1,"Reader 1"));
        management.addReader(new Reader(2,"Reader 2"));
        management.addReader(new Reader(3,"Reader 3"));

        List<Reader> readerList = management.getReaders();

        Reader reader1 = readerList.get(0);
        List<Book> readerBooks = reader1.getBooksByReader();
        readerBooks.add(management.getBooks().get(0));
        readerBooks.add(management.getBooks().get(6));

        Reader reader2 = readerList.get(1);
        List<Book> readerBooks1 = reader2.getBooksByReader();
        readerBooks1.add(management.getBooks().get(1));
        readerBooks1.add(management.getBooks().get(2));
        readerBooks1.add(management.getBooks().get(3));

        management.getReaders().get(2).getBooksByReader().add(management.getBooks().get(4)); //verkürztes code für reader 3
        management.getReaders().get(2).getBooksByReader().add(management.getBooks().get(5));
        management.getReaders().get(2).getBooksByReader().add(management.getBooks().get(7));
        management.getReaders().get(2).getBooksByReader().add(management.getBooks().get(8));


        System.out.println("---- LIST of ALL BOOKS ----");
        printList(management.getBooks());
        System.out.println("____________________________");
        System.out.println("---- LIST of BOOKS by READER ----");
        management.printBooksByAllReader(management.getReaders());
       //Variant 2: printList(management.getReaders());

        management.getReaders().get(0).getBooksByReader().remove(management.getBooks().get(0)); //verkürztes code für remove buch 1 bei reader 1
        management.getReaders().get(0).getBooksByReader().remove(management.getBooks().get(6)); //verkürztes code für remove buch 7 bei reader 1

        System.out.println("---- LIST of BOOKS by READER AFTER book removing ----");
        printList(management.getReaders());

        System.out.println("---- LIST of BOOKS by READER 2 ----");
        management.printBooksByReader(management.getReaders(),2);

    }
    private static void printList(List list){
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
