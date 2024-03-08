package homeworks.homework_36.collections.middle.task_09;

import java.util.*;

public class CountryService {
    HashMap<Country, List<String>> countryListHashMap = new HashMap<>();

    public void addCity(String city,List<String> cities) {
       cities.add(city);
    }

    public void addCitiesToCountry(String country,List<String> cities) {
        countryListHashMap.put(new Country(country),cities);
    }
    public void printAllCountries() {
        // Create a TreeSet to automatically sort countries
        Set<Country> sortedCountries = new TreeSet<>(countryListHashMap.keySet());

        for (Country country : sortedCountries) {
            System.out.println(country);
            System.out.println("Cities: " + countryListHashMap.get(country));
        }
    }
}
