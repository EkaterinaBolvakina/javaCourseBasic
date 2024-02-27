package lessons.lesson_31.iterator.forEach;

import java.util.Set;
import java.util.TreeSet;

public class ForEachExample_SET_ERROR {
    public static void main(String[] args) {
        Set<String> stringSet = new TreeSet<>();
        stringSet.add("AAA");
        stringSet.add("GGG");
        stringSet.add("RRR");
        stringSet.add("EEE");
        stringSet.add("WWW");
        stringSet.add("AAA");
        stringSet.add("MMM");
        stringSet.add("TTT");
        stringSet.add("SSS");
        stringSet.add("FFF");
        stringSet.add("HHH");
        stringSet.add("CCC");

       // System.out.println(stringSet);

        ////// Schleife FOR EACH gibt uns hier den Fehler aus,
        // denn JAVA geht in der Schleife durch die Objekte/Elemente der Kollektion, kennt die Indexen nicht.
        // und jede Modifikation innerhalb der Schleife ist verboten!!!
        // Deswegen nutzt man ITERATOR
        for (String tempVar : stringSet){
            System.out.println(tempVar);
            if (tempVar.contains("H")){
                stringSet.remove(tempVar);
            }
        }
        System.out.println(stringSet);
    }
}
