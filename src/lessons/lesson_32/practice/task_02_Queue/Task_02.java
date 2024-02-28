package lessons.lesson_32.practice.task_02_Queue;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

/*
2. Queue
написать программу которая бы хранила "историю" браузера
написать методы, которые бы "добавляли" в "историю" просмотренные страницы
и позволяло бы посмотреть всю историю (построчно)
 */
public class Task_02 {
    public static void main(String[] args) {
        //Simulation von Seitenbesuchen:
        visitInternetPage("Hauptseite");
        visitInternetPage("Unternehmen");
        visitInternetPage("Karriere");
        visitInternetPage("Kontakt");
        visitInternetPage("Hauptseite");

        printHistoryBrowser();

    }
   private static Queue<String> historyBrowser = new LinkedList<>();
    public static void visitInternetPage(String internetPage){
        historyBrowser.offer(internetPage);
    }
    public static void printHistoryBrowser(){
        System.out.println("----- Verlauf: ----- ");
        for (String internetPage : historyBrowser){
            System.out.println(internetPage);
        }
    }
}
