package homeworks.homework_36.optional;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/*
8)  Напишите метод, который получает HashMap, и возвращает Optional
    с наибольшим значением, связанным с любым ключом в HashMap.
 */
public class Task_08 {

    public <K, V extends Comparable<V>> Optional<V> getMaxValue(HashMap<K,V> hashMap) {
        if (!hashMap.isEmpty()) {
            V max = null;
            for (Map.Entry<K,V> entry: hashMap.entrySet()) {
                if ( max == null || entry.getValue().compareTo(max) > 0) {
                    max = entry.getValue();
                }
            }
            return Optional.of(max);
        } else {
            return Optional.empty();
        }
    }

    public static void main(String[] args) {
        Task_08 demo = new Task_08();
        HashMap<Integer,String> hashMap = new HashMap<>();

        demo.getMaxValue(hashMap);
        System.out.println("Max value in hashMap: "+ demo.getMaxValue(hashMap));

        hashMap.put(2,"Banana");
        hashMap.put(3,"Cherry");
        hashMap.put(1,"Strawberry");

        demo.getMaxValue(hashMap);
        System.out.println("Max value in hashMap: "+ demo.getMaxValue(hashMap));

    }
}
