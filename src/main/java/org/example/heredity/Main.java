package org.example.heredity;

public class Main {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Tesla", "Semi");
        v1.setConstructionYear(2022);
        Car c1 = new Car("Opel", "CorsaC", 4);
        c1.setConstructionYear(2012);
        Motorcycle m1 = new Motorcycle("Honda", "Chopper", "red");
        m1.setConstructionYear(2001);
        System.out.println(v1);
        System.out.println();
        System.out.println(c1);
        System.out.println();
        System.out.println(m1);
    }
}
