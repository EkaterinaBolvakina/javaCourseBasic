package lessons.lesson_04.create_03_classConstructor;

public class Car {
    String model;
    String producer;
    int maxSpeed;
    //Constructor 1:
    public Car(){}
    //Constructor 2:
    public Car(String p, String m, int mS) {
        model = m;
        producer = p;
        maxSpeed = mS;
    }
    //Method:
    public void printCarData(){
        System.out.println("Car`s characteristics:");
        System.out.println("Producer: " + producer);
        System.out.println("Model: "+ model);
        System.out.println("Max speed: " + maxSpeed);
    }
}
