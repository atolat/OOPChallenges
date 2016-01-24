package com.arpan;

/**
 * Created by arpanpune on 12/30/2015.
 */
public class Honda extends Car{
    private String makeName;
    private String series;

    public Honda(String model, String color, String engineMake, int maxSpeed, int mileage, String makeName, String series) {
        super("Honda", model, color, engineMake, maxSpeed, mileage, 5);
        this.makeName = makeName;
        this.series = series;
    }

    public void gearOne(){
        moveSpeed(10);
    }

    public void gearTwo(){
        moveSpeed(20);
    }

    public void gearThree(){
        moveSpeed(30);
    }

    public void gearFour(){
        moveSpeed(40);
    }

    public void gearFive(){
        moveSpeed(50);
    }

    public void steerRight(){
        moveDirection("Right");
    }

    public void steerLeft(){
        moveDirection("Left");
    }

    public String getMakeName() {
        return makeName;
    }

    public String getSeries() {
        return series;
    }
}
