package extraPractce.sort.arrayList;

import java.util.ArrayList;
import java.util.List;

public class Sort_ArrayList {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal(3,"Dog"));
        animals.add(new Animal(2,"Cat"));
        animals.add(new Animal(1,"Bird"));
        animals.add(new Animal(5,"Cat"));
        animals.add(new Animal(4,"Bird"));

        System.out.println(animals);
        print(animals);

        System.out.println("Sorted list by index in reverse order:");
        System.out.println(animals.reversed());

        System.out.println("Sorted list by index in reverse order:");
        sortListByIndexReverse(animals);
        System.out.println();

        System.out.println("Sorted list by animal type alphabetically in reverse order:");
        sortListReverseAlphabetically(animals);
        System.out.println(animals);

        System.out.println("Sorted list by animal ID alphabetically in reverse order:");
        sortListReverseAlphabeticallyByID(animals);
        System.out.println(animals);



    }
    public static void print(List<Animal> animals){
        System.out.println("------ ANIMALS LIST -----------");
            for (Animal animal : animals) {
                System.out.println("Animal ID: "+animal.getAnimalId());
                System.out.println("Animal type: "+animal.getAnimalType());
                System.out.println("----------------------------------------");
            }
    }
    public  static void sortListByIndexReverse(List<Animal> animals){
        for (int i = animals.size()-1; i >= 0 ; i--) {
            System.out.print(animals.get(i)+", ");
        }
    }
    public  static void sortListReverseAlphabetically(List<Animal> animals){
        int n = animals.size();
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (animals.get(j).getAnimalType().compareTo(animals.get(j+1).getAnimalType())<0){
                    Animal temp = animals.get(j);
                    animals.set(j,animals.get(j+1));
                    animals.set(j+1,temp);
                }
            }
        }
    }
    public  static void sortListReverseAlphabeticallyByID(List<Animal> animals){
        int n = animals.size();
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (animals.get(j).getAnimalId().compareTo(animals.get(j+1).getAnimalId())<0){
                    Animal temp = animals.get(j);
                    animals.set(j,animals.get(j+1));
                    animals.set(j+1,temp);
                }
            }
        }
    }

}
