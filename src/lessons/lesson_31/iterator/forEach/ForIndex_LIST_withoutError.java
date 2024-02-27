package lessons.lesson_31.iterator.forEach;

import java.util.ArrayList;
import java.util.List;

public class ForIndex_LIST_withoutError {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();

        strings.add("AAA");
        strings.add("GGG");
        strings.add("RRR");
        strings.add("EEE");
        strings.add("WWW");
        strings.add("AAA");
        strings.add("MMM");
        strings.add("TTT");
        strings.add("SSS");
        strings.add("FFF");
        strings.add("HHH");
        strings.add("CCC");

        //System.out.println(strings);

        for (int i = 0; i < strings.size(); i++) {
            System.out.println(strings.get(i));
            if (strings.get(i).contains("H")) {
                strings.remove(strings.get(i));
            }
        }

        System.out.println(strings);

        for (String temp: strings){
            System.out.println(temp);
            if (temp.contains("C")){
                strings.remove(temp); //Hier kommt wieder der Fehler!!! Weil JAVA in der Schleife die Indexen nicht kennt
            }
        }
        System.out.println(strings);
    }
}
