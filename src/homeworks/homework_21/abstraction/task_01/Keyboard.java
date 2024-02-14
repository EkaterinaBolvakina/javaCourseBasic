package homeworks.homework_21.abstraction.task_01;

public class Keyboard extends InputDevice{


    public Keyboard(String id, String model) {
        super(id, model);
    }

    @Override
    void connect() {
        System.out.println("Keyboard is connected");
    }

    @Override
    void disconnect() {
        System.out.println("Keyboard is disconnected");
    }


    public void print() {
        System.out.println(getModel()+" Nr."+getId());
    }
}
