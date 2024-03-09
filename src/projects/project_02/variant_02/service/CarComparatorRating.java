package projects.project_02.variant_02.service;

import projects.project_02.variant_02.entity.Car;

import java.util.Comparator;

public class CarComparatorRating implements Comparator<Car> {
    @Override
    public int compare(Car car1, Car car2) {
        Integer rating1 = (car1 != null && car1.getCarRating() != null) ? car1.getCarRating() : 0;
        Integer rating2 = (car2 != null && car2.getCarRating() != null) ? car2.getCarRating() : 0;
        return Integer.compare(rating1, rating2);
    }
}
