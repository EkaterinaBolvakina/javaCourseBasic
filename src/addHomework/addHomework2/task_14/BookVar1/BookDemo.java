package addHomework.addHomework2.task_14.BookVar1;

import addHomework.addHomework2.task_14.Book;

public class BookDemo {
    public static void main(String[] args) {
        Book myBook = new Book("Principles");
        String bookTitle = myBook.getTitle();
        System.out.println("Book title = " + bookTitle);
    }
}
