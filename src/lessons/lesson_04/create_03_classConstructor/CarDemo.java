package lessons.lesson_04.create_03_classConstructor;

public class CarDemo {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.producer = "VW";
        car1.model = "GLC 250";
        car1.maxSpeed = 200;
        car1.printCarData();

        Car car2 = new Car();
        car2.producer = "BMW";
        car2.model = "M3";
        car2.maxSpeed = 280;
        car2.printCarData();

        Car car3withConstructor = new Car("Volvo", "S80", 260);
        car3withConstructor.printCarData();
    }
}
