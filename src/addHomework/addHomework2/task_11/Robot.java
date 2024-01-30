package addHomework.addHomework2.task_11;

public class Robot {
    public void sayHello(){
        System.out.println("Hello!");
    }

    public Robot() {
    }
    public void sayYourName(){
        System.out.println("My name is "+name);
    }

    String name;

    public Robot(String name) {
        this.name = name;
    }
}
