//Задача 3.
// Дано трехзначное число (произвольное).
// Создать три переменные в которые с помощью математических действий присвоить цифры этого числа
// Вывести на экран все переменные (не напечатать цифры, а именно получить значения переменных).
//Пример: 345 Вывод в консоль: Число 345 -> 3, 4, 5

package homeworks.homework_02;
public class Task03 {
    public static void main(String[] args) {
        //Variant 1:
        int x;
        int y;
        int z;
        x = 3;
        y = 4;
        z = 5;
        System.out.println("Variant1: Число "+x+y+z +" -> "+x +", "+y +", "+z);
        //Variant 2:
        int a = 345;
        int a1 = a/100;
        int a2 = (a/10) % 10;
        int a3 = a % 10;
        System.out.println("Variant2: Число " +a +" -> "+a1+", "+a2+", "+a3);
    }
}
