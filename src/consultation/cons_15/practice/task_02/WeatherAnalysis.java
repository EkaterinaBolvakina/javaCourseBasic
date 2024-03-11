package consultation.cons_15.practice.task_02;

import java.util.function.Function;
import java.util.function.Predicate;

public class WeatherAnalysis {
    public static void main(String[] args) {

        WeatherData data = new WeatherData(28, "sunny");

        Predicate<WeatherData> isTemperatureValid = weatherData -> weatherData.getTemperature() >= -60 && weatherData.getTemperature() <= 50;

        Function<WeatherData, String> getDescriptionMessage = weatherData -> {

            switch (weatherData.getWeatherDescription().toLowerCase()) {
                case "sunny":
                    return "Don't forget the sunscreen!";
                case "cloudy":
                    return "You may need an umbrella.";
                case "rain":
                    return "Don't forget your umbrella!";
                default:
                    return "Today's weather: " + weatherData.getWeatherDescription();
            }
        };
        if (!isTemperatureValid.test(data)) {
            System.out.println("Not correct data about the temperature.");
        } else {
            System.out.println(getDescriptionMessage.apply(data));
        }
    }
}

