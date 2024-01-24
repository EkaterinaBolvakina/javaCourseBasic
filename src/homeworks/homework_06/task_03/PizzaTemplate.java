package homeworks.homework_06.task_03;

public class PizzaTemplate {

    int diameter;
    int caloriesInOneSquareCm;

    public PizzaTemplate(int diameter, int caloriesInOneSquareCm) {
        this.diameter = diameter;
        this.caloriesInOneSquareCm = caloriesInOneSquareCm;
    }

    public double caloriesCalculator (){
        double pi = 3.14159;
        double pizzaSquareCm = pi * (diameter * diameter) /4;
        double pizzaCalories = pizzaSquareCm * caloriesInOneSquareCm;
        return pizzaCalories;
    }
}
