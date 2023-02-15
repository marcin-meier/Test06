package test02.zad2;

import java.util.ArrayList;

public class Car {
    private String brand;
    private int width;
    private String fuelType;
    private int price;

    public Car(String brand, int width, String fuelType, int price) {
        this.brand = brand;
        this.width = width;
        this.fuelType = fuelType;
        this.price = price;
    }


    public String getBrand() {
        return brand;
    }

    public int getWidth() {
        return width;
    }

    public String getFuelType() {
        return fuelType;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return brand;
    }


}
