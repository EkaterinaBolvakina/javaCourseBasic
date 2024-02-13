package homeworks.homework_21.inheritance.task_01;

public class Bicycle extends Vehicle{

String colour;

    public Bicycle(String producer, String model, int speed, String colour) {
        super(producer, model, speed);
        this.colour = colour;
    }

    @Override
    public void startRoad() {
        System.out.println("Bike starts with "+getSpeed()+"km/h");
        System.out.println("Enjoy your road trip");
        System.out.println();
    }
}
