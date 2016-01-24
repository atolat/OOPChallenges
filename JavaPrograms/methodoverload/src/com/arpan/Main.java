package com.arpan;

public class Main {

    public static void main(String[] args) {
        double myResult = calcFeetAndInchestoCentimeters(5,7);
        System.out.println(myResult+"cm");

        double mynewResult = calcFeetAndInchestoCentimeters(186);
        System.out.println(mynewResult+"cm");

    }
    public static double calcFeetAndInchestoCentimeters(double feet, double inches)
    {
        if((feet>=0) && (inches>=0) && (inches<=12))
        {
            double feetToInch = feet*12;
            inches = feetToInch + inches;
            double inchToCentimeter = inches * 2.54;
            return inchToCentimeter;


        }
        return -1;
    }


    public static double calcFeetAndInchestoCentimeters(double inches)
    {
        if(inches>=0)
        {
//            double inchToCentimeter = inches * 2.54;
//            return inchToCentimeter;
            double valueFeet = (int)(inches/12);
            double valueInches= inches%12;
            return calcFeetAndInchestoCentimeters(valueFeet,valueInches);



        }
        return -1;
    }
}
