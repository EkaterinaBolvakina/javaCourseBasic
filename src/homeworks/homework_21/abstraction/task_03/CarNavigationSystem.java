package homeworks.homework_21.abstraction.task_03;

public class CarNavigationSystem extends NavigationSystem{

    @Override
    public void getSignal() {
        super.getSignal();
    }

    @Override
    void startNavigation() {
        System.out.println("Car navi system is ON");
    }

    @Override
    void stopNavigation() {
        System.out.println("Car navi system is OUT");
    }
}
