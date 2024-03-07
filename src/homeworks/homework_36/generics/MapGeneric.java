package homeworks.homework_36.generics;
/*
9)  Создайте класс Map для хранения пар ключ-значение. Реализуйте методы
    put(), get() и remove(). Используйте Generics для обеспечения
    типобезопасности и возможности хранения в Map объектов разных типов.
 */
import java.util.HashMap;
import java.util.Map;

public class MapGeneric <K, V>{
    private Map<K,V> map;
    public MapGeneric() {
        this.map = new HashMap<>();
    }

    public void put(K key, V value){
           map.put(key,value);
    }

    public V get(K key) {
        return map.get(key);
    }
    public void remove(K key) {
        map.remove(key);
    }

    public static void main(String[] args) {
        MapGeneric<Integer,String> mapGeneric = new MapGeneric<>();
        mapGeneric.put(1,"Banana");
        mapGeneric.put(2,"Apple");
        mapGeneric.put(3,"Kiwi");
        mapGeneric.put(4,"Kaki");
        mapGeneric.put(5,"Cherry");
        System.out.println("Value of key 4: "+mapGeneric.get(4));
        mapGeneric.remove(4);
        System.out.println("Value of key 4 after remove: "+mapGeneric.get(4));
    }
}
