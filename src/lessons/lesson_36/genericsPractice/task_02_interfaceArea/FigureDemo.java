package lessons.lesson_36.genericsPractice.task_02_interfaceArea;

public class FigureDemo {
    public static void main(String[] args) {
        Circle<Double> circle1 = new Circle<>(12.5);
        System.out.println("Circle area with radius as Double: "+circle1.area());

        Circle<Integer> circle2 = new Circle<>(12);
        System.out.println("Circle area with radius as Integer: "+circle2.area());

        Rectangle<Integer> rectangle1 = new Rectangle<>(12,20);
        System.out.println("Rectangle area with two lengths as Integers: "+rectangle1.area());

        Rectangle<Float> rectangle2 = new Rectangle<>(12.5678f, 20f);
        System.out.println("Rectangle area with two lengths as Floats: "+rectangle2.area());



    }
}
