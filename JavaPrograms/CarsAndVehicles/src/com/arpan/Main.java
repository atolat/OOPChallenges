package com.arpan;

public class Main {

    public static void main(String[] args) {
	Honda newHonda = new Honda("Civic","Black","V10",150,20,"cruiser","2016");

        System.out.println(newHonda.getMakeName());
        newHonda.gearFive();
        newHonda.steerRight();
        newHonda.steerLeft();
        newHonda.steerRight();
    }
}
