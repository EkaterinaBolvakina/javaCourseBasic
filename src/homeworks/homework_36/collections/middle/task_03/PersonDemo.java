package homeworks.homework_36.collections.middle.task_03;
/*
3) Create a LinkedHashSet set and add to it several objects of Person class that have name and age properties.
   Then search through all elements of the set and display on the console only those people whose age is less than 30 years.
 */
public class PersonDemo {
    public static void main(String[] args) {

        PersonService personService = new PersonService();

        personService.addPerson("Schulz",55);
        personService.addPerson("Weber",20);
        personService.addPerson("Otto",12);
        personService.addPerson("Schulz",20);
        personService.addPerson("Mustermann",38);
        personService.addPerson("Pelz",30);

        personService.printPersonYoungerAge(30);

    }
}
