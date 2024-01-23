package lessons.lesson_06.publicAndPrivate.car;

import lessons.lesson_06.publicAndPrivate.car.entity.Car;

public class CarDemo {
    public static void main(String[] args) {
        Car car1 = new Car ("Mercedes");
        car1.colour = "White";
        car1.model = "GLC 250";


        System.out.println(car1.getProducer());
    }

}
