package com.inatel.brownies.brownie;

public class BrownieCafe extends Brownie{

    //Constructor
    public BrownieCafe(String name, double price, String taste) {
        super(name, price, taste);
    }
    /*------------------------------------------------------------------------*/
    public void addCoffe(){
        System.out.println("Adicionando café");
    }
}
