package homeworks.homework_cons_11.variant_02;

import homeworks.homework_cons_11.variant_02.entity.Author;
import homeworks.homework_cons_11.variant_02.entity.Book;
import homeworks.homework_cons_11.variant_02.entity.Reader;
import homeworks.homework_cons_11.variant_02.service.LibraryManagement;


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

        List<Book> booksByReader1 = new ArrayList<>();
        Reader reader1 = new Reader(1,"Reader 1",booksByReader1);
        reader1.addBookByReader(book1);
        reader1.addBookByReader(book7);
        List<Book> booksByReader2 = new ArrayList<>();
        Reader reader2 = new Reader(2,"Reader 2",booksByReader2);
        reader2.addBookByReader(book2);
        reader2.addBookByReader(book3);
        reader2.addBookByReader(book4);
        List<Book> booksByReader3 = new ArrayList<>();
        Reader reader3 = new Reader(3,"Reader 3",booksByReader3);
        reader3.addBookByReader(book5);
        reader3.addBookByReader(book6);
        reader3.addBookByReader(book8);
        reader3.addBookByReader(book9);

        management.addReader(reader1);
        management.addReader(reader2);
        management.addReader(reader3);

        System.out.println("---- LIST of ALL BOOKS ----");
        printList(management.getBooks());
        System.out.println("____________________________");
        System.out.println("---- LIST of BOOKS by READER ----");
        printList(management.getReaders());

        reader1.removeBookByReader(reader1,book1);
        reader1.removeBookByReader(reader1,book7);
        reader1.removeBookByReader(reader1,book2);
        System.out.println("---- LIST of BOOKS by READER AFTER book removing ----");
        printList(management.getReaders());

    }
    private static void printList(List list){
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
