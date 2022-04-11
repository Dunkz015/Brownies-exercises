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

    @Override
    public void addShoppingCart(){
        System.out.println("Adicionando brownie de cefé no carrinho");
    }
}
