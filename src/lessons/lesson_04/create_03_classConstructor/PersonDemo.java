package lessons.lesson_04.create_03_classConstructor;

public class PersonDemo {
    public static void main(String[] args) {
        Person person1 = new Person("Katharina", "Pelz", "11-05-2003");
        person1.age = 10;
        person1.address ="Koeln XStrasse 11";

        System.out.println(person1.surName);
        System.out.println(person1.firstName);
        System.out.println(person1.birthday);
        System.out.println(person1.age);
        System.out.println(person1.address);
    }
}
