package homeworks.homework_29.task_05_HashSet;

import java.util.HashSet;
import java.util.Set;

/*
5. **Уникальный набор имен:**
    - Создайте `HashSet` для хранения имен.
    - Добавьте в набор десять имен, некоторые из которых могут повторяться.
    - Выведите количество уникальных имен в наборе.
    - Проверьте, содержит ли набор определенное имя.
 */
public class NameCollection {
    public static void main(String[] args) {
        Service service = new Service();

        Set<String> namesCollection = new HashSet<>();
        namesCollection.add("Paul");
        namesCollection.add("Olga");
        namesCollection.add("Peter");
        namesCollection.add("Jan");
        namesCollection.add("Paul");
        namesCollection.add("Olga");
        namesCollection.add("Kate");
        namesCollection.add("Jimmy");
        namesCollection.add("Paulo");
        namesCollection.add("Pablo");

        service.printCollection(namesCollection);
        service.checkName(namesCollection,"Jan");
        service.checkName(namesCollection,"Anna");
    }

}
