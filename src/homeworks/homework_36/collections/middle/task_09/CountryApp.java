package homeworks.homework_36.collections.middle.task_09;
/*
9 Create a HashMap mapping where the key is an object of class Country and
the value is a list of strings (names of cities in this country).
Then add several cities for each country and display all countries on the console in alphabetical order.
 */
import java.util.ArrayList;
import java.util.List;

public class CountryApp {
    public static void main(String[] args) {
        CountryService service = new CountryService();

        List<String> cities1 = new ArrayList<>();
        service.addCity("Hamburg",cities1);
        service.addCity("Berlin",cities1);
        service.addCity("Cologne",cities1);
        service.addCity("Münster",cities1);

        service.addCitiesToCountry("Germany",cities1);

        List<String> cities2 = new ArrayList<>();
        service.addCity("Moscow",cities2);
        service.addCity("St.Petersburg",cities2);
        service.addCity("Novosibirsk",cities2);

        service.addCitiesToCountry("Russia",cities2);

        List<String> cities3 = new ArrayList<>();
        service.addCity("London",cities3);
        service.addCity("Manchester",cities3);
        service.addCity("Birmingham",cities3);

        service.addCitiesToCountry("England",cities3);

        service.printAllCountries();
    }
}
