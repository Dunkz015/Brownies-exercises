package com.inatel.brownies.brownie;

public class BrownieNutella extends Brownie{

    //Constructor
    public BrownieNutella(String name, double price, String taste) {
        super(name, price, taste);
    }
    /*------------------------------------------------------------------------*/
    public void addNutella(){
        System.out.println("Adicionando nutella");
    }

    @Override
    public void addShoppingCart(){
        System.out.println("Adicionando brownie de nutella no carrinho");
    }

}
