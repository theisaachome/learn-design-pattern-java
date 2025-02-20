package com.isaac.learn.beverage;

public class AmericanBeverage extends Beverage{
    public AmericanBeverage(String price,String addon){
        super(price,addon);
    }
    @Override
    public void processOrder() {
        System.out.println("Processing American Beverage");
    }

    @Override
    public void deliver() {
        System.out.println("Delivering Germany beverages");
    }
}
