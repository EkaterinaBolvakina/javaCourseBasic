package lessons.lesson_28.practice;

import java.util.HashMap;
import java.util.Map;

public class MapTask1 {
    public static <key, value> void main(String[] args) {
        int[] arr = {1, 7, 49, 4, 12, 9, 45, 3, 9, 23, 1, 7, 12, 1, 7, 23};

          /*
        написать метод, который получает на входе массив
        возвращает коллекцию, у которой
        в качестве ключа - элемент массива,
        а значение - количество повторений
         */
        System.out.println(createMap(arr));

    }
        static Map<Integer, Integer> createMap(int[] arr){
            Map<Integer, Integer> collection = new HashMap<>();
            for (int i = 0; i < arr.length; i++) {
                int count = 0;
                int key = arr[i];
                if (collection.get(key) != null) {
                    count = collection.get(key);
                }
                count++;
                collection.put(key, count);
            }
        return collection;
    }
}
