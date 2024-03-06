package lessons.lesson_37.practice.task_1_2;

public class LibraryDemo {
    public static void main(String[] args) {

        // Variant1: hier ist genre als String:
        Library<String> stringLibrary = new Library<>();
        stringLibrary.addBook(new Book<>("Drei Kameraden","Roman"));
        stringLibrary.addBook((new Book<>("Drei ferkel","Märchen")));

        System.out.println(stringLibrary.getBooksByGenre("Märchen"));
        System.out.println(stringLibrary.getBooksByGenre("Belletristic"));
        System.out.println(stringLibrary.findBookByTitle("Drei Kameraden"));
//------------------------------------------------------------------------------------
        // Variant2: wenn genre als Class, der von Class Genre extends / sich erweitert als Child:
        GenreRoman roman = new GenreRoman("Roman");
        GenreMaerchen maerchen = new GenreMaerchen("Märchen");

        Library<Genre> genreLibrary = new Library<>();
        genreLibrary.addBook(new Book<>("Drei Kameraden",roman));
        genreLibrary.addBook(new Book<>("Drei Ferkel",maerchen));

        System.out.println(genreLibrary.getBooksByGenre(roman));
        System.out.println(genreLibrary.findBookByTitle("Drei Kameraden"));
        System.out.println(genreLibrary.findBookByTitle("Drei "));


    }
}
