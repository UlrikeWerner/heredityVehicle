package org.example.heredity;

import java.util.Objects;

public class Car extends Vehicle{
    protected int numberOfDoors;

    public Car(){
        super();
    }
    public Car(String brand, String model){
        super(brand, model);
    }
    public Car(String brand, String model, int numberOfDoors){
        super(brand, model);
        this.numberOfDoors = numberOfDoors;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand +
                ", model='" + model + '\'' +
                ", constructionYear=" + constructionYear + '\'' +
                ", numberOfDoors=" + numberOfDoors +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Car car = (Car) o;
        return numberOfDoors == car.numberOfDoors;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), numberOfDoors);
    }
}
