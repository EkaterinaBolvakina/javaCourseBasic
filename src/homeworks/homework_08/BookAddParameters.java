package homeworks.homework_08;

public class BookAddParameters {
    private int numberOfPagesInBook;
    private int numberInCatalogue;
    private String bookOnHand;

    public BookAddParameters(int numberOfPagesInBook, int numberInCatalogue, String bookOnHand) {
        this.numberOfPagesInBook = numberOfPagesInBook;
        this.numberInCatalogue = numberInCatalogue;
        this.bookOnHand = bookOnHand;
    }

    @Override
    public String toString() {
        return ", Number of pages in book: " + numberOfPagesInBook +
                ", Number of book in catalogue: " + numberInCatalogue +
                ", Is a book on hand? " +bookOnHand;
    }
}



