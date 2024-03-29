package homeworks.homework_08.variant_01;

import homeworks.homework_08.ScannerUserInput;

public class BookUtil {
    ScannerUserInput ui;

    public BookUtil() {
        this.ui = new ScannerUserInput();
    }

    //Additional for choice:
    int choice;
    public int choice(){
        int choice =ui.inputInt("Do you want create a book ONLY WITH AUTHOR and TITLE? Please enter 1, if not then 0");
        return choice;
    }

    // Create book with all parameters:
    public Book createBookAllParameters(){
        String author = ui.inputText("Please enter author of the book: ");
        String titleOfBook = ui.inputText("Please enter a title of the book: ");
        int numberOfPagesInBook = ui.inputInt("Please enter a number of pages in the book: ");
        int numberInCatalogue =ui.inputInt("Please enter number of book in catalogue: ");
        String bookLocation = ui.inputText("Is a book on hand? Then please enter '1', if in storage then '0'");
        if (bookLocation.equals("1")){
            bookLocation = "Book is on hand";
        } else if (bookLocation.equals("0")) {
            bookLocation = "Book is in storage";
        } else { bookLocation = "undefined";
        }
        return new Book(author,titleOfBook,numberOfPagesInBook,numberInCatalogue,bookLocation);
    }

    // Create book only with author and title:
    public Book createBookAuthorAndTitle(){
        String author = ui.inputText("Please enter author of the book: ");
        String titleOfBook = ui.inputText("Please enter a title of the book: ");
        return new Book(author,titleOfBook);
    }
    // Method for input new number Of Pages In Book:
    public int inputNumberOfPagesInBook(){
        int inputNumberOfPagesInBook = ui.inputInt("Please enter a number of pages in the book: ");
        return inputNumberOfPagesInBook;
    }
    // Method for input new number In Catalogue:
    public int inputNumberInCatalogue(){
        int inputNumberInCatalogue = ui.inputInt("Please enter number of book in catalogue: ");
        return inputNumberInCatalogue;
    }
    // Method for input new book Location:
    public String inputBookLocation(){
        String inputBookLocation = ui.inputText("Is a book on hand? Then please enter '1', if in storage then '0'");
        if (inputBookLocation.equals("1")){
            inputBookLocation = "Book is on hand";
        } else if (inputBookLocation.equals("0")) {
            inputBookLocation = "Book is in storage";
        } else { inputBookLocation = "undefined";
        }
        return inputBookLocation;
    }


}
