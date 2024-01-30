package addHomework.addHomework2.task_11;

public class RobotDemo {
    public static void main(String[] args) {
        Robot robot1 = new Robot("Rider");
        System.out.println(robot1);
        robot1.sayHello();
        robot1.sayYourName();

        Robot robot2 = new Robot("James");
        System.out.println(robot2);
        robot2.sayHello();
        robot2.sayYourName();

        Robot robot3 = new Robot("Arko");
        System.out.println(robot3);
        robot3.sayHello();
        robot3.sayYourName();
    }
}
