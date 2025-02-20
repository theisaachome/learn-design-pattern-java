package com.isaac.learn.beverage;

public class GermanyBeverage extends Beverage {
    public GermanyBeverage(String price,String addons) {
        super(price,addons);
    }
    @Override
    public void processOrder() {
        System.out.println("Processing Germany beverage");
    }

    @Override
    public void deliver() {
        System.out.println("Delivering Germany beverage");
    }
}
