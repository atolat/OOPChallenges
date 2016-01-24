package com.arpan;

/**
 * Created by arpanpune on 12/29/2015.
 */
public class VipCustomer {
    private String customerName;
    private double creditLimit;
    private String customerEmail;

    public VipCustomer(){
        this("xxxxx",99999,"xxxx@xxx.xxx");
    }


    public VipCustomer(String customerName) {
        this(customerName,99999,"xxxx@xxx.xxx");

    }

    public VipCustomer(String customerName, double creditLimit) {
        this(customerName,creditLimit,"xxxx@xxx.xxx");

    }

    public VipCustomer(String customerName, double creditLimit, String customerEmail) {
        this.customerName = customerName;
        this.creditLimit = creditLimit;
        this.customerEmail = customerEmail;
    }

    public String getCustomerName() {
        return customerName;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }
}
