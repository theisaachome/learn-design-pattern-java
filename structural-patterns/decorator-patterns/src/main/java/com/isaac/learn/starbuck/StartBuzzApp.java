package com.isaac.learn.starbuck;

public class StartBuzzApp {
    public static void main(String[] args) {
        Beverage espresso = new Espresso();
        System.out.println(espresso.getDescription() + ": $ " + espresso.cost());

        Beverage darkRost = new DarkRoast();
        darkRost = new Mocha(darkRost);
        darkRost = new Mocha(darkRost);
        darkRost = new SteamMilk(darkRost);

        System.out.println(darkRost.getDescription() + ": $ " + darkRost.cost());
    }
}
