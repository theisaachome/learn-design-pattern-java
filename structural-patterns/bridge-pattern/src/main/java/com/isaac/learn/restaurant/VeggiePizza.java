package com.isaac.learn.restaurant;

public class VeggiePizza extends Pizza{

    @Override
    public void assemble() {
        System.out.println("Adding Sauce " + sauce);
        System.out.println("Adding Toppings " + toppings);
        System.out.println("Adding pepperonia...");
    }

    @Override
    public void qualityCheck() {
        System.out.println("Crust " + crust);
    }
}
