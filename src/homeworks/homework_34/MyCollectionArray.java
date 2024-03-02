package homeworks.homework_34;

import java.util.Arrays;

public class MyCollectionArray<E> {
    private static final int defaultSize = 5; // ЕМКОСТЬ ПО УМОЛЧАНИЮ
    private Object[] elements;
    private int size;

    public MyCollectionArray() {
        this.elements = new Object[defaultSize];
        this.size = 0;
    }

    // Добавление элемента в конец коллекции
    public void add(E element) {
        ensureCapacity();
        elements[size++] = element;
    }

    // Вставка элемента по указанному индексу
    public void add(int index, E element){
        checkIndex(index);
        ensureCapacity();

        // Сдвигаем существующие элементы вправо, начиная с конца
        for (int i = size; i > index; i--){
            elements[i] = elements[i-1];
        }

        elements[index] = element;
        size++;
    }

    // Удаление элемента по указанному индексу
    public void remove(int index) {
        if (checkIndex(index)) {

            // Сдвигаем существующие элементы влево, начиная с удаляемого элемента
            for (int i = index; i < size - 1; i++) {
                elements[i] = elements[i + 1];
            }

            elements[--size] = null;
        }
    }

    // Вспомогательный метод для увеличения емкости массива при необходимости
    private void ensureCapacity() {
        if (size == elements.length) {
            elements = extendArray();
        }
    }

    // Вспомогательный метод для расширения/увеличения емкости массива в два раза:
    private Object[] extendArray() {
        return elements = Arrays.copyOf(elements, size * 2);
    }

    // Вспомогательный метод для проверки корректности индекса при вставке / при удалении
    private Boolean checkIndex(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Index does not correspond to the parameters: Index = "+index+ " Size = "+size);
           return false;
        }return true;
    }

    // Возвращает текущий размер коллекции
    public int size() {
        return size;
    }

    @Override
    public String toString() {
        return Arrays.toString(elements);
    }
}
