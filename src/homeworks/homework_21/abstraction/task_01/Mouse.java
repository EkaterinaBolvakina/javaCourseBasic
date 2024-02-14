package homeworks.homework_21.abstraction.task_01;

public class Mouse extends InputDevice {

    public Mouse(String id, String model) {
        super(id, model);
    }

    @Override
    void connect() {
        System.out.println("Mouse is connected");
    }

    @Override
    void disconnect() {
        System.out.println("Mouse is disconnected");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
