package lessons.lesson_30.compareObjects.comparableWithEnum;

public class Comparator implements java.util.Comparator<Dog> {
    @Override
    public int compare(Dog dog1, Dog dog2) {
        int result = dog1.getBreed().compareTo(dog2.getBreed());
        return result;
    }
}
