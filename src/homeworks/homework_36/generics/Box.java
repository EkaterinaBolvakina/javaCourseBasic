package homeworks.homework_36.generics;
/*
1)  Создайте класс Box для хранения любых объектов и реализуйте методы
    get() и put() для чтения и записи объектов в коробку.
    Используйте Generics для обеспечения типобезопасности.

2)  Напишите метод printList, который принимает список объектов и
    выводит их на экран. Используйте Generics для обеспечения
    типобезопасности и возможности передачи списка объектов любого типа.
 */
import java.util.ArrayList;
import java.util.List;

public class Box <T> {
    private T object;

    public T get() {
        return object;
    }

    public void put(T object) {
        this.object = object;
    }
    public <T> void printList(List<T> list){
        for (T item : list){
            System.out.println(item);
        }
    }

    public static void main(String[] args) {
        // Using class Box with different data types:
        Box<String> stringBox = new Box<>();
        stringBox.put("Put String in box");
        String message = stringBox.get();
        System.out.println(message);

        Box<Integer> integerBox = new Box<>();
        integerBox.put(25);
        int integer = integerBox.get();
        System.out.println("Integer in box: "+integer);

        Box<List<Double>> listBox = new Box<>();
        List<Double> doubleList = new ArrayList<>();
        doubleList.add(23.45);
        doubleList.add(56.89);
        listBox.put(doubleList);
        System.out.println("Collection array list in box: "+listBox.get());

        listBox.printList(doubleList);

    }
}
