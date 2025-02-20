package com.isaac.learn.restaurant;

public class AmericanRestaurant extends Restaurant{
    public AmericanRestaurant(Pizza pizza) {
        super(pizza);
    }

    @Override
    public void addSauce() {
        pizza.setSauce("Chilli Pepperoni");
    }

    @Override
    public void addToppings() {
        pizza.setToppings("Mozzarella");
    }

    @Override
    public void makeCrust() {
        pizza.setCrust("Thick");
    }
}
