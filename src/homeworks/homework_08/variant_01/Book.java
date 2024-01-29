package homeworks.homework_08.variant_01;

public class Book {
    private String author;
    private String titleOfBook;
    private int numberOfPagesInBook;
    private int numberInCatalogue;
    private int bookLocation;

    //Constructor with all parameters:
    public Book(String author, String titleOfBook, int numberOfPagesInBook, int numberInCatalogue, int bookLocation) {
        this.author = author;
        this.titleOfBook = titleOfBook;
        this.numberOfPagesInBook = numberOfPagesInBook;
        this.numberInCatalogue = numberInCatalogue;
        this.bookLocation = bookLocation;
    }
    //Constructor only with author and title:
    public Book(String author, String titleOfBook) {
        this.author = author;
        this.titleOfBook = titleOfBook;
    }

    // Setters for changing add information:
    public void setAddInfo(int numberOfPagesInBook, int numberInCatalogue, int bookLocation) {
        this.numberOfPagesInBook = numberOfPagesInBook;
        this.numberInCatalogue = numberInCatalogue;
        this.bookLocation = bookLocation;
    }
    //Print all information about book:
    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", titleOfBook='" + titleOfBook + '\'' +
                ", numberOfPagesInBook=" + numberOfPagesInBook +
                ", numberInCatalogue=" + numberInCatalogue +
                ", bookLocation=" + bookLocation +
                '}';
    }
}
