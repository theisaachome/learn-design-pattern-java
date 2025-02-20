package com.isaac.learn.beverage;

public abstract class Beverage {
    protected String price;
    protected String addOn;
    public  Beverage(String price, String addOn) {
        this.price = price;
        this.addOn = addOn;
    }
    public abstract void processOrder();
    public abstract void deliver();

}
