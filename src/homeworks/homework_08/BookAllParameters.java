package homeworks.homework_08;

public class BookAllParameters {
    private BookFirstParameters bookFirstParameters;
    private BookAddParameters bookAddParameters;

    public BookAllParameters(BookFirstParameters bookFirstParameters, BookAddParameters bookAddParameters) {
        this.bookFirstParameters = bookFirstParameters;
        this.bookAddParameters = bookAddParameters;
    }

    public BookAllParameters(BookFirstParameters bookFirstParameters) {
        this.bookFirstParameters = bookFirstParameters;
    }

    public BookAllParameters(BookAddParameters bookAddParameters) {
        this.bookAddParameters = bookAddParameters;
    }

    @Override
    public String toString() {
        return
               ""+ bookFirstParameters + bookAddParameters;
    }
}
