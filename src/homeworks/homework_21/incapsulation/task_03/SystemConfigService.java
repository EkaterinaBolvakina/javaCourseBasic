package homeworks.homework_21.incapsulation.task_03;

import java.util.Objects;

public class SystemConfigService {
    private boolean checkNewLogLevel(String newLogLevel) {
        if (Objects.equals(newLogLevel, "INFO")) {
            return true;
        }
        return false;
    }
    public void changeLogLevel(String newLogLevel){
        SystemConfiguration systemConfiguration = new SystemConfiguration();
        if (checkNewLogLevel(newLogLevel)){
            systemConfiguration.setLoggingLevel(newLogLevel);
            System.out.println("LogLevel is correctly changed: ");
            System.out.println(systemConfiguration.getLoggingLevel());
        }else{
            System.out.println("Incorrect values");
        }
    }
}
