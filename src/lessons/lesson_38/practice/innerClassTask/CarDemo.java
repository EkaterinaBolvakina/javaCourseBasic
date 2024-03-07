package lessons.lesson_38.practice.innerClassTask;

public class CarDemo {
    public static void main(String[] args) {
        Car carTwoDoors = new Car(2);
        Car.Door door = carTwoDoors.new Door(60,70);
        System.out.println("Is open? "+ door.isOpen());
        door.doorOpenClose(door.isOpen());

        System.out.println("Is open? "+ !door.isOpen());
        door.doorOpenClose(false);
        door.doorOpenClose(!door.isOpen());
    }
}
