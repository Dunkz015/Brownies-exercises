package com.inatel.brownies.customer;

import com.inatel.brownies.brownie.Brownie;

public class Customer {

    private String name;
    private double money;
    /*------------------------------------------------------------------------*/
    //Constructor
    public Customer(String name, double money) {
        this.name = name;
        this.money = money;
    }

    public void buyBrownie(Brownie brownie){
        System.out.println("------------------------");
        brownie.addShoppingCart();
        System.out.println("Comprou: ");
        brownie.calcTotalValue();
        System.out.println("------------------------");
    }
}
