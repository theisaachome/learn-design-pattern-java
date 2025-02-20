package com.isaac.learn.restaurant;

// Concrete  implementation I
public class PepperoniaPizza extends Pizza{
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
