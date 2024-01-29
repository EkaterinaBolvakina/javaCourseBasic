package homeworks.homework_08.variant_01;

public class BookDemo {
    public static void main(String[] args) {
        BookUtil util = new BookUtil();

        //Book1:
        //0) Additional option with choice:
        if (util.choice() == 1){
            //1) создают новую книгу только с автором и названием:
            System.out.println("Create a book nr.1: ");
            Book book1 = util.createBookAuthorAndTitle();
            //вывод информацию о книге
            System.out.println("Information about book: ");
            // if you want to see book1: System.out.println(book1);
            System.out.println();

            //3) редактирует книгу добавляя: номер каталога, количество страниц и где книга находится
            System.out.println("Unfortunately,information about book nr.1 is not complete: ");
            book1.setAddInfo(util.inputNumberOfPagesInBook(),util.inputNumberInCatalogue(),util.inputBookLocation());
            //вывод подробно информацию о книге
            System.out.println("Completely information about book nr.1: ");
            System.out.println(book1);
            System.out.println("=====================================");

        } else {
            //2) создают новую книгу с использованием всех параметров
            System.out.println("Create a book nr.1: ");
            Book book1 = util.createBookAllParameters();
            //вывод подробно информацию о книге
            System.out.println("Completely information about book nr.1: ");
            System.out.println(book1);
            System.out.println("=====================================");

        }
        //Book2:
        //0) Additional option with choice:
        if (util.choice() == 1){
            //1) создают новую книгу только с автором и названием:
            System.out.println("Create a book nr.2: ");
            Book book2 = util.createBookAuthorAndTitle();
            //вывод информацию о книге
            System.out.println("Information about book: ");
            // if you want to see book2: System.out.println(book2);
            System.out.println();

            //3) редактирует книгу добавляя: номер каталога, количество страниц и где книга находится
            System.out.println("Unfortunately,information about book nr.2 is not complete: ");
            book2.setAddInfo(util.inputNumberOfPagesInBook(),util.inputNumberInCatalogue(),util.inputBookLocation());
            //вывод подробно информацию о книге
            System.out.println("Completely information about book nr.2: ");
            System.out.println(book2);
            System.out.println("=====================================");

        } else {
            //2) создают новую книгу с использованием всех параметров
            System.out.println("Create a book nr.2: ");
            Book book2 = util.createBookAllParameters();
            //вывод подробно информацию о книге
            System.out.println("Completely information about book nr.2: ");
            System.out.println(book2);
            System.out.println("=====================================");

        }
    }
}
