package com.isaac.learn.beverage;

class MyanmarBeverage extends Beverage {
    public MyanmarBeverage(String price, String addOn) {
        super(price, addOn);
    }

    @Override
    public void deliver() {
        System.out.println("Myanmar beverage");
        System.out.println("Adding addons");
        System.out.println("Order in progress");
    }

    @Override
    public void processOrder() {

    }
}
class KoreanBeverage extends Beverage {
    public KoreanBeverage(String price, String addOn) {
        super(price, addOn);
    }

    @Override
    public void deliver() {
        System.out.println("Korean beverage");
        System.out.println("Adding addon.");
        System.out.println("Order in progress");
    }

    @Override
    public void processOrder() {

    }
}

class GermayBeverage extends Beverage {

    public GermayBeverage(String price, String addOn) {
        super(price, addOn);
    }

    @Override
    public void deliver() {

    }

    @Override
    public void processOrder() {

    }
}
public class UnPatternExample  {

}
