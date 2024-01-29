package homeworks.homework_08.variant_02_NotOptimal;

public class BookFirstParameters {
    private String author;
    private String titleOfBook;

    public BookFirstParameters(String author, String titleOfBook) {
        this.author = author;
        this.titleOfBook = titleOfBook;
    }

    //get setter!!!!!!!

    @Override
    public String toString() {
        return "Author: " + author + '\'' +
                ", Title of book: " + titleOfBook ;
    }
}
