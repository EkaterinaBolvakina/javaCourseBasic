package homeworks.homework_21.abstraction.task_03;

public class DemoNavigationSystems {
    public static void main(String[] args) {
        CarNavigationSystem carNavigationSystem = new CarNavigationSystem();
        MarineNavigationSystem marineNavigationSystem = new MarineNavigationSystem();
        marineNavigationSystem.startNavigation();
        marineNavigationSystem.stopNavigation();
        System.out.println();
        carNavigationSystem.startNavigation();
        carNavigationSystem.getSignal();
        carNavigationSystem.stopNavigation();
    }
}
