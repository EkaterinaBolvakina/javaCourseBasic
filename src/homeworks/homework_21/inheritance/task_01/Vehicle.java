/*
#### Задача 1: Транспортное средство
Создайте базовый класс `Vehicle` с общими свойствами и методами для транспортных средств.
Затем создайте производные классы `Car` и `Bicycle`, расширяющие класс `Vehicle`,
добавляя специфические свойства и методы (например, количество дверей для автомобиля).

 */
package homeworks.homework_21.inheritance.task_01;

public class Vehicle {
    private String producer;
    private String model;
    private int speed;

    public Vehicle(String producer, String model, int speed) {
        this.producer = producer;
        this.model = model;
        this.speed = speed;
    }

    public String getProducer() {
        return producer;
    }

    public String getModel() {
        return model;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void startRoad(){
        System.out.println(model);
        System.out.println("Beeepp beeep");
        System.out.println("start with "+speed+"km/h");
        System.out.println();
    }


}
