package org.example.heredity;

import java.util.Objects;

public class Motorcycle extends Vehicle{
    protected String color;

    public Motorcycle(){
        super();
    }
    public Motorcycle(String brand, String model){
        super(brand, model);
    }
    public Motorcycle(String brand, String model, String color){
        super(brand, model);
        this.color = color;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Motorcycle{" +
                "brand='" + brand +
                ", model='" + model + '\'' +
                ", constructionYear=" + constructionYear + '\'' +
                ", color=" + color +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Motorcycle that = (Motorcycle) o;
        return Objects.equals(color, that.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), color);
    }
}
