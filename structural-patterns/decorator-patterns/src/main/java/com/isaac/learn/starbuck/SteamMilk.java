package com.isaac.learn.starbuck;

public class SteamMilk extends  CondimentBeverage{
    public SteamMilk(Beverage beverage) {
        this.beverage = beverage;
    }
    @Override
    public String getDescription() {
        return beverage.getDescription() + ",Steam Milk";
    }

    @Override
    public double cost() {
        return .10;
    }
}
