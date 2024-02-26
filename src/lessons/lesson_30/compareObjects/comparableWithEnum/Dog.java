package lessons.lesson_30.compareObjects.comparableWithEnum;

public class Dog implements Comparable<Dog>{

    private String name;
    private Breed breed; // hier ist Object ENUM

    public Dog(String name, Breed breed) {
        this.name = name;
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public Breed getBreed() {
        return breed;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed=" + breed +
                '}';
    }

    @Override
    public int compareTo(Dog anotherDog) {
        int result = breed.compareTo(anotherDog.getBreed());
        return result;
    }
}
