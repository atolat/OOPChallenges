package com.arpan;

/**
 * Created by arpanpune on 12/30/2015.
 */
public class Vehicle {
    private String make;
    private String model;
    private String color;
    private int wheels;
    private int doors;

    public Vehicle(String make, String model, String color, int wheels, int doors) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.wheels = wheels;
        this.doors = doors;
    }

    public void moveSpeed(int speed){
        System.out.println("The vehicle is moving at speed: "+speed);
    }

    public void moveDirection(String dir){
        System.out.println("The vehicle is moving in direction: "+dir);
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getWheels() {
        return wheels;
    }

    public int getDoors() {
        return doors;
    }
}
