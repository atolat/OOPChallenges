package com.arpan;

public class Main {

    public static void main(String[] args) {
	VipCustomer bobby=new VipCustomer("Bobby",1000);
        System.out.println(bobby.getCustomerEmail()+"\n"+bobby.getCustomerName()+"\n"+bobby.getCreditLimit());

    }
}
