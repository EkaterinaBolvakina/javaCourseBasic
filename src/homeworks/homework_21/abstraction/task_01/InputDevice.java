/*
### Задача 1: Устройства ввода

Создайте абстрактный класс InputDevice, который включает абстрактные методы connect и disconnect,
а также может содержать поля или неабстрактные методы, общие для всех устройств ввода.
От этого абстрактного класса наследуйте классы Keyboard и Mouse, реализуя абстрактные методы.
 */
package homeworks.homework_21.abstraction.task_01;

abstract class InputDevice {
    private String id;
    private String model;

    public InputDevice(String id, String model) {
        this.id = id;
        this.model = model;
    }

    abstract void connect();
    abstract void disconnect();

    public void signal(){
        System.out.println("get signal");
    }

    public String getId() {
        return id;
    }

    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return "InputDevice{" +
                "id='" + id + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
