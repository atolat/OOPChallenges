package com.arpan;

/**
 * Created by arpanpune on 12/30/2015.
 */
public class Car extends Vehicle {
    private String engineMake;
    private int maxSpeed;
    private int mileage;
    private int gears;

    public Car(String make, String model, String color,  String engineMake, int maxSpeed, int mileage, int gears) {
        super(make, model, color, 4, 4);
        this.engineMake = engineMake;
        this.maxSpeed = maxSpeed;
        this.mileage = mileage;
        this.gears = gears;
    }

    @Override
    public void moveSpeed(int speed) {
        System.out.println("car.moveSpeed() called");
        super.moveSpeed(speed);

    }

    @Override
    public void moveDirection(String dir) {
        System.out.println("car.moveDirection() called");
        super.moveDirection(dir);
    }

    public String getEngineMake() {
        return engineMake;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getMileage() {
        return mileage;
    }

    public int getGears() {
        return gears;
    }
}
