package homeworks.homework_41.task_01;

import java.util.ArrayList;
import java.util.List;

/*
Task 1: Filtering and sorting a collection

Task: A list of strings is given.
You need to filter all strings from this list,
that begin with the letter "A" (case ignored), and
return the list of these strings sorted in alphabetical order.
 */
public class StringListFilteredStream {
    public static void main(String[] args) {
        String string1 = "Feiern bis zum Abwinken!";
        String string2 = "Abendessen an einem Zweier-Tisch";
        String string3 = "Wer Fußball liebt hört damit auch im Urlaub nicht auf!";
        String string4 = "Anfänger oder Fortgeschrittene - Professionelle Tennistrainer stehen euch mit Rat und Tat zur Verfügung.";
        String string5 = "Anschluss zu finden";
        String string6 = "aber bitte mit Sahne";
        String string7 = "Außerdem warten regelmäßig spannende";
        String string8 = "Aussichten nicht entgehen";
        String string9 = "Pritschen, baggern, vollen Einsatz zeigen!";

        List<String> strings = new ArrayList<>();
        strings.add(string1);
        strings.add(string2);
        strings.add(string3);
        strings.add(string4);
        strings.add(string5);
        strings.add(string6);
        strings.add(string7);
        strings.add(string8);
        strings.add(string9);

        List<String> stringsWithStartA = strings.stream()
                .filter(string -> string.startsWith("A"))
                .sorted()
                .toList();

        System.out.println(stringsWithStartA);

    }
}
