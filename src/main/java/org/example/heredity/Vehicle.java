package org.example.heredity;

import java.util.Objects;

public class Vehicle {
    protected String brand;
    protected String model;
    protected int constructionYear;

    public Vehicle(){}

    public Vehicle(String brand, String model){
        this.brand = brand;
        this.model = model;
    }
    public Vehicle(String brand, String model, int constructionYear){
        this.brand = brand;
        this.model = model;
        this.constructionYear = constructionYear;
    }

    public String getBrand(){
        return this.brand;
    }
    public String getModel(){
        return this.model;
    }
    public int getConstructionYear(){
        return this.constructionYear;
    }
    public void setBrand(String brand){
        this.brand = brand;
    }
    public void setModel(String model){
        this.model = model;
    }
    public void setConstructionYear(int constructionYear){
        this.constructionYear = constructionYear;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", constructionYear=" + constructionYear +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return constructionYear == vehicle.constructionYear && Objects.equals(brand, vehicle.brand) && Objects.equals(model, vehicle.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, constructionYear);
    }
}
