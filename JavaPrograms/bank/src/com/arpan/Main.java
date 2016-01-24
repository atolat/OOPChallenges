package com.arpan;

public class Main {

    public static void main(String[] args) {
	BankAcc accountOne = new BankAcc();
        accountOne.setCustomerName("Julio");
        accountOne.setBalance(10000);
        accountOne.setAccountNumber(01);
        accountOne.setCustomerEmail("julio@gmail.com");
        accountOne.setPhoneNumber(12345);

        System.out.println("Account Details: ");
        System.out.println("Customer Name: "+accountOne.getCustomerName());
        System.out.println("Account Number: "+accountOne.getAccountNumber());
        System.out.println("Account Balance: "+accountOne.getBalance());
        System.out.println("Customer Email id: "+accountOne.getCustomerEmail());
        System.out.println("Phone Number: "+accountOne.getPhoneNumber());

        accountOne.depositFunds(500);
        accountOne.withdrawFunds(100000);
        //withdrawFund(accountOne,600);

        System.out.println("Account Balance: "+accountOne.getBalance());

    }

//    public static void withdrawFund(BankAcc accountOne,int amt)
//    {
//      int newBalance = accountOne.withdrawFunds(amt);
//        if(newBalance==-1)
//            System.out.println("Insufficient Balance");
//    }
}
