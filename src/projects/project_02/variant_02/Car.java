package projects.project_02.variant_02;

import java.util.Objects;

public class Car {
    private String carMake;
    private String carModel;
    private Integer yearOfCarManufacture;
    private Double carPrice;
    private Integer carRating;

    public Car(String carMake, String carModel, Integer yearOfCarManufacture, Double carPrice) {
        this.carMake = carMake;
        this.carModel = carModel;
        this.yearOfCarManufacture = yearOfCarManufacture;
        this.carPrice = carPrice;
    }

    public String getCarMake() {
        return carMake;
    }

    public String getCarModel() {
        return carModel;
    }

    public Integer getYearOfCarManufacture() {
        return yearOfCarManufacture;
    }

    public Double getCarPrice() {
        return carPrice;
    }

    public Integer getCarRating() {
        return carRating;
    }

    public void setCarRating(Integer carRating) {
        this.carRating = carRating;
    }

    public void setCarPrice(Double carPrice) {
        this.carPrice = carPrice;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carMake='" + carMake + '\'' +
                ", carModel='" + carModel + '\'' +
                ", yearOfCarManufacture='" + yearOfCarManufacture + '\'' +
                ", carPrice=" + carPrice +
                ", carRating=" + carRating +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(carMake, car.carMake) && Objects.equals(carModel, car.carModel) && Objects.equals(yearOfCarManufacture, car.yearOfCarManufacture) && Objects.equals(carPrice, car.carPrice) && Objects.equals(carRating, car.carRating);
    }

    @Override
    public int hashCode() {
        return Objects.hash(carMake, carModel, yearOfCarManufacture, carPrice, carRating);
    }
}
