package com.inatel.brownies.brownie;

public class BrownieDoceDeLeite extends Brownie{

    //Constructor
    public BrownieDoceDeLeite(String name, double price, String taste) {
        super(name, price, taste);
    }
    /*------------------------------------------------------------------------*/
    public void addDoceDeLeite(){
        System.out.println("Adicionado doce de leite no brownie");
    }
}
