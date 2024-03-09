package projects.project_02.variant_02.service;

import projects.project_02.variant_02.entity.Car;

import java.util.Comparator;

public class CarComparatorPrice implements Comparator<Car> {
    @Override
    public int compare(Car car1, Car car2) {
        Double price1 = (car1 != null && car1.getCarPrice() != null) ? car1.getCarPrice() : 0;
        Double price2 = (car2 != null && car2.getCarPrice() != null) ? car2.getCarPrice() : 0;
        return Double.compare(price1, price2);
    }
}
