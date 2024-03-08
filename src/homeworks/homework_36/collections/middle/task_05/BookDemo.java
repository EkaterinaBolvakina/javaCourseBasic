package homeworks.homework_36.collections.middle.task_05;
/*
5 Create a Book class with title, author and year properties,
then create a LinkedList, populate it with several Book objects
and remove from the list all books that were published before the year 2022.
 */
public class BookDemo {
    public static void main(String[] args) {
        BookService bookService = new BookService();

        bookService.addBook("Drei Kameraden","Remarque", 1949);
        bookService.addBook("Über Menschen","Juli Zeh", 2021);
        bookService.addBook("Algorithmen kapieren","Aditya Y.Bhargava", 2019);
        bookService.addBook("Feuer","Maria Pourchet", 2023);

        bookService.deleteBookUnderConditional(1900);
        System.out.println();
        bookService.deleteBookUnderConditional(2022);

    }
}
