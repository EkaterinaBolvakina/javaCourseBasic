package homeworks.homework_21.inheritance.task_01;

public class DemoVehicle {
    public static void main(String[] args) {
        Car car1 = new Car("BMW","TYP5",50,4);
        Bicycle bike1 = new Bicycle("Continental","h45",20,"Red");
        car1.startRoad();
        bike1.startRoad();
    }
}
