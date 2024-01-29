package homeworks.homework_08.variant_02;

import homeworks.homework_08.ScannerUserInput;

public class BookUtil {

    ScannerUserInput ui;

    public BookUtil() {
        this.ui = new ScannerUserInput();
    }

    int choice;
    public int choice(){
        int choice =ui.inputInt("Do you want create a book ONLY WITH AUTHOR and TITLE? Please enter 1, if not then 0");
        return choice;
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
        int bookLocation = ui.inputInt("Is a book on hand? Then please enter '1', if in storage then '0'");
        return new BookAddParameters(numberOfPagesInBook, numberInCatalogue, bookLocation);
    }


    public BookAllParameters editBookAuthorAndTitleWithAddInfo(BookFirstParameters bookFirstParameters,BookAddParameters bookAddParameters) {
        return new BookAllParameters(bookFirstParameters,bookAddParameters);

    }
    public BookAllParameters createBookAllParameters(){
        String author = ui.inputText("Please enter author of the book: ");
        String titleOfBook = ui.inputText("Please enter a title of the book: ");
        int numberOfPagesInBook = ui.inputInt("Please enter a number of pages in the book: ");
        int numberInCatalogue =ui.inputInt("Please enter number of book in catalogue: ");
        int bookLocation = ui.inputInt("Is a book on hand? Then please enter '1', if in storage then '0'");
        return new BookAllParameters(new BookFirstParameters(author,titleOfBook),new BookAddParameters(numberOfPagesInBook,numberInCatalogue,bookLocation));
    }


}
