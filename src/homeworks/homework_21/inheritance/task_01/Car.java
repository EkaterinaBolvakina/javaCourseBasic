package homeworks.homework_21.inheritance.task_01;

public class Car extends Vehicle {

    private int doorsNumber;

    public Car(String producer, String model, int speed, int doorsNumber) {
        super(producer, model, speed);
        this.doorsNumber = doorsNumber;
    }

    @Override
    public void startRoad() {
        super.startRoad();
    }
}
