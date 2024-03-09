package projects.project_02.variant_02;

import java.util.Comparator;

public class CarComparatorYear implements Comparator<Car> {
    @Override
    public int compare(Car car1, Car car2) {
        Integer year1 = (car1 != null && car1.getYearOfCarManufacture() != null) ? car1.getYearOfCarManufacture() : 0;
        Integer year2 = (car2 != null && car2.getYearOfCarManufacture() != null) ? car2.getYearOfCarManufacture() : 0;
        return Integer.compare(year1, year2);
    }
}
