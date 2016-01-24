package com.arpan;

/**
 * Created by arpanpune on 12/29/2015.
 */
public class BankAcc {
    private int accountNumber;
    private int balance;
    private String customerName;
    private String customerEmail;
    private int phoneNumber;

    public void setAccountNumber(int accountNumber)
    {
        this.accountNumber=accountNumber;
    }

    public int getAccountNumber()
    {
        return this.accountNumber;
    }

    public void setBalance(int balance)
    {
        this.balance=balance;
    }

    public int getBalance()
    {
        return this.balance;
    }

    public void setCustomerName(String customerName)
    {
        this.customerName=customerName;
    }

    public String getCustomerName()
    {
        return this.customerName;
    }

    public void setCustomerEmail(String customerEmail)
    {
        this.customerEmail=customerEmail;
    }

    public String getCustomerEmail()
    {
        return this.customerEmail;
    }

    public void setPhoneNumber(int phoneNumber)
    {
        this.phoneNumber=phoneNumber;
    }

    public int getPhoneNumber()
    {
        return this.phoneNumber;
    }

    public void depositFunds(int amt)
    {
        this.balance = this.balance + amt;
       // return this.balance;
    }

    public void withdrawFunds(int amt)
    {
        if(amt <= this.balance)
        {
            this.balance = this.balance - amt;
            //return this.balance;
        }
        else {
           // return -1;
            System.out.println("Insufficient Balance");
        }
    }
}

