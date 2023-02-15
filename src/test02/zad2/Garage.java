package test02.zad2;

import java.util.*;

public class Garage {

    private final int numberOfSpaces;
    private final boolean lpgAllowed;
    private final int spaceWidth;
    private final String address;
    final List<Car> cars = new ArrayList<>();


    public Garage(String address, int numberOfSpaces, boolean lpgAllowed, int spaceWidth) {
        this.numberOfSpaces = numberOfSpaces;
        this.lpgAllowed = lpgAllowed;
        this.spaceWidth = spaceWidth;
        this.address = address;
    }

    public List<Car> getCars() {
        return cars;
    }

    public String getAddress() {
        return address;
    }

    public int getNumberOfSpaces() {
        return numberOfSpaces;
    }

    public boolean addCar(Car car) {
        if (cars.size() >= numberOfSpaces) {
            System.out.println("No free space in this garage");
            return false;
        }
        if (!lpgAllowed && car.getFuelType().equals("LPG")) {
            System.out.println("You cannot park your LPG car in this garage");
            return false;
        }
        if (car.getWidth() > spaceWidth) {
            System.out.println("Your car is to wide for this garage");
            return false;
        }
        cars.add(car);
        System.out.println("Your car has been added");
        return true;
    }


    public String carMakesMaxRepetition() {
        Map<String, Integer> map = new HashMap<>();
        String mostOftenMake = null;
        int max = Integer.MIN_VALUE;
        for (Car car : cars)
            if (map.containsKey(car.getBrand()))
                map.put(car.getBrand(), map.get(car.getBrand()) + 1);
            else
                map.put(car.getBrand(), 1);

        for (Map.Entry<String, Integer> entry : map.entrySet())
            if (entry.getValue() > max) {
                max = entry.getValue();
                mostOftenMake = entry.getKey();
            }
        return mostOftenMake;
    }

    public String carFuelTypeMaxRepetition() {
        Map<String, Integer> map = new HashMap<>();
        String mostOftenFuelType = null;
        int max = Integer.MIN_VALUE;
        for (Car car : cars)
            if (map.containsKey(car.getFuelType()))
                map.put(car.getFuelType(), map.get(car.getFuelType()) + 1);
            else
                map.put(car.getFuelType(), 1);

        for (Map.Entry<String, Integer> entry : map.entrySet())
            if (entry.getValue() > max) {
                max = entry.getValue();
                mostOftenFuelType = entry.getKey();
            }
        return mostOftenFuelType;
    }

    public Car mostExpensiveCar() {
        Car tmp = cars.get(0);
        for (Car car : cars)
            if (car.getPrice() >= tmp.getPrice()) {
                tmp = car;
            }
        return tmp;
    }

    public int averagePrice() {
        int sumOfPrices = 0;
        for (Car car : cars)
            sumOfPrices += car.getPrice();
        return sumOfPrices / cars.size();
    }
}










