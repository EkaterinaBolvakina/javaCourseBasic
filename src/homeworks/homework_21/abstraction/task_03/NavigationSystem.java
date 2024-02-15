package homeworks.homework_21.abstraction.task_03;

abstract class NavigationSystem {

    String model;
    String producer;

    abstract void startNavigation();
    abstract void stopNavigation();

    public void getSignal(){
        System.out.println("Get signal");
    }
}
