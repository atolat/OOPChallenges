package com.arpan;

public class Main {

    public static void main(String[] args) {
	    double myDouble=20;
        double myNewDouble=80;
        double myResult= (myDouble+myNewDouble)*25d;
        double myNewResult= myResult%2300d;
        if (myNewResult <= 200d)
        {
        System.out.println("Total was over limit");
    }
}}
