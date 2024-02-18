package homeworks.homework_21.incapsulation.task_03;

public class SystemConfigApp {
    public static void main(String[] args) {

        SystemConfigService systemConfigService = new SystemConfigService();
        systemConfigService.changeLogLevel("INFO");

    }
}
