package com.arpan;

public class Main {

    public static void main(String[] args) {
        for (int i=2; i<=8; i++)
        {
            double interestVal = calculateInterest(10000, i);
            System.out.println("The interest value for rate "+i+"% is equal to "+interestVal);
        }

    }
    public static double calculateInterest(double amount, double rate)
    {
        return (amount*(rate/100.0));

    }
}

//Create a for statement using any range of numbers
//determine if the number is prime
//if prime increment a counter that determines the number of prime numbers
//if the count is 3 exit the for loop