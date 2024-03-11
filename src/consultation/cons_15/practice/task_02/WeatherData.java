package consultation.cons_15.practice.task_02;

public class WeatherData {
    private Integer temperature;
    private String weatherDescription;

    public WeatherData(Integer temperature, String weatherDescription) {
        this.temperature = temperature;
        this.weatherDescription = weatherDescription;
    }

    public Integer getTemperature() {
        return temperature;
    }

    public String getWeatherDescription() {
        return weatherDescription;
    }

    @Override
    public String toString() {
        return "WeatherData{" +
                "temperature=" + temperature +
                ", weatherDescription='" + weatherDescription + '\'' +
                '}';
    }
}
