/*
#### Задача 2: Фигуры
Определите абстрактный класс `Shape` с методом для вычисления площади.
Создайте классы `Circle`, `Rectangle` и `Triangle`, наследующие `Shape` и
реализующие метод вычисления площади в соответствии с формой каждой фигуры.

 */
package homeworks.homework_21.inheritance.task_02;

public class DemoArea
{
    public static void main(String[] args) {
        Circle circle = new Circle("circle",10);
        Rectangle rectangle = new Rectangle("rectangle",5,8);
        Triangle triangle = new Triangle("triangle",20,15);

        Shape[] shapes = {circle,rectangle,triangle};

        double allAreas = 0;

        for (int i = 0; i < shapes.length; i++) {
            allAreas = allAreas + shapes[i].calculateArea();
        }
        System.out.println("Area of all shapes: "+allAreas);



    }
}
