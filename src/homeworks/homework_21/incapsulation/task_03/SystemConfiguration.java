/*
#### Задача 3: Конфигурация системы
Разработайте класс `SystemConfiguration`, который хранит конфигурационные параметры системы
(например, уровень логирования, путь к файлам логов).
Доступ к изменению этих параметров должен быть строго контролируемым через методы,
предотвращающие установку некорректных значений.

 */
package homeworks.homework_21.incapsulation.task_03;

import java.util.Objects;

public class SystemConfiguration {
    private String loggingLevel;
    private String logFilePath;

    public String getLoggingLevel() {
        return loggingLevel;
    }

    public String getLogFilePath() {
        return logFilePath;
    }

    public void setLoggingLevel(String loggingLevel) {
        this.loggingLevel = loggingLevel;
    }

    @Override
    public String toString() {
        return "SystemConfiguration{" +
                "loggingLevel='" + loggingLevel + '\'' +
                ", logFilePath='" + logFilePath + '\'' +
                '}';
    }
}
