/*
4. Создайте 2 массива из 5 случайных целых чисел из отрезка [0;5] каждый
   Выведите массивы на экран в двух отдельных строках
   Посчитайте среднее арифметическое элементов каждого массива и сообщите,
   для какого из массивов это значение оказалось больше (либо сообщите, что их средние арифметические равны)
 */
package homeworks.homework_19.task_04;

public class Demo {
    public static void main(String[] args) {
        Methods demo = new Methods();
        int[] arrayOne = demo.createAndFillArrayOne();
        int[] arrayTwo = demo.createAndFillArrayTwo();
        demo.printArrays(arrayOne,arrayTwo);
        double avgOne = demo.calculateAverageArrayOne(arrayOne);
        double avgTwo = demo.calculateAverageArrayTwo(arrayTwo);
        demo.compareAverages(avgOne, avgTwo);
    }
}
