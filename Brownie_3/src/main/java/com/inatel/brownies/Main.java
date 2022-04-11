package com.inatel.brownies;

import com.inatel.brownies.brownie.Brownie;
import com.inatel.brownies.brownie.BrownieCafe;
import com.inatel.brownies.brownie.BrownieDoceDeLeite;
import com.inatel.brownies.brownie.BrownieNutella;
import com.inatel.brownies.customer.Customer;

public class Main {
    public static void main(String[] args) {

        Brownie brownie = new Brownie("Brownie", 2, "Sweet");
        Brownie brownieNutella = new BrownieNutella("Brownie Nutella", 3, "Sweet");
        Brownie brownieDoceDeLeite = new BrownieDoceDeLeite("Brownie Doce de leite", 5, "Sweet");
        Brownie brownieCafe = new BrownieCafe("Brownie de cafe", 10, "Sweet");

        Customer customer = new Customer("Edward", 200);
        /*------------------------------------------------------------------------*/
        customer.buyBrownie(brownie);
        customer.buyBrownie(brownieNutella);
        customer.buyBrownie(brownieDoceDeLeite);
        customer.buyBrownie(brownieCafe);
    }
}
