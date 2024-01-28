package homeworks.homework_08;

public class BookUtil {

    ScannerUserInput ui;

    public BookUtil() {
        this.ui = new ScannerUserInput();
    }

    public BookFirstParameters createBookAuthorAndTitle(){
        String author = ui.inputText("Please enter author of the book: ");
        String titleOfBook = ui.inputText("Please enter a title of the book: ");
        return new BookFirstParameters(author,titleOfBook);
    }
    public BookAllParameters editBookAuthorAndTitle(BookFirstParameters bookFirstParameters) {
        return new BookAllParameters(bookFirstParameters);
    }
    public BookAddParameters createBookAdditionalInfo(){
        int numberOfPagesInBook = ui.inputInt("Please enter a number of pages in the book: ");
        int numberInCatalogue =ui.inputInt("Please enter number of book in catalogue: ");
        String bookOnHand = ui.inputText("Is a book on hand? Then please enter 'Yes', else 'No'");
        return new BookAddParameters(numberOfPagesInBook, numberInCatalogue, bookOnHand);
    }
    public BookAllParameters editBookAuthorAndTitleWithAddInfo(BookFirstParameters bookFirstParameters,BookAddParameters bookAddParameters) {
        return new BookAllParameters(bookFirstParameters,bookAddParameters);
    }
    public BookAllParameters createBookAllParameters(){
        String author = ui.inputText("Please enter author of the book: ");
        String titleOfBook = ui.inputText("Please enter a title of the book: ");
        int numberOfPagesInBook = ui.inputInt("Please enter a number of pages in the book: ");
        int numberInCatalogue =ui.inputInt("Please enter number of book in catalogue: ");
        String bookOnHand = ui.inputText("Is a book on hand? Then please enter 'Yes', else 'No'");
        return new BookAllParameters(new BookFirstParameters(author,titleOfBook),new BookAddParameters(numberOfPagesInBook,numberInCatalogue,bookOnHand));
    }


}
