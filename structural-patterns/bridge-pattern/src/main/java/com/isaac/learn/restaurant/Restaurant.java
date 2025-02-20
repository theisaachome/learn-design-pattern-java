package com.isaac.learn.restaurant;

public abstract class Restaurant {
    protected Pizza pizza;

    public Restaurant(Pizza pizza) {
        this.pizza = pizza;
    }
    public abstract void addSauce();
    public abstract void addToppings();
    public abstract void makeCrust();

    public  void deliverPizza() {
        addSauce();
        addToppings();
        makeCrust();
        pizza.assemble();
        pizza.qualityCheck();
        System.out.println("Order is on the way...");
    }


}
