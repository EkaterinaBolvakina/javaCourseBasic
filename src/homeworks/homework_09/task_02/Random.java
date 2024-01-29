//**Task 2**
//
//- Запишите в 4 переменные случайные числа от 0 до 100
//- Выведите все 4 на экран
//- Программа должна определить максимальное из этих четырех чисел
//- Результат вывести на экран

package homeworks.homework_09.task_02;

public class Random {
    public static void main(String[] args) {

        /* Theorie:
           double double1 = Math.random();
           System.out.println(double1);
           Die mathematische Methode random generiert die zufällige Zahl zwischen [0;1)

           Aber wie bekommt man eine Zahl zwischen 100 und 500 mit
           min = 100 und max = 500?
           Dafür kann man diese Formel nutzen:
           min + random() * ( max - min + 1) oder
           random() * ( max - min + 1) + min
           !!!wenn aber min = 0, dann: random() * ( max - min ) + min
         */
        int min = 0;
        int max = 99;
        //- Запишите в 4 переменные случайные числа от 0 до 100
        long num1 = Math.round(Math.random() * (max - min + 1) + min);
        long num2 = Math.round(Math.random() * (max - min + 1) + min);
        long num3 = Math.round(Math.random() * (max - min + 1) + min);
        long num4 = Math.round(Math.random() * (max - min + 1) + min);
        //- Выведите все 4 на экран
        System.out.println("1st number: " + num1);
        System.out.println("2nd number: " + num2);
        System.out.println("3rd number: " + num3);
        System.out.println("4th number: " + num4);
        //- Программа должна определить максимальное из этих четырех чисел
        //Variant 1 with Math.max()
        long maxOfNumbersOneAndTwo = Math.max(num1, num2);
        long maxOfNumbersThreeAndFour = Math.max(num3, num4);
        long maxOfNumbers = Math.max(maxOfNumbersOneAndTwo, maxOfNumbersThreeAndFour);
        //- Результат вывести на экран
        System.out.println("Max of these 4 numbers (Math.max): " + maxOfNumbers);

        //Variant 2 with if-else:
        //- Программа должна определить максимальное из этих четырех чисел with if-else:
        if ((num4 > num1) && (num4 > num2) && (num4 > num3)){
                    System.out.println("Max of these 4 numbers (IF-ELSE): " + num4);
        } else if ((num3 > num1) && (num3 > num2) && (num3 > num4) ){
                    System.out.println("Max of these 4 numbers (IF-ELSE): " + num3);
        } else if ((num2 > num1) && (num2 > num3) && (num2 > num4)){
                    System.out.println("Max of these 4 numbers (IF-ELSE): " + num2);
                }else {
                     System.out.println("Max of these 4 numbers (IF-ELSE): " + num1);
                 }
        }
    }

