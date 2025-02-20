package com.isaac.learn.starbuck;

public class Soy extends    CondimentBeverage{

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy.";
    }

    @Override
    public double cost() {
        return .15;
    }
}
