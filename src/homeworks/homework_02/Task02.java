//Задача 2:
// Создать класс. Объявить метод main.
// В методе main инициализировать переменные для всех примитивных типов.
// Вывести их результат в консоль

package homeworks.homework_02;

public class Task02 {
    public static void main(String[] args) {
      // Define primitive values:
        // Integer:
        byte xByte = 125;
        short xShort = -31245;
        int xInt = 235675;
        long xLong = 5368;
        // Fractional:
        float xFloat = 5.34f;
        double xDouble = 101.23753;
        // Textual:
        char colourOfCap = 'R';
        // Logical:
        boolean sweet = true;
System.out.println("Byte Variable = " + xByte);
System.out.println("Short Variable = " +xShort);
System.out.println("Int Variable = "+ xInt);
System.out.println("Float Variable = " + xFloat);
System.out.println("Double Variable = " + xDouble);
System.out.println("Char Variable Colour Of Cap = " + colourOfCap);
System.out.print("Boolean Variable SWEET = " + sweet);
    }
}
