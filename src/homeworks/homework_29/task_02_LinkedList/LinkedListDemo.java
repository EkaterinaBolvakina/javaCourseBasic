package homeworks.homework_29.task_02_LinkedList;
import java.util.LinkedList;
import java.util.List;
/*
2. **Операции с числовым списком:**
    - Создайте `LinkedList` для хранения целых чисел.
    - Добавьте в список случайные числа в диапазоне от 1 до 100.
    - Найдите и выведите максимальное и минимальное числа в списке.
    - Отсортируйте список в порядке возрастания и выведите его.
 */
public class LinkedListDemo {
    public static void main(String[] args) {
        Service service = new Service();
        List<Integer> integerList = new LinkedList<>();
        int min = 1;
        int max = 100;
        int random1 = (int) Math.round(Math.random()*(max - min + 1)+min);
        int random2 = (int) Math.round(Math.random()*(max - min + 1)+min);
        int random3 = (int) Math.round(Math.random()*(max - min + 1)+min);
        int random4 = (int) Math.round(Math.random()*(max - min + 1)+min);
        int random5 = (int) Math.round(Math.random()*(max - min + 1)+min);
        service.addList(integerList,random1);
        service.addList(integerList,random2);
        service.addList(integerList,random3);
        service.addList(integerList,random4);
        service.addList(integerList,random5);

        service.printList(integerList);
        service.findMinMax(integerList);
        service.sortList(integerList);
        service.printList(integerList);
    }
}



