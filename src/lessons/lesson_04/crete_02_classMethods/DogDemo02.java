package lessons.lesson_04.crete_02_classMethods;

public class DogDemo02 {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.age = 3;
        dog1.dogWoow();
        dog1.dogBirthday("My Dog`s Birthday!!!");

        System.out.println();

        Dog dog2 =new Dog();
        dog2.age = 7;
        dog2.dogWoow();
        dog2.dogBirthday("My Mum has a dog.");

        System.out.println();

        Dog dog3 = new Dog();
        dog3.age = 5;
        System.out.println("Rex has a birthday!");
        System.out.println("My third dog has birthday today!");
        System.out.println("He was " +dog3.age +" years old,");
        dog3.age = dog3.age +1;
        System.out.println("and today he is " + dog3.age);

    }
}
