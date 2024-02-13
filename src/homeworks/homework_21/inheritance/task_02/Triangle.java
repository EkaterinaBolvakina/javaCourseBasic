package homeworks.homework_21.inheritance.task_02;

public class Triangle extends Shape{
    private double base;
    private double height;

    public Triangle(String title, double base, double height) {
        super(title);
        this.base = base;
        this.height = height;
    }

    @Override
    double calculateArea() {
        return (0.5 * base * height);
    }
}
