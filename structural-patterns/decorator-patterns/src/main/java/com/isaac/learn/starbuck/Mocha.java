package com.isaac.learn.starbuck;

public class Mocha extends CondimentBeverage{
    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }
    @Override
    public String getDescription() {
        return  beverage.getDescription() + " Mocha";
    }

    @Override
    public double cost() {
        return beverage.cost() +.20;
    }
}
