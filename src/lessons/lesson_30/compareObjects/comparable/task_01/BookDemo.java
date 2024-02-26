package lessons.lesson_30.compareObjects.comparable.task_01;

import java.util.Set;
import java.util.TreeSet;

/*
1) Создать коллекцию книг в которую вы можете добавить новую книгу
с параметрами (id, nameBook)
Коллекция должна содержать уникальные элементы и они должны быть отсортированы
по id и по имени
 */
public class BookDemo {
    public static void main(String[] args) {
        Set<Book> bookSet = new TreeSet<>();
        bookSet.add(new Book(1,"Book 1"));
        bookSet.add(new Book(2,"Roman"));
        bookSet.add(new Book(3,"Poesie"));
        bookSet.add(new Book(5,"Book 5"));
        bookSet.add(new Book(4,"Book 3"));

        System.out.println(bookSet);
    }
}
