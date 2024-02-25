package homeworks.homework_29.task_06_HashSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
6. **Удаление дубликатов из списка:**
    - Создайте `ArrayList` с дублирующимися элементами.
    - Преобразуйте `ArrayList` в `HashSet`, чтобы автоматически удалить дубликаты.
    - Выведите новый список без дубликатов.
    - Добавьте новые элементы в `HashSet` и снова преобразуйте его обратно в `ArrayList`.
 */
public class Collection_ArrayListToHashSet {
    public static void main(String[] args) {
        //Create ArrayList с дублирующимися элементами:
        List<String> animalCollection = new ArrayList<>();
        animalCollection.add("Dog");
        animalCollection.add("Cat");
        animalCollection.add("Bird");
        animalCollection.add("Dog");
        animalCollection.add("Cat");
        animalCollection.add("Cat");
        animalCollection.add("Elephant");
        animalCollection.add("Bird");
        animalCollection.add("Dog");
        animalCollection.add("Dog");

        System.out.println("----- Array List ------");
        System.out.println(animalCollection);
        System.out.println();

        // Variant 1: Create HashSet and add all elements from ArrayList, чтобы автоматически удалить дубликаты.
        Set<String> animalCollectionSet = new HashSet<>(animalCollection);
        // Variant 2:
        // Set<String> animalCollectionSet = new HashSet<>();
        // animalCollectionSet.addAll(animalCollection);

        //Выведите новый список без дубликатов:
        System.out.println("----- Hash Set: unique animals ------");
        System.out.println(animalCollectionSet);
        System.out.println();

        animalCollectionSet.add("Crocodile");
        animalCollectionSet.add("Straus");
        System.out.println("----- Hash Set: unique animals with added new elements ------");
        System.out.println(animalCollectionSet);
        System.out.println();

        List<String> animalNewCollection = new ArrayList<>(animalCollectionSet);
        System.out.println("----- Array List NEW Collection from Hash Set------");
        System.out.println(animalNewCollection);
    }
}
