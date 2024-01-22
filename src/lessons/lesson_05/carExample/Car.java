package lessons.lesson_05.carExample;

public class Car {
    public String model;
    public String producer;
    public int maxSpeed;
    public String engine;

    public void signal(){System.out.println("Car "+model+" beeps!");}
    public void engineStart(String message){
        System.out.println(message);
        System.out.println("Car "+producer+" "+model+" turned on the engine");
        System.out.println("Engine type: "+engine);
    }
    public void engineStop () {System.out.println("Car "+producer+" "+model+" turned off the engine");}
}
