package homeworks.homework_40.streamAPI.task_06;

import java.util.ArrayList;
import java.util.List;
/*
6) Given Person collection - Name, age, list of skills (e.g. programming languages).
   You need to find all the unique skills that people over 25 years old have and sort them.
 */
public class PersonSkillsStream {
    public static void main(String[] args) {

        List<String> skills1 = new ArrayList<>();
        skills1.add("Java programming");
        skills1.add("HTML programming");
        skills1.add("Spring boot");
        skills1.add("English");
        skills1.add("SQL");
        skills1.add("Project management");

        List<String> skills2 = new ArrayList<>();
        skills2.add("Java programming");
        skills2.add("Spring boot");
        skills2.add("SAP BW");

        List<String> skills3 = new ArrayList<>();
        skills3.add("Java programming");
        skills3.add("Spring boot");
        skills3.add("SQL");

        List<Person> people = new ArrayList<>();
        people.add(new Person("Schulz",26, skills1));
        people.add(new Person("Meyer",23, skills2));
        people.add(new Person("Meyer",43, skills3));

        System.out.println("People: ");
        System.out.println(people);

        System.out.println("Unique and common skills of people over 25: ");
        List<String> uniqueCommonSkills = people.stream()
                .filter(age -> age.getAge() > 25)
                .map(person -> person.getSkills())  // Hier wird die Liste der Fähigkeiten für jede Person extrahiert. Der Rückgabetyp ist List<String>.
                .reduce((skillsA, skillsB) -> {     // die Liste der Fähigkeiten der Personen wird reduziert, um nur die gemeinsamen Fähigkeiten zu behalten.
                    skillsA.retainAll(skillsB);     // Behalte nur die gemeinsamen Fähigkeiten in skillsA (eine Liste von Strings, die verschiedene Fähigkeiten repräsentieren)
                    return skillsA;
                })
                .orElseGet(ArrayList::new)         // Wenn es keine gemeinsamen Fähigkeiten gibt, wird eine leere Liste zurückgegeben.
                .stream()                          // Die Liste der gemeinsamen Fähigkeiten wird in einen Stream konvertiert.
                .sorted()                         // Die Fähigkeiten werden sortiert.
                .toList();

        System.out.println(uniqueCommonSkills);

    }
}
