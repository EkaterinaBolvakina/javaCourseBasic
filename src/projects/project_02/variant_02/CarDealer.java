package projects.project_02.variant_02;

import java.util.*;

public class CarDealer {
    private Map<String,Car> cars = new HashMap<>();
    private Comparator<Car> carComparatorRating = new CarComparatorRating();
    private Comparator<Car> carComparatorPrice = new CarComparatorPrice();
    private Comparator<Car> carComparatorYear = new CarComparatorYear();

    public void addCar(String vinNumber, Car car){
        cars.put(vinNumber,car);
        System.out.println("Car: "+car+" with VIN nr.:"+vinNumber+" is added");
    }

    public void removeCar(String vinNumber) {
        if (cars.containsKey(vinNumber)) {
            System.out.println("Car: " + cars.remove(vinNumber) + " with VIN number: " + vinNumber + " is removed");
        } else {
            System.out.println("Car with VIN number: " + vinNumber + " does not exist in collection");
        }
    }
    public void updateCarPrice(String vinNumber, Double newPrice) {
        if (cars.containsKey(vinNumber)) {
            System.out.println("Car: " + cars.get(vinNumber).getCarMake() +" "+ cars.get(vinNumber).getCarModel() + " with VIN number: " + vinNumber + " changed price: ");
            System.out.println("from: "+cars.get(vinNumber).getCarPrice());
            cars.get(vinNumber).setCarPrice(newPrice);
            System.out.println("to: "+cars.get(vinNumber).getCarPrice());

        } else {
            System.out.println("Car with VIN number: " + vinNumber + " not exist in collection");
        }
    }
    public void updateCarRating(String vinNumber, Integer newRating) {
        if (cars.containsKey(vinNumber)) {
            System.out.println("Car: " + cars.get(vinNumber).getCarMake() +" "+ cars.get(vinNumber).getCarModel() + " with VIN number: " + vinNumber + " updated rating: ");
            System.out.println("from: "+cars.get(vinNumber).getCarRating());
            cars.get(vinNumber).setCarRating(newRating);
            System.out.println("to: "+cars.get(vinNumber).getCarRating());

        } else {
            System.out.println("Car with VIN number: " + vinNumber + " not exist in collection");
        }
    }

    public void findCarByMake(String carMake) {
        System.out.println("List of all cars (make): "+carMake);
        boolean existCarMake = false;
        for (Map.Entry<String,Car> entry: cars.entrySet()) {
            if (entry.getValue().getCarMake().equals(carMake)) {
                System.out.println("Car VIN number: "+ entry.getKey());
                System.out.println(entry.getValue());
                existCarMake = true;
            }
        }
        if (!existCarMake) {
            System.out.println("Car with make: " + carMake + " not exist in collection");
        }
    }
    public void findCarByModel(String carModel) {
        System.out.println("List of all cars (model): "+carModel);
        boolean existCarModel = false;
        for (Map.Entry<String,Car> entry: cars.entrySet()) {
            if (entry.getValue().getCarModel().equals(carModel)) {
                System.out.println("Car VIN number: "+ entry.getKey());
                System.out.println(entry.getValue());
                existCarModel = true;
            }
        }
        if (!existCarModel) {
            System.out.println("Car model: " + carModel + " not exist in collection");
        }
    }
    public void findCarByManufactureYear(Integer yearOfCarManufacture) {
        System.out.println("List of all cars (year of manufacture): "+yearOfCarManufacture);
        boolean existCarYearOfManufacture = false;
        for (Map.Entry<String,Car> entry: cars.entrySet()) {
            if (entry.getValue().getYearOfCarManufacture().equals(yearOfCarManufacture)) {
                System.out.println("Car VIN number: "+ entry.getKey());
                System.out.println(entry.getValue());
                existCarYearOfManufacture = true;
            }
        }
        if (!existCarYearOfManufacture) {
            System.out.println("Car (year of manufacture): " + yearOfCarManufacture + " not exist in collection");
        }
    }
    public void sortByRating() {
        // Konvertiere die HashMap-Einträge in eine Liste von Cars
        List<Car> carList = new ArrayList<>(cars.values());

        // Sortiere die Liste basierend auf dem CarComparatorRating
        carList.sort(carComparatorRating.reversed());

        // Ausgabe der sortierten Liste
        System.out.println("List of cars sorted by rating (reversed):");
        for (Car car : carList) {
            System.out.println("VIN-Nummer: " + getVinByCar(car));
            System.out.println(car);
        }
    }
    public void sortByPrice() {
        // Konvertiere die HashMap-Einträge in eine Liste von Cars
        List<Car> carList = new ArrayList<>(cars.values());

        // Sortiere die Liste basierend auf dem CarComparatorRating
        carList.sort(carComparatorPrice.reversed());

        // Ausgabe der sortierten Liste
        System.out.println("List of cars sorted by price (reversed):");
        for (Car car : carList) {
            System.out.println("VIN-Nummer: " + getVinByCar(car));
            System.out.println(car);
        }
    }
    public void sortByYearOfManufacture() {
        // Konvertiere die HashMap-Einträge in eine Liste von Cars
        List<Car> carList = new ArrayList<>(cars.values());

        // Sortiere die Liste basierend auf dem CarComparatorRating
        carList.sort(carComparatorYear.reversed());

        // Ausgabe der sortierten Liste
        System.out.println("List of cars sorted by year of manufacture (reversed):");
        for (Car car : carList) {
            System.out.println("VIN-Nummer: " + getVinByCar(car));
            System.out.println(car);
        }
    }
    public void printAll() {
        System.out.println("List of all cars in our salon:");
        for (Map.Entry<String,Car> entry: cars.entrySet()) {
            System.out.println("VIN number: "+ entry.getKey());
            System.out.println(entry.getValue());
        }
    }
    private String getVinByCar(Car car) {
        for (Map.Entry<String, Car> entry : cars.entrySet()) {
            if (entry.getValue().equals(car)) {
                return entry.getKey();
            }
        }
        return null;
    }



}
