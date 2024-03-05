package homeworks.homework_36.generics;
/*
4)  Напишите метод findMax, который принимает массив объектов и возвращает
    наибольший из них. Используйте Generics для обеспечения возможности
    передачи массива объектов любого типа.
 */
public class FindMax {
    public <T extends Comparable<T>> T findMax(T[] array){
        if (array == null || array.length == 0){
            return null;
        }
        T max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i].compareTo(max) > 0){
                max = array[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        String[] stringArray = {"Anna", "Roman", "Oleg", "Olga", "Andrej"};
        Integer[] intArray = {1, 2, 5, 4, 1};
        Double[] doubleArray = {1.5, 2.3, 1.9, 16.4, 2.8};

        FindMax findMaxDemo = new FindMax();
        String maxString = findMaxDemo.findMax(stringArray);
        Integer maxInteger = findMaxDemo.findMax(intArray);
        Double maxDouble = findMaxDemo.findMax(doubleArray);

        System.out.println("Max String: "+maxString);
        System.out.println("Max Integer: "+maxInteger);
        System.out.println("Max Double: "+maxDouble);


    }
}
