package homeworks.homework_21.abstraction.task_03;

public class MarineNavigationSystem extends NavigationSystem{
    @Override
    void startNavigation() {
        System.out.println("Marine navigation system is ready to start");
    }

    @Override
    void stopNavigation() {
        System.out.println("Marine navigation system stopped");
    }
}
