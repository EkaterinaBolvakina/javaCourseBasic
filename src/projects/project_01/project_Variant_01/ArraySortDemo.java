/*
Вариант 1.

Задание: Создайте класс ArrayService, содержащий метод sort,
который принимает массив целых чисел и сортирует его по убыванию.

Добавьте метод createArrayFromUserInput для чтения размера
массива и его создания.

Добавьте метод fillArrayFromUserInput для заполнения
массива элементами от пользователя, возвращая созданный
массив как ссылку.

Добавьте метод printArray для вывода отсортированного массива.

Реализуйте класс ArraySortDemo для демонстрации работы программы.
 */
package projects.project_01.project_Variant_01;

public class ArraySortDemo {
    public static void main(String[] args) {
        ArrayService demo = new ArrayService();
        int[] array = demo.createArrayFromUserInput();
        int[] filledArray = demo.fillArrayFromUserInput(array);
        demo.printArray(filledArray);
    }
}
