package homeworks.homework_08;

public class BookAddParameters {
    private int numberOfPagesInBook;
    private int numberInCatalogue;
    private int bookLocation;
   // private String bookLoc;



    public BookAddParameters(int numberOfPagesInBook, int numberInCatalogue, int bookLocation) {
        this.numberOfPagesInBook = numberOfPagesInBook;
        this.numberInCatalogue = numberInCatalogue;
        this.bookLocation = bookLocation;
    }

    @Override
    public String toString() {
        //    if (bookLocation==1){
        //    String bookLoc = "On hand";
      //      } else if (bookLocation ==0){
         //   String bookLoc = "In storage";
      //      } else {String bookLoc = "NA";}
        return ", Number of pages in book: " + numberOfPagesInBook +
                ", Number of book in catalogue: " + numberInCatalogue +
                ", Location of book (1 = On hand; 0 = In storage): " + bookLocation;

    }
}


