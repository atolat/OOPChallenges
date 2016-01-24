package com.arpan;

public class Main {


    public static void main(String[] args) {
        int count=0;
	for (int i=1;i<=100;i++)
    {
        boolean primeTest = isPrime(i);
        if(primeTest==true){
            count++;
//            if(count==3)
//                break;
            System.out.println("The "+count+" prime number is "+i);
        }

    }System.out.println("The number of prime numbers in the range are "+count);
    }

    public static boolean isPrime(int n){
        if(n==1)
            return false;
        for(int i=2;i<=n/2;i++)
        {
            if(n%i==0)
                return false;

        }
        return true;
    }
}
