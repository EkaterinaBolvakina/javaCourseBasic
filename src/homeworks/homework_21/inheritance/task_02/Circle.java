package homeworks.homework_21.inheritance.task_02;

public class Circle extends Shape{
    private double radius;

    public Circle(String title, double radius) {
        super(title);
        this.radius = radius;
    }


    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}
