package lessons.lesson_29.practice.set;

import java.util.HashSet;
import java.util.Set;

public class Task2 {
    public static void main(String[] args) {
/*
Написать программу для учета посещения сайта пользователем.
Необходимо хранить данные об уникальных пользователях (на основании
их идентификатора)
 */
        Set<String> uniqueVisitors = new HashSet<>();

        // Предположим, что каждый раз, когда пользователь посещает сайт, его идентификатор добавляется в Set
        addVisitor(uniqueVisitors,"user1");
        addVisitor(uniqueVisitors,"user2");
        addVisitor(uniqueVisitors,"user3");
        // пользователь user1 посетил сайт повторно
        addVisitor(uniqueVisitors,"user1");

        // Выводим количество уникальных посетителей
        System.out.println("Количество уникальных посетителей за период: "+uniqueVisitors.size());
    }
    public static void addVisitor(Set<String> uniqueVisitors, String userId){
        uniqueVisitors.add(userId);
    }
}
