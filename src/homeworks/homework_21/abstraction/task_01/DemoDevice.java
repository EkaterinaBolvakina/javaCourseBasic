package homeworks.homework_21.abstraction.task_01;

public class DemoDevice {
    public static void main(String[] args) {
        Keyboard keyboard = new Keyboard("1","Super keyboard");
        Mouse mouse = new Mouse("1","Super mouse");
        keyboard.print();
        keyboard.connect();
        keyboard.signal();
        keyboard.disconnect();
        System.out.println();
        mouse.connect();
        mouse.disconnect();

    }
}
