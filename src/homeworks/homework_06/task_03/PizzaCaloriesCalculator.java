//## 3. Задание №3
//Напишите программу, которая вычисляет, сколько лишних калорий будет,
//если вместо пиццы диаметром 24 см вы купите пиццу диаметром 28 см.
//Чтобы решить эту проблему, предположим, что каждый квадратный сантиметр пиццы содержит 40 калорий.

package homeworks.homework_06.task_03;

public class PizzaCaloriesCalculator {
    public static void main(String[] args) {

    PizzaTemplate pizza1 = new PizzaTemplate(24,40);
    PizzaTemplate pizza2 = new PizzaTemplate(28,40);
    double resultOfExtraCalories = pizza2.caloriesCalculator() - pizza1.caloriesCalculator();
    System.out.println("If you eat the pizza with diameter "+pizza2.diameter+" cm, and not the same pizza with diameter "+pizza1.diameter+" cm, you'll get "+resultOfExtraCalories +" extra more Calories." );

    }
}
