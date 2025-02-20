package com.isaac.learn.restaurant;

public class ItalianRestaurant extends Restaurant{
    public ItalianRestaurant(Pizza pizza) {
        super(pizza);
    }
    @Override
    public void addSauce() {
        pizza.setSauce("Adding sauce");
    }

    @Override
    public void addToppings() {
        pizza.setToppings("Adding toppings");
    }

    @Override
    public void makeCrust() {
        pizza.setCrust("Making crust");
    }
}
