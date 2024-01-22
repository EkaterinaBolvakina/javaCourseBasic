package lessons.lesson_05.carExample;

public class CarExampleProgram {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.producer = "BMW";
        car1.model = "S80";
        car1.maxSpeed = 290;
        car1.engine = "2455 cubic cm";

        Car car2 = new Car();
        car2.producer = "VW";
        car2.model = "x8";
        car2.maxSpeed = 250;
        car2.engine = "2200 cubic cm";

        car1.signal();
        car2.signal();

        car1.engineStart("Let`s start our trip by "+car1.producer+" !");
        car1.engineStop();

        car2.engineStart("Let`s start our trip by "+car2.producer+" !");
        car2.engineStop();


    }
}
