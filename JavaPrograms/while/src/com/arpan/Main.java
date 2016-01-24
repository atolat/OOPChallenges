package com.arpan;

public class Main {

    public static void main(String[] args) {
	    int number = 5;
        int finishNumber = 20;
        int count = 0;
        while(number <= finishNumber)
        {
            if(!isEven(number))
            {
                number++;
                continue;
            }
            System.out.println("Number "+number+" is even");
            count++;
            number++;
            if(count==5)
                break;
        }
        System.out.println("The total number of even numbers are "+count);
    }
    public static boolean isEven(int n)
    {
        if(n%2==0)
            return true;
        return false;
    }
}
