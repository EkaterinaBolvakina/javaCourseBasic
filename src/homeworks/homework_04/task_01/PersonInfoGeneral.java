package homeworks.homework_04.task_01;

public class PersonInfoGeneral {
    String firstName;
    int age;
    String city;

    //Constructor:
    public PersonInfoGeneral (String firstName, int age, String city){
        this.firstName = firstName;
        this.age = age;
        this.city = city;
    }

    //Method:
    public void personInformation () {
        System.out.println("My Name is " + firstName +".");
        System.out.println("I`m "+ age +" years old.");
        System.out.println("I`m from " + city +".");

    }
}
