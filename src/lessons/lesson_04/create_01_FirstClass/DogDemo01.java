package lessons.lesson_04.create_01_FirstClass;

public class DogDemo01 {
    public static void main(String[] args) {
        //Variante1 ohne Bezug auf Class Dog:
        int ageDog1 = 2;
        String nameDog1 = "Rex";
        double weightDog1 = 2.6;
        System.out.println("Variante 1 ohne Bezug auf Class Dog:");
        System.out.println("Age Dog1: " + ageDog1);
        System.out.println("Name Dog1: " + nameDog1);
        System.out.println("Weight Dog1: " + weightDog1);
        System.out.println();

        //Variante2 mit Bezug auf Class Dog:
        System.out.println("Variante2 mit Bezug auf Class Dog:");

        Dog dog1 = new Dog();
        dog1.age = 2;
        dog1.dogName = "Rex";
        dog1.weight = 2.6;
        System.out.println("Dog1:");
        System.out.println("Adresse/Bezug von Dog1 auf Class Dog: "+ dog1);
        System.out.println(dog1.age);
        System.out.println(dog1.dogName);
        System.out.println(dog1.weight);
        System.out.println();

        Dog dog2 = new Dog();
        dog2.age = 5;
        dog2.dogName = "Alfa";
        dog2.weight = 7.3;
        System.out.println("Dog2:");
        System.out.println("Adresse/Bezug von Dog2 auf Class Dog: "+ dog1);
        System.out.println(dog2.age);
        System.out.println(dog2.dogName);
        System.out.println(dog2.weight);
        System.out.println();



    }
}



