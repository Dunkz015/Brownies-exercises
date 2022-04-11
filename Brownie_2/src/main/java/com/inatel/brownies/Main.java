package com.inatel.brownies;

import com.inatel.brownies.brownie.Brownie;
import com.inatel.brownies.brownie.BrownieCafe;
import com.inatel.brownies.brownie.BrownieDoceDeLeite;
import com.inatel.brownies.brownie.BrownieNutella;

public class Main {
    public static void main(String[] args) {

        Brownie brownie = new Brownie("Brownie", 2, "Sweet");
        BrownieNutella brownieNutella = new BrownieNutella("Brownie Nutella", 3, "Sweet");
        BrownieDoceDeLeite brownieDoceDeLeite = new BrownieDoceDeLeite("Brownie Doce de leite", 5, "Sweet");
        BrownieCafe brownieCafe = new BrownieCafe("Brownie de cafe", 10, "Sweet");
        /*------------------------------------------------------------------------*/
        brownie.addShoppingCart();
        brownieCafe.addShoppingCart();
        brownieNutella.addShoppingCart();
        brownieDoceDeLeite.addShoppingCart();
    }
}
