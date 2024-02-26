package lessons.lesson_30.compareObjects.comparableWithEnum;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class DemoDog_TreeSet_ArrayList {
    public static void main(String[] args) {
        Set<Dog> dogs = new TreeSet<>();
        dogs.add(new Dog("Bobik",Breed.Labrador));
        dogs.add(new Dog("Lessi",Breed.Colly));
        dogs.add(new Dog("Pers",Breed.Mastiff));
        dogs.add(new Dog("Rex",Breed.Shepard));
        dogs.add(new Dog("Marli",Breed.Colly));

        System.out.println(dogs);

        List<Dog> dogList = new ArrayList<>();
        dogList.add(new Dog("Bobik",Breed.Labrador));
        dogList.add(new Dog("Lessi",Breed.Colly));
        dogList.add(new Dog("Pers",Breed.Mastiff));
        dogList.add(new Dog("Rex",Breed.Shepard));
        dogList.add(new Dog("Marli",Breed.Colly));

        System.out.println(dogList);
        dogList.sort(new Comparator());
        System.out.println(dogList);


    }
}
