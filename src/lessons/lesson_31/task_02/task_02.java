package lessons.lesson_31.task_02;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
/*
2) Дан список String
написать метод, который заменяет все элементы, которые содержат букву 'a'
на "..."
 */

public class task_02 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Katarina");
        names.add("Anna");
        names.add("Matvej");
        names.add("Egor");
        names.add("Annabella");

        ListIterator<String> iterator = names.listIterator();
        while (iterator.hasNext()){
            String tempString = iterator.next();
            System.out.println(tempString);
            if (tempString.contains("a")){
                iterator.set("");
            }
        }
        System.out.println(names);





    }


}
