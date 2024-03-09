package projects.project_02.variant_02;

import projects.project_02.variant_02.entity.Car;
import projects.project_02.variant_02.service.CarDealer;

public class CarApp {
    public static void main(String[] args) {
        CarDealer carDealer = new CarDealer();
        carDealer.addCar("123",new Car("Audi","A5",2020,50000.99));
        carDealer.addCar("456",new Car("Audi","A4",2018,32000.99));
        carDealer.addCar("789",new Car("Audi","A6",2022,65000.99));
        carDealer.addCar("245",new Car("BMW","X",2022,55000.99));

        carDealer.removeCar("123");
        carDealer.removeCar("12456");

        carDealer.updateCarPrice("456",15000.99);
        carDealer.updateCarRating("456",5);
        carDealer.updateCarRating("789",1);
        carDealer.updateCarRating("123",5);

        carDealer.findCarByMake("BMW");
        carDealer.findCarByMake("Audi");
        carDealer.findCarByMake("VW");

        carDealer.findCarByModel("A4");
        carDealer.findCarByModel("X5");

        carDealer.findCarByManufactureYear(2022);
        carDealer.findCarByManufactureYear(2015);

        carDealer.sortByRating();
        carDealer.sortByPrice();
        carDealer.sortByYearOfManufacture();

        carDealer.printAll();

    }
}
