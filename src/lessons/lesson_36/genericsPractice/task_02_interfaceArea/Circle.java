package lessons.lesson_36.genericsPractice.task_02_interfaceArea;

public class Circle<T extends Number> implements Figure {
private T radius;

    public Circle(T radius) {
        this.radius = radius;
    }

    public T getRadius() {
        return radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }

    @Override
     public Object area() {
      return   3.14 * (radius.doubleValue() * radius.doubleValue());
    }
}
