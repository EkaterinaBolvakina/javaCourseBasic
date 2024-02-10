/*
5. Пользователь должен ввести с клавиатуры размер массива - натуральное число больше 3.
   Введенное пользователем число сохраняется в переменную n.
   Если пользователь ввёл не подходящее число, то программа должна просить пользователя повторить ввод.
   Создать массив из n случайных целых чисел из отрезка [0;n] и вывести его на экран.
   Создать второй массив только из чётных элементов первого массива, если они там есть, и вывести его на экран.
 */
package homeworks.homework_19.task_05;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        Methods demo = new Methods();
        int size = demo.inputUserArraySize();
        int[] arrayOne = demo.createArrayOne(size);
        System.out.println(Arrays.toString(arrayOne));
        demo.createAndPrintArrayTwo(arrayOne);

    }
}
