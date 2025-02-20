package com.isaac.learn.restaurant;

public class BridgeClientCode {
    public static void main(String[] args) {
        Restaurant americanRestaurant = new AmericanRestaurant(new PepperoniaPizza());
        americanRestaurant.deliverPizza();
        System.out.println("-------------------------------");
        Restaurant italianRestaurant = new ItalianRestaurant(new VeggiePizza());
        italianRestaurant.deliverPizza();

    }
}
