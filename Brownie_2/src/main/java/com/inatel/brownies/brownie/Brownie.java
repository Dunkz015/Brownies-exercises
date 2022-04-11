package com.inatel.brownies.brownie;

public class Brownie {

    protected String name;
    protected double price;
    protected String taste;
    /*------------------------------------------------------------------------*/
    //Constructor
    public Brownie(String name, double price, String taste) {
        this.name = name;
        this.price = price;
        this.taste = taste;
    }

    public void addShoppingCart(){
        System.out.println("Adicionando " + name + " no carrinho");
    }

    public void calcTotalValue(){
        System.out.println(name + " = R$ " + price);
    }

    public void showInfo(){
        System.out.println(name);
        System.out.println("R$ " + price);
        System.out.println(taste);
    }

}
